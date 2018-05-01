package TestBase;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TagNameClass extends CommonAPI {
    public void viewMultipleByXpath() {
        List<WebElement> menu = getElementsByXpathforList("//a[text()='News'][1]");
        //Actions action =new Actions(driver);
        //action.moveToElement(driver.findElement(By.xpath("//a[text()='News'][1]"))).build().perform();
        for (WebElement search : menu) {
            System.out.println(search.getText());
        }
    }
}