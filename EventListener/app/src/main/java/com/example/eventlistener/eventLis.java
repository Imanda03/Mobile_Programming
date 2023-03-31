package com.example.eventlistener;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class eventLis extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Button btn;
        TextView tView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_listener);

        btn = (Button)findViewById(R.id.btnClick);
        tView = (TextView) findViewById(R.id.textResult);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tView.setText("YOu Clicked on Button");
            }
        });
    }
}
