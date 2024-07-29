package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.ContextMenuPage;


public class BaseStep {
    protected WebDriver driver;
    protected ContextMenuPage contextMenuPage;


    public BaseStep(WebDriver driver) {
        this.driver = driver;
        contextMenuPage = new ContextMenuPage(driver);
    }
}