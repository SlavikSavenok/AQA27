package pages;

import baseEntities.BasePage;
import elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {
    private final By ADD_PROJECT_BUTTON_LOCATOR = By.id("sidebar-projects-add");
    private final By GO_TO_TESTCASES_PAGE_LOCATOR =By.cssSelector("[href='index.php?/suites/view/2']");
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return ADD_PROJECT_BUTTON_LOCATOR;
    }

    public Button getAddButton() {
        return new Button(pageDriver, ADD_PROJECT_BUTTON_LOCATOR);
    }

    public Button getTestCases() {
        return new Button(pageDriver, GO_TO_TESTCASES_PAGE_LOCATOR);
    }

    public void clickTestCases(){
        getTestCases().click();
    }

    public void clickAddButton() {
        getAddButton().click();
    }
}