package test;

import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.DriverForTests;

public class LocatorsTest {
    WebDriver driver;
    DriverForTests driverForTests = new DriverForTests();

    @BeforeMethod
    public void setUp() {
        driver = driverForTests.getDriver();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void locatorsTest() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        //поиск по id
        WebElement username = driver.findElement(By.id("user-name"));
        // поиск по name
        WebElement password = driver.findElement(By.name("password"));
        // поиск по class name
        WebElement login = driver.findElement(By.className("btn_action"));
        // поиск по tag name
        WebElement tagNam = driver.findElement(By.tagName("noscript"));
        // поиск по link text
         WebElement backpack = driver.findElement(By.linkText("LinkedIn"));

        //поиск по partial link text
        // WebElement ww=driver.findElement(By.partialLinkText("Twitter"));



        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        login.click();
        Thread.sleep(3000);


    }

}
