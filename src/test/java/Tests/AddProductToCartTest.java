package Tests;
import BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.MainPage;
import utils.SleeperUtils;

public class AddProductToCartTest extends BaseTest {


    @Test
    public void checkAddProduct() throws InterruptedException {
        MainPage page = new MainPage(driver);
        String oldCardValue;
        String newCartValue;
        oldCardValue = page.takeCartValue();
        page.doSearch("Телефон");
        page.setTelephone();
        SleeperUtils.threadSleep(4);
        newCartValue = page.takeCartValue();
        Assert.assertNotEquals(oldCardValue, newCartValue);
    }
}
