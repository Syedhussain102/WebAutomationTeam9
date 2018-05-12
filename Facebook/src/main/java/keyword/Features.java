package keyword;

import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;

public class Features extends CommonAPI {
    public void signIn(){
        typeByXpath("","username");
        typeByXpath("","password");
        clickByCss("");
    }
    public void signUp(){
        typeByXpath("","firstName");
        typeByXpath("","lastName");
        typeByXpath("","email");
        typeByXpath("","newPassword");
        clickByXpath("");
        clickByXpath("");
        clickByXpath("");
        clickByXpath("");
    }
    public void search(){

    }
    public void select(String featureName){
        switch (featureName){
            case "signIn":
                signIn();
                break;
            case "signUp":
                signUp();
                break;
            case "search":
                search();
                break;
                default:
                    throw new InvalidArgumentException("Invalid features choice");
        }
    }
    public void selectFeatures(){
        //ItemsToBeSearched
    }

}
