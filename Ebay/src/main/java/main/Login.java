package main;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login extends CommonAPI {
    //Go to myEbay
    public void myAccount(){
        clickByXpath("//li[@id='gh-eb-My']//a[@href='http://my.ebay.com/ws/eBayISAPI.dll?MyEbay&gbh=1']");
    }
   //Go To register
    public void clickRegister(){
        myAccount();
        clickByXpath("/html//div[@id='regTab']");
        }
    //input
    public void inputValues() throws InterruptedException {
        clickRegister();
        typeByCss("#firstname_r [v]","naim");
        typeByCss("#lastname_r [v]","siam");
        typeByXpath("/html//input[@id='email']","naimkhan626@gmail.com");
        typeByXpath("/html//input[@id='PASSWORD']","testMySelenium123#@.");
        Thread.sleep(1000);
        clickByXpath("/html//input[@id='ppaFormSbtBtn']");
    }
}
