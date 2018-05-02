package TestBase;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

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
        //mouseHoverNClickbyXC("//a[text()='News'][1]","CFO COUNCIL");
    }
    public void markets(){
        mouseHoverNClickbyXC("//a[text()='Markets'][1]","PRE-MARKETS");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='Markets'][1]","U.S");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='Markets'][1]","ASIA");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='Markets'][1]","EUROPE");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='Markets'][1]","STOCKS");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='Markets'][1]","COMMODITIES");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='Markets'][1]","CURRENCIES");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='Markets'][1]","CRYPTOCURRENCY");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='Markets'][1]","BONDS");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='Markets'][1]","FOUNDS");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='Markets'][1]","ETFs");
    }

    public void investing(){
        mouseHoverNClickbyXC("//a[text()='Investing'][1]","TRADING NATION");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='Investing'][1]","TRADER TALK");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='Investing'][1]","FINANCIAL ADVISORS");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='Investing'][1]","PERSONAL FINANCE");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='Investing'][1]","ETS STREET");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='Investing'][1]","FUTURES NOW");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='Investing'][1]","OPTIONS ACTION");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='Investing'][1]","PORTFOLIO");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='Investing'][1]","WATCHLIST");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='Investing'][1]","STOCK SCREENER");
        navigateBack();
        mouseHoverNClickbyXC("//a[text()='Investing'][1]","FUND SCREENER");
    }
    public void tech(){
        mouseHoverNClickbyXC("//a[text()='Tech'][1]","MOBILE");
        mouseHoverNClickbyXC("//a[text()='Tech'][1]","SOCIAL MEADIA");
        mouseHoverNClickbyXC("//a[text()='Tech'][1]","ENTERPRISE");
        mouseHoverNClickbyXC("//a[text()='Tech'][1]","GAMING");
        mouseHoverNClickbyXC("//a[text()='Tech'][1]","CYBERSECURITY");
        mouseHoverNClickbyXC("//a[text()='Tech'][1]","TECH GUIDE");
    }
    public void makeIt(){
        mouseHoverNClickbyXC("//a[text()='Make It'][1]","ENTERPRENEURS");
        mouseHoverNClickbyXC("//a[text()='Make It'][1]","LEADERSHIP");
        mouseHoverNClickbyXC("//a[text()='Make It'][1]","CAREERS");
        mouseHoverNClickbyXC("//a[text()='Make It'][1]","MONEY");
        mouseHoverNClickbyXC("//a[text()='Make It'][1]","SPECIALS");
        mouseHoverNClickbyXC("//a[text()='Make It'][1]","PRIMETIME");
    }
    public void video(){
        mouseHoverNClickbyXC("//a[text()='Video'][1]","TOP VIDEO");
        mouseHoverNClickbyXC("//a[text()='Video'][1]","LATEST VIDEO");
        mouseHoverNClickbyXC("//a[text()='Video'][1]","U.S VIDEO");
        mouseHoverNClickbyXC("//a[text()='Video'][1]","ASIA VIDEO");
        mouseHoverNClickbyXC("//a[text()='Video'][1]","EUROPE VIDEO");
        mouseHoverNClickbyXC("//a[text()='Video'][1]","CEO INTERVIEWS");
        mouseHoverNClickbyXC("//a[text()='Video'][1]","ANALYST INTERVIEWS");
        mouseHoverNClickbyXC("//a[text()='Video'][1]","FULL EPISODES");
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



        driver.findElement(By.xpath("//input[@id='input_username']")).sendKeys("tester1");
    }
    public void career(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[text()='Make It'][1]"))).build().perform();
        driver.findElement(By.xpath("//a[text()='Careers']")).click();
    }

}

