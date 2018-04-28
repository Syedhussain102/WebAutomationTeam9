package ebay;

import base.CommonAPI;
import main.Search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class SearchTest extends CommonAPI {
    //search for a laptop
    //@Test
    public void searchLaptop(){
        Search search = PageFactory.initElements(driver, Search.class);
        search.lookForALaptop();
    }
    //search for a laptop  and define group apple
    //@Test
    public void group(){
        Search search = PageFactory.initElements(driver, Search.class);
        search.group();
    }
    //SearchMultipleItems
    //@Test
    public void test3() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.searchItems();
    }
}
