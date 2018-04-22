package alibaba;

import base.CommonAPI;
import org.testng.annotations.Test;

public class test1 extends CommonAPI {
//Go to my account
@Test
    public void myAccount() throws InterruptedException {
        sleepFor(5);
        mouseHoverNClickbyXC (".J-sc-hd-ms-ma .sc-hd-ms-title-top","My Account");
        clickByLinkedLink("Join Free");
        sleepFor(2);
        switchTabs(1,0);
    }
//search for a laptop, define color black,category laptop,sort by response rate
@Test
    public void lookForALaptop(){
        typeByCssNEnter(".ui-searchbar-size-middle [type=\"text\"]","laptop");
        clickByLinkedLink("Laptops");
        //clickByLinkedLink("Transaction Level");

    }

    @Test
    public void addToCart(){
        typeByCssNEnter(".ui-searchbar-size-middle [type=\"text\"]","iphone");
        clickByLinkedLink("Hot 2018 phone case cover for iphone X, tpu pc card slot case pouch mobile cover for iphone X 8 6s plus hybrid case");
        switchTabs(0,1);
        clickByCss("#J-btn-order");
    }

}
