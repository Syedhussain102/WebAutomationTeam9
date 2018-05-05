package ebay;

import main.GoogleSheet;
import org.testng.annotations.Test;
import utility.GoogleSheetReader;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

public class GoogleSheetTest extends GoogleSheet {
    @Test
    public void testGoogle() throws IOException, GeneralSecurityException {
        List<List<Object>> expectedResult =  GoogleSheetReader.getGoogleSheetValues();
        for (List<Object> rs: expectedResult){
            System.out.println(rs);
        }
        List<String> actualResult = getBooksName();
    }
}
