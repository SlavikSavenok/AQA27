package pages;

import baseEntities.BasePage;
import elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MilestonesPage extends BasePage {
    private final By ADD_MILESTONE_BUTTON = By.id("navigation-milestones-add");

    public MilestonesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return ADD_MILESTONE_BUTTON;
    }

    public Button getAddMilestoneButton() {
        return new Button(pageDriver, ADD_MILESTONE_BUTTON);
    }

    public void clickAddMilestone() {
        getAddMilestoneButton().click();
    }


}
