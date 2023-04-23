package Pages;

import io.cucumber.java.hu.De;
import lombok.Builder;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

public class CheckoutPage extends PageObject {
    @FindBy(xpath = "//*[@class= \"shopping_cart_link\"]")
    private WebElementFacade shoppingCartLink;

    @FindBy(xpath = "//*[@id= \"first-name\"]")
    private WebElementFacade firtNameTextBox;

    @FindBy(xpath = "//*[@id= \"last-name\"]")
    private WebElementFacade lastNameTextBox;

    @FindBy(xpath = "last-name")
    private WebElementFacade postalCodeTextBox;

    @FindBy(xpath = "//*[@id= \"cancel\"]")
    private WebElementFacade cancelButton;

    @FindBy(xpath = "//*[@id= \"continue\"]")
    private WebElementFacade continueButton;

    public void clickShoppingCartButton(){
        clickOn(shoppingCartLink);
    }

    public void insertFirstName(){
        typeInto(firtNameTextBox,"Razvan");
    }

    public void insertLastName(){
        typeInto(lastNameTextBox,"Bustiuc");
    }

    public void insertZipCode(){
        typeInto(postalCodeTextBox,"123456");
    }

    public void clickCancelButton(){
        clickOn(cancelButton);
    }

    public void clickContinueButton(){
        clickOn(continueButton);
    }
}
