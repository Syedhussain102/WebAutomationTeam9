package main;

import TestBase.CommonAPI;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ExcelSearch extends CommonAPI {

    public ArrayList<String> dataFromExcel(int colNo) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/zann/IdeaProjects/WebAutomationTeam9/Ebay/data/Book1.xls");
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet s = wb.getSheet("Sheet1");
        Iterator<Row> rowIT =s.iterator();
        ArrayList<String> list = new ArrayList<>();
        while(rowIT.hasNext()){
           list.add(rowIT.next().getCell(colNo).getStringCellValue());
        }
        return list;
    }
    public void testExcel() throws IOException {
        ArrayList<String> searchAbleItems = dataFromExcel(0);
        for (int i = 0; i < searchAbleItems.size(); i++) {
            typeByXpathNEnter("//input[@id='gh-ac']", searchAbleItems.get(i));
            clearInputByXpath("//input[@id='gh-ac']");
        }
    }
}
