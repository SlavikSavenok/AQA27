package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;

public class AdvansedActionTest extends BaseTest {

    @Test
    public void contextMenuTest() throws InterruptedException {
        driver.get(ReadProperties.getUrlContextMenu());
        Thread.sleep(2000);
    }

    @Test
    public void dynamicControlsTest() throws InterruptedException {
        driver.get(ReadProperties.getUrlDynamicControls());
        Thread.sleep(2000);
    }

    @Test
    public void fileDownloaderTest() throws InterruptedException {
        driver.get(ReadProperties.getUrlFileDownloader());
        Thread.sleep(2000);
    }
}
