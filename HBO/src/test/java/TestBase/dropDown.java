package TestBase;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

@Test
public class dropDown extends CommonAPI {
    public void dropdownmanu(){
        driver.findElement(By.xpath("/html//main/div[11]/div/div//ul[@class='modules/FooterLinks--links modules/FooterLinks--topLinks']//a[@href='https://hbocareers.com/']")).click();
        switchTabs(0,1);
        driver.findElement(By.xpath("/html/body/main/section[1]/div/div[2]/div/form/table/tbody/tr/td[1]/input")).sendKeys("SOFTWARE ENGINEER",Keys.ENTER);
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//button[@class='ui-multiselect ui-widget ui-state-default ui-corner-all' and @title='Area of Interest' ]")).click();
        driver.findElement(By.xpath("/html/body/div[7]/ul/li[3]")).click();
        driver.findElement(By.xpath("/html/body/div[7]/div/ul/li[3]/a/span")).click();

    }
}
