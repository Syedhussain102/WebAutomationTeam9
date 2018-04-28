package bestBuy;

import main.CheckBestBuyHome;
import org.testng.annotations.Test;

public class TestBestBuyHome extends CheckBestBuyHome {
    //my best buy
    @Test
    public void testBuy(){
       // clickByXpath("//*[@id='modal625']/div/div/div[1]/button/span[2]");
        myBestBuy();
    }
    //CREDIT CARDS ›
    //@Test
    public void Creditl(){
        creditCards();
    }
    //ORDERS & RETURNS ›
    //@Test
    public void orderNreturns(){
        OnR();
    }
    //SUPPORT & SERVICES ›
    //@Test
    public void supportNservices(){
        support();
    }
    //others
    //@Test
    public void othersBestBuy(){
        others();
    }
}
