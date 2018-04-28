package ebay;

import main.CheckEbayHome;
import org.testng.annotations.Test;

public class TestEbayHome extends CheckEbayHome {
    //buy
    //@Test
    public void testBuy(){
        Buy();
    }
    //Sell
    //@Test
    public void testSell(){
        Sell();
    }
    //T&A
    //@Test
    public void toolsNapps(){
        TnA();
    }
    //Companies
    //@Test
    public void ebayCompanies(){
        companies();
    }
    //about Ebay
    //@Test
    public void aboutEbay(){
        about();
    }
}
