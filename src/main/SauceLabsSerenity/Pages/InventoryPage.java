package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

public class InventoryPage extends PageObject {
    @FindBy(xpath = "//*[@class = \"product_sort_container\"]")
    private WebElementFacade productSorting;

    @FindBy(xpath = "//*[@class = \"shopping_cart_link\"]")
    private WebElementFacade cartButton;

    @FindBy(xpath = "//*[@id = \"react-burger-menu-btn\"]")
    private WebElementFacade burgerMenuButton;

    @FindBy(xpath = "//*[@class = \"btn btn_primary btn_small btn_inventory\"]")
    private WebElementFacade addToCartButton;

    @FindBy(xpath = "//*[@class= \"app_logo\"]")
    private WebElementFacade pageTitle;

    public void clickOnProductSortingButton(){
        clickOn(productSorting);
    }

    public void clickOnBurgerMenuButton(){
        clickOn(burgerMenuButton);
    }

    public void clickOnAddToCart(){
        clickOn(addToCartButton);
    }

    public void verifyPageTile(){
        pageTitle.shouldContainOnlyText("Swag Labs");
    }



}
