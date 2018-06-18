package Interview;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JavaScriptExecutor extends CommonAPI {
    @Test
            public void test1(){
    JavascriptExecutor js = (JavascriptExecutor)driver ;
    js.executeScript("document.getElementByID(\"//input[@id='username']\").value='naim'");

    }
}
