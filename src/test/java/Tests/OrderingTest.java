package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.SleeperUtils;

public class OrderingTest extends BaseTest {

    @Test
    public void orderingPurchase() throws InterruptedException {

        MainPage page = new MainPage(driver);
        SleeperUtils.threadSleep(1);
        page.doSearch("Айфон");
        page.setTelephone();
        SleeperUtils.threadSleep(4);
        page.orderBtnClick();
        page.setFieldNameOnOrdering("Андрей");
        page.setFieldTelephoneOnOrdering("994567634");
        page.setFieldEmailOnOrdering("test@gmail.com");
        Assert.assertTrue(page.checkBtnCheckOut());
    }

    @Test
    public void orderingPurchaseFalse() throws InterruptedException {
        MainPage page = new MainPage(driver);
        SleeperUtils.threadSleep(1);
        page.doSearch("Микроволновка");
        page.microwaveBtnClick();
        page.orderBtnClick();
        Assert.assertFalse(page.checkBtnCheckOut());
    }
}
