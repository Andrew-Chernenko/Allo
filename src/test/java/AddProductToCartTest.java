import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductToCartTest extends MainPage {
    private String newCartValue;


    @Test
    public void checkAddProduct() throws InterruptedException {
        takeCartValue();
        searchSearchBox();
        searchBox.sendKeys("Телефон" + Keys.ENTER);
        Thread.sleep(4000);
        setTelephone();
        Thread.sleep(4000);
        newCartValue = CartValue;
        takeCartValue();
        Assert.assertNotEquals(newCartValue, CartValue);
    }
}
