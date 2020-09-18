package Tests;
import BaseTest.BaseTest;
import Pages.LoginMenuPage;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.EntityData.User;

public class PasswordRecoveryTest extends BaseTest {

    @Test
    public void passwordRecovery() {
        User user = new User();
        user.setEmail("test@gmail.com");
        MainPage page = new MainPage(driver);
        LoginMenuPage loginMenuPage = page.loginClickBtn();
        loginMenuPage.btnRecoveryPasswordClick();
        loginMenuPage.setInputRecoveryPassword(user);
        Assert.assertTrue(loginMenuPage.isCheckBtnSendCodeRecoveryPassword());
    }
}
