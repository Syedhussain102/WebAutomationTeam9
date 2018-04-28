package ebay;

import main.MainEbay;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TestEbay extends MainEbay {
    @Test (priority = 1)
    public void mouse(){

       mouseHoverByXpath("//*[@id='s0-container']/li[3]/a","Vehicles");
    }
    //view multiple items
    @Test (priority = 2)
    public void view(){
        viewMultipleByCSS("[aria-label=\'Select a category for search\']");
    }
    //extended search
    //@Test (priority = 3)
    public void ExtendedSearch() throws InterruptedException {
        xtendedSearches();
    }
    //search problems
    @Test (priority = 4)
    public void Problems() throws InterruptedException {
        searchProblems();
    }

    //search different parameters
    @Test (priority = 5)
    public void searcfDifferent(){
        searchWithDifferentRequirements();
    }
    //edit categories
    @Test (priority = 6)
    public void editcategoriess(){
        editCategories();
    }
    //test tab
    @Test (priority = 7)
    public void testNewTab(){
        newTab();
    }
    //use TAB
    //@Test (priority = 8)
    public void testTabButton() throws InterruptedException {
        tabUse();
    }
    //using scrolling
    @Test (priority = 9)
    public void scroolupanddown() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,2000)");
       Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("scroll(50,0)");
    }
}
