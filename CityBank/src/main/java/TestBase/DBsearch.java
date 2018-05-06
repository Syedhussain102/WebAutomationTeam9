package TestBase;

import base.CommonAPI;
import database.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class DBsearch extends CommonAPI {
    //put Data to DB-Mysql
    public static void main(String[] args) {
        ConnectDB connectDB = new ConnectDB();
        //connectDB.insertDataFromArrayListToMySql2Column(getItemValue(),"TestCiti","login","pass");
    }

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
