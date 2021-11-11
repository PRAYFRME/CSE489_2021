package com.example.cse489_2021;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class KeyValueDB extends SQLiteOpenHelper {

	// TABLE INFORMATTION
	static final String DB_NAME = "KEY_VALUE.DB";
	public final String KEY = "keyname";
	public final String VALUE = "itemvalue";
	//
	public KeyValueDB(Context context) {
		super(context, DB_NAME, null, 2);
		// SQLiteDatabase db = this.getWritableDatabase();
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		System.out.println("DB@OnCreate");
		try {
			db.execSQL("DROP TABLE key_value_pairs ");
		} catch (Exception e) {
		}
		createKeyValueTable(db);
	}

	private void createKeyValueTable(SQLiteDatabase db){
		try {
			db.execSQL("create table key_value_pairs (keyname TEXT, itemvalue TEXT)");
		} catch (Exception e) {
		}
		//db = getWritableDatabase();
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		createKeyValueTable(db);
	}

	private void handleError(SQLiteDatabase db, Exception e){
		String errorMsg = e.getMessage().toString();
		if (errorMsg.contains("no such table")){
			if (errorMsg.contains("key_value_pairs")){
				createKeyValueTable(db);
			}
		}
	}

	public Cursor execute(String query) {
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor res;
		try {
			res = db.rawQuery(query, null);
		}catch (Exception e){
			//e.printStackTrace();
			handleError(db, e);
			res = db.rawQuery(query, null);
		}
		return res;
	}



	public Boolean insertKeyValue(String key, String value) {
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues cv = new ContentValues();
		cv.put(KEY, key);
		cv.put(VALUE, value);
		long result;
		try{
			result = db.insert("key_value_pairs", null, cv);
		}catch (Exception e){
			handleError(db, e);
			result = db.insert("key_value_pairs", null, cv);
		}
		if (result == -1) {
			return false;
		}
		else {
			return true;
		}
	}

//	public Cursor getAllKeyValues() {
//		SQLiteDatabase db = this.getWritableDatabase();
//		Cursor res = db.rawQuery("select * from " + TABLE_KEY_VALUE, null);
//		return res;
//	}

	public boolean updateValueByKey(String key, String value) {
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues cv = new ContentValues();
		cv.put(KEY, key);
		cv.put(VALUE, value);
		int nr = 0;
		try{
			nr = db.update("key_value_pairs", cv, KEY + "=?",
					new String[] { key });
		}catch (Exception e){
			handleError(db, e);
			try {
				nr = db.update("key_value_pairs", cv, KEY + "=?",
						new String[]{key});
			}catch (Exception ex){}
		}
		if (nr == 0) {
			insertKeyValue(key, value);
		}
		return true;
	}

	public Integer deleteDataByKey(String key) {
		SQLiteDatabase db = this.getWritableDatabase();
		int isDeleted = 0;
		try{
			isDeleted = db.delete("key_value_pairs", KEY + " = ?", new String[] { key });
		}catch (Exception e){
			handleError(db, e);
			try {
				isDeleted = db.delete("key_value_pairs", KEY + " = ?", new String[]{key});
			}catch (Exception ex){}
		}
		return isDeleted;
	}

	public String getValueByKey(String key) {
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor res;
		try{
			res = db.rawQuery("SELECT * FROM key_value_pairs\" WHERE "
					+ KEY + "='" + key + "'", null);
		}catch (Exception e){
			handleError(db, e);
			res = db.rawQuery("SELECT * FROM key_value_pairs WHERE "
					+ KEY + "='" + key + "'", null);
		}
		if(res.getCount()>0){
			res.moveToNext();
			return res.getString(1);
		}
		return null;
	}
	//
	public void deleteQuery(String query) {
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor res;
		try {
			db.execSQL(query);
		}catch (Exception e){
			// e.printStackTrace();
			handleError(db, e);
			db.execSQL(query);
		}
	}
}