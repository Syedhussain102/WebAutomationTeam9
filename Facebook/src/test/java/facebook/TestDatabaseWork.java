package facebook;

import Base.DataBaseWork;
import org.testng.annotations.Test;

public class TestDatabaseWork extends DataBaseWork {
    @Test
    public void dataBaseWork1() throws Exception {
        infoDatabase1();}
    @Test
    public void dataBaseWork2() throws Exception {
        infoDatabase2();
    }
}
