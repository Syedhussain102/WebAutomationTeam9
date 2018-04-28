package bestBuy;

import main.MainBestBuy;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class testBestBuy extends MainBestBuy {
    //view multiple items
    //@Test
    public void view(){
        viewMultipleByCSS(".list-items .list-item:nth-of-type(1) h4");
    }

    //extended search
    //@Test
    public void ExtendedSearch() throws InterruptedException {
        xtendedSearches();
    }

    //search different parameters
    //@Test
    public void searcfDifferent(){
        searchWithDifferentRequirements();
    }

    //test tab
    //@Test
    public void testNewTab(){
        newTab();
    }

    //use TAB
    //@Test
    public void testTabButton() throws InterruptedException {
        tabUse();
    }
    //using scrolling
    @Test
    public void scroolupanddown() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,2000)");
       Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("scroll(50,0)");

    }


}
