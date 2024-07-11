package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
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
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://www.saucedemo.com/");
        //поиск по id
        WebElement username = driver.findElement(By.id("user-name"));
        // поиск по name
        WebElement password = driver.findElement(By.name("password"));
        // поиск по class name
        WebElement login = driver.findElement(By.className("btn_action"));
        // поиск по tag name
        WebElement tagNam = driver.findElement(By.tagName("noscript"));
        //class1.class2 (CSS)
        Assert.assertTrue(driver.findElement(By.cssSelector(".submit-button.btn_action")).isDisplayed());

        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        login.click();

        // поиск по link text
        Assert.assertTrue(driver.findElement(By.linkText("LinkedIn")).isDisplayed());
        //поиск по partial link text
        Assert.assertTrue(driver.findElement(By.partialLinkText("Twi")).isDisplayed());


        // CSS ЛОКАТОРЫ
        // css id
        Assert.assertTrue(driver.findElement(By.cssSelector("#react-burger-menu-btn")).isDisplayed());
        // css class name
        Assert.assertTrue(driver.findElement(By.cssSelector(".app_logo")).isDisplayed());
        // class1 .class2
        Assert.assertTrue(driver.findElement(By.cssSelector(".header_label .app_logo")).isDisplayed());
        // css tag name
        Assert.assertTrue(driver.findElement(By.cssSelector("select")).isDisplayed());
        // tag name.class
        WebElement shoppingCart = driver.findElement(By.cssSelector("a.shopping_cart_link"));
        // двухуровневая иерархия поиска дочеренего элемента
        WebElement backpack = driver.findElement(By.cssSelector("#item_4_title_link .inventory_item_name"));
        backpack.click();
        // многоуровневая иерархия поска элемента
        WebElement cart = driver.findElement(By.cssSelector("body #root .inventory_details_desc_container #add-to-cart"));
        cart.click();
        //поиск всех элементов с тэгоми div или script
        Assert.assertTrue(driver.findElement(By.cssSelector("div,script")).isEnabled());
        //Поиск всех элементов с тэгом ul у которых непосредственный родитель с тэгом footer
        Assert.assertTrue(driver.findElement(By.cssSelector("footer>ul")).isEnabled());
        // Поиск всех элементов с тэгом div которые идут сразу за элементом с тэгом ul
        Assert.assertTrue(driver.findElement(By.cssSelector("ul+div")).isEnabled());
        // Поиск  аттрибуа data-test с конкретным значением
        WebElement backToProduct = driver.findElement(By.cssSelector("[data-test='back-to-products']"));
        backToProduct.click();
        // Поиск всех элементов у которых присутствует аттрибут name со значением заканчивающимся на какое-то value
        WebElement tShirt = driver.findElement(By.cssSelector("[name$=-labs-bolt-t-shirt]"));
        tShirt.click();
        // Поиск всех элементов у которых присутствует аттрибут name со значением начинающимся на какое-то value
        WebElement labs = driver.findElement(By.cssSelector("[name^=add-to-cart-sauce-labs-o]"));
        labs.click();
        // Поиск всех элементов у которых присутствует аттрибут name со значением содержащим какой текст
        WebElement bikeLight = driver.findElement(By.cssSelector("[name*=e-labs-bike-]"));
        bikeLight.click();
        // Поиск всех элементов у которых присутствует аттрибут id со значением начинающимся на какиие-то слова
        WebElement jacket = driver.findElement(By.cssSelector("[id|=add-to-cart-sauce-labs]"));
        jacket.click();
        // Поиск всех элементов у которых присутствует аттрибут data-test со значением содержащим слово целиком
        Assert.assertTrue(driver.findElement(By.cssSelector("[data-test~='footer']")).isDisplayed());

        // XPath локаторы
        // поиск по атрибуту
        WebElement removeLabs = driver.findElement(By.xpath("//*[@data-test='remove-sauce-labs-onesie']"));
        removeLabs.click();
        // поиск элемента с условием and
        WebElement cart2 = driver.findElement(By.xpath("//*[@class='shopping_cart_link' and @data-test='shopping-cart-link']"));
        cart2.click();
        // Поиск элемента у которого значение аттрибута содержит подстроку
        WebElement continueShopping = driver.findElement(By.xpath("//*[contains(@id,'ntinu')]"));
        continueShopping.click();
        //// Поиск элемента у по текстовому значению
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']")).isDisplayed());
        // Поиск элемента у которого текстовое значение содержит подстроку
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Test')]")).isDisplayed());
        //parent
        WebElement cart3 = driver.findElement(By.xpath("//span/parent::a"));
        cart3.click();
        //ancestor
        Assert.assertTrue(driver.findElement(By.xpath("//footer/ancestor::body")).isEnabled());
        //following
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='cart_footer']/following::div")).isEnabled());
        //preceding
        Assert.assertTrue(driver.findElement(By.xpath("//footer/preceding::div[@id='contents_wrapper']")).isEnabled());
        //descendant
        Assert.assertTrue(driver.findElement(By.xpath("//ul/descendant::li")).isEnabled());


        // чтот увлекся с локаторами, пошел по списку и забыл что нужно проверть стоимость/цену:)

        WebElement labsBackpack = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        WebElement labsBackpackPrice = driver.findElement(By.xpath("//*[@name='remove-sauce-labs-backpack']/preceding::div[@class='inventory_item_price']"));
        WebElement labsBolt = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        WebElement labsBoltPrice = driver.findElement(By.xpath("//*[text()='15.99']"));
        WebElement labsFleece = driver.findElement(By.cssSelector("#item_5_title_link .inventory_item_name "));
        WebElement labsFleecePrice = driver.findElement(By.xpath("//*[text()='49.99']"));

        softAssert.assertEquals(labsBackpack.getText(), "Sauce Labs Backpack");
        softAssert.assertEquals(labsBackpackPrice.getText(), "$29.99");
        softAssert.assertEquals(labsBolt.getText(), "Sauce Labs Bolt T-Shirt");
        softAssert.assertEquals(labsBoltPrice.getText(), "$15.99");
        softAssert.assertEquals(labsFleece.getText(), "Sauce Labs Fleece Jacket");
        softAssert.assertEquals(labsFleecePrice.getText(), "$49.99");
        softAssert.assertAll();


        Thread.sleep(3000);

    }

}
