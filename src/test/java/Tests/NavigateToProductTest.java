package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigateToProductTest extends BaseTest {


    @Test
    public void moveToRef() throws InterruptedException {
        MainPage page = new MainPage(driver);
        sleeper.threadSleep(200);
        page.searchBox.sendKeys("Холодильник" + Keys.ENTER);
        sleeper.threadSleep(5000);
        page.setRefrigeratorBtnClick();
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/holodilniki/mijia-bcd-160mdmj01.html");
    }

    @Test
    public void moveToIph() throws InterruptedException {
        MainPage page = new MainPage(driver);
        sleeper.threadSleep(500);
        page.searchBox.sendKeys("Айфон" + Keys.ENTER);
        sleeper.threadSleep(5000);
        page.setIphoneBtnClick();
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/products/mobile/apple-iphone-11-128gb-black.html");
    }
}
