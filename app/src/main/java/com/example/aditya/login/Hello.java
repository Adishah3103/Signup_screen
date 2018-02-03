package com.example.aditya.login;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Hello extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        TextView tv = (TextView)findViewById(R.id.tv1);
        SharedPreferences sp = getSharedPreferences("name", MODE_PRIVATE);
        String name = sp.getString("name","");
        tv.setText(name);
    }
}
