package TestBase;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class test1 extends CommonAPI {

    @Test
    public void test1() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='text' and @class='components/Search--searchInput']")).sendKeys("game of thrones",Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div/div[1]/div[2]/div/div[2]/div[2]/div[4]/a/span/span[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='__player-placeholder-play-button'][1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='components/HeroVideo--wrapper']//button[@class='__player-overlay-button-close']/i")).click();

//       Alert alert=driver.switchTo().alert();
//       System.out.println();
//       alert.accept();
//
        driver.findElement(By.xpath("/html/body/main/div[7]/div/div/div[1]/div/div/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div[2]")).click();

    }
}

