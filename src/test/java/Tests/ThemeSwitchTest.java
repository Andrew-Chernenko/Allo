package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.SleeperUtils;

public class ThemeSwitchTest extends BaseTest {


    @Test
    public void checkColor() throws InterruptedException {
        MainPage page = new MainPage(driver);
        SleeperUtils.threadSleep(1);
        String color;
        String headerColor;
        headerColor = page.getHeaderColor();
        headerColor = Color.fromString(headerColor).asHex();
        color = headerColor;
        page.checkBoxThemeSwitchClick();
        headerColor = page.getHeaderColor();
        headerColor = Color.fromString(headerColor).asHex();
        Assert.assertNotEquals(color, headerColor);
    }
}
