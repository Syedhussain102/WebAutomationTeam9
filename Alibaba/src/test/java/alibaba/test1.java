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
//search for a item and give me all prices on the first page
    @Test
    public void printAllPrices(){
        typeByCssNEnter(".ui-searchbar-size-middle [type=\"text\"]","laptop");
        getTextFromWebElements("id","a2700.7724838.2017115.i0.1c1b792euIOB5S");
    }

}
