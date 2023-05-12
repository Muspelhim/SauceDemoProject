package features;

import Pages.LoginPage;
import Utils.Constants;
import org.junit.Test;

public class ProblemUserTest extends BaseTest{

    private LoginPage loginPage;

    @Test
    public void openProblemUser() throws InterruptedException {
        loginPage.open();
        loginPage.insertUser(Constants.ProblemUser);
        loginPage.insertPassword(Constants.passcode);
        loginPage.clickLogin();
        loginPage.waitFor(200);


    }
}
