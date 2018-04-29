package main;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login extends CommonAPI {
    //Go to myEbay
    public void myAccount(){
        clickByXpath("//*[@id='gh-eb-My']/div[1]/a[1]");
    }
   //Go To register
    public void clickRegister(){
        myAccount();
        clickByXpath("/html//div[@id='regTab']");
        }
    //input values inside
    public void inputValues() throws InterruptedException {
        clickRegister();
        typeByCss("#firstname_r [v]","naim");
        typeByCss("#lastname_r [v]","siam");
        typeByXpath("/html//input[@id='email']","zan.sheum@gmail.com");
        typeByXpath("/html//input[@id='PASSWORD']","testMySelenium123#@");
        Thread.sleep(1000);
        clickByXpath("/html//input[@id='ppaFormSbtBtn']");
    }
    //login to ebay
    public void login(){
        clickByXpath("//*[@id='gh-ug']/a");
        typeByCss("#pri_signin div:nth-of-type(3) [size]","zan.sheum@gmail.com");
        typeByCss("#pri_signin .m12 [size]","testMySelenium123#@");
        clickByXpath("/html//input[@id='sgnBt']");
    }
    //go to my messages//
    public void myMessages(){
        login();
        mouseHoverNClickbyXC("//*[@id='gh-eb-My']/div/a[1]","Messages");
    }
    //add a folder inside messages
    public void folderInMessages(){
        myMessages();
        clickByXpath("//*[@id='adf']");
        driver.findElement(By.xpath("//*[@id='-1_inp_inp']")).clear();
        typeByXpath("//*[@id='-1_inp_inp']","folder1");
    }


}
