package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContextMenuPage extends BasePage {
    private final By RECTANGULAR_BUTTON = By.xpath("//*[@style='border-style: dashed; border-width: 5px; width: 250px; height: 150px;']");

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return RECTANGULAR_BUTTON;
    }

    public WebElement getContextButton() {
        return pageDriver.findElement(RECTANGULAR_BUTTON);
    }

    public void clickContextButton(){
        actions.contextClick(getContextButton()).perform();
    }
}
