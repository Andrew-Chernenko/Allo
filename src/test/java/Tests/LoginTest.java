package Tests;
import BaseTest.BaseTest;
import Pages.LoginMenuPage;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.EntityData.User;

public class LoginTest extends BaseTest {

    @Test
    public void checkLogin() {
        User user = new User();
        user.setEmail("test123@gmail.com");
        user.setPassword("qwerty12345");
        MainPage page = new MainPage(driver);
        LoginMenuPage loginMenuPage = page.loginClickBtn();
        loginMenuPage.setFieldLoginProcces(user);
        Assert.assertTrue(loginMenuPage.isCheckSuccesRegisterBtn());
    }
}
