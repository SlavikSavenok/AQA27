package pages;

import baseEntities.BasePage;
import elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {
    private final By ADD_PROJECT_BUTTON_LOCATOR = By.id("sidebar-projects-add");
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return ADD_PROJECT_BUTTON_LOCATOR;
    }

    public Button getEditButton() {
        return new Button(pageDriver, ADD_PROJECT_BUTTON_LOCATOR);
    }

    public void clickEdit() {
        getEditButton().click();
    }
}