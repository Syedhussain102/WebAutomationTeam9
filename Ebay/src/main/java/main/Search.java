package main;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.ArrayList;
import java.util.List;

public class Search extends CommonAPI {
    //search for a laptop,
    @FindBy(how = How.XPATH, using = "//input[@id='gh-ac']")
    public static WebElement search;
    public void lookForALaptop() {
        search.sendKeys("laptop", Keys.ENTER);
    }
    // define group apple
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Apple Laptops')]")
    public static WebElement group;
    public void group() {
        lookForALaptop();
        group.click();
    }
    //sort by heighest price
    @FindBy(how = How.XPATH, using = "//div[@class='sort-menu-container']")
    public static WebElement sortByPrice;
    public void mouseHoverToSort() throws InterruptedException {
        group();
        Thread.sleep(5000);
        clickByXpath("//span[@class='prodsch-tooltip__close']");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//div[@class='sort-menu-container']"))).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Price + Shipping: highest first")).click();
    }
    //SearchMultipleItems
    @FindBy(xpath = "//input[@id='gh-ac']")
    public WebElement searchElements;
    public void searchItems() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("laptop");
        itemsList.add("cell Phone");
        itemsList.add("guitar");
        for (String st : itemsList) {
            searchElements.sendKeys(st, Keys.ENTER);
            searchElements.clear();
        }
    }
}
