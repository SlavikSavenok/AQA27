package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectsPage extends BasePage {
    private final By PROJECTS_PAGE_LOCATOR = By.cssSelector("[data-testid='testCaseContentHeaderTitle']");
    private final By SUCCESSFULLY_ADD_PROJECT_TEXT_LOCATOR=By.cssSelector("[class='message message-success']");

    public ProjectsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return PROJECTS_PAGE_LOCATOR;
    }

    public By getSuccessfullyAddProjectText() {
        return SUCCESSFULLY_ADD_PROJECT_TEXT_LOCATOR;
    }

    public boolean isProjectCreated(){
      return pageDriver.findElement(By.cssSelector("[class='message message-success']")).isDisplayed();
    }
}
