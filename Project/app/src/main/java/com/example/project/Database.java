package com.example.project;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {

    //Database version
    private static final int DATABSE_VERSION = 1;

    //Database Name
    private static final String DATABASE_NAME = "employee_database";

    //DataBase Table Name
    private static final String TABLE_NAME = "EMPLOYEE";

    //Table columns
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String EMAIL = "email";
    private SQLiteDatabase sqLiteDatabase;

    //creating table query
    private static final String CREATE_TABLE = "create table " + TABLE_NAME + "("+ID+
            "INTEGER PRIMARY KEY AUTOINCREMENT," + NAME + "TEXT NOT NULL," +EMAIL+"TEXT NOT NULL,);";

    //Constructor
    public Database(Context context){
        super(context, DATABASE_NAME,null,DATABSE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
    onCreate(db);
    }

    //Add Employee Data
    public void addEmployee(EmployeeModelClass employeeModelClass){
        ContentValues contentValues = new ContentValues();
        contentValues.put(Database.NAME, employeeModelClass.getName());
        contentValues.put(Database.EMAIL, employeeModelClass.getEmail());
        sqLiteDatabase = this.getWritableDatabase();
        sqLiteDatabase.insert(Database.TABLE_NAME,null,contentValues);
    }
}
