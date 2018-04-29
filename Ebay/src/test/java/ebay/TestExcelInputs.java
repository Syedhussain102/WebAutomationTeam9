package ebay;

import main.TryExcelSearch;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestExcelInputs extends TryExcelSearch {
    //@Test
    public void testExcel() throws IOException {
        searchItemsAndSubmitButton();
    }
}
