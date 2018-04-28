package ebay;

import base.CommonAPI;
import main.Search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

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

    //SearchMultipleItems
    //@Test
    public void test3() {
        Search refVar = PageFactory.initElements(driver,Search.class);
        refVar.searchItems();
}
    //
    @Test
    public void testExcel() throws IOException {
        Search refVar = PageFactory.initElements(driver,Search.class);
        refVar.searchItemsAndSubmitButton();
    }




}
