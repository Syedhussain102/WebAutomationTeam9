package TestBase;

import Base.ReadDataFromTable;
import org.testng.annotations.Test;

public class TestReadData extends ReadDataFromTable {
    @Test
    public void readDataTest(){
        readData(); }
    @Test
    public void readDataTest1(){
        readData1();}
    @Test
    public void readDataTest2(){
        readData2();}
}
