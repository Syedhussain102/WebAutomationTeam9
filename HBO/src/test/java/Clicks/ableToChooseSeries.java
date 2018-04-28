package Clicks;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ableToChooseSeries extends CommonAPI {
    @Test
    public void clickonseries() throws InterruptedException {
        clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div[1]/div[2]/div/div/ul/li[1]/div/a");
        ((JavascriptExecutor) driver).executeScript("scroll(0,2500)");
        Thread.sleep(2000);
        clickByXpath("/html/body/main/div[7]/div/div/div[1]/section/div/div/div/div[2]/a/div[1]/img");
        clickByXpath("//div[@class='__player-placeholder-play-button']");
        Thread.sleep(3000);
        navigateBack();
        ((JavascriptExecutor) driver).executeScript("scroll(500,0)");


    }
}
