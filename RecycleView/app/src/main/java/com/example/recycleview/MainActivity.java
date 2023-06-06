package com.example.recycleview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyList[] myListData = new MyList[] {
                new MyList("Email", android.R.drawable.ic_dialog_email),
                new MyList("Info", android.R.drawable.ic_dialog_info),
                new MyList("Delete", android.R.drawable.ic_delete),
                new MyList("Dialer", android.R.drawable.ic_dialog_dialer),
                new MyList("Alert", android.R.drawable.ic_dialog_alert),
                new MyList("Map", android.R.drawable.ic_dialog_map),
                new MyList("Email", android.R.drawable.ic_dialog_email),
                new MyList("Info", android.R.drawable.ic_dialog_info),
                new MyList("Delete", android.R.drawable.ic_delete),
                new MyList("Dialer", android.R.drawable.ic_dialog_dialer),
                new MyList("Alert", android.R.drawable.ic_dialog_alert),
                new MyList("Map", android.R.drawable.ic_dialog_map),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}