package TimelinesScenario;

import Base.MainClass;

public class ScenarioMainClass extends MainClass {
    public void SearchFunction(){
        login();
        clickByXpath("//input[@class='_1frb']");
        typeByXpathNEnter("//input[@class='_1frb']","naim khan siam");
    }
    public void friendRequest(){
        login();
        typeByXpathNEnter("//input[@class='_1frb']","felicity smoak");
        clickByXpath("//div[@class='_4xjz'][contains(text(),'People')]");
        clickByXpath("//*[@class='_42ft _4jy0 FriendRequestAdd addButton _4jy3 _517h _51sy'][1]");
    }
    public void postAstatus(){
        login();
        clickByXpath("//a[@class='_2s25'][contains(text(),'Home')]");
        typeByXpath("//textarea[@class='_3en1 _480e navigationFocus']","this is a test");
        clickByXpath("//button[@class='_1mf7 _4jy0 _4jy3 _4jy1 _51sy selected _42ft']");
    }
    public void deleteAstatus(){
        login();
        clickByXpath("");

    }
}
