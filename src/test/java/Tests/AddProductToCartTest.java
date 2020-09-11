package Tests;
import BaseTest.BaseTest;
import Pages.ProductListPage;
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
        ProductListPage productListPage = new ProductListPage(driver);
        productListPage.buyProductBtnClick(3);
        SleeperUtils.threadSleep(4);
        String newCartValue = page.takeCartValue();
        Assert.assertNotEquals(oldCardValue, newCartValue);
    }
}
