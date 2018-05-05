package main;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GoogleSheet extends CommonAPI {
    public void searchItems(){
        typeByXpathNEnter("//input[@id='gh-ac']","Java Books");
    }
    public List<String> getBooksName(){
        List<WebElement> bookList = driver.findElements(By.className("s-item__title"));
        List<String> bookname = new ArrayList<>();
        for(int i = 0;i<=3;i++){
            System.out.println(bookname.add(bookList.get(i).getText()));
        }
        return bookname;
    }
}
