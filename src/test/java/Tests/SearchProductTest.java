package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTest extends BaseTest {


    @Test
    public void searchGoodsEng() throws InterruptedException {
        MainPage page = new MainPage(driver);
        sleeper.threadSleep(300);
        page.searchBox.sendKeys("Apple" + Keys.ENTER);
        sleeper.threadSleep(1500);
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/apple-store/");
    }


    @Test
    public void searchGoodsRus() throws InterruptedException {
        MainPage page = new MainPage(driver);
        sleeper.threadSleep(300);
        page.searchBox.sendKeys("Айфон" + Keys.ENTER);
        sleeper.threadSleep(1500);
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/products/mobile/proizvoditel-apple/");
    }
}
