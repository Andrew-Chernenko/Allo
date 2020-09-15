package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PasswordRecoveryTest extends BaseTest {

    @Test
    public void passwordRecovery() {
        MainPage page = new MainPage(driver);
        page.loginClickBtn();
        page.btnRecoveryPasswordClick();
        page.setInputRecoveryPassword("test@gmail.com");
        Assert.assertTrue(page.isCheckBtnSendCodeRecoveryPassword());
    }
}
