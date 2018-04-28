package bestBuy;

import base.CommonAPI;
import main.Search;
import org.openqa.selenium.support.PageFactory;

public class searchTest extends CommonAPI {
    //search for a laptop
    //@Test
    public void searchLaptop(){
        Search refVar = PageFactory.initElements(driver, Search.class);
        refVar.lookForALaptop();
    }

    //search for a laptop  and define group apple
    //@Test
    public void viewChange(){
        Search refVar = PageFactory.initElements(driver, Search.class);
        refVar.view();
    }

    //SearchMultipleItems
    //@Test
    public void test3() {
        Search refVar = PageFactory.initElements(driver,Search.class);
        refVar.searchItems();
}




}
