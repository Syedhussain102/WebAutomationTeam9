package Base;

import TestBase.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeeInfo extends CommonAPI {
    public void seeInfo(){
        mouseHoverByXpath("//a[text()='News'][1]");

        List<WebElement> list =driver.findElements(By.xpath("//*[@id='nav']/li[2]/ul//li//a"));
        System.out.println(list.size());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getText());
        }
    }

}
