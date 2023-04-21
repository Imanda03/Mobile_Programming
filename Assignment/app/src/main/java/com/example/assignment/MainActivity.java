package com.example.assignment;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    EditText input;
    TextView text1, text2,text3,text4;
    Button Check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        input=(EditText)findViewById(R.id.editText1);
        Check=(Button)findViewById(R.id.button1);
        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        text3 = (TextView) findViewById(R.id.text3) ;
        text4 = (TextView) findViewById(R.id.text4) ;

        Check.setOnClickListener(new OnClickListener()
        {

            @Override
            public void onClick(View arg0) {
                int n = Integer.parseInt(input.getText().toString());
                int f = 0;
                String num = input.getText().toString();


                for (int i = 2; i < n; i++)
                {
                    if (n % i == 0)
                        f = 1;
                }

                if (f == 0)
                {
                    text1.setText("Given number is prime");
                }else{
                    text1.setText("GIven number is not a prime");

                }
                if (isPalindrome(num)) {
                        text2.setText("Givrn number is palindrome");
                } else {
                    text2.setText("Given number is not a palindrome");
                }

                if(n %2 ==0){
                    text3.setText("Given number is even");
                }else{
                    text3.setText("Given number id odd");
                }
        if(isFac(n)){
            text4.setText("Given number is Fibonacci");
        }else{
            text4.setText("Given number is not Fibonacci");
        }

            }});

    }
    public static boolean isPalindrome(String number) {
        String reversed = 0;
        String original = number;
        while (number > 0) {
            String digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        return original == reversed;
    }

    public static boolean isFac(int number){
        try{
            int firstTerm = 0;
            int secondTerm = 1;
            int thirdTerm = 0;
            while(thirdTerm < number){
                thirdTerm = firstTerm+ secondTerm;
                firstTerm = secondTerm;
                secondTerm = thirdTerm;
            }
            if(thirdTerm == number) {
                return true;
            }else{
                return false;
            }
        }catch(Exception e) {
            return false;
        }
    }
    }




