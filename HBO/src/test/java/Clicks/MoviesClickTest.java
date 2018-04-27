package Clicks;

import base.CommonAPI;
import org.testng.annotations.Test;

public class MoviesClickTest extends CommonAPI {
    @Test
    public void clickonmovies(){
        clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div[1]/div[2]/div/div/ul/li[2]/div/a");
    }
}
