package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.lang.annotation.Target;

public class test1 extends CommonAPI{
    @Test
    public void test1(){
        mouseHoverNClickbyXC("//ul[@id='unreg-user']//a[@href='javascript:void(0)']/i","LOG IN");

        driver.switchTo().frame("//div[@id='surf-xdm']/iframe[@name='easyXDM_default7303_provider']");

        driver.switchTo().frame("/html//iframe[@id='display-frame']");

        clickByXpath("//div[@id='newTabsContainer']/ul[@class='tab']/li[@class='first']/a[@href='#']");
       //typeByCss("#input_username","Siam");
        typeByXpath("//input[@id='input_username']","siam");
        //clickByXpath("//*[@id='newTabsContainer']/ul/li[2]/a");
        //driver.findElement(By.id("input_username")).sendKeys("Siam");
        //clickByLinkedText("reset your password");
    }
}
