package Tests;
import BaseTest.BaseTest;
import Pages.ProductListPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.MainPage;

public class AddProductToCartTest extends BaseTest {

    @Test
    public void checkAddProduct() {
        MainPage page = new MainPage(driver);
        String oldCardValue = page.takeCartValue();
        page.doSearch("Samsung");
        ProductListPage productListPage = new ProductListPage(driver);
        productListPage.productBtnClick("SM-N985FZNGSEK");
        String newCartValue = page.takeCartValue();
        Assert.assertNotEquals(oldCardValue, newCartValue);
    }
}
