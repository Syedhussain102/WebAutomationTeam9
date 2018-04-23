package ebay;

import base.CommonAPI;
import main.Login;
import main.Search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class test1 extends CommonAPI {
    //Go to my account
    //@Test
    public void myAccount(){
        Login refVar = PageFactory.initElements(driver,Login.class);
        refVar.myAccount();
    }
    //search for a laptop
    //@Test
    public void searchLaptop(){
    Search refVar = PageFactory.initElements(driver, Search.class);
    refVar.lookForALaptop();
}
    //define group apple
    //@Test
    public void group(){
        Search refVar = PageFactory.initElements(driver, Search.class);
        refVar.group();

    }
    public void addToCart(){
        typeByCssNEnter(".ui-searchbar-size-middle [type=\"text\"]","iphone");
        clickByLinkedLink("Hot 2018 phone case cover for iphone X, tpu pc card slot case pouch mobile cover for iphone X 8 6s plus hybrid case");
        switchTabs(0,1);
        clickByCss("#J-btn-order");

    }

}
