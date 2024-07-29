package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;


public class UserSteps extends BaseStep {

    public UserSteps(WebDriver driver) {
        super(driver);
    }

    public void clickButton() {
        clickContext();
    }
    private void clickContext(){
        contextMenuPage.clickContextButton();
    }


}