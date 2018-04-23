package ebay;

import base.CommonAPI;
import main.Search;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;

public class searchTest extends CommonAPI {
    //search for a laptop
    //@Test
    public void searchLaptop(){
        Search refVar = PageFactory.initElements(driver, Search.class);
        refVar.lookForALaptop();
    }
    //search for a laptop  and define group apple
    //@Test
    public void group(){
        Search refVar = PageFactory.initElements(driver, Search.class);
        refVar.group();
    }
    //search for a laptop  and define group apple,sort by heighest price
    //@Test
    public void testMouseHover() throws InterruptedException {
        Search refVar = PageFactory.initElements(driver, Search.class);
        refVar.mouseHoverToSort();
    }
    //SearchMultipleItems
    //@Test
    public void test3() {
        Search refVar = PageFactory.initElements(driver,Search.class);
        refVar.searchItems();
}
    //view multiple items
    //@Test
    public void categories(){
        List<WebElement> menu = getElementsByCSSforList("[aria-label=\'Select a category for search\']");
        for (WebElement search : menu) {
            System.out.println(search.getText());
        }
    }


}
