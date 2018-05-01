package TestBase;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mainClass extends CommonAPI {
    public void homeUs(){
        driver.findElement(By.xpath("//span[contains(text(),'HOME U.S.')]")).click();
    }
    public void news(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[text()='News'][1]"))).build().perform();
        driver.findElement(By.xpath("//a[text()='Energy']")).click();
    }
    public void markets(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[text()='Markets'][1]"))).build().perform();
        driver.findElement(By.xpath("//a[text()='Cryptocurrency']")).click();
    }
    public void investing(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[text()='Investing'][1]"))).build().perform();
        driver.findElement(By.xpath("//a[text()='Futures Now'][1]")).click();
    }
    public void tech(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[text()='Tech'][1]"))).build().perform();
        driver.findElement(By.xpath("//a[text()='Gaming']")).click();
    }
    public void makeIt(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[text()='Make It'][1]"))).build().perform();
        driver.findElement(By.xpath("//a[text()='Leadership']")).click();
    }
    public void video(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[text()='Video'][1]"))).build().perform();
        driver.findElement(By.xpath("//a[text()='Latest Video'][1]")).click();
    }
    public void shows(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[text()='Shows'][1]"))).build().perform();
        driver.findElement(By.xpath("//a[text()='Watch Live']")).click();
    }
    public void subscribe(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//li[@id='bx-subscribe-anchor-342017']"))).build().perform();
    }
    public void pro(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[text()='Pro'][1]"))).build().perform();
        driver.findElement(By.xpath("//a[text()='Take a Tour']"));
        //driver.findElement(By.xpath("//div[@class='cnbc-popup-close-btn']")).click();
    }
    public void liveTv(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[text()='LIVE TV']"))).build().perform();
        driver.findElement(By.xpath("//a[text()='Watch CNBC TV")).click();
    }
    public void watchList(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[text()='WATCHLIST']"))).build().perform();
        driver.findElement(By.xpath("")).click();
    }
    public void breakingNews(){
        driver.findElement(By.xpath("//div[contains(text(),'Breaking News')]")).click();
    }
    public void itemSearch(){
        driver.findElement(By.xpath("//*[@placeholder='Search Quotes, News & Video']")).sendKeys("VERIZON",Keys.ENTER);
        driver.findElement(By.xpath("//*[@class='fa fa-search fa-2']")).click();
    }
    public void work(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//i[@class='fa fa-user fa-2']"))).build().perform();
        driver.findElement(By.xpath("//*[@id='unreg-user']/li/ul/li[1]")).click();

    }
    public void work2() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//i[@class='fa fa-user fa-2']"))).build().perform();
        driver.findElement(By.xpath("//*[@id='signin']")).click();
        Thread.sleep(10000);
        driver.switchTo().frame("");

        driver.findElement(By.xpath("//input[@id='input_username']")).sendKeys("tester1");
    }
    public void career(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[text()='Make It'][1]"))).build().perform();
        driver.findElement(By.xpath("//a[text()='Careers']")).click();
    }

}

