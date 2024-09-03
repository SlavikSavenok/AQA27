package pages.TestCase;

import baseEntities.BasePage;
import elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCasePersonalPage extends BasePage {
    private final By EDIT_BUTTON_LOCATOR = By.xpath("//a[@data-testid='testCaseEditButton']");

    public TestCasePersonalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return EDIT_BUTTON_LOCATOR;
    }

    public Button getEditButton() {
        return new Button(pageDriver, EDIT_BUTTON_LOCATOR);
    }

    public void clickEditButton(){
        getEditButton().click();
    }
}
