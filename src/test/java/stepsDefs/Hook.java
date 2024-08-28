package stepsDefs;

import baseEntities.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import services.BrowsersService;

import java.util.concurrent.TimeUnit;

public class Hook extends BaseTest {
    private BaseTest baseTest;

    public Hook(BaseTest baseTest) {
        this.baseTest = baseTest;
    }

    @Before()
    public void initBrowser() {
        baseTest.driver = new BrowsersService().getDriver();
    }

    @After
    public void closeBrowser(){
        baseTest.driver.quit();
    }
}