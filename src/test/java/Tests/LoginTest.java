package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.WaitUtils;

public class LoginTest extends BaseTest {

    @Test
    public void checkLogin() {
        MainPage page = new MainPage(driver);
        page.loginClickBtn();
        page.setFieldLogin("test123@gmail.com");
        page.setFieldPassword("qwerty12345");
        Assert.assertTrue(page.isCheckBtnSuccesLogin());
    }
}
