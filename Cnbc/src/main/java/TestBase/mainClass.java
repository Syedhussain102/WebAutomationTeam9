package TestBase;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mainClass extends CommonAPI {
    public void homeUs(){
        mouseHoverNClickbyXC("//span[contains(text(),'HOME U.S.')]","U.S EDITION");
        navigateBack();
        mouseHoverNClickbyXC("//span[contains(text(),'HOME U.S.')]","INTL EDITION");
    }

    public void newss(){
        mouseHoverNClickbyXC("//a[text()='News'][1]","ECONOMY");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='News'][1]","FINANCE");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='News'][1]","HEALTH CARE");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='News'][1]","REAL ESTATE");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='News'][1]","WEALTH");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='News'][1]","AUTOS");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='News'][1]","EARNINGS");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='News'][1]","ENERGY");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='News'][1]","LIFE");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='News'][1]","MEDIA");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='News'][1]","POLITICS");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='News'][1]","RETAIL");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='News'][1]","COMMENTARY");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='News'][1]","SPECIAL REPORTS");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='News'][1]","ASIA");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='News'][1]","EUROPE");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='News'][1]","CFO COUNCIL");


    }
    public void markets(){
        mouseHoverNClickbyXC("//a[text()='Markets'][1]","CRYPTOCURRENCY");
    }
    public void investing(){
        mouseHoverNClickbyXC("//a[text()='Investing'][1]","FUTURES NOW");
    }
    public void tech(){
        mouseHoverNClickbyXC("//a[text()='Tech'][1]","GAMING");
    }
    public void makeIt(){
        mouseHoverNClickbyXC("//a[text()='Make It'][1]","LEADERSHIP");
    }
    public void video(){
        mouseHoverNClickbyXC("//a[text()='Video'][1]","LATEST VIDEO");
    }
    public void shows(){
        mouseHoverNClickbyXC("//a[text()='Shows'][1]","WATCH LIVE");
    }
    public void subscribe(){
        mouseHoverByXpath("//li[@id='bx-subscribe-anchor-342017']");
    }
    public void pro(){
        mouseHoverNClickbyXC("//a[text()='Pro'][1]","TAKE A TOUR");
    }
    public void liveTv(){
        mouseHoverNClickbyXC("//a[text()='LIVE TV']","WATCH CNBC TV");
    }
    public void watchList(){
       mouseHoverByXpath("//a[text()='WATCHLIST']");
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

