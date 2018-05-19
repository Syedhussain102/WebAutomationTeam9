package TestBase;

import google.api.GoogleSheetPageCnbc;
import google.api.GoogleSheetReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

public class TestGoogleAPI extends GoogleSheetPageCnbc {
    @Test
    public void testGoogleSheetData() throws IOException, GeneralSecurityException {
        searchGaming();
        //expected result
        List<List<Object>> expectedResult = GoogleSheetReader.getGoogleSheetValues();
        for (List<Object> rs:expectedResult){
            System.out.println(rs);
        }
        //actual result
        GoogleSheetPageCnbc gsp = new GoogleSheetPageCnbc();
        List<String> actualResult=gsp.getLinkName();
        //assert here
        Assert.assertEquals(expectedResult.get(0),actualResult.get(0));

    }
}
