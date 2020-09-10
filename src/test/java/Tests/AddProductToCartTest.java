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
        String oldCardValue = page.takeCartValue();
        page.doSearch("Телефон");
        page.telephoneBtnClick();
        SleeperUtils.threadSleep(4);
        String newCartValue = page.takeCartValue();
        Assert.assertNotEquals(oldCardValue, newCartValue);
    }
}
