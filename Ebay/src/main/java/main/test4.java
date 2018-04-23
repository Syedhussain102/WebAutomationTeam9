package main;

import base.CommonAPI;
import org.openqa.selenium.By;

public class test4 extends CommonAPI {
    //sort by heighest price
    public void mouseHoverToSort() throws InterruptedException {
        typeByXpathNEnter("//input[@id='gh-ac']","laptop");
        Thread.sleep(10000);
        clickByXpath("//span[@class='prodsch-tooltip__close']");
       mouseHoverNClickbyXC("//div[@class='sort-menu-container']", "Price + Shipping: highest first");
    }
}
