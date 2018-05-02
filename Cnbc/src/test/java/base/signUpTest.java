package base;

import TestBase.signUp;

public class signUpTest extends signUp {
    public void registerTest() throws InterruptedException {
        try {
            register();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
