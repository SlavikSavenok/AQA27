package pages.TestCase;

import baseEntities.BasePage;
import elements.Button;
import elements.DropDown;
import elements.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AddTestCasePage extends BasePage {
    private final By TITLE_FIELD_LOCATOR = By.id("title");
    private final By SECTION_DROPDOWN_LOCATOR = By.id("section_id_chzn");
    private final By TEMPLATE_DROPDOWN_LOCATOR = By.id("template_id_chzn");
    private final By TYPE_DROPDOWN_LOCATOR = By.id("type_id_chzn");
    private final By PRIORITY_DROPDOWN_LOCATOR = By.id("priority_id_chzn");
    private final By ASSIGNED_TO_DROPDOWN_LOCATOR = By.id("assigned_to_id_chzn");
    private final By ESTIMATE_INPUT_LOCATOR = By.id("estimate");
    private final By REFERENCES_INPUT_LOCATOR = By.id("refs");
    private final By AUTOMATION_TYPE_DROPDOWN_LOCATOR = By.id("custom_automation_type_chzn");
    private final By PRECONDITIONS_INPUT_LOCATOR = By.id("custom_preconds_display");
    private final By ADD_TEST_CASE_BUTTON_LOCATOR = By.id("accept");
    private final By DELETE_TEST_CASE_BUTTON_LOCATOR = By.xpath("//span[text()='Delete this test case']");
    private final By MARK_AS_DELETE_LOCATOR = By.xpath("//*[@id='casesDeletionDialog']//a[1]");
   // private final By SAVE_TEST_CASE_BUTTON_LOCATOR = By.id("accept");

    public AddTestCasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return ADD_TEST_CASE_BUTTON_LOCATOR;
    }

    /*public Button getSaveTestCase(){
        return new Button(pageDriver, SAVE_TEST_CASE_BUTTON_LOCATOR);
    }*/


    public Button getDeleteTestCase(){
        return new Button(pageDriver, DELETE_TEST_CASE_BUTTON_LOCATOR);
    }

    public Button getMarkAsDeleteWindow(){
        return new Button(pageDriver, MARK_AS_DELETE_LOCATOR);
    }

    public Input getTitle() {
        return new Input(pageDriver, TITLE_FIELD_LOCATOR);
    }

    public DropDown getSectionDropDown() {
        return new DropDown(pageDriver, SECTION_DROPDOWN_LOCATOR);
    }

    public void setSectionDropDown(String text) {
        getSectionDropDown().selectByText(text);
    }

    public DropDown getTemplateDropDown() {
        return new DropDown(pageDriver, TEMPLATE_DROPDOWN_LOCATOR);
    }

    public void setTemplateDropDown(String text) {
        getTemplateDropDown().selectByText(text);
    }

    public DropDown getTypeDropDown() {
        return new DropDown(pageDriver, TYPE_DROPDOWN_LOCATOR);
    }

    public void setTypeDropDown(String text) {
        getTypeDropDown().selectByText(text);
    }

    public Input getPreconditions() {
        return new Input(pageDriver, PRECONDITIONS_INPUT_LOCATOR);
    }

    public DropDown getPriorityDropDown() {
        return new DropDown(pageDriver, PRIORITY_DROPDOWN_LOCATOR);
    }

    public void setPriorityDropDown(String text) {
        getPriorityDropDown().selectByText(text);
    }

    public DropDown getAssignedDropDown() {
        return new DropDown(pageDriver, ASSIGNED_TO_DROPDOWN_LOCATOR);
    }

    public void setAssignedDropDown(String text) {
        getAssignedDropDown().selectByText(text);
    }

    public DropDown getAutomationTypeDropDown() {
        return new DropDown(pageDriver, AUTOMATION_TYPE_DROPDOWN_LOCATOR);
    }

    public void setAutomationTypeDropDown(String text) {
        getAutomationTypeDropDown().selectByText(text);
    }

    public Button getAddCaseButton() {
        return new Button(pageDriver, ADD_TEST_CASE_BUTTON_LOCATOR);
    }

    public Input getEstimate() {
        return new Input(pageDriver, ESTIMATE_INPUT_LOCATOR);
    }

    public Input getReferences() {
        return new Input(pageDriver, REFERENCES_INPUT_LOCATOR);
    }

    public void setTitleValue(String title) {
        getTitle().write(title);
    }

    public void writeEstimate(String text) {
        getEstimate().write(text);
    }

    public void writeReferences(String text) {
        getReferences().write(text);
    }

    public void writePreconditions(String text) {
        getPreconditions().write(text);
    }

    public void clickAddTestCaseButton() {
        getAddCaseButton().click();
    }

    public String readTitleField() {
        return getTitle().getAttribute("value");
    }

    public String readSectionField() {
        return getSectionDropDown().getText();
    }

    public String readTemplateField() {
        return getTemplateDropDown().getText();
    }

    public String readTypeField() {
        return getTypeDropDown().getText();
    }

    public String readPriorityField() {
        return getPriorityDropDown().getText();
    }

    public String readAssignedField() {
        return getAssignedDropDown().getText();
    }

    public String readEstimateField() {
        return getEstimate().getAttribute("value");
    }

    public String readReferencesField() {
        return getReferences().getAttribute("value");
    }

    public String readAutomationTypeField() {
        return getAutomationTypeDropDown().getText();
    }

    public String readPreconditionsField() {
        return getPreconditions().getText();
    }

    public void updateTitle(String text){
        getTitle().clearAndWrite(text);
    }

    public void updateTemplate(String text){
        getTemplateDropDown().selectByText(text);
    }

    public void updateType(String text){
        getTypeDropDown().selectByText(text);
    }

    public void updatePriority(String text){
        getPriorityDropDown().selectByText(text);
    }

    public void updateAssigned(String text){
        getAssignedDropDown().selectByText(text);
    }

    public void updateEstimate(String text){
        getEstimate().clearAndWrite(text);
    }

    public void updateReferences(String text){
        getReferences().clearAndWrite(text);
    }

    public void updateAutomationType(String text){
        getAutomationTypeDropDown().selectByText(text);
    }

    public void updatePreconditions(String text){
        getPreconditions().clearAndWrite(text);
    }

    public void clickDeleteTestCase(){
        getDeleteTestCase().click();
    }

    public void clickMarkAsDelete(){
        getMarkAsDeleteWindow().click();
    }
}
