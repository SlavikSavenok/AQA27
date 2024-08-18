package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class OverviewPage extends BasePage {
    private final By FINISH_BUTTON_LOCATOR = By.id("finish");

    public OverviewPage() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return FINISH_BUTTON_LOCATOR;
    }

    @Override
    protected String getPagePath() {
        return "/";
    }

    public SelenideElement getFinishButton() {
        return $(FINISH_BUTTON_LOCATOR);
    }

    public void clickFinishButton() {
        getFinishButton().click();
    }
}
