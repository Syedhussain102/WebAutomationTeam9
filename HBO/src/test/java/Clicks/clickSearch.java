package Clicks;

import TestBase.CommonAPI;
import org.testng.annotations.Test;

public class clickSearch extends CommonAPI {
    @Test

    public void clicksearch(){
        //mainClass obj = new mainClass();
        //ss("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div");
        clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div");

    }


}
