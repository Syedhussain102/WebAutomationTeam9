package Clicks;

import base.CommonAPI;
import org.testng.annotations.Test;

public class ableToChooseMovie extends CommonAPI {

    @Test
    public void AbleToclickonmovies() {
        clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div[1]/div[2]/div/div/ul/li[2]/div/a");
        clickByXpath("/html/body/main/div[2]/div/div/div[1]/section/div/div/div/div[1]/a/div[1]/img");
        clickByXpath("//div[@class='__player-placeholder-play-button'][1]");

    }
}
