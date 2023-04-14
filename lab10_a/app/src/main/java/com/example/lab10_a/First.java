package com.example.lab10_a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class First extends AppCompatActivity {
    EditText textBox, textBox2;
    Button passButton;
    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.passing_from);

        Spinner spinner = (Spinner) findViewById(R.id.select);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.select        , android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        textBox = (EditText) findViewById(R.id.textBox);
        textBox2 = (EditText) findViewById(R.id.textBox2);
        passButton = (Button) findViewById(R.id.passButton);
        radioGroup = (RadioGroup) findViewById(R.id.rdGroup);




        passButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String str = textBox.getText().toString();
                String str2 = textBox2.getText().toString();
                int selectedID = radioGroup.getCheckedRadioButtonId();

                radioButton = (RadioButton) findViewById(selectedID);

                String getRadio = (String) radioButton.getText();

                Intent intent = new Intent(getApplicationContext(),Second.class);
                intent.putExtra("message",str);
                intent.putExtra("message",str2);
                intent.putExtra("message",getRadio);

                startActivity(intent);
            }
        });
    }
}
