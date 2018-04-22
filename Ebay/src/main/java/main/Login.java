package main;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login extends CommonAPI {
    //Go to myEbay
    @FindBy(how = How.XPATH, using = "//li[@id='gh-eb-My']//a[@href='http://my.ebay.com/ws/eBayISAPI.dll?MyEbay&gbh=1']")
    public static WebElement myEbay;
    public void myAccount(){
    myEbay.click();
    }
}
