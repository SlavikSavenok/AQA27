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
    private final By NAME_FIELD_LOCATOR = By.id("name");
    private final By ANNOUNCEMENT_FIELD_LOCATOR = By.id("announcement_display");
    private final By ACCEPT_BUTTON_LOCATOR = By.cssSelector("[data-testid='addEditProjectAddButton']");


    public AddProjectPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return CHECKBOX_ANNOUNCEMENT_LOCATOR;
    }

    public Input getProjectName() {
        return new Input(pageDriver, NAME_FIELD_LOCATOR);
    }

    public Input getAnnouncement() {
       return new Input(pageDriver, ANNOUNCEMENT_FIELD_LOCATOR);
    }

    public CheckBox getCheckBoxButton() {
        return new CheckBox(pageDriver, CHECKBOX_ANNOUNCEMENT_LOCATOR);
    }

    public RadioButton getProjectTypeRadioButton() {
        return new RadioButton(pageDriver, PROJECT_TYPE_RADIOBUTTON_LOCATOR);
    }

    public void checkBoxEnableTCApprovals() {
        new CheckBox(pageDriver, CHECKBOX_ENABLE_TEST_CASE_LOCATOR);
    }

    public Button getCreateProject() {
        return new Button(pageDriver, ACCEPT_BUTTON_LOCATOR);
    }

    public void clickCheckBox() {
        getCheckBoxButton().setCheckBox();
    }

    public void removeCheckBox() {
        getCheckBoxButton().removeCheckBox();
    }

    public AddProjectPage setProjectName(String projectName) {
        getProjectName().write(projectName);

        return this;
    }

    public AddProjectPage setAnnouncement(String announcement) {
        getAnnouncement().write(announcement);

        return this;
    }

    public void createdProject(String value) {
        setProjectName(value);
        setAnnouncement(value);



    }
}
