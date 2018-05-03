package base;

import TestBase.Search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class SearchTest extends Search {
    @Test
    public void searchMultipleIteams() {
        Search sc = PageFactory.initElements(driver, Search.class);
        sc.searchItems();
    }
    //@Test
    public void searchOneItem(){ searchItems();}
    @Test
    public void exTest() throws IOException {
        excelTest();

    }
}
