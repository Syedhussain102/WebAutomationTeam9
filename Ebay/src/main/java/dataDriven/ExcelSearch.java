package dataDriven;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelSearch extends CommonAPI {

    public static void main(String[] args) throws IOException {
        String excelValues = String.valueOf(dataFromExcel("../Ebay/data/Book1.xls", "Sheet1", 0));
        System.out.println(excelValues);
    }

    public void testExcel() throws IOException {
        ArrayList<String> searchAbleItems = dataFromExcel("../Ebay/data/Book1.xls", "Sheet1", 1);
        for (int i = 0; i < searchAbleItems.size(); i++) {
            driver.findElement(By.xpath("fgerdvdf")).sendKeys(searchAbleItems.get(i));
            driver.findElement(By.xpath("fgerdvdf")).clear();

            typeByXpathNEnter("//input[@id='gh-ac']", searchAbleItems.get(i));
            clearInputByXpath("//input[@id='gh-ac']");
        }
    }

    public void multipleLoginExcel() throws IOException {
        clickByXpath("//*[@id='gh-ug']/a");
        ArrayList<String> searchAbleUsers = dataFromExcel("../Ebay/data/Book1.xls", "Sheet1", 0);
        ArrayList<String> searchAblePass = dataFromExcel("../Ebay/data/Book1.xls", "Sheet1", 1);
        for (int i = 1; i < searchAbleUsers.size(); i++) {
            typeByCss("#pri_signin div:nth-of-type(3) [size]", searchAbleUsers.get(i));
            typeByCss("#pri_signin .m12 [size]", searchAblePass.get(i));
            clickByXpath("/html//input[@id='sgnBt']");

            clearInputByCSS("#pri_signin div:nth-of-type(3) [size]");
            clearInputByCSS("#pri_signin .m12 [size]");
        }
    }

    public void doesFileExist(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testUntitledTestCase() throws Exception {
        driver.get("https://www.weightwatchers.com/us/");
        Assert.assertEquals(driver.getTitle(), "Weight Loss Program, Recipes & Help | Weight Watchers");

        driver.findElement(By.id("ela-menu-visitor-desktop-supplementa_find-a-meeting")).click();
        Assert.assertEquals(driver.getTitle(), "Get Schedules & Times Near You");

        WebElement element = driver.findElement(By.xpath("a[href='/us/find-a-meeting/1180510/weight-watchers-store-23rd-st-5th-ave-new-york-ny']"));
        System.out.println(element.getText());

        driver.findElement(By.id("meetingSearch")).click();
        driver.findElement(By.id("meetingSearch")).sendKeys("10011");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.xpath("//div[@id='ml-1180510']/result-location/div/div/a/location-address/div/div/div/div/span")).click();
    }

    public void printExcelSpecificColumn(String sheetName, int columnNo, String path) throws IOException {
        String excelValues = String.valueOf(dataFromExcel(path, sheetName, columnNo));
        System.out.println(excelValues);
    }


    public void method() {
        driver.getWindowHandle();
        driver.switchTo();
    }
}
