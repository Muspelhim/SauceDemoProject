package features;
import Pages.InventoryPage;
import Pages.LoginPage;
import Utils.Constants;
import org.junit.Test;

public class StandardUserTest extends BaseTest{

    private LoginPage loginPage;
    private InventoryPage inventoryPage;

    @Test
    public void verifyLoginPage(){
        loginPage.open();
        loginPage.insertUser(Constants.StandardUser);
        loginPage.insertPassword(Constants.passcode);
        loginPage.clickLogin();
        inventoryPage.verifyPageTile();
    }

}
