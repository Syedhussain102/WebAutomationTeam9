package dataDriven;

import base.CommonAPI;

import java.io.IOException;
import java.util.ArrayList;

public class ExcelSearch extends CommonAPI {

    public static void main(String[] args) throws IOException {
        String excelValues = String.valueOf(dataFromExcel("/Users/zann/IdeaProjects/WebAutomationTeam9/Ebay/data/Book1.xls", "Sheet1", 0));
        System.out.println(excelValues);
    }

    public void multipleLoginExcel() throws IOException, InterruptedException {
        clickByXpath("//*[@id='gh-ug']/a");
        ArrayList<String> searchAbleUsers = dataFromExcel("/Users/zann/IdeaProjects/WebAutomationTeam9/CityBank/data/Book1.xls", "Sheet1", 0);
        ArrayList<String> searchAblePass = dataFromExcel("/Users/zann/IdeaProjects/WebAutomationTeam9/CityBank/data/Book1.xls", "Sheet1", 1);
        for (int i = 1; i < searchAbleUsers.size(); i++) {
            typeByXpath("/html//input[@id='username']", searchAbleUsers.get(i));
            typeByXpath("/html//input[@id='password']", searchAblePass.get(i));
            clickByXpath("/html//input[@id='signInBtn']");
            wait(5);
            navigateBack();
        }
    }


}
