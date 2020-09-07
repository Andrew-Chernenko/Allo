import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderingTest extends MainPage {

    @Test
    public void orderingPurchase() throws InterruptedException {

        searchSearchBox();
        Thread.sleep(1000);
        searchBox.sendKeys("Айфон" + Keys.ENTER);
        Thread.sleep(4000);
        setIphone();
        Thread.sleep(4500);
        orderBtnSearch();
        Thread.sleep(5000);
        nameInputSearch();
        Thread.sleep(1000);
        nameInput.sendKeys("Андрей");
        numberInputSearch();
        Thread.sleep(1000);
        numberInput.sendKeys("994567634");
        emailInputSearch();
        Thread.sleep(1000);
        emailInput.sendKeys("test@gmail.com");
        Thread.sleep(500);
        lastStepBtnSearch();
        Assert.assertTrue(lastStepBtn.isEnabled());

    }

    @Test
    public void orderingPurchaseFalse() throws InterruptedException {

        searchSearchBox();
        Thread.sleep(1000);
        searchBox.sendKeys("Айфон" + Keys.ENTER);
        Thread.sleep(4000);
        setIphone();
        Thread.sleep(4500);
        orderBtnSearch();
        Thread.sleep(5000);
        lastStepBtnSearch();
        Assert.assertFalse(lastStepBtn.isEnabled());

    }
}
