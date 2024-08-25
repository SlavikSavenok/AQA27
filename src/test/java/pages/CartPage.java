package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    private final By CHECKOUT_BUTTON_LOCATOR = By.id("checkout");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return CHECKOUT_BUTTON_LOCATOR;
    }

    public WebElement getCheckoutButton() {
        return pageDriver.findElement(CHECKOUT_BUTTON_LOCATOR);
    }

    public void clickCheckout() {
        getCheckoutButton().click();
    }
}
