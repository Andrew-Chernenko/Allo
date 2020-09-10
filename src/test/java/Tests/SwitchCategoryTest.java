package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.SleeperUtils;

public class SwitchCategoryTest extends BaseTest {

    @Test
    public void checkCategoryFirst() throws InterruptedException {
        MainPage page = new MainPage(driver);
        SleeperUtils.threadSleep(1);
        page.firstCategoryClick();
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/mobilnye-telefony-i-sredstva-svyazi/");
    }

    @Test
    public void checkCategorySecond() throws InterruptedException {
        MainPage page = new MainPage(driver);
        SleeperUtils.threadSleep(1);
        page.secondCategoryClick();
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/bytovaya-tehnika/");
    }

}
