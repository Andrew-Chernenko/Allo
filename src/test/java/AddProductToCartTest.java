import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductToCartTest extends MainPage {
    private String newCartValue;
    private String CartValue;
    private WebElement searchBox;


    @Test
    public void checkAddProduct() throws InterruptedException {
        CartValue = takeCartValue();
        searchBox = searchSearchBox();
        searchBox.sendKeys("Телефон" + Keys.ENTER);
        Thread.sleep(4000);
        setTelephone();
        Thread.sleep(4000);
        newCartValue = CartValue;
        CartValue = takeCartValue();
        Assert.assertNotEquals(newCartValue, CartValue);
    }
}
