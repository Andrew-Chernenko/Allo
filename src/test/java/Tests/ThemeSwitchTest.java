package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.SleeperUtils;

public class ThemeSwitchTest extends BaseTest {

    @Test
    public void checkColor() throws InterruptedException {
        MainPage page = new MainPage(driver);
        String headerColor;
        SleeperUtils.threadSleep(1);
        headerColor = page.getHeaderColor();
        page.checkBoxThemeSwitchClick();
        Assert.assertNotEquals(page.getHeaderColor(), headerColor);
    }
}
