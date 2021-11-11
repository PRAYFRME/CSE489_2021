package com.example.cse489_2021;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class CreateEventActivity extends AppCompatActivity {

    private static String globalCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);
        System.out.println(MainActivity.globalCounter+" @CreateEventActivity-onCreate()");
        MainActivity.globalCounter++;

        findViewById(R.id.btnShare).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                System.out.println(CreateEventActivity.globalCounter+" @CreateEventActivity Share button was pressed");
                MainActivity.globalCounter++;
            }
        });
        
        
        findViewById(R.id.btnSave).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println(CreateEventActivity.globalCounter+" @CreateEventActivity Save button was pressed");

                EditText etName = findViewById(R.id.etName);
                String eventName = etName.getText().toString();
                System.out.println(eventName);

                EditText etPlace = findViewById(R.id.etPlace);
                String eventPlace = etPlace.getText().toString();
                System.out.println(eventPlace);


                //Radio


                EditText etDateTime = findViewById(R.id.etDateTime);
                String eventDateTime = etDateTime.getText().toString();
                System.out.println(eventDateTime);

                EditText etCapacity = findViewById(R.id.etCapacity);
                String eventCapacity = etCapacity.getText().toString();
                System.out.println(eventCapacity);

                EditText etBudget = findViewById(R.id.etBudget);
                String eventBudget = etBudget.getText().toString();
                System.out.println(eventBudget);

                EditText etEmail = findViewById(R.id.etEmail);
                String eventEmail = etEmail.getText().toString();
                System.out.println(eventEmail);

                EditText etPhone = findViewById(R.id.etPhone);
                String eventPhone = etPhone.getText().toString();
                System.out.println(eventPhone);

                EditText etDescription = findViewById(R.id.etDescription);
                String eventDescription = etDescription.getText().toString();
                System.out.println(eventDescription);
            }
        });


        findViewById(R.id.btnCancel).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                System.out.println(CreateEventActivity.globalCounter+" @CreateEventActivity Cancel button was pressed");
                MainActivity.globalCounter++;
                finish();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println(MainActivity.globalCounter+" @CreateEventActivity-onStart()");
        MainActivity.globalCounter++;
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println(MainActivity.globalCounter+" @CreateEventActivity-onResume");
        MainActivity.globalCounter++;
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println(MainActivity.globalCounter+" @CreateEventActivity-onPause");
        MainActivity.globalCounter++;
    }
    @Override
    protected void onStop() {
        super.onStop();
        System.out.println(MainActivity.globalCounter+" @CreateEventActivity-onStop");
        MainActivity.globalCounter++;
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println(MainActivity.globalCounter+" @CreateEventActivity-onRestart");
        MainActivity.globalCounter++;
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println(MainActivity.globalCounter+" @CreateEventActivity-onDestroy");
        MainActivity.globalCounter++;
    }
}