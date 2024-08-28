package pages;

import baseEntities.BasePage;
import elements.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddMilestonePage extends BasePage {
    private final By NAME_FIELD_LOCATOR = By.id("name");
    public AddMilestonePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return NAME_FIELD_LOCATOR;
    }

    public Input getNameInput() {
        return new Input(pageDriver, NAME_FIELD_LOCATOR);
    }

    public void setNameValue(String value) {
        getNameInput().write(value);
    }
}
