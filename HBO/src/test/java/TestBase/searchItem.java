package TestBase;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class searchItem extends CommonAPI {
    @Test
    public void searchItem (){

        driver.findElement(By.xpath("//input[@type='text' and @class='components/Search--searchInput']")).sendKeys("game of thrones",Keys.ENTER);
    }

}
