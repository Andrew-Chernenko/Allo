package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.SleeperUtils;

public class LanguageSwitchTest extends BaseTest {


    @Test
    public void checkSwap() throws InterruptedException {
        MainPage page = new MainPage(driver);
        SleeperUtils.threadSleep(1);
        String headerColor = page.getHeaderColor();
        headerColor = Color.fromString(headerColor).asHex();
        if (headerColor.equals("#323232")) {
            page.swapLanguageNightTheme();
        } else {
            page.swapLanguageDayTheme();
        }
        SleeperUtils.threadSleep(2);
        Assert.assertNotEquals(driver.getCurrentUrl(), BaseTest.link);
    }
}
