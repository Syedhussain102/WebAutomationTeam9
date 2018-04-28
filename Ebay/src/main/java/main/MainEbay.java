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
    //go to daily deals--spotlight deal
    public void searchProblems() throws InterruptedException {
        //xtendedSearches();
        clickByXpath("//*[@id='gh-p-1']/a");
        clickByXpath("//*[@id='s4-c0-c1-title']/a/span");
    }
    //search for a laptop and use different options
    public void searchWithDifferentRequirements(){
        typeByXpathNEnter("/html//input[@id='gh-ac']","Laptop");
        try{clickByXpath("//*[@id='productSearchToggle']/div/span[2]");}catch (Exception ex){
        //click acer
        clickByXpath("//*[@id='w3-w0-w1-multiselect[0]']/a/span[1]");}
        clickByCss("[id='w3-w0-w1-multiselect\\[0\\]'] .x-refine__multi-select-cbx");
        clickByXpath("//*[@id='w3-w0-singleselect[9]-w0-_valueOption']");
        clickByXpath("//*[@id='w3-w0-singleselect[9]-w0-_select']/option[6]");
        //clickNClearbyXpath("//*[@id='w3-w0-singleselect[9]-w0-zipcode-validator-x-zipcode-validator__input']");
        //typeOnInputField("//*[@id='w3-w0-singleselect[9]-w0-zipcode-validator-x-zipcode-validator__input']","11377");
        //clickByXpath("//*[@id='w3-w0-singleselect[9]-w0-_submit']");
    }
    //select categories and then select travel
    public void editCategories(){
        clickByCss("[aria-label='Select a category for search']");
        WebElement menu = driver.findElement(By.xpath("//*[@id='gh-cat']/option[34]"));
        System.out.println(menu.getText());
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