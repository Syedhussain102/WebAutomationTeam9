package TestBase;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class searchMultipleItems extends CommonAPI {
    @Test
    public void searchMultipleItems(){
        //clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div");
        mainClass search =PageFactory.initElements(driver,mainClass.class);
        search.searchItems();

    }
}
