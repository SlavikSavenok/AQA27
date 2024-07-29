package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void dynamicControlTest() throws InterruptedException {
        driver.get(ReadProperties.getUrlDynamicControls());
        dynamicControlSteps.clickRemove();

        Thread.sleep(2000);

    }
}
