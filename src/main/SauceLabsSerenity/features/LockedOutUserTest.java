package features;

import Pages.LoginPage;
import Utils.Constants;
import org.junit.Test;

public class LockedOutUserTest extends BaseTest{

    private LoginPage loginPage;

    @Test
    public void openLockedOutUser(){
        loginPage.open();
        loginPage.insertUser(Constants.LockedUser);
        loginPage.insertPassword(Constants.passcode);
        loginPage.clickLogin();
        loginPage.verifyErrorMessage();
    }
}
