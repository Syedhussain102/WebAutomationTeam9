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
    //using TAB
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
    //Check Ebay Motors Mousehover and click by linkText
    public void motors(){
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Parts & Accessories");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Cars & Truck Parts");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Motorcycle Parts");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Automotive Tools & Supplies");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Sales & Events");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Motors Deals");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","My Garage");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Vehicles");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Cars & Trucks");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Motorcycles");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Classics & Exotics");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Powersports");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","RVs & Other Vehicles");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Motors Blog");
    }
    //Check Ebay Fashion Mousehover and click by linkText
    public void fashion(){
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Women's Clothing");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Women's Shoes");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Men's Clothing");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Men's Shoes");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Handbags & Accessories");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Kids & Baby");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","My Garage");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Vehicles");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Cars & Trucks");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Motorcycles");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Classics & Exotics");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Powersports");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","RVs & Other Vehicles");
        navigateBack();
        mouseHoverNClickbyXC("//*[@id='s0-container']/li[3]/a","Motors Blog");

    }
    //Check Ebay Electronics Mousehover and click by linkText
    public void electronics(){

    }
    //Check Ebay Collectiables & art Mousehover and click by linkText
    public void collectiablesNart(){

    }
    //Check Ebay Home & Garden Mousehover and click by linkText
    public void homeNgarden(){

    }
    //Check Ebay Sporting Goods Mousehover and click by linkText
    public void sportingGoods(){

    }
    //Check Ebay Toys Mousehover and click by linkText
    public void toys(){

    }
    //Check Ebay Business & Industrial Mousehover and click by linkText
    public void businessNindustrial(){

    }
    //Check Ebay Music Mousehover and click by linkText
    public void music(){

    }
    //Check Ebay Deals Mousehover and click by linkText
    public void deals(){

    }
    //Check Ebay Under $10 Mousehover and click by linkText
    public void under$10(){

    }



}