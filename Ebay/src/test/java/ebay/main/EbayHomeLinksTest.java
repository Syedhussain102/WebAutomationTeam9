package ebay.main;

import main.EbayHomeLinks;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class EbayHomeLinksTest extends EbayHomeLinks {
    //buy
    @Test(groups = {"1"})
    public void testBuy(){
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Buy();
    }
    //Sell
    @Test(groups = {"2"})
    public void testSell(){
 //       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Sell();
    }
    //T&A
   @Test(groups = {"1"})
    public void toolsNapps(){
 //       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TnA();
    }
    //Companies
    @Test(groups = {"2"})
    public void ebayCompanies(){
 //       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        companies();
    }
    //about Ebay
    //@Test
    public void aboutEbay() throws InterruptedException {
 //       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //about();
    }
}
