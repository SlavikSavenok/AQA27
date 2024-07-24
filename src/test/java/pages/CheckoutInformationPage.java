package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutInformationPage extends BasePage {
    private final By FIRSTNAME_FIELD_LOCATOR = By.id("first-name");
    private final By LASTNAME_FIELD_LOCATOR = By.id("last-name");
    private final By ZIP_FIELD_LOCATOR = By.id("postal-code");
    private final By CONTINUE_BUTTON_LOCATOR = By.id("continue");


    public CheckoutInformationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }

    public WebElement getFirstname() {
        return pageDriver.findElement(FIRSTNAME_FIELD_LOCATOR);
    }

    public WebElement getLastname() {
        return pageDriver.findElement(LASTNAME_FIELD_LOCATOR);
    }

    public WebElement getZip() {
        return pageDriver.findElement(ZIP_FIELD_LOCATOR);
    }

    public WebElement getContinueButton() {
        return pageDriver.findElement(CONTINUE_BUTTON_LOCATOR);
    }


    public void setFirstNameValue(String value) {
        getFirstname().sendKeys(value);
    }

    public void setLastNameValue(String value) {
        getLastname().sendKeys(value);
    }

    public void setZipValue(String value) {
        getZip().sendKeys(value);
    }

    public void clickContinueButton() {
        getContinueButton().click();
    }


}
