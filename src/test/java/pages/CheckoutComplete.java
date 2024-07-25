package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutComplete extends BasePage {
    private final By BACK_HOME_LOCATOR = By.id("back-to-products");

    public CheckoutComplete(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return BACK_HOME_LOCATOR;
    }

    public WebElement getBackHomeButton() {
        return pageDriver.findElement(BACK_HOME_LOCATOR);
    }

    public void clickBackHome() {
        getBackHomeButton().click();
    }
}
