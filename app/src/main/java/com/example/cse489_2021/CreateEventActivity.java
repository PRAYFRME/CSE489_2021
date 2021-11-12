package com.example.cse489_2021;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class CreateEventActivity extends AppCompatActivity {

    private static String globalCounter;
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);
        System.out.println(MainActivity.globalCounter + " @CreateEventActivity-onCreate()");
        //MainActivity.globalCounter++;


        findViewById(R.id.btnSave).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(CreateEventActivity.globalCounter + " @CreateEventActivity Save button was pressed");
                //MainActivity.globalCounter++;

                /*radioGroup = findViewById(R.id.radioGroup);
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                textView.setText("Event: "+radioButton.getText());
                String eventType = textView.getText().toString();*/


                EditText etName = findViewById(R.id.etName);
                //String eventName = etName.getText().toString();
                //System.out.println(eventName);

                EditText etPlace = findViewById(R.id.etPlace);
                //String eventPlace = etPlace.getText().toString();
                //System.out.println(eventPlace);

                /*radioGroup = findViewById(R.id.radioGroup);
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                textView.setText("Event Type: " + radioButton.getText());
                String eventType = textView.getText().toString();*/


                EditText etDateTime = findViewById(R.id.etDateTime);
                //String eventDateTime = etDateTime.getText().toString();
                //System.out.println(eventDateTime);

                EditText etCapacity = findViewById(R.id.etCapacity);
                //String eventCapacity = etCapacity.getText().toString();
                //System.out.println(eventCapacity);

                EditText etBudget = findViewById(R.id.etBudget);
                //String eventBudget = etBudget.getText().toString();
                //System.out.println(eventBudget);

                EditText etEmail = findViewById(R.id.etEmail);
                //String eventEmail = etEmail.getText().toString();
                //System.out.println(eventEmail);

                EditText etPhone = findViewById(R.id.etPhone);
                //String eventPhone = etPhone.getText().toString();
                //System.out.println(eventPhone);

                EditText etDescription = findViewById(R.id.etDescription);
                //String eventDescription = etDescription.getText().toString();
                //System.out.println(eventDescription);


                /*String eventId = eventName;

                String eventValue=eventName+"-----"+eventPlace+"-----"
                +eventDateTime+"-----"+eventCapacity+"-----"+eventBudget
                        +"-----"+eventEmail+"-----"+eventPhone+"-----"+eventDescription; */

                String eventId = etName.getText().toString();

                String eventValue = etName.getText().toString() + "-----" + etPlace.getText().toString() + "-----"
                        + etDateTime.getText().toString() + "-----" + etCapacity.getText().toString() + "-----" + etBudget.getText().toString()
                        + "-----" + etEmail.getText().toString() + "-----" + etPhone.getText().toString() + "-----" + etDescription.getText().toString();

                Util.getInstance().setKeyValue(CreateEventActivity.this, eventId, eventValue);

                //+radioGroup.getText().toString()+"-----"


                System.out.println("Name : " + etName.getText().toString());
                System.out.println("Place : " + etPlace.getText().toString());
                //System.out.println("Type :"+typeFieldBtn.getText());
                System.out.println("Date & Time :" + etDateTime.getText());
                System.out.println("Capacity  :" + etCapacity.getText());
                System.out.println("Budget :" + etBudget.getText());
                System.out.println("Email :" + etEmail.getText());
                System.out.println("Phone :" + etPhone.getText());
                System.out.println("Description :" + etDescription.getText());

                //finish();

            }
        });


        findViewById(R.id.btnShare).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                System.out.println(CreateEventActivity.globalCounter+" @CreateEventActivity Share button was pressed");
                MainActivity.globalCounter++;
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

    /*public void checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        Toast.makeText(this,"Selected Radio Button: "+radioButton.getText(),Toast.LENGTH_SHORT).show();
    }*/

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