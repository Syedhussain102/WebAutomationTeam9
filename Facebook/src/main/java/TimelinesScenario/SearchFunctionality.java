package TimelinesScenario;

import Base.LogIn;

public class SearchFunctionality extends LogIn {
    public void SearchFunction(){
        login();
        clickByXpath("//input[@class='_1frb']");
        typeByXpathNEnter("//input[@class='_1frb']","naim khan siam");
    }
}
