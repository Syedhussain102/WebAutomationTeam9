package ebay;
import base.CommonAPI;
import main.Login;
import org.testng.annotations.Test;

public class loginTest extends Login {
    //Go to my account
    //@Test
    public void ClickMyAccount(){
        myAccount();
    }
    //click on register
    //@Test
    public void ClickOnRegister(){
        clickRegister();
    }
    //input all values
    //@Test
    public void input() throws InterruptedException {
        inputValues();
    }
    // log in
    //@Test
    public void clickOnSignIn(){
        login();
    }
    //go to my messages
    //@Test
    public void myMessage(){
        myMessages();
    }
    //create folder in messages
    @Test
    public void createFolder(){
        folderInMessages();
    }
}
