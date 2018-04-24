package TestBase;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class mainClass extends CommonAPI {


    @FindBy(xpath = "//input[@type='text' and @class='components/Search--searchInput']")
    public WebElement searchElements;
    public void searchItems() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("West world");
        itemsList.add("Kong");
        itemsList.add("Fantastic Beast and Where TO Find Them");

        for (String st : itemsList) {
            driver.findElement(By.xpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div"));
            searchElements.sendKeys(st,Keys.ENTER);
            searchElements.clear();




        }


    }



}
