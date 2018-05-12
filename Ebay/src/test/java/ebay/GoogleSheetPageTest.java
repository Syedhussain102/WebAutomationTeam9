package ebay;

import googleSheet.GoogleSHeetPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class GoogleSheetPageTest extends GoogleSHeetPage {
    @Test
    public void testGoogleSheet() throws IOException, InterruptedException {
        searchItemsByName("1nHi8IV_-AUZq8-9ejFZblhZ6Fq7ea4jFGEPKBOrtGA8","Sheet1!A2:B");
    }
}
