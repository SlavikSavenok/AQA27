package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class FileUploadTest extends BaseTest {

    @Test
    public void fileUploadTest() {
        driver.get(ReadProperties.getUrlFileUpload());
        WebElement fileUploadElement = waitsService.presenceOfElementLocated(By.id("file-upload"));
        String pathToFile = FileUploadTest.class.getClassLoader().getResource("data" + File.separator + "sample-zip-file.zip").getPath().replace("/D","D").replace("%5c","/");
        System.out.println(pathToFile);
        fileUploadElement.sendKeys(pathToFile);
        waitsService.elementToBeClickable(By.id("file-submit")).click();
        Assert.assertEquals(driver.findElement(By.id("uploaded-files")).getText(), "sample-zip-file.zip");
    }
}
