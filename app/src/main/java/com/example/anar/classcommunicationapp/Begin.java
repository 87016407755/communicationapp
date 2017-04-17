package com.example.anar.classcommunicationapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


/**
 * Created by anar on 4/17/17.
 */

public class Begin extends Activity {
    String TAG ="Begin";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);
        Log.d(TAG,"onCreate");
    }
}
