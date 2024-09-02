package pages;

import baseEntities.BasePage;
import elements.DropDown;
import elements.Input;
import io.cucumber.java.be.I;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AddTestCasePage extends BasePage {
    private final By TITLE_FIELD_LOCATOR=By.id("title");
    private final By SECTION_DROPDOWN_LOCATOR = By.id("section_id_chzn");
    private final By TEMPLATE_DROPDOWN_LOCATOR = By.id("template_id_chzn");
    private final By ADD_TEST_CASE_BUTTON_LOCATOR = By.id("accept");
    private final By PRIORITY_DROP_DOWN_LOCATOR = By.id("priority_id_chzn");


    public AddTestCasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return ADD_TEST_CASE_BUTTON_LOCATOR;
    }
    public Input getTitle(){
        return new Input(pageDriver,TITLE_FIELD_LOCATOR);
    }

    public DropDown getSectionDropDown(){
        return new DropDown(pageDriver,SECTION_DROPDOWN_LOCATOR);
    }

    public DropDown getTemplateDropDown(){
        return new DropDown(pageDriver,TEMPLATE_DROPDOWN_LOCATOR);
    }

    public DropDown getPriorityDropDown() {
        return new DropDown(pageDriver, PRIORITY_DROP_DOWN_LOCATOR);
    }

    public void setTitleValue(String title){
        getTitle().write(title);
    }

    public void  setSectionDropDown(String text){
        getSectionDropDown().selectByText(text);
    }

    public void  setTemplateDropDown(String text){
        getTemplateDropDown().selectByText(text);
    }
}
