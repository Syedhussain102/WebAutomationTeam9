package ebay;

import base.CommonAPI;
import main.ExcelSearch;
import org.testng.annotations.Test;

import java.io.IOException;

public class ExcelSearchTest extends ExcelSearch {
    //@Test
    public void testExcel() throws IOException {
        searchItemsAndSubmitButton();
    }
}
