package com.example.cse489_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   public static int globalCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(MainActivity.globalCounter+" @MainActivity-onCreate()");
        MainActivity.globalCounter++;

        TextView btnCreateNew = findViewById(R.id.btnCreateNew);
        btnCreateNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(MainActivity.globalCounter+" @MainActivity-CreateNew button was pressed");
                MainActivity.globalCounter++;
                Intent i = new Intent(MainActivity.this, CreateEventActivity.class);
                startActivity(i);
            }
        });

        TextView btnHistory = findViewById(R.id.btnHistory);
        btnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(MainActivity.globalCounter+" @MainActivity-History button was pressed");
                MainActivity.globalCounter++;
            }
        });

        TextView btnExit = findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(MainActivity.globalCounter+" @MainActivity-Exit button was pressed");
                MainActivity.globalCounter++;
                finish();
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println(MainActivity.globalCounter+" @MainActivity-onStart()");
        MainActivity.globalCounter++;
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println(MainActivity.globalCounter+" @MainActivity-onResume");
        MainActivity.globalCounter++;
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println(MainActivity.globalCounter+" @MainActivity-onPause");
        MainActivity.globalCounter++;
    }
    @Override
    protected void onStop() {
        super.onStop();
        System.out.println(MainActivity.globalCounter+" @MainActivity-onStop");
        MainActivity.globalCounter++;
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println(MainActivity.globalCounter+" @MainActivity-onRestart");
        MainActivity.globalCounter++;
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println(MainActivity.globalCounter+" @MainActivity-onDestroy");
        MainActivity.globalCounter++;
    }
}