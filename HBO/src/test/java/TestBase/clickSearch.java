package TestBase;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class clickSearch extends CommonAPI {
    @Test

    public void clickSearch(){
        //mainClass obj = new mainClass();
        //ss("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div");
        clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div");

    }


}
