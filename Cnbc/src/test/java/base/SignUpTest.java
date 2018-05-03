package base;

import TestBase.SignUp;

public class SignUpTest extends SignUp {
    public void registerTest() throws InterruptedException {
        try {
            register();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
