package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.AddProjectPage;
import pages.AddTestCasePage;

public class ProjectStep extends BaseStep {

    public ProjectStep(WebDriver driver) {
        super(driver);
    }

    public AddProjectPage clickAddProject() {
        dashboardPage.clickAddButton();

        return addProjectPage;
    }


}
