package pages.TestCase;

import baseEntities.BasePage;
import elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCasesPage extends BasePage {
    private final By ADD_TEST_CASE_LOCATOR =By.id("sidebar-cases-add");
    private final By TEST_CASE_TITLEAQA27_LOCATOR =By.xpath("//span[text()='TitleAQA27']");
    private final By TEST_CASE_FOR_DELETE_LOCATOR =By.xpath("//span[text()='Test Case for delete']");

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

    public Button getTestCaseTitleAQA27() {
        return new Button(pageDriver, TEST_CASE_TITLEAQA27_LOCATOR);
    }

    public Button getTestCaseForDelete(){
        return new Button(pageDriver,TEST_CASE_FOR_DELETE_LOCATOR);
    }

    public void clickAddTestCase(){
        getAddTestCase().click();
    }

    public void clickTestCaseAQA27(){
        getTestCaseTitleAQA27().click();
    }

    public void clickTestCaseForDelete(){
        getTestCaseForDelete().click();
    }
}
