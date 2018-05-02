package base;

import TestBase.search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class searchTest extends search {
    @Test
    public void test3() {
        search sc = PageFactory.initElements(driver, search.class);
        sc.searchItems();
    }
}
