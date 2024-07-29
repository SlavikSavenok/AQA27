package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextTest extends BaseTest {

    @Test
    public void contextMenuTest() {
        driver.get(ReadProperties.getUrlContextMenu());
        contextMenuSteps.clickButton();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "You selected a context menu");
        alert.accept();
    }
}
