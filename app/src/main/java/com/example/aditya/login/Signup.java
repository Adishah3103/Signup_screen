package com.example.aditya.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Signup extends AppCompatActivity {

    String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void submit(View v)
    {
          EditText tv =(EditText) findViewById(R.id.name);
          a=tv.getText().toString();
          SharedPreferences sp = getSharedPreferences("name", MODE_PRIVATE);
          SharedPreferences.Editor ed = sp.edit();
          ed.putString("name",a);
          ed.apply();

          Intent i = new Intent(this, Hello.class);
          startActivity(i);

    }
}
