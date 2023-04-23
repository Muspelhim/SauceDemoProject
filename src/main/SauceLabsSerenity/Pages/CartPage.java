package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

public class CartPage extends PageObject {

  @FindBy(xpath = "//*[@id = \"react-burger-menu-btn\"]")
    private WebElementFacade burgerMenuButton;

  @FindBy(xpath = "//*[@id= \"continue-shopping\"]")
    private WebElementFacade continueShoppingButton;

  @FindBy(xpath = "//*[@name= \"checkout\"]")
    private WebElementFacade checkoutButton;

  public void clickBurgerMenu(){
      clickOn(burgerMenuButton);
  }

  public void clickContinueShopping(){
      clickOn(continueShoppingButton);
  }

  public void clickCheckout(){
      clickOn(checkoutButton);
  }
}
