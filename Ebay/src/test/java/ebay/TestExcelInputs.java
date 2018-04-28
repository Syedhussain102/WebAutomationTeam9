package ebay;

import main.ExcelSearch;
import main.Search;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class TestExcelInputs extends ExcelSearch {
    //
    //@Test
    public void testExcel() throws IOException {
        searchItemsAndSubmitButton();
    }
}
