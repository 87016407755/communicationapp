package com.example.anar.classcommunicationapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

/**
 * Created by anar on 4/16/17.
 */

public class LogIn extends Activity{

    public String TAG = "Login";
    EditText psd;
    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.d(TAG, "Oncreate");
        psd = (EditText)findViewById(R.id.psd);
        email = (EditText)findViewById(R.id.email);

    }

    public void Login(View v) {
        String l = email.getText().toString();
        String p = psd.getText().toString();
        Log.d(TAG,l);
        Log.d(TAG, p);
        Intent i = new Intent(this, Begin.class);
        startActivity(i);
    }


}
