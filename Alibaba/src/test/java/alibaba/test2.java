package alibaba;

import base.CommonAPI;
import main.SearchMultipleItems;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class test2 extends CommonAPI {

    @Test
    public void test3() {
    SearchMultipleItems refVar = PageFactory.initElements(driver,SearchMultipleItems.class);
        refVar.searchItems();
}
}
