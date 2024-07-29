package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;

public class DynamicControlSteps extends BaseStep {

    public DynamicControlSteps(WebDriver driver) {
        super(driver);
    }

    public void clickRemove() {
        clickRemoveButton();
    }

    private void clickRemoveButton(){
        dynamicControlPage.clickRemoveButton();
    }
}
