package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import Pages.ProductDescriptionPage;
import Pages.ProductListPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.SleeperUtils;

public class NavigateToProductTest extends BaseTest {

    @Test
    public void moveToRefrigerator() throws InterruptedException {
        MainPage page = new MainPage(driver);
        SleeperUtils.threadSleep(1);
        page.doSearch("Холодильник");
        ProductListPage productListPage = new ProductListPage(driver);
        productListPage.navigateToProductDescriptionPage("BCD-160MDMJ01");
        ProductDescriptionPage productDescriptionPage = new ProductDescriptionPage(driver);
        Assert.assertEquals(true,productDescriptionPage.isContainsProductName("BCD-160MDMJ01"));
    }

    @Test
    public void moveToIphone() throws InterruptedException {
        MainPage page = new MainPage(driver);
        SleeperUtils.threadSleep(1);
        page.doSearch("Телефон");
        ProductListPage productListPage = new ProductListPage(driver);
        productListPage.navigateToProductDescriptionPage("SM-N985FZNGSEK");
        ProductDescriptionPage productDescriptionPage = new ProductDescriptionPage(driver);
        SleeperUtils.threadSleep(3);
        Assert.assertEquals(true,productDescriptionPage.isContainsProductName("SM-N985FZNGSEK"));
    }
}
