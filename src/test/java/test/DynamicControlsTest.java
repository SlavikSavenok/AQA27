package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void dynamicControlTest(){
        driver.get(ReadProperties.getUrlDynamicControls());
        dynamicControlSteps.clickRemove();
        waitsService.waitVisibilityOf(By.id("message"));
        waitsService.invisibilityOf(By.id("checkbox"));
        Assert.assertFalse(driver.findElement(By.cssSelector("[type='text']")).isEnabled());
        dynamicControlSteps.clickEnable();
        waitsService.waitVisibilityOf(By.id("message"));
        Assert.assertTrue(driver.findElement(By.cssSelector("[type='text']")).isEnabled());
    }
}
