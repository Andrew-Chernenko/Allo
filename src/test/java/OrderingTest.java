import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderingTest extends MainPage {
    private WebElement searchBox;
    private WebElement nameInput;
    private WebElement numberInput;
    private WebElement emailInput;
    private WebElement lastStepBtn;

    @Test
    public void orderingPurchase() throws InterruptedException {

        searchBox = searchSearchBox();
        Thread.sleep(1000);
        searchBox.sendKeys("Айфон" + Keys.ENTER);
        Thread.sleep(4000);
        setIphone();
        Thread.sleep(4500);
        orderBtnSearch();
        Thread.sleep(5000);
        nameInput = nameInputSearch();
        Thread.sleep(1000);
        nameInput.sendKeys("Андрей");
        numberInput = numberInputSearch();
        Thread.sleep(1000);
        numberInput.sendKeys("994567634");
        emailInput = emailInputSearch();
        Thread.sleep(1000);
        emailInput.sendKeys("test@gmail.com");
        Thread.sleep(500);
        lastStepBtn = lastStepBtnSearch();
        Assert.assertTrue(lastStepBtn.isEnabled());
    }

    @Test
    public void orderingPurchaseFalse() throws InterruptedException {

        searchBox = searchSearchBox();
        Thread.sleep(1000);
        searchBox.sendKeys("Айфон" + Keys.ENTER);
        Thread.sleep(4000);
        setIphone();
        Thread.sleep(4500);
        orderBtnSearch();
        Thread.sleep(5000);
        lastStepBtn = lastStepBtnSearch();
        Assert.assertFalse(lastStepBtn.isEnabled());
    }
}
