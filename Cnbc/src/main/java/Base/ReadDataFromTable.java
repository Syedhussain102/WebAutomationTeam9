package Base;

import base.CommonAPI;

public class ReadDataFromTable extends CommonAPI {
    public void readData(){
        String cellData=getTextByCss(".data.quoteTable");
        System.out.println(cellData);
    }
    public void readData1(){
        String cellData1=getTextByCss(".data.quoteTable tr:nth-child(1)");
        System.out.println(cellData1);
    }
    public void readData2(){
        String cellData2=getTextByCss(".data.quoteTable tr:nth-child(1) td:nth-child(2)");
        System.out.println(cellData2);
    }
}
