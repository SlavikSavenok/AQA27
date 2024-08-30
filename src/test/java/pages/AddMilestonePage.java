package pages;

import baseEntities.BasePage;
import elements.Button;
import elements.CheckBox;
import elements.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddMilestonePage extends BasePage {
    private final By NAME_FIELD_LOCATOR = By.id("name");
    private final By REFERENCES_FIELD_LOCATOR = By.id("reference");
    private final By DESCRIPTION_FIELD_LOCATOR = By.id("description_display");
    private final By START_DATE_FIELD_LOCATOR = By.id("start_on");
    private final By FIRST_AUGUST_DATE = By.xpath("//*[text()='1']");
    private final By TENTH_AUGUST_DATE = By.xpath("//*[text()='1']");
    private final By TWENTY_FIFTH_AUGUST_DATE = By.xpath("//*[text()='1']");
    private final By END_DATE_FIELD_LOCATOR = By.id("due_on");
    private final By THIRTY_FIRST_AUGUST_DATE = By.xpath("//*[text()='31']");
    private final By CHECKBOX_LOCATOR = By.id("is_completed");
    private final By ADD_MILESTONE_BUTTON = By.id("accept");
    private final By DELETE_THIS_MILESTONE=By.cssSelector("[data-testid='buttonDelete']");
    private final By POPUP_WINDOW_LOCATOR =By.id("deleteDialog");
    private final By DELETE_CHECKBOX_LOCATOR=By.xpath("//*[@id='deleteDialog']//input");
    private final By OK_BUTTON_POPUP_WINDOW=By.cssSelector("[data-testid='caseFieldsTabDeleteDialogButtonOk']");


    public AddMilestonePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return NAME_FIELD_LOCATOR;
    }

    protected By getPopupWindowIdentifier() {
        return POPUP_WINDOW_LOCATOR;
    }

    public boolean isPopupOpened() {
        return pageDriver.findElement(getPopupWindowIdentifier()).isDisplayed();
    }

    public Input getNameInput() {
        return new Input(pageDriver, NAME_FIELD_LOCATOR);
    }

    public Input getReferencesInput() {
        return new Input(pageDriver, REFERENCES_FIELD_LOCATOR);
    }

    public Input getDescriptionInput() {
        return new Input(pageDriver, DESCRIPTION_FIELD_LOCATOR);
    }

    public Button getStartDateField() {
        return new Button(pageDriver, START_DATE_FIELD_LOCATOR);
    }

    public Button getEndDateField() {
        return new Button(pageDriver, END_DATE_FIELD_LOCATOR);
    }

    public Button getThirtyFirstAugustField() {
        return new Button(pageDriver, THIRTY_FIRST_AUGUST_DATE);
    }

    public Button getTenthAugustField() {
        return new Button(pageDriver, TENTH_AUGUST_DATE);
    }

    public Button getTwentyFifthAugustField() {
        return new Button(pageDriver, TWENTY_FIFTH_AUGUST_DATE);
    }

    public Button getFirstAugustField() {
        return new Button(pageDriver, FIRST_AUGUST_DATE);
    }

    public Button getOkButtonPopupWindow() {
        return new Button(pageDriver, OK_BUTTON_POPUP_WINDOW);
    }

    public CheckBox getCheckBox() {
        return new CheckBox(pageDriver, CHECKBOX_LOCATOR);
    }

    public CheckBox getDeleteCheckBox() {
        return new CheckBox(pageDriver, DELETE_CHECKBOX_LOCATOR);
    }

    public Button getAddMilestoneButton() {
        return new Button(pageDriver, ADD_MILESTONE_BUTTON);
    }

    public Button getDeleteMilestoneButton() {
        return new Button(pageDriver, DELETE_THIS_MILESTONE);
    }

    public void setNameValue(String value) {
        getNameInput().write(value);
    }

    public void setReferencesValue(String value) {
        getReferencesInput().write(value);
    }

    public void setDescriptionValue(String value) {
        getDescriptionInput().write(value);
    }

    public void clickStartDate() {
        getStartDateField().click();
    }

    public void clickEndDate() {
        getEndDateField().click();
    }

    public void clickFirstAugustDate(){
        getFirstAugustField().click();
    }

    public void clickThirtyFirstAugustDate(){
        getThirtyFirstAugustField().click();
    }

    public void clickOkButtonPopupWindow(){
        getOkButtonPopupWindow().click();
    }

    public void setCheckBox(){
        getCheckBox().setCheckBox();
    }

    public void setDeleteCheckbox(){
        getDeleteCheckBox().setCheckBox();
    }

    public void clickAddMilestone(){
        getAddMilestoneButton().click();
    }

    public void readNameField(){
        System.out.println(getNameInput().getText());
    }

    public void updateNameField(String value){
        getNameInput().clearAndWrite(value);
    }

    public void updateReferenceField(String value){
        getReferencesInput().clearAndWrite(value);
    }

    public void updateDescriptionField(String value){
        getDescriptionInput().clearAndWrite(value);
    }

    public void updateStartDate(){
        getStartDateField().click();
        getTenthAugustField().click();
    }

    public void updateEndDate(){
        getEndDateField().click();
        getTwentyFifthAugustField().click();
    }

    public void removeCheckbox(){
        getCheckBox().removeCheckBox();
    }

    public void deleteMilestone(){
        getDeleteMilestoneButton().click();
    }
}
