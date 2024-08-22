package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class CartPage extends BasePage {
    private final By CHECKOUT_BUTTON_LOCATOR = By.id("checkout");

    public CartPage() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return CHECKOUT_BUTTON_LOCATOR;
    }

    @Override
    protected String getPagePath() {
        return "/";
    }

    public SelenideElement getCheckoutButton() {
        return $(CHECKOUT_BUTTON_LOCATOR);
    }

    public void clickCheckout() {
        getCheckoutButton().click();
    }
}
