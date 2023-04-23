package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

   @FindBy(xpath = "//*[@id = \"user-name\"]")
   private WebElementFacade usernameTextbox;

   @FindBy(xpath = "//*[@id = \"password\"]")
   private WebElementFacade passwordTextbox;

   @FindBy(xpath = "//*[@id = \"login-button\"]")
   private WebElementFacade loginButton;

   public void insertStandardUser(String standard_user){
      typeInto(usernameTextbox,standard_user);
   }

   public void insertLockedOutUser(String locked_out_user){
      typeInto(usernameTextbox,locked_out_user);
   }

   public void insertProblemUser(String problem_user){
      typeInto(usernameTextbox,problem_user);
   }

   public void insertPeformanceGlitchUser(String performance_glitch_user){
      typeInto(usernameTextbox,performance_glitch_user);
   }

   public void insertPassword(String password){
      typeInto(passwordTextbox,password);
   }

   public void clickLogin(){
      clickOn(loginButton);
   }

}
