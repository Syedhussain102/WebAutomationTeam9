package citybank;

import org.testng.annotations.Test;


public class testHomePage {

    @Test
    public void CitiBankTitle() {
        String titleActual = "Banking with Citi | Citi.com";
        //Assert.assertEquals(titleActual, driver.getTitle());
        //System.out.println(driver.getTitle());
    }

    @Test
    public void Citibankurl() {
        String urlActual = "https://online.citi.com/US/login.do";
        //Assert.assertEquals(urlActual,driver.getCurrentUrl());
        //System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void Citibanklogo() {
        String logoActual = "https://online.citi.com/US/login.do";
        //System.out.println(driver.getPageSource());
    }

    @Test
    public void clickcreditcardTag() {
        //clickbuttonbyCSS("#creditCards>a");

    }

    @Test
    public void CreditcardTitle() {
        String ActualTitle = "Banking with Citi | Citi.com";
        //Assert.assertEquals(ActualTitle,driver.getTitle());
        //System.out.println(driver.getTitle());
    }

    @Test
    public void clickBankingTab() {
        //navigateback();
        //clickbuttonbyCSS("#banking>a");

    }

    @Test
    public void clicklandingTab() {
        //navigateback();
        //clickbuttonbyCSS("#lending");

    }

    @Test
    public void clickinvestingTab() {
        //navigateback();
        //clickbuttonbyCSS("#investing");
    }

    @Test
    public void clickcitigoldTab() {
        //navigateback();
        //clickbuttonbyCSS("#primary-nav>ul>li>a");
    }

    @Test
    public void brokenlinksInHP() {
        // brokenLinks();
    }


}
