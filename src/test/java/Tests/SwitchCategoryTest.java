package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwitchCategoryTest extends BaseTest {


    @Test
    public void checkCategoryFirst() throws InterruptedException {
        MainPage page = new MainPage(driver);
        sleeper.threadSleep(500);
        page.firstCategoryClick();
        sleeper.threadSleep(2500);
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/mobilnye-telefony-i-sredstva-svyazi/");
    }

    @Test
    public void checkCategorySecond() throws InterruptedException {
        MainPage page = new MainPage(driver);
        sleeper.threadSleep(500);
        page.secondCategoryClick();
        sleeper.threadSleep(2500);
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/bytovaya-tehnika/");
    }

}
