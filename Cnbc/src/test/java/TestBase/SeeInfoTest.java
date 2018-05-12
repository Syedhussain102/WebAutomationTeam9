package TestBase;

import Base.SeeInfo;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SeeInfoTest extends SeeInfo {
    @Test
    public void viewInfo1(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeInfoNews();}
    @Test
    public void viewInfo2(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeInfoInvesting();}
    @Test
    public void viewInfo3(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeInfoLiveTv();}
    @Test
    public void viewInfo4(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeInfoMakeIt();}
    @Test
    public void viewInfo5(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeInfoMarket();}
    @Test
    public void viewInfo6(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeInfoPro();}
    @Test
    public void viewInfo7(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeInfoVideo();}
    @Test
    public void viewInfo8(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeInfoTest();}
}
