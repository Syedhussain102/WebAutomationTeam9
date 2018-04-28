package main;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainBestBuy extends CommonAPI {

    //view multiple items
    public void viewMultipleByCSS(String CSS){
        clickByLinkedText("PRODUCTS");
        clickByLinkedText("Audio");
        clickByLinkedText("Over-Ear & On-Ear Headphones");

        List<WebElement> menu = getElementsByCSSforList(CSS);
        for (WebElement search : menu) {
            System.out.println(search.getText());
        }
    }//search
    public void xtendedSearches() throws InterruptedException {
        Search log = PageFactory.initElements(driver,Search.class);
        log.lookForALaptop();
        sleepFor(2);
        driver.findElement(By.xpath("/html//input[@id='gh-search-input']")).clear();

    }
    //search for a laptop and use different options
    public void searchWithDifferentRequirements(){
        typeByXpathNEnter("/html//input[@id='gh-search-input']","Laptop");
        //click gaming
        clickByLinkedText("Gaming");
        typeByXpath("/html//input[@id='facet-range-currentprice_facet-min']","1000");
        typeByXpath("/html//input[@id='facet-range-currentprice_facet-max']","2500");
        clickByXpath("//button[@id='facet-range-currentprice_facet-submit']/i");
        implicityWait();
        clickByCss("#brand_facet .facet-value:nth-of-type(9) .custom-input");

    }

    //handeling new tab
    public void newTab(){
        String newTabTest = Keys.chord(Keys.COMMAND,Keys.RETURN);
        driver.findElement(By.linkText("Contact us")).sendKeys(newTabTest);
        switchTabs(0,1);
    }

    //usint TAB
    public void tabUse() throws InterruptedException {
        Actions act = new Actions(driver);
        act.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.TAB).perform();

    }
}
