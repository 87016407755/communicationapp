package com.example.anar.classcommunicationapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by anar on 4/16/17.
 */

public class RegisterTeacher extends Activity {
    public String TAG = "RegisterTeacher";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Log.d(TAG,"onCreate");
    }
}
