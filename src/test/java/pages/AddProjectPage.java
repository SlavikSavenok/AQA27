package pages;

import baseEntities.BasePage;
import elements.Button;
import elements.CheckBox;
import elements.Input;
import elements.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProjectPage extends BasePage {
    private final By CHECKBOX_ANNOUNCEMENT_LOCATOR = By.id("show_announcement");
    private final By CHECKBOX_ENABLE_TEST_CASE_LOCATOR = By.name("case_statuses_enabled");
    private final By PROJECT_TYPE_RADIOBUTTON_LOCATOR = By.cssSelector("[name='suite_mode']");
    private final By NAME_FIELD_LOCATOR =By.id("name");
    private final By ANNOUNCEMENT_FIELD_LOCATOR =By.id("announcement_display");
    private final By ACCEPT_BUTTON_LOCATOR = By.cssSelector("[data-testid='addEditProjectAddButton']");


    public AddProjectPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return CHECKBOX_ANNOUNCEMENT_LOCATOR;
    }

    public CheckBox getCheckBoxButton() {
        return new CheckBox (pageDriver,CHECKBOX_ANNOUNCEMENT_LOCATOR);
    }

    public void clickCheckBox() {
        getCheckBoxButton().setCheckBox();
    }

    public void removeCheckBox() {
        getCheckBoxButton().removeCheckBox();
    }

    public RadioButton getProjectTypeRadioButton() {
        return new RadioButton(pageDriver, PROJECT_TYPE_RADIOBUTTON_LOCATOR);
    }

    public void setProjectName(String projectName){
        new Input(pageDriver,NAME_FIELD_LOCATOR).write(projectName);
    }

    public void setAnnouncement(String projectAnnouncement){
        new Input(pageDriver,ANNOUNCEMENT_FIELD_LOCATOR).write(projectAnnouncement);
    }

    public void clickCheckBoxShowAnnouncement(){
        new CheckBox(pageDriver,CHECKBOX_ANNOUNCEMENT_LOCATOR).setCheckBox();
    }

    public void clickCheckBoxEnableTCApprovals(){
        new CheckBox(pageDriver,CHECKBOX_ENABLE_TEST_CASE_LOCATOR).removeCheckBox();
    }

    public void setProjectType(int projectType) {
        getProjectTypeRadioButton().selectByIndex(projectType);
    }

    public Button getCreateProject() {
        return new Button(pageDriver, ACCEPT_BUTTON_LOCATOR);
    }

    public void createProject() {
        getCreateProject().click();
    }
}
