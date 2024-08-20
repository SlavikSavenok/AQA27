package pages;

import baseEntities.BasePage;
import elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCasesPage extends BasePage {
    private final By ADD_TEST_CASE_LOCATOR = By.id("sidebar-cases-add");

    public TestCasesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return ADD_TEST_CASE_LOCATOR;
    }

    public Button getAddTestCase() {
        return new Button(pageDriver, ADD_TEST_CASE_LOCATOR);
    }

    public void clickAddTestCase() {
        getAddTestCase().click();
    }
}
