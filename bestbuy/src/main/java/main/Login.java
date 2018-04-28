package main;

import base.CommonAPI;
import org.openqa.selenium.By;

public class Login extends CommonAPI {
    //Go to myEbay
    public void myAccount(){
        clickByLinkedText("Account");
    }
   //Go To register
    public void clickRegister(){
        myAccount();
        clickByLinkedText("Create a BestBuy.com account");
        }
    //input values inside
    public void inputValues() throws InterruptedException {
        clickRegister();
        typeByXpath("/html//input[@id='fld-firstName']","naim");
        typeByXpath("/html//input[@id='fld-lastName']","siam");
        typeByXpath("/html//input[@id='fld-e']","zan.sheum@gmail.com");
        typeByXpath(".cia-password-wrap [aria-required]","testMySelenium123#@");
        typeByXpath("[action] div:nth-child(5) [type]","testMySelenium123#@");
        typeByCss(".cia-tooltip-wrap [type]","9293739212");
        clickByCss("[type='checkbox']");
        clickByCss("[type='submit'] .btn-text");
    }
    //login to bestBuy
    public void login(){
        myAccount();
        clickByLinkedText("Sign In");
        typeByCss("[type='email']","zan.sheum@gmail.com");
        typeByCss("[type='password']","testMySelenium123#@");
        clickByCss("[type='submit']");
    }

}
