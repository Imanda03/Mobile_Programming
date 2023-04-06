package com.example.lab9;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView question3;
    Button previous_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        previous_button = (Button) findViewById(R.id.third_activity_previous_button);
        question3 = (TextView) findViewById(R.id.question3_id);
        question3.setText("Q 3 - How to store heavy structured data in android?\n"
                + "\n"
                + "Ans- SQlite database");
        // Add_button add clicklistener
        previous_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    }
