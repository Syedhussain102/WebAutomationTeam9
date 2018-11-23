package ebay.main;

import main.Messages;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class MessagesTest extends Messages {
    //go to my messages
    //@Test(groups = {"666"})
    public void MyMessage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        myMessages();
    }

    //create folder in messages
    // @Test(groups = {"777"})
    public void FolderInMessages() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        folderInMessages();
    }

    //@Test
    public void m() {
        clickByXpath("//ul[@id='gh-topl']//a[@href='https://ocsnext.ebay.com/ocs/home']", true);
        clickByXpath("/html//a[@id='gh-la']", true);
    }

    @Test
    public void mx() throws InterruptedException {
        Thread.sleep(20000);

    }

}
