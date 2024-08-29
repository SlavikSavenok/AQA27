package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class MenuPage extends BasePage {
    protected final By TOP_LOGO_MENU_PAGE = By.cssSelector(".app_logo");
    protected final By ADD_SAUCE_LABS_BACKPACK = By.id("add-to-cart-sauce-labs-backpack");
    protected final By ADD_SAUCE_LABS_ONESIE = By.name("add-to-cart-sauce-labs-onesie");
    protected final By REMOVE_SAUCE_LABS_BACKPACK = By.id("remove-sauce-labs-backpack");
    protected final By REMOVE_SAUCE_LABS_ONESIE = By.id("remove-sauce-labs-onesie");
    protected final By CART_LOCATOR = By.cssSelector("[data-test='shopping-cart-link']");


    public MenuPage() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return TOP_LOGO_MENU_PAGE;
    }

    @Override
    protected String getPagePath() {
        return "/";
    }

    public SelenideElement getAddSauceLabsBackpack() {
        return $(ADD_SAUCE_LABS_BACKPACK);
    }

    public SelenideElement getAddSauceLabsOnesie() {
        return $(ADD_SAUCE_LABS_ONESIE);
    }
    public SelenideElement getRemoveSauceLabsBackpack() {
        return $(REMOVE_SAUCE_LABS_BACKPACK);
    }

    public SelenideElement getRemoveSauceLabsOnesie() {
        return $(REMOVE_SAUCE_LABS_ONESIE);
    }

    public SelenideElement getCartButton() {
        return $(CART_LOCATOR);
    }

    public void setAddSauceLabsBackpack() {
        getAddSauceLabsBackpack().click();;
    }

    public void  setAddSauceLabsOnesie() {
        getAddSauceLabsOnesie().click();
    }
    public void setRemoveSauceLabsBackpack() {
        getRemoveSauceLabsBackpack().click();
    }

    public void  setRemoveSauceLabsOnesie() {
        getRemoveSauceLabsOnesie().click();
    }

    public void clickCart() {
        getCartButton().click();
    }
}
