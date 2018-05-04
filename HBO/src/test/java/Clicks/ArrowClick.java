package Clicks;

import TestBase.CommonAPI;
import org.testng.annotations.Test;

public class ArrowClick extends CommonAPI {
    @Test
    public void clickingonarrow() throws InterruptedException {
        clickByXpath("/html/body/main/div[4]/div/div/div[1]/div[2]/div[2]/section/div/button[2]/div");
        clickByXpath("/html/body/main/div[4]/div/div/div[1]/div[2]/div[2]/section/div/button[2]/div");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickByXpath("/html/body/main/div[4]/div/div/div[1]/div[2]/div[2]/section/div/button[1]/div");
        //clickByXpath("/html/body/main/div[4]/div/div/div[1]/div[2]/div[2]/section/div/button[1]/div");
    }

}
