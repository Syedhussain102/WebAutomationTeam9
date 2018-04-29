package main;

import base.CommonAPI;
import utility.DataReader;
import java.io.IOException;
public class TryExcelSearch extends CommonAPI{

    public String[] getDataFromExcelFile() throws IOException {
        DataReader dr = new DataReader();
        String path = System.getProperty("user.dir") + "/data/Book1.xls";
        String[] data = dr.fileReader(path);
        return data;
    }
    public void searchItemsAndSubmitButton()throws IOException {
        clickByXpath( "//input[@id='gh-ac']");
        String [] value = getDataFromExcelFile();
        for(int i=0; i<value.length; i++) {
           typeByXpath("//input[@id='gh-ac']",value[i]);
            clickNClearbyXpath( "//input[@id='gh-ac']");
        }
    }
}
