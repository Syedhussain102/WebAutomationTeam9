package ebay;

import main.DBsearch;
import org.testng.annotations.Test;

public class DBsearchTest extends DBsearch {
    @Test
    public void testSearchByDB() throws Exception {
        searchByDBmultiple();
    }
}
