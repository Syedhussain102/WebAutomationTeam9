package google.api;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GoogleSheetPageCnbc extends CommonAPI {
    // get actual result
    public void searchGaming(){
        typeByXpathNEnter("//*[@placeholder='Search Quotes, News & Video']","gaming");
    }
    //get the item info
    public List<String> getLinkName(){
       List<WebElement> linkLists= driver.findElements(By.xpath("//a[@class='dyother.dyMonitor']"));
       List<String> linkname=new ArrayList<>();
       for(int i=0;i<5;i++){
           System.out.println(linkname.add(linkLists.get(i).getText()));
       }
        return linkname;
    }
}
