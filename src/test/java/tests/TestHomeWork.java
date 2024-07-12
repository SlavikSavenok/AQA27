package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import services.DriverForTests;

public class TestHomeWork {
    WebDriver driver;
    DriverForTests driverForTests = new DriverForTests();

    @BeforeMethod
    public void setUp() {
        driver = driverForTests.getDriver();
    }

    @AfterMethod
    public void teatDown() {
        driver.quit();
    }

    @Test()
    public void validateElectricFloorCalculator() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");
        WebElement width = driver.findElement(By.id("el_f_width"));
        WebElement length = driver.findElement(By.id("el_f_lenght"));
        WebElement room = driver.findElement(By.id("room_type"));
        WebElement heatingType = driver.findElement(By.id("heating_type"));
        WebElement button = driver.findElement(By.name("button"));
        WebElement cablePower = driver.findElement(By.id("floor_cable_power"));
        WebElement powerDensity = driver.findElement(By.id("spec_floor_cable_power"));

        width.sendKeys("10");
        length.sendKeys("5");
        Select selectRoomType = new Select(room);
        selectRoomType.selectByVisibleText("Ванная");
        Select selectHeatingType = new Select(heatingType);
        selectHeatingType.selectByVisibleText("Основное отопление");
        button.click();


        softAssert.assertEquals(cablePower.getAttribute("value"), "7000");
        softAssert.assertEquals(powerDensity.getAttribute("value"), "140");

        softAssert.assertAll();


    }

    @Test
    public void validateSKF() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://bymed.top/calc/%D1%81%D0%BA%D1%84-2148");

        driver.switchTo().frame(1);
        WebElement age = driver.findElement(By.id("age"));
        WebElement gender = driver.findElement(By.id("sex"));
        WebElement creatinine = driver.findElement(By.name("cr"));
        WebElement selectUnitOfMeasurement = driver.findElement(By.id("cr-size"));
        WebElement race = driver.findElement(By.id("race"));
        WebElement weight = driver.findElement(By.id("mass"));
        WebElement grow = driver.findElement(By.name("grow"));
        WebElement button = driver.findElement(By.xpath("//*[@id=\"input-data\"]/p[7]/button"));
        WebElement MRDRResult = driver.findElement(By.id("mdrd_res"));
        WebElement CKDEPIResult = driver.findElement(By.id("ckd_epi_res"));
        WebElement CockcroftGaultFormula = driver.findElement(By.id("cge_res"));


        age.sendKeys("38");
        creatinine.sendKeys("80");
        weight.sendKeys("55");
        grow.sendKeys("163");

        Select genderType = new Select(gender);
        genderType.selectByVisibleText("Женский");

        Select raceType = new Select(race);
        raceType.selectByVisibleText("Другая");

        Select selectCreatinineType = new Select(selectUnitOfMeasurement);
        selectCreatinineType.selectByVisibleText("мкмоль/л");

        button.submit();

        softAssert.assertEquals(MRDRResult.getText(), "69.63");
        softAssert.assertEquals(CKDEPIResult.getText(), "80.57");
        softAssert.assertEquals(CockcroftGaultFormula.getText(), "73.18");

        softAssert.assertAll();
    }

    @Test
    public void validateLaminateCalculator() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://calc.by/building-calculators/laminate.html");
        Thread.sleep(3000);

        WebElement roomLength = driver.findElement(By.id("ln_room_id"));
        WebElement roomWidth = driver.findElement(By.id("wd_room_id"));
        WebElement laminatePanelLength = driver.findElement(By.id("ln_lam_id"));
        WebElement laminatePanelWidth = driver.findElement(By.id("wd_lam_id"));
        WebElement laminateLayingDirection = driver.findElement(By.id("direction-laminate-id1"));
        WebElement button = driver.findElement(By.xpath("//*[@id=\"t3-content\"]/div[3]/article/section/div[2]/div[2]/div[2]/a"));


        roomLength.clear();
        roomLength.sendKeys("500");
        roomWidth.clear();
        roomWidth.sendKeys("400");
        laminatePanelLength.clear();
        laminatePanelLength.sendKeys("2000");
        laminatePanelWidth.clear();
        laminatePanelWidth.sendKeys("200");
        laminateLayingDirection.click();
        button.click();
        Thread.sleep(3000);

        WebElement requiredNumberOfLLaminateBoards = driver.findElement(By.xpath("//span[@style='padding:5px 0;font-size:22px; color:#C80303; font-weight:bold;']"));
        WebElement numberOfLaminatePackages = driver.findElement(By.xpath("//span[@style='padding:5px 0;font-size:18px; color:#0E8C19; font-weight:bold;']"));


        softAssert.assertEquals(requiredNumberOfLLaminateBoards.getText(), "53");
        softAssert.assertEquals(numberOfLaminatePackages.getText(), "7");
        softAssert.assertAll();
        Thread.sleep(3000);

    }
}
