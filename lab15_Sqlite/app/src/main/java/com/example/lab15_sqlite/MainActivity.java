package com.example.lab15_sqlite;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import java.util.List;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    ListView list;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        DatabaseHandler db = new DatabaseHandler(this);
        // Inserting Contacts
        Log.d("Insert: ", "Inserting ..");
        db.addContact(new Contact("Ravi", "9100000000"));
        db.addContact(new Contact("Srinivas", "9199999999"));
        db.addContact(new Contact("Tommy", "9522222222"));
        db.addContact(new Contact("Karthik", "9533333333"));
        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");
        List<Contact> contacts = db.getAllContacts();
        for (Contact cn : contacts) {
            String log = "Id: " + cn.getId() + " ,Name: " + cn.get_name() + " ,Phone: " +
                    cn.get_phone_number();
            // Writing Contacts to log
            Log.d("Name: ", log);
        }
    }
}
