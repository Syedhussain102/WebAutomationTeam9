package ebay;

import base.CommonAPI;
import main.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class test1 extends CommonAPI {
    //Go to my account--messages
    @Test
    public void myAccount(){
        Login refVar = PageFactory.initElements(driver,Login.class);
        refVar.myAccount();
    }

//search for a laptop, define group apple,sort by heighest price
    public void lookForALaptop() throws InterruptedException {
        typeByXpathNEnter("//input[@id='gh-ac']","laptop");
        clickByXpath("//span[contains(text(),'Apple Laptops')]");
        sleepFor(2);
        mouseHoverNClickbyXC(".srp-controls .srp-controls__control:nth-of-type(1) .icon-arrow-down","Price + Shipping: highest first");
        }

    public void addToCart(){
        typeByCssNEnter(".ui-searchbar-size-middle [type=\"text\"]","iphone");
        clickByLinkedLink("Hot 2018 phone case cover for iphone X, tpu pc card slot case pouch mobile cover for iphone X 8 6s plus hybrid case");
        switchTabs(0,1);
        clickByCss("#J-btn-order");
        //wkjfvsavnlgit
    }

}
