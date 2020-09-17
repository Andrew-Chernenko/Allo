package Tests;
import BaseTest.BaseTest;
import Pages.CartPage;
import Pages.MainPage;
import Pages.OrderingPage;
import Pages.ProductListPage;
import utils.EntityData.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderingTest extends BaseTest {

    @Test
    public void orderingPurchase() {
        MainPage page = new MainPage(driver);
        page.doSearch("Айфон");
        ProductListPage productListPage = new ProductListPage(driver);
        productListPage.productBtnClick("MWM02");
        CartPage cartPage = new CartPage(driver);
        cartPage.orderBtnClick();
        OrderingPage orderingPage = new OrderingPage(driver);
        User user = new User();
        user.setName("Андрей");
        user.setPhone("994567634");
        user.setEmail("test@gmail.com");
        orderingPage.setFieldOrdering(user);
        Assert.assertTrue(orderingPage.isCheckBtnCheckOut());
    }

    @Test
    public void orderingPurchaseIncorrectData() {
        MainPage page = new MainPage(driver);
        page.doSearch("Микроволновка");
        ProductListPage productListPage = new ProductListPage(driver);
        productListPage.productBtnClick("MWBLXE1ACM");
        CartPage cartPage = new CartPage(driver);
        cartPage.orderBtnClick();
        OrderingPage orderingPage = new OrderingPage(driver);
        Assert.assertFalse(orderingPage.isCheckBtnCheckOut());
    }
}
