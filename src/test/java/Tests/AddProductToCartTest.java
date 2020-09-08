package Tests;

import BaseTest.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.MainPage;

public class AddProductToCartTest extends BaseTest {


    @Test
    public void checkAddProduct() throws InterruptedException {
        MainPage page = new MainPage(driver);
        String oldCardValue;
        String newCartValue;
        oldCardValue = page.takeCartValue();
        page.searchBox.sendKeys("Телефон" + Keys.ENTER);
        sleeper.threadSleep(4000);
        page.setTelephone();
        sleeper.threadSleep(4000);
        newCartValue = page.takeCartValue();
        Assert.assertNotEquals(oldCardValue, newCartValue);
    }
}
