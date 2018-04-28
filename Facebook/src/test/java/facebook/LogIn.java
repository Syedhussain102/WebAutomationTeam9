package facebook;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class LogIn extends CommonAPI {
@Test
    public void login() throws InterruptedException {

    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("team6.selenium");
    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("team612345");
    driver.findElement(By.xpath("//input[@value='Log In']")).click();
}
}
