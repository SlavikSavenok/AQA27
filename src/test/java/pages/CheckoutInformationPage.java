package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutInformationPage extends BasePage {
    private final By FIRSTNAME_FIELD_LOCATOR = By.id("first-name");
    private final By LASTNAME_FIELD_LOCATOR = By.id("last-name");
    private final By ZIP_FIELD_LOCATOR = By.id("postal-code");
    private final By CONTINUE_BUTTON_LOCATOR = By.id("continue");

    public CheckoutInformationPage() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }

    @Override
    protected String getPagePath() {
        return "/";
    }

    public SelenideElement getFirstname() {
        return $(FIRSTNAME_FIELD_LOCATOR);
    }

    public SelenideElement getLastname() {
        return $(LASTNAME_FIELD_LOCATOR);
    }

    public SelenideElement getZip() {
        return $(ZIP_FIELD_LOCATOR);
    }

    public SelenideElement getContinueButton() {
        return $(CONTINUE_BUTTON_LOCATOR);
    }

    public void setFirstNameValue(String value) {
        getFirstname().val(value);
    }

    public void setLastNameValue(String value) {
        getLastname().val(value);
    }

    public void setZipValue(String value) {
        getZip().val(value);
    }

    public void clickContinueButton() {
        getContinueButton().click();
    }
}
