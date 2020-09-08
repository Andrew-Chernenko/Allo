package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ThemeSwitchTest extends BaseTest {


    protected WebElement checkBox;

    @Test
    public void checkColor() throws InterruptedException {
        MainPage page = new MainPage(driver);
        sleeper.threadSleep(300);
        String color;
        String headerColor;
        headerColor = page.getHeaderColor();
        headerColor = Color.fromString(headerColor).asHex();
        color = headerColor;
        page.checkBoxThemeSwitchClick();
        sleeper.threadSleep(2500);
        headerColor = page.getHeaderColor();
        headerColor = Color.fromString(headerColor).asHex();
        Assert.assertNotEquals(color, headerColor);
    }
}
