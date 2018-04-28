package facebook;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LogIn extends CommonAPI {
@Test
    public void login(String email,String password){
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
    }
}
