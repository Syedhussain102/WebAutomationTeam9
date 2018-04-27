package Clicks;

import base.CommonAPI;
import org.testng.annotations.Test;

public class SeriesClickTest extends CommonAPI {
    @Test
    public void clickonseries(){
        clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div[1]/div[2]/div/div/ul/li[1]/div/a");
    }
}
