package com.example.lab9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class oneActivity extends AppCompatActivity {
    TextView questions1;

    Button next_Activity_button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        next_Activity_button = (Button) findViewById(R.id.first_activity_button);
        questions1 = (TextView) findViewById(R.id.question1_id);

        questions1.setText("Q 1 - How to pass the data between activities in Android?\n" + "\n" + "Ans- Intent");


        next_Activity_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(oneActivity.this, SecondActivity.class);

                startActivity(intent);
            }
        });
    }
}
