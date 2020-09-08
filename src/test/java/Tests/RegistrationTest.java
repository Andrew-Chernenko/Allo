package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {


    @Test
    public void registerCheck() throws InterruptedException {
        MainPage page = new MainPage(driver);
        sleeper.threadSleep(2000);
        page.registerBtnClick();
        sleeper.threadSleep(1400);
        page.inputRegisterName.sendKeys("Андрей");
        sleeper.threadSleep(100);
        page.inputRegisterPhone.sendKeys("956765444");
        sleeper.threadSleep(100);
        page.inputRegisterEmail.sendKeys("test12345612355@gmail.com");
        sleeper.threadSleep(100);
        page.inputRegisterPassword.sendKeys("qwerty12345");
        Assert.assertTrue(page.succesRegisterBtn.isEnabled());
    }
}
