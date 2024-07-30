package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {

    @Test
    public void fileUploadTest() {
        driver.get(ReadProperties.getUrlFileUpload());
        WebElement fileUploadElement = waitsService.presenceOfElementLocated(By.id("file-upload"));
        String pathToFile = "D:\\Project\\AQA27\\src\\test\\resources\\data\\sample-zip-file.zip";
        // String pathToFile = FileUploadTest.class.getClassLoader().getResource("data" + File.separator + "sample-zip-file.zip").getPath();
        fileUploadElement.sendKeys(pathToFile);
        waitsService.elementToBeClickable(By.id("file-submit")).click();
        Assert.assertEquals(driver.findElement(By.id("uploaded-files")).getText(), "sample-zip-file.zip");
    }
}
