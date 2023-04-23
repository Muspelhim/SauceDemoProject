package Steps;

import Pages.InventoryPage;
import Pages.LoginPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginPageSteps extends ScenarioSteps{
    private LoginPage loginPage;
    private InventoryPage inventoryPage;

    @Step
    public void navigateToLoginPage(){
        loginPage.open();
    }

    @Step
    public void setWorkingCredentials(String username,String password){
        loginPage.insertStandardUser(username);
        loginPage.insertPassword(password);
    }

    @Step
    public void clickLogin(){
        loginPage.clickLogin();
    }

    @Step
    public void verifyPageTitle(){
        inventoryPage.verifyPageTile();
    }

    @Step
    public void loginToSecretSauce(){
        navigateToLoginPage();
        setWorkingCredentials("standard_user" , "secret_sauce");
        clickLogin();
        verifyPageTitle();
    }
}
