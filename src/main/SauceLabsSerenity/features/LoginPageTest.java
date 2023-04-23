package features;
import Pages.InventoryPage;
import Pages.LoginPage;
import org.junit.Test;

public class LoginPageTest extends BaseTest{

    private LoginPage loginPage;
    private InventoryPage inventoryPage;

    @Test
    public void verifyLoginPage(){
        loginPage.open();
        loginPage.insertStandardUser("standard_user");
        loginPage.insertPassword("secret_sauce");
        loginPage.clickLogin();
        inventoryPage.verifyPageTile();
    }

}
