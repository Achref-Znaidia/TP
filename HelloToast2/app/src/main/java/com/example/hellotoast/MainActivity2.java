package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView textV;
    private String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textV = (TextView) findViewById(R.id.textView2);
        Bundle b1 = getIntent().getExtras();
        if (b1 != null) {
            s = b1.getString("count");
        }
        textV.setText(String.format("%s", s));
    }
}