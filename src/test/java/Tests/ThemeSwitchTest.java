package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.WaitUtils;

public class ThemeSwitchTest extends BaseTest {

    @Test
    public void checkThemeColor() {
        MainPage page = new MainPage(driver);
        String headerColor;
        headerColor = page.getHeaderColor();
        page.checkBoxThemeSwitchClick();
        Assert.assertNotEquals(page.getHeaderColor(), headerColor);
    }
}
