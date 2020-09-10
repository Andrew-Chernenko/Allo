package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import Pages.ProductListPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.SleeperUtils;

public class NavigateToProductTest extends BaseTest {

    @Test
    public void moveToRef() throws InterruptedException {
        MainPage page = new MainPage(driver);
        ProductListPage productListPage = new ProductListPage(driver);
        SleeperUtils.threadSleep(1);
        page.doSearch("Холодильник");
        productListPage.buyProductBtnClick(2);
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/holodilniki/viomi-301l-bcd-301wmsaym.html");
    }

    @Test
    public void moveToIph() throws InterruptedException {
        MainPage page = new MainPage(driver);
        ProductListPage productListPage = new ProductListPage(driver);
        SleeperUtils.threadSleep(1);
        page.doSearch("Айфон");
        productListPage.buyProductBtnClick(1);
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/products/mobile/apple-iphone-11-pro-max-256gb-midnight-green.html");
    }
}
