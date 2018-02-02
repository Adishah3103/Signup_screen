package com.example.aditya.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signup(View v)
    {
        Intent i = new Intent(this, Signup.class);
        startActivity(i);


    }

    public void start(View v)
    {
        Intent i = new Intent(this, Hello.class);
        startActivity(i);

    }
}
