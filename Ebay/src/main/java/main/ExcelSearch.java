package main;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import utility.DataReader;

import java.io.IOException;

public class ExcelSearch extends CommonAPI {
    Search refVar = new Search();
    //search from excel sheet
    DataReader dr = new DataReader();
    public String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir")+"/data/Book1.xls";
        String [] data = dr.fileReader2(path,1);
        return data;
    }
    public void searchItemsAndSubmitButton()throws IOException {
        String [] value = getDataFromExcelFile();
        for(int i=0; i<value.length; i++) {
            refVar.searchElements.sendKeys(value[i],Keys.ENTER);
            refVar.searchElements.clear();
        }
    }
}
