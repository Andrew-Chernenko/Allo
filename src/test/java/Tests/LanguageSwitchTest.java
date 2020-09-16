package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LanguageSwitchTest extends BaseTest {

    @Test
    public void checkSwapLanguage() {
        MainPage page = new MainPage(driver);
        page.swapLanguageClick();
        Assert.assertNotEquals(driver.getCurrentUrl(), BaseTest.link);
    }
}
