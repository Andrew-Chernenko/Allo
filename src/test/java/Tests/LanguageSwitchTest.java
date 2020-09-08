package Tests;

import BaseTest.BaseTest;
import Pages.MainPage;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LanguageSwitchTest extends BaseTest {


    @Test
    public void checkSwap() throws InterruptedException {
        MainPage page = new MainPage(driver);
        sleeper.threadSleep(500);
        String headerColor = page.getHeaderColor();
        headerColor = Color.fromString(headerColor).asHex();
        if (headerColor.equals("#323232")) {
            page.swapLanguageNightTheme();
        } else {
            page.swapLanguageDayTheme();
        }
        sleeper.threadSleep(2000);
        Assert.assertNotEquals(driver.getCurrentUrl(), BaseTest.link);
    }
}
