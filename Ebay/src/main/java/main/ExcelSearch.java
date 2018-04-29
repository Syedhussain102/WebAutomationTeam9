package main;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;

public class ExcelSearch{
    //search from excel sheet
    public String[] getDataFromExcelFile() throws IOException {
        DataReader dr = new DataReader();
        String path = System.getProperty("user.dir") + "/data/Book1.xls";
        String[] data = dr.fileReader2(path, 1);
        return data;
    }

    /*public String[] getDataFromExcelFileForFeaturesChoice() throws IOException {
        String path = System.getProperty("user.dir") + "/data/file1.xls";
        String[] data = dr.fileReader2(path, 1);
        return data;
    }
*/
    @FindBy(xpath = "//input[@id='gh-ac']")
    public static WebElement search;

    public void clear() {
        search.clear();
    }
    public void click(String value) {
        search.sendKeys(value,Keys.ENTER);
    }
    public void searchItemsAndSubmitButton()throws IOException {
        String [] valuee = getDataFromExcelFile();
        for(int i=0; i<valuee.length; i++) {
            click(valuee[i]);
           clear();
        }
    }
}
