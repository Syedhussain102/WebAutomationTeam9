package ebay;

import base.CommonAPI;
import main.SearchMultipleItems;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;

public class test2 extends CommonAPI {

    public void test3() {
    SearchMultipleItems refVar = PageFactory.initElements(driver,SearchMultipleItems.class);
        refVar.searchItems();
}

    //view multiple items
    public void categories(){
    List<WebElement> menu = driver.findElements(By.id("gh-cat-box"));
    for(WebElement search : menu) {
        System.out.println(search.getText());
    }

}

    public void selectM(){
        getElementList("ID","gh-cat");

    }

}
