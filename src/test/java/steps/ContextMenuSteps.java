package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;

public class ContextMenuSteps extends BaseStep {

    public ContextMenuSteps(WebDriver driver) {
        super(driver);
    }

    public void clickButton() {
        clickContext();
    }

    private void clickContext(){
        contextMenuPage.clickContextButton();
    }
}