package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.SleeperUtils;

public class RegistrationTest extends BaseTest {


    @Test
    public void registerCheck() throws InterruptedException {
        MainPage page = new MainPage(driver);
        SleeperUtils.threadSleep(2);
        page.registerBtnClick();
        page.setInputRegisterName("Андрей");
        page.setInputRegisterPhone("956765444");
        page.setInputRegisterEmail("test12345612355@gmail.com");
        Assert.assertTrue(page.checkSuccesRegisterBtn());
    }
}
