package Clicks;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class careers extends CommonAPI {
@Test
    public void clickcareers(){
        driver.findElement(By.xpath("/html//main/div[11]/div/div//ul[@class='modules/FooterLinks--links modules/FooterLinks--topLinks']//a[@href='https://hbocareers.com/']")).click();
    }

}
