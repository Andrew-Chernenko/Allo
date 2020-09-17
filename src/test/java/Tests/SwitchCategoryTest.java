package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwitchCategoryTest extends BaseTest {

    @Test
    public void checkCategoryFirst() {
        MainPage page = new MainPage(driver);
        page.firstCategoryClick();
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/mobilnye-telefony-i-sredstva-svyazi/");
    }

    @Test
    public void checkCategorySecond() {
        MainPage page = new MainPage(driver);
        page.secondCategoryClick();
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/bytovaya-tehnika/");
    }
}
