package pages;

import baseEntities.BasePage;
import elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MilestonesPage extends BasePage {
    private final By ADD_MILESTONE_BUTTON = By.id("navigation-milestones-add");
    private final By AQA27_NAME_PROJECT_BUTTON =By.xpath("//*[text()='AQA27']");
    private final By VIACHASLAU_AQA27_NAME_PROJECT_BUTTON =By.xpath("//*[text()='Viachaslau AQA27']");

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

    public Button getAQA27NameProjectButton() {
        return new Button(pageDriver, AQA27_NAME_PROJECT_BUTTON);
    }

    public Button getViachaslauAQA27NameProjectButton() {
        return new Button(pageDriver, VIACHASLAU_AQA27_NAME_PROJECT_BUTTON);
    }

    public void clickAddMilestone() {
        getAddMilestoneButton().click();
    }

    public void clickOnProjectNameAQA27(){
        getAQA27NameProjectButton().click();
    }

    public void clickOnProjectNameViachaslauAQA27(){
        getViachaslauAQA27NameProjectButton().click();
    }
}
