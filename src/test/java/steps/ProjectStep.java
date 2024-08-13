package steps;

import baseEntities.BaseStep;
import models.Project;
import org.openqa.selenium.WebDriver;
import pages.AddProjectPage;
import pages.AddTestCasePage;
import pages.ProjectsPage;

public class ProjectStep extends BaseStep {

    public ProjectStep(WebDriver driver) {
        super(driver);
    }

    public void clickCheckBox() {
        addProjectPage.clickCheckBox();
    }

    public void removeCheckBox() {
        addProjectPage.removeCheckBox();
    }

    public void selectRadioButtonByIndex(int index) {
        addProjectPage.getProjectTypeRadioButton().selectByIndex(index);
    }

    public void selectRadioButtonByValue(String value) {
        addProjectPage.getProjectTypeRadioButton().selectByValue(value);
    }

    public void selectRadioButtonByText(String text) {
        addProjectPage.getProjectTypeRadioButton().selectByText(text);
    }

    public AddTestCasePage addTestCase() {
        testCasesPage.clickAddTestCase();

        return addTestCasePage;
    }

    public void selectDropDownByIndex(int index) {
        addTestCasePage.getPriorityDropDown().selectByIndex(index);
    }

    public AddProjectPage clickAddProject() {
        dashboardPage.clickAddButton();

        return addProjectPage;
    }

    public void addProject(Project project) {
        addProjectPage.setProjectName(project.getProjectName());
        addProjectPage.setAnnouncement(project.getAnnouncement());
        addProjectPage.clickCheckBoxShowAnnouncement();
        addProjectPage.setProjectType(project.getProjectType());
        addProjectPage.clickCheckBoxEnableTCApprovals();
    }

    public ProjectsPage createProject() {
        addProjectPage.createProject();

        return projectsPage;
    }
}
