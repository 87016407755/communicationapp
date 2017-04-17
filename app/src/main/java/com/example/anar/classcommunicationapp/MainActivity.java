package com.example.anar.classcommunicationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG,"onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SignUp(View v) {
        Intent i = new Intent(this, SignUp.class);
        startActivity(i);
    }


    public void LogIn(View v) {
        Intent i = new Intent(this, LogIn.class);
        startActivity(i);
    }

}
