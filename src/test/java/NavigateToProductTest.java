import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigateToProductTest extends MainPage {
    @Test
    public void moveToRef() throws InterruptedException {
        searchSearchBox();
        searchBox.sendKeys("Холодильник" + Keys.ENTER);
        Thread.sleep(4000);
        setRefrigerator();
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/holodilniki/mijia-bcd-160mdmj01.html");

    }

    @Test
    public void moveToIph() throws InterruptedException {
        searchSearchBox();
        searchBox.sendKeys("Айфон" + Keys.ENTER);
        Thread.sleep(5000);
        setIphoneForNavigate();
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/products/mobile/apple-iphone-11-128gb-black.html");
    }
}
