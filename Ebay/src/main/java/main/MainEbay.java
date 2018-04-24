package main;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;
import java.util.List;

public class MainEbay extends CommonAPI {
    //Mouse Hover By xpath
    public void mouseHoverByXpath(String xpath, String linkedText){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(xpath))).build().perform();
        implicityWait();
        driver.findElement(By.linkText(linkedText)).click();
    }

    //view multiple items
    public void viewMultipleByCSS(String CSS){
        List<WebElement> menu = getElementsByCSSforList(CSS);
        for (WebElement search : menu) {
            System.out.println(search.getText());
        }
    }

    //search
    public void xtendedSearches() throws InterruptedException {
        Search log = PageFactory.initElements(driver,Search.class);
        log.lookForALaptop();
        sleepFor(2);
        driver.findElement(By.xpath("//*[@id='productSearchToggle']/div/span[2]")).click();

    }
    //go to daily deals
    public void searchProblems() throws InterruptedException {
        xtendedSearches();
        clickByXpath("//*[@id='gh-p-1']/a");
        clickByXpath("//*[@id='s4-c0-c1-title']/a/span");
        driver.findElement(By.cssSelector(".qtyInput")).clear();
        driver.findElement(By.cssSelector(".qtyInput")).sendKeys("2", Keys.ENTER);
    }


}
