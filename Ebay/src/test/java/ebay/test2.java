package ebay;

import base.CommonAPI;
import main.SearchMultipleItems;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class test2 extends CommonAPI {


    public void test3() {
    SearchMultipleItems refVar = PageFactory.initElements(driver,SearchMultipleItems.class);
        refVar.searchItems();
}
    @Test
    public void test4(){
        clickByLinkedLink("All Categories");
        clickByCss("[class='cg-nav-wrapper cg-nav-wrapper-row-2'] .anchor5-wrap .desc");
        /*ViewMultipleItems refVar = new ViewMultipleItems();
        refVar.categories();*/
    }
}
