package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.SleeperUtils;

public class SearchProductTest extends BaseTest {

    @Test
    public void searchGoodsEng() throws InterruptedException {
        MainPage page = new MainPage(driver);
        SleeperUtils.threadSleep(1);
        page.doSearch("Apple");
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/apple-store/");
    }

    @Test
    public void searchGoodsRus() throws InterruptedException {
        MainPage page = new MainPage(driver);
        SleeperUtils.threadSleep(1);
        page.doSearch("Айфон");
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/products/mobile/proizvoditel-apple/");
    }
}
