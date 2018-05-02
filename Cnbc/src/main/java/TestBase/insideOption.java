package TestBase;

import base.CommonAPI;

public class insideOption extends CommonAPI {
    public void Economy(){
        mouseHoverNClickbyXC("//a[text()='News'][1]","ECONOMY");
        clickByXpath("//a[contains(text(),'World Economy')][1]");
        clickByXpath("//a[contains(text(),'US Economy')][1]");
        clickByXpath("//a[contains(text(),'The Fed')][1]");
        clickByXpath("//a[contains(text(),'Central Banks')][1]");
        clickByXpath("//a[contains(text(),'Jobs')][1]");
    }
    public void Finance(){
        mouseHoverNClickbyXC("//a[text()='News'][1]","FINANCE");
        clickByXpath("//a[contains(text(),'Banks')][1]");
        clickByXpath("//a[contains(text(),'Investing')][1]");
        clickByXpath("//a[contains(text(),'Wall Street')][1]");
        clickByXpath("//a[contains(text(),'Hedge Funds')][1]");
        clickByXpath("//a[contains(text(),'M&A')][1]");
        clickByXpath("//a[contains(text(),'Insurance')][1]");
        clickByXpath("//a[contains(text(),'Venture Capital')][1]");
    }
    public void healthCare(){
        mouseHoverNClickbyXC("//a[text()='News'][1]","HEALTH CARE");
        clickByXpath("//a[contains(text(),'Hospital Insurance')][1]");
        clickByXpath("//a[contains(text(),'Pharma')][1]");
        clickByXpath("//a[contains(text(),'Hospitals')][1]");
        clickByXpath("//a[contains(text(),'Modern Medicine')][1]");
    }
    public void realEstate(){
        mouseHoverNClickbyXC("//a[text()='News'][1]","REAL ESTATE");
        clickByXpath("//a[contains(text(),'Housing')][1]");
        clickByXpath("//a[contains(text(),'Mortgages')][1]");
        clickByXpath("//a[contains(text(),'Construction')][1]");
        clickByXpath("//a[contains(text(),'Commercial Real Estate')][1]");
        clickByXpath("//a[contains(text(),'Reits')][1]");
    }
    public void wealth(){}
    public void autos(){}
    public void earnings(){}
    public void energy(){}
    public void life(){}
    public void media(){}
    public void politics(){}
    public void retails(){}
    public void commentary(){}
    public void specialReports(){}
    public void asia(){}
    public void europe(){}
    public void cfoCouncil(){}

}
