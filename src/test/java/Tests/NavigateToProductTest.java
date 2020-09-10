package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.SleeperUtils;

public class NavigateToProductTest extends BaseTest {

    @Test
    public void moveToRef() throws InterruptedException {
        MainPage page = new MainPage(driver);
        SleeperUtils.threadSleep(1);
        page.doSearch("Холодильник");
        page.refrigeratorBtnClick();
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/holodilniki/mijia-bcd-160mdmj01.html");
    }

    @Test
    public void moveToIph() throws InterruptedException {
        MainPage page = new MainPage(driver);
        SleeperUtils.threadSleep(1);
        page.doSearch("Айфон");
        page.iphoneBtnClick();
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/products/mobile/apple-iphone-11-128gb-black.html");
    }
}
