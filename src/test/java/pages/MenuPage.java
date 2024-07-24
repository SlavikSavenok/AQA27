package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage extends BasePage {
    protected final By TOP_LOGO_MENU_PAGE = By.cssSelector(".app_logo");
    protected final By ADD_SAUCE_LABS_BACKPACK = By.id("add-to-cart-sauce-labs-backpack");
    protected final By ADD_SAUCE_LABS_ONESIE = By.id("add-to-cart-sauce-labs-onesie");
    protected final By REMOVE_SAUCE_LABS_BACKPACK = By.id("remove-sauce-labs-backpack");
    protected final By REMOVE_SAUCE_LABS_ONESIE = By.id("remove-sauce-labs-onesie");
    protected final By CART_LOCATOR = By.className("shopping_cart_link");


    public MenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return TOP_LOGO_MENU_PAGE;
    }

    public WebElement getAddSauceLabsBackpack() {
        return pageDriver.findElement(ADD_SAUCE_LABS_BACKPACK);
    }

    public WebElement getAddSauceLabsOnesie() {
        return pageDriver.findElement(ADD_SAUCE_LABS_ONESIE);
    }
    public WebElement getRemoveSauceLabsBackpack() {
        return pageDriver.findElement(REMOVE_SAUCE_LABS_BACKPACK);
    }

    public WebElement getRemoveSauceLabsOnesie() {
        return pageDriver.findElement(REMOVE_SAUCE_LABS_ONESIE);
    }

    public WebElement getCartButton() {
        return pageDriver.findElement(CART_LOCATOR);
    }


    public void setAddSauceLabsBackpack() {
        getAddSauceLabsBackpack().click();;
    }

    public void  setAddSauceLabsOnesie() {
        getAddSauceLabsOnesie().click();
    }
    public void setRemoveSauceLabsBackpack() {
        getRemoveSauceLabsBackpack().click();;
    }

    public void  setRemoveSauceLabsOnesie() {
        getRemoveSauceLabsOnesie().click();
    }

    public void clickCart() {
        getCartButton().click();
    }



}
