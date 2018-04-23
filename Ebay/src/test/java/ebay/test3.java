package ebay;

import main.test4;
import org.testng.annotations.Test;

public class test3 extends test4 {
    //sort by heighest price
    @Test
    public void testMouseHover() throws InterruptedException {
        mouseHoverToSort();
    }
}
