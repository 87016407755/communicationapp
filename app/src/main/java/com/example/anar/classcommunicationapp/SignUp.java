package com.example.anar.classcommunicationapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Created by anar on 4/16/17.
 */

public class SignUp extends Activity {
    private String TAG = "SignUp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG,"onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_signup);
    }

    public void TeacherSignup(View v) {
        Intent i = new Intent(this, RegisterTeacher.class);
        startActivity(i);
    }


    public void StudentSignup(View v) {
        Intent i = new Intent(this, RegisterStudent.class);
        startActivity(i);
    }

}
