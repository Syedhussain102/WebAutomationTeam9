package main;

import database.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class DBsearch {

    //insert data to db
    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Book");
        itemsList.add("Pen");
        itemsList.add("Laptop");
        itemsList.add("Pencil");
        itemsList.add("Guitar");
        itemsList.add("Pick");
        itemsList.add("Cap");
        return itemsList;
    }

    public static void main(String[] args) {
        ConnectDB connectDB = new ConnectDB();
        connectDB.insertDataFromArrayListToMySql(getItemValue(),"TestEbay","search");
    }

    //bring data from db and search using them
}
