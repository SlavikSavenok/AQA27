package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage extends BasePage {
    private final static String pagePath="inventory.html";
    protected final By TOP_LOGO_MENU_PAGE = By.cssSelector(".app_logo");

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return TOP_LOGO_MENU_PAGE;
    }


    public void openPageByUrl(){
        super.openPageByUrl(pagePath);
    }

}
