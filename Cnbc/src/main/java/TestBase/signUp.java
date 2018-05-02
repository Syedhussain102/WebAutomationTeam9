package TestBase;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class signUp extends CommonAPI {
        public void register() throws InterruptedException {
            Actions action = new Actions(driver);
            action.moveToElement(driver.findElement(By.xpath("//i[@class='fa fa-user fa-2']"))).build().perform();
            driver.findElement(By.xpath("//*[@id='unreg-user']/li/ul/li[1]")).click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            /* WebElement myFrame=driver.findElement(By.xpath("//div[@id='surf-xdm']/iframe[@name='easyXDM_default7303_provider']"));
            driver.switchTo().frame(myFrame);*/
            driver.switchTo().frame("easyXDM_default965_provider");
            driver.findElement(By.xpath("//input[@name='user_data.email']")).sendKeys("testuserabcd13@gmail.com",Keys.ENTER);
            driver.findElement(By.xpath("//input[@name='user_data.password']")).sendKeys("testabcd1234",Keys.ENTER);
            driver.findElement(By.xpath("//input[@name='user_data.username']")).sendKeys("testuser");
            //driver.findElement(By.xpath("//span[text()='Sign up']")).click();

        }
    }

