package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.AddTestCasePage;

public class ProjectStep extends BaseStep {

    public ProjectStep(WebDriver driver) {
        super(driver);
    }

    public void clickCheckBox(){
        editProjectPage.clickCheckBox();
    }

    public void removeCheckBox(){
        editProjectPage.removeCheckBox();
    }

    public void selectRadioButtonByIndex(int index){
        editProjectPage.getProjectTypeRadioButton().selectByIndex(index);
    }

    public void selectRadioButtonByValue(String value){
        editProjectPage.getProjectTypeRadioButton().selectByValue(value);
    }

    public void selectRadioButtonByText(String text){
        editProjectPage.getProjectTypeRadioButton().selectByText(text);
    }

    public AddTestCasePage addTestCase(){
        testCasesPage.clickAddTestCase();

        return addTestCasePage;
    }
    public void selectPriorityDropDownByIndex(int index){
        addTestCasePage.getPriorityDropDown().selectByIndex(index);
    }

    public void selectDropDownByValue(String value){
        addTestCasePage.getPriorityDropDown().selectByValue(value);
    }
}
