package pages;

import baseEntities.BasePage;
import elements.DropDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AddTestCasePage extends BasePage {
    private final By ADD_TEST_CASE_BUTTON_LOCATOR = By.id("accept");
    private final By PRIORITY_DROP_DOWN_LOCATOR = By.id("priority_id_chzn");

    public AddTestCasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return ADD_TEST_CASE_BUTTON_LOCATOR;
    }

    public DropDown getPriorityDropDown() {
        return new DropDown(pageDriver, PRIORITY_DROP_DOWN_LOCATOR);
    }
}
