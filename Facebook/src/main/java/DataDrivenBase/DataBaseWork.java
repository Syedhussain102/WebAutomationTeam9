package DataDrivenBase;

import base.CommonAPI;
import database.ConnectDB;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
public class DataBaseWork extends CommonAPI{
    public static List<String> infotech(){
        List<String> name1=new ArrayList<>();
        name1.add("alen");
        name1.add("nimo");
        name1.add("dory");
        return name1;
    }
    public void main() {
        ConnectDB connectDB =new ConnectDB();
        connectDB.insertDataFromArrayListToMySql333(infotech(),"single_search","column1");
    }
    //single colomn
    public void infoDatabase1() throws Exception {
        ConnectDB connectDB =new ConnectDB();
        List<String> items = connectDB.readDataBase("single_search","column1");
        for (int i = 0; i < items.size(); i++) {
            typeByXpathNEnter("//input[@name='email']", items.get(i));
            clearInputByXpath("//input[@name='email']");
        }
    }
    //multiple colomn
    public void infoDatabase2() throws Exception {
        ConnectDB connectDB =new ConnectDB();
        List<String> myDBlist=connectDB.readDataBase("login","username");
        List<String> myDBlist2=connectDB.readDataBase("login","password");
        for (int i=0;i<myDBlist.size();i++){
            typeByXpath("//input[@name='email']",myDBlist.get(i));
            typeByXpathNEnter("//input[@name='pass']",myDBlist2.get(i));
            navigateBack();
            clearInputByXpath("//input[@name='email']");
            clearInputByXpath("//input[@name='pass']");
        }
    }

}

