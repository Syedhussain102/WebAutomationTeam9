package ebay;

import base.CommonAPI;
import main.ExcelSearch;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestExcelInputs extends ExcelSearch {

    @Test
    public void testExcel() throws IOException {
        searchItemsAndSubmitButton();
    }
}
