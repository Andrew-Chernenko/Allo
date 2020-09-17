package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test
    public void registerCheck() {
        MainPage page = new MainPage(driver);
        page.registerBtnClick();
        page.setInputRegisterName("Андрей");
        page.setInputRegisterPhone("956765444");
        page.setInputRegisterEmail("test12345612355@gmail.com");
        page.setInputRegisterPassword("qwerty12345");
        Assert.assertTrue(page.isCheckSuccesRegisterBtn());
    }
}
