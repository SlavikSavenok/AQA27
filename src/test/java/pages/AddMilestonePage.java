package pages;

import baseEntities.BasePage;
import elements.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddMilestonePage extends BasePage {
    private final By ADD_MILESTONE_NAME_LOCATOR=By.cssSelector("[data-testid='testCaseContentHeaderTitle']");
    private final By NAME_FIELD_LOCATOR=By.id("name");
    private final By REFERENCE_FIELD_LOCATOR=By.id("reference");
    private final By PARENT_DROPDOWN_LOCATOR=By.id("parent_id_chzn");
    private final By DESCRIPTION_FIELD_LOCATOR=By.className("form-control field-editor form-control-full ");
    private final By START_DATE_FIELD_LOCATOR=By.name("start_on");
    private final By END_DATE_FIELD_LOCATOR=By.name("due_on");
    private final By MILESTONE_COMPLETED_CHECKBOX_LOCATOR=By.id("is_completed");
    private final By ADD_MILESTONE_BUTTON_LOCATOR=By.id("accept");

    public AddMilestonePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return NAME_FIELD_LOCATOR;
    }

    public Input getNameInput() {
        return new Input(pageDriver, NAME_FIELD_LOCATOR);
    }

    public void setNameValue(String value) {
        getNameInput().write(value);
    }


}
