package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutCompletePage extends BasePage {
    private final By BACK_HOME_LOCATOR = By.id("back-to-products");

    public CheckoutCompletePage() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return BACK_HOME_LOCATOR;
    }

    @Override
    protected String getPagePath() {
        return "/";
    }

    public SelenideElement getBackHomeButton() {
        return $(BACK_HOME_LOCATOR);
    }

    public void clickBackHome() {
        getBackHomeButton().click();
    }
}
