package baseEntities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.ContextMenuPage;
import pages.DynamicControlPage;

public class BaseStep {
    protected WebDriver driver;
    protected ContextMenuPage contextMenuPage;
    protected Actions actions;
    protected DynamicControlPage dynamicControlPage;

    public BaseStep(WebDriver driver) {
        this.driver = driver;
        contextMenuPage = new ContextMenuPage(driver);
        actions = new Actions(driver);
        dynamicControlPage=new DynamicControlPage(driver);
    }
}