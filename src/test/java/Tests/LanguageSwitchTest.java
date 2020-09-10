package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.SleeperUtils;

public class LanguageSwitchTest extends BaseTest {

    @Test
    public void checkSwap() throws InterruptedException {
        MainPage page = new MainPage(driver);
        SleeperUtils.threadSleep(1);
        String headerColor = page.getHeaderColor();
        if (headerColor.equals("#323232")) {
            page.swapLanguageNightThemeClick();
        } else {
            page.swapLanguageDayThemeClick();
        }
        SleeperUtils.threadSleep(2);
        Assert.assertNotEquals(driver.getCurrentUrl(), BaseTest.link);
    }
}
