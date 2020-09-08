package Tests;

import BaseTest.BaseTest;
import Pages.MainPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderingTest extends BaseTest {

    @Test
    public void orderingPurchase() throws InterruptedException {

        MainPage page = new MainPage(driver);
        sleeper.threadSleep(300);
        page.searchBox.sendKeys("Айфон" + Keys.ENTER);
        sleeper.threadSleep(4000);
        page.setTelephone();
        sleeper.threadSleep(4000);
        page.orderBtnClick();
        sleeper.threadSleep(4000);
        page.fieldName.sendKeys("Андрей");
        sleeper.threadSleep(500);
        page.fielTelephone.sendKeys("994567634");
        sleeper.threadSleep(500);
        page.fieldEmail.sendKeys("test@gmail.com");
        sleeper.threadSleep(500);
        Assert.assertTrue(page.btnCheckOut.isEnabled());
    }

    @Test
    public void orderingPurchaseFalse() throws InterruptedException {
        MainPage page = new MainPage(driver);
        sleeper.threadSleep(300);
        page.searchBox.sendKeys("Микроволновка" + Keys.ENTER);
        sleeper.threadSleep(4000);
        page.microwaveBtnClick();
        sleeper.threadSleep(4000);
        page.orderBtnClick();
        sleeper.threadSleep(5000);
        Assert.assertFalse(page.btnCheckOut.isEnabled());
    }
}
