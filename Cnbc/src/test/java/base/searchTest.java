package base;

import TestBase.search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class searchTest extends search {
    //@Test
    public void searchMultipleIteams() {
        search sc = PageFactory.initElements(driver, search.class);
        sc.searchItems();
    }
    //@Test
    public void searchOneItem(){ searchItems();}
    @Test
    public void exTest() throws IOException {
        excelTest();

    }
}
