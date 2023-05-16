package com.example.lab12_menu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        text = (TextView) findViewById(R.id.text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.settings){
            text.setText("Settingd");
            return true;
        } else if (item.getItemId() == R.id.history) {
            text.setText("Hostory");
            return true;
        } else if (item.getItemId() == R.id.share) {
            text.setText("Share");
            return true;
        } else if (item.getItemId() == R.id.logout) {
            text.setText("Logout");
            return true;
        } else{
            return  true;
        }
    }
}
