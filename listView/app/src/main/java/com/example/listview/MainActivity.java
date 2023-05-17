package com.example.listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String[][] deepArr = new String[][]{{"Item1", "Item2", "Item3", "Item4"}};
    String[][] subArr = new String[][] {{"subItem1","subItem2"}};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        list = (ListView) findViewById(R.id.list);
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> subArrayList = new ArrayList<String>();
        for(String[] s:deepArr){
            for(String s1:s) {
                arrayList.add(s1);
            }

            arrayList.get(0).SubItems.Add("subItems");

            ArrayAdapter adapter = new ArrayAdapter<String> (this,android.R.layout.simple_list_item_1,arrayList);
            list.setAdapter(adapter);
        }
    }
}
