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
        connectDB.insertDataFromArrayListToMySql(getItemValue(),"TestTwo","search");
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
    //-------------
    //insert datas to db
    public static List<String> setUserName() {
        List<String> username = new ArrayList<String>();
        username.add("user1");
        username.add("user2");
        username.add("user3");
        username.add("user4");
        username.add("user5");
        username.add("user6");
        username.add("user7");
        return username;
    }
    public static List<String> setUserPass() {
        List<String> passWord = new ArrayList<String>();
        passWord.add("Pass-user1");
        passWord.add("Pass-user2");
        passWord.add("Pass-user3");
        passWord.add("Pass-user4");
        passWord.add("Pass-user5");
        passWord.add("Pass-user6");
        passWord.add("Pass-user7");
        return passWord;
    }
    //put Datas to DB-Mysql
    public static void main(String[] args) {
        ConnectDB connectDB = new ConnectDB();
        connectDB.insertDataFromArrayListToMySql(setUserName(),"TestTwo","userName");
        connectDB.insertDataFromArrayListToMySql(setUserPass(),"TestTwo","userPass");

    }
}
