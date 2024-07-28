package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {
    protected final By CONTEXT_MENU = By.xpath("//a[text()='Context Menu']");
    protected final By Dynamic_Controls = By.xpath("//a[text()='Dynamic Controls']");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return CONTEXT_MENU;
    }

    public WebElement getContextMenu() {
        return pageDriver.findElement(CONTEXT_MENU);
    }

    public void clickContextMenu(){
        getContextMenu().click();
    }
    public WebElement getDynamicControls() {
        return pageDriver.findElement(Dynamic_Controls);
    }

    public void clickDynamicControls(){
        getDynamicControls().click();
    }
}
