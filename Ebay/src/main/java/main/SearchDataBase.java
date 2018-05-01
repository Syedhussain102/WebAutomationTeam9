package main;

import base.CommonAPI;
import database.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class SearchDataBase extends CommonAPI {

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
        connectDB.insertDataFromArrayListToMySql(getItemValue(), "aftabShoppingList", "items");
    }
}