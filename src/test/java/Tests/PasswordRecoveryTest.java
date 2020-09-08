package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PasswordRecoveryTest extends BaseTest {


    @Test
    public void passwordRecovery() throws InterruptedException {
        MainPage page = new MainPage(driver);
        sleeper.threadSleep(1000);
        page.setLoginClick();
        sleeper.threadSleep(1000);
        page.btnRecoveryPasswordClick();
        sleeper.threadSleep(2000);
        page.inputRecoveryPassword.sendKeys("test@gmail.com");
        Assert.assertTrue(page.btnSendCodeRecoveryPassword.isEnabled());
    }
}
