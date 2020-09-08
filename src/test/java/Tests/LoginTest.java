package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @Test
    public void checkLogin() throws InterruptedException {
        MainPage page = new MainPage(driver);
        sleeper.threadSleep(1000);
        page.setLoginClick();
        sleeper.threadSleep(1000);
        page.fieldLogin.sendKeys("test123@gmail.com");
        page.fieldPassword.sendKeys("qwerty12345");
        Assert.assertTrue(page.btnSuccesLogin.isEnabled());
    }
}
