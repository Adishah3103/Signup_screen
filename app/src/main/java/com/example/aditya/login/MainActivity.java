package com.example.aditya.login;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button)findViewById(R.id.signup);
        b.setPaintFlags(b.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
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
