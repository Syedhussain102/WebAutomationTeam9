package ebay;

import main.MainEbay;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TestEbay extends MainEbay {
    @Test
    public void mouse(){
       mouseHoverByXpath("//*[@id='s0-container']/li[3]/a","Vehicles");
    }
    //view multiple items
    @Test
    public void view(){
        viewMultipleByCSS("[aria-label=\'Select a category for search\']");
    }
    //extended search
    @Test
    public void ExtendedSearch() throws InterruptedException {
        xtendedSearches();
    }
    //search problems
    @Test
    public void Problems() throws InterruptedException {
        searchProblems();
    }
    //search different parameters
    @Test
    public void searcfDifferent(){
        searchWithDifferentRequirements();
    }
    //edit categories
    @Test
    public void editcategoriess(){
        editCategories();
    }
    //test tab
    @Test
    public void testNewTab(){
        newTab();
    }
    //use TAB
    @Test
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
