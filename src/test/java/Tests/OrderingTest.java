package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import Pages.ProductListPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderingTest extends BaseTest {

    @Test
    public void orderingPurchase() {
        MainPage page = new MainPage(driver);
        page.doSearch("Айфон");
        ProductListPage productListPage = new ProductListPage(driver);
        productListPage.productBtnClick("MWM02");
        page.orderBtnClick();
        page.setFieldNameOnOrdering("Андрей");
        page.setFieldTelephoneOnOrdering("994567634");
        page.setFieldEmailOnOrdering("test@gmail.com");
        Assert.assertTrue(page.isCheckBtnCheckOut());
    }

    @Test
    public void orderingPurchaseIncorrectData() {
        MainPage page = new MainPage(driver);
        page.doSearch("Микроволновка");
        ProductListPage productListPage = new ProductListPage(driver);
        productListPage.productBtnClick("MWBLXE1ACM");
        page.orderBtnClick();
        Assert.assertFalse(page.isCheckBtnCheckOut());
    }
}
