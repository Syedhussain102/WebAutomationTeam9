package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ran {
    @FindBy(xpath = "//input[@id='gh-ac']")
    public static WebElement search;


    public static String a() {
        String x = null;
        try {
            int a = 1 / 0;
        } catch (Exception ee) {
            x = "Exception";
            System.out.println(x);
        }
        return x;
    }

    public static void main(String[] args) {


        try {
            a();
        } catch (Exception ee) {

        }
    }

}
