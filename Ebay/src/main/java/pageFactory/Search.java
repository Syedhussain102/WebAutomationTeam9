package pageFactory;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Search extends CommonAPI {
    ran r = new ran();
    //search for a laptop,

    public void lookForALaptop() {
        ran.search.sendKeys("laptop", Keys.ENTER);
    }
    // define group apple
    @FindBy(xpath = "//a[contains(text(),'Apple Laptops')]")
    public static WebElement group;
    public void group() {
        lookForALaptop();
        group.click();
    }
    //SearchMultipleItems
    @FindBy(xpath = "//input[@id='gh-ac']")
    public WebElement searchElements;
    public void searchItems() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("laptop");
        itemsList.add("cell Phone");
        itemsList.add("guitar");
        for (String st : itemsList) {
            searchElements.sendKeys(st, Keys.ENTER);
            searchElements.clear();
        }
    }
}
