package services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

public class DriverForTests {


    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        return new ChromeDriver(getChromeOptions());
    }

    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-gpu");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--silent");


        return options;


    }
}