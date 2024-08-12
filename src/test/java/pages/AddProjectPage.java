package pages;

import baseEntities.BasePage;
import elements.CheckBox;
import elements.Input;
import elements.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProjectPage extends BasePage {
    private final By CHECKBOX_ANNOUNCEMENT_LOCATOR = By.id("show_announcement");
    private final By PROJECT_TYPE_RADIOBUTTON_LOCATOR = By.cssSelector("[name='suite_mode']");
    private final By NAME_FIELD_LOCATOR =By.id("name");


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
}
