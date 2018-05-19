package facebook;

import DataDrivenBase.DataWork;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestDataWork extends DataWork {
    @Test
    public void excelWork() throws IOException {
        excelData();
    }

}
