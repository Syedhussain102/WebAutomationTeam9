package TestBase;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class search extends CommonAPI {
    //SearchMultipleItems
    @FindBy(xpath = "//*[@placeholder='Search Quotes, News & Video']")
    public WebElement searchElements;
    public void searchItems() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("gaming");
        itemsList.add("social media");
        itemsList.add("mobile");
        for (String st : itemsList) {
            searchElements.sendKeys(st, Keys.ENTER);
            //driver.findElement(By.xpath("//*[@class='fa fa-search fa-2']")).click();
            searchElements.clear();
        }

    }
    public void work(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//i[@class='fa fa-user fa-2']"))).build().perform();
        driver.findElement(By.xpath("//*[@id='unreg-user']/li/ul/li[1]")).click();
    }



}