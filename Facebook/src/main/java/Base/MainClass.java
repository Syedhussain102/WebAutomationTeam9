package Base;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class MainClass extends CommonAPI {
    public void login() {
        typeByXpath("//input[@name='email']","testuserabcd13@gmail.com");
        typeByXpath("//input[@name='pass']","testabcd1234");
        clickByXpath("//input[@value='Log In']");
        Actions action =new Actions(driver);
        action.sendKeys(Keys.ESCAPE).perform();
        action.sendKeys(Keys.ESCAPE).perform();
    }
}
