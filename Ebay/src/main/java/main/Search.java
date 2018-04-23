package main;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class Search extends CommonAPI {
    //search for a laptop,
    @FindBy(how = How.XPATH, using = "//input[@id='gh-ac']")
    public static WebElement search;
    public void lookForALaptop() {
        search.sendKeys("laptop", Keys.ENTER);
    }
    // define group apple,sort by heighest price
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Apple Laptops')]")
    public static WebElement group;
        public void group(){
            lookForALaptop();
            group.click();
        }

    //sort by heighest price
    public void mouseHoverToSort() throws InterruptedException {
        typeByXpathNEnter("//input[@id='gh-ac']","laptop");
        Thread.sleep(5000);
        clickByXpath("//span[@class='prodsch-tooltip__close']");
        mouseHoverNClickbyXC("//div[@class='sort-menu-container']", "Price + Shipping: highest first");
    }
}
