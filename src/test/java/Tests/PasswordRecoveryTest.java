package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.SleeperUtils;

public class PasswordRecoveryTest extends BaseTest {

    @Test
    public void passwordRecovery() throws InterruptedException {
        MainPage page = new MainPage(driver);
        SleeperUtils.threadSleep(1);
        page.loginClickBtn();
        page.btnRecoveryPasswordClick();
        page.setInputRecoveryPassword("test@gmail.com");
        Assert.assertTrue(page.isCheckBtnSendCodeRecoveryPassword());
    }
}
