package main;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ViewMultipleItems extends CommonAPI {
    //view multiple items

    public void categories(){
    List<WebElement> menu = driver.findElements(By.id("gh-cat-box"));

    for(WebElement search : menu) {
        System.out.println(search.getText());
    }

    }

    /*@Test
    public void categories(){
        typeByXpathNEnter("//input[@id='gh-ac']","Java");
    List<WebElement> menu = driver.findElements(By.className("s-item__price"));

    for(WebElement search : menu) {
        System.out.println(search.getText());
        System.out.println(menu.size());
    }
    }
}*/
}
