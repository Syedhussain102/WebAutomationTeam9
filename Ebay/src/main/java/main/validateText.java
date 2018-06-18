package main;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class validateText extends CommonAPI {

    public void validation() {
        String expected = "We're committed to providing a secure and fair marketplace for our buyers and sellers. To support this commitment, we've put in place rules and policies that govern our expectations of buyers and sellers, the actions we'll take to keep you safe, and how we'll protect you if something goes wrong.";
        clickByLinkedText("Policies");
        WebElement actual = driver.findElement(By.cssSelector(".article_desc p"));
        Assert.assertEquals(actual.getText(),expected);

    }

    public void JS(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
    }
}
