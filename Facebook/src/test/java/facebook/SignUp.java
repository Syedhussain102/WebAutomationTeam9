package facebook;


import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignUp extends CommonAPI {

    @Test
    public void test1() throws InterruptedException {
        driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='firstname']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='lastname']")).sendKeys("user");
        driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='reg_email__']")).sendKeys("testuserabcd13@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"u_0_l\"]")).sendKeys("testuserabcd13@gmail.com");
        driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='reg_passwd__']")).sendKeys("testabcd1234");
        driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
        driver.findElement(By.xpath("//*[@id=\"month\"]/option[10]")).click();
        driver.findElement(By.xpath("//select[@name='birthday_day']")).click();
        driver.findElement(By.xpath("//*[@id=\"day\"]/option[17]")).click();
        driver.findElement(By.xpath("//select[@name='birthday_year']")).click();
        driver.findElement(By.xpath("//*[@id=\"year\"]/option[40]")).click();
        driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();



        //driver.findElement(By.name("websubmit")).click();
    }
}
