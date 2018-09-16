package pageFactory;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Search extends CommonAPI {
    // define group apple
    @FindBy(xpath = "//a[contains(text(),'Apple Laptops')]")
    public static WebElement group;
    //search for a laptop,
    //SearchMultipleItems
    @FindBy(xpath = "//input[@id='gh-ac']")
    public WebElement searchElements;
    ran r = new ran();

    public void lookForALaptop() {
        ran.search.sendKeys("laptop", Keys.ENTER);
    }

    public void group() {
        lookForALaptop();
        group.click();
    }

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
