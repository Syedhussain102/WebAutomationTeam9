package main;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Search extends CommonAPI {
    //search for a laptop, define group apple,sort by heighest price
    @FindBy(how = How.XPATH, using = "//input[@id='gh-ac']")
    public static WebElement search;
    public void lookForALaptop() {
        search.sendKeys("iphone");
    }

    //clickByXpath("//span[contains(text(),'Apple Laptops')]");
   // mouseHoverNClickbyXC(".srp-controls .srp-controls__control:nth-of-type(1) .icon-arrow-down","Price + Shipping: highest first");

}
