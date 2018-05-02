package main;

import base.CommonAPI;
import database.ConnectDB;
import java.util.ArrayList;
import java.util.List;

public class DBsearch extends CommonAPI {

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
    //put Data to DB-Mysql
    /*public static void main(String[] args) {
        ConnectDB connectDB = new ConnectDB();
        connectDB.insertDataFromArrayListToMySql(getItemValue(),"TestEbay","search");
    }*/

    //bring data from db and search using them
    public void searchByDB() throws Exception {
        ConnectDB connectDB = new ConnectDB();
        List<String> items = connectDB.readDataBase("TestEbay","search");
        for (int i = 0; i < items.size(); i++) {
            typeByXpathNEnter("//input[@id='gh-ac']", items.get(i));
            clearInputByXpath("//input[@id='gh-ac']");
        }
    }
}
