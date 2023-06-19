package com.example.lab15_sqlite;

public class Contact {
    int id;
    String _name;
    String _phone_number;

    public Contact(){}

    public Contact(int id, String _name, String _phone_number) {
        this.id = id;
        this._name = _name;
        this._phone_number = _phone_number;
    }

    public Contact(String _name, String _phone_number) {
        this._name = _name;
        this._phone_number = _phone_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_phone_number() {
        return _phone_number;
    }

    public void set_phone_number(String _phone_number) {
        this._phone_number = _phone_number;
    }


}
