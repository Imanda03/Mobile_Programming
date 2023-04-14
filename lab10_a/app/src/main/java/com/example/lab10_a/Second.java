package com.example.lab10_a;

import  android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Second extends AppCompatActivity {
    TextView text, text2, radioText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.passing_to);

        text = (TextView) findViewById(R.id.text);
        text2 = (TextView) findViewById(R.id.text2);
        radioText = (TextView) findViewById(R.id.radio);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        String str2 = intent.getStringExtra("message");
        String setRadio = intent.getStringExtra("message");
        text.setText(str);
        text2.setText(str2);
        text2.setText(setRadio);
    }
}
