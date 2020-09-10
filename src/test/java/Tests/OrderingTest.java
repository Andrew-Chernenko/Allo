package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import Pages.ProductListPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.SleeperUtils;

public class OrderingTest extends BaseTest {

    @Test
    public void orderingPurchase() throws InterruptedException {
        MainPage page = new MainPage(driver);
        ProductListPage productListPage = new ProductListPage(driver);
        SleeperUtils.threadSleep(1);
        page.doSearch("Айфон");
        productListPage.buyProductBtnClick(3);
        SleeperUtils.threadSleep(4);
        page.orderBtnClick();
        page.setFieldNameOnOrdering("Андрей");
        page.setFieldTelephoneOnOrdering("994567634");
        page.setFieldEmailOnOrdering("test@gmail.com");
        Assert.assertTrue(page.isCheckBtnCheckOut());
    }

    @Test
    public void orderingPurchaseFalse() throws InterruptedException {
        MainPage page = new MainPage(driver);
        ProductListPage productListPage = new ProductListPage(driver);
        SleeperUtils.threadSleep(1);
        page.doSearch("Микроволновка");
        productListPage.buyProductBtnClick(2);
        page.orderBtnClick();
        Assert.assertFalse(page.isCheckBtnCheckOut());
    }
}
