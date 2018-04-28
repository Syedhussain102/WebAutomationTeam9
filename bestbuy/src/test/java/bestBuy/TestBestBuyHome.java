package bestBuy;

import main.CheckBestBuyHome;
import org.testng.annotations.Test;

public class TestBestBuyHome extends CheckBestBuyHome {
    //my best buy
    @Test
    public void testBuy(){
        myBestBuy();
    }
    //CREDIT CARDS ›
    @Test
    public void Creditl(){
        creditCards();
    }
    //ORDERS & RETURNS ›
    @Test
    public void orderNreturns(){
        OnR();
    }
    //SUPPORT & SERVICES ›
    @Test
    public void supportNservices(){
        support();
    }
    //others
    @Test
    public void othersBestBuy(){
        others();
    }
}
