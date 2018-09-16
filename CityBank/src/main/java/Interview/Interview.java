package Interview;

import base.CommonAPI;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;


public class Interview extends CommonAPI {

    //@Test    //Take ScreenShoot
    public void screenShoot() throws IOException {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("/Users/zann/Desktop/JiraHome.png"));
    }


    //@Test     //
    public void testWebDriverWait() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='creditCards']/a[@href='https://www.citi.com/credit-cards/citi.action']")));

        wait.until(ExpectedConditions.alertIsPresent());
    }

    //@Test
    public void ScrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,500)");
        WebElement link = driver.findElement(By.linkText("Learn More"));
        js.executeScript("arguments[0].scrollIntoView(true);", link);

    }


    //@Test
    public void keysMouse() {
        WebElement name = driver.findElement(By.xpath("//*[@id=\"usernameMasked\"]"));
        clickByXpath("//*[@id=\"usernameMasked\"]");
        Actions actions = new Actions(driver);
        actions.keyDown(name, Keys.SHIFT).sendKeys(name, "siam").doubleClick().
                build().perform();

    }

    //@Test
    public void window() {
        System.out.println(driver.manage().window().getSize());
        Dimension dimension = new Dimension(800, 800);
        //driver.manage().window().setSize(dimension);

        ((JavascriptExecutor) driver).executeScript("window.resizeTo(800,800);");
    }

    //@Test //          DropDown
    public void dropDown() {
        WebElement dropDown = driver.findElement(By.xpath("xpath"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("text");
        select.selectByIndex(1);
        select.selectByValue("option2");
    }

    //@Test
    public void switchTo() {
        driver.switchTo().window("window_name");
        driver.switchTo().frame("frameName or ID");
        driver.switchTo().alert();


    }


}
