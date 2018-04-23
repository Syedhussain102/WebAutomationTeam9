package ebay;
import base.CommonAPI;
import main.Login;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class loginTest extends CommonAPI {
    //Go to my account--messages
    //@Test
    public void myAccount(){
        Login refVar = PageFactory.initElements(driver,Login.class);
        refVar.myAccount();
    }
    @Test
    public void addToCart() {
        typeByXpathNEnter("/html//input[@id='gh-ac']","iphone");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        clickByXpath("//span[@class='prodsch-tooltip__close']");
        clickByXpath("//*[@id='item280a0dfce2']/h3/a");
        clickByCss("#binBtn_btn");
        //switchTabs(0,1);
        //clickByCss("#J-btn-order");

    }

}
