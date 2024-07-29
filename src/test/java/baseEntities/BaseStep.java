package baseEntities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.ContextMenuPage;


public class BaseStep {
    protected WebDriver driver;
    protected ContextMenuPage contextMenuPage;
    protected Actions actions;


    public BaseStep(WebDriver driver) {
        this.driver = driver;
        contextMenuPage = new ContextMenuPage(driver);
        actions = new Actions(driver);
    }
}