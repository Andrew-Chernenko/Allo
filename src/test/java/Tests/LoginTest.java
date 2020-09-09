package Tests;

import BaseTest.BaseTest;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.SleeperUtils;

public class LoginTest extends BaseTest {


    @Test
    public void checkLogin() throws InterruptedException {
        MainPage page = new MainPage(driver);
        SleeperUtils.threadSleep(1);
        page.setLoginClick();
        SleeperUtils.threadSleep(1);
        page.setFieldLogin("test123@gmail.com");
        page.setFieldPassword("qwerty12345");
        Assert.assertTrue(page.checkBtnSuccesLogin());
    }
}
