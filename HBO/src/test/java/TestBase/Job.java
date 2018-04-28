package TestBase;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Job extends CommonAPI {
    @Test
    public void lookForJob(){
        clickByXpath("/html//main/div[11]/div/div//ul[@class='modules/FooterLinks--links modules/FooterLinks--topLinks']//a[@href='https://hbocareers.com/']");
        switchTabs(0,1);
        driver.findElement(By.xpath("/html/body/main/section[1]/div/div[2]/div/form/table/tbody/tr/td[1]/input")).sendKeys("SOFTWARE ENGINEER",Keys.ENTER);
        driver.manage().window().fullscreen();
        clickByXpath("//button[@class='ui-multiselect ui-widget ui-state-default ui-corner-all ui-state-active']");
        clickByXpath("/html/body/div[6]/div/ul/li[1]/a/span[2]");

    }

}
