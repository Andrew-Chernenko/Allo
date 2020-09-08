import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SwitchCategoryTest extends MainPage {

    private WebElement firstCategory;
    private WebElement secondCategory;

    @Test
    public void checkCategoryFirst() throws InterruptedException {
        firstCategory = searchCategory(0);
        firstCategory.click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/mobilnye-telefony-i-sredstva-svyazi/");
    }

    @Test
    public void checkCategorySecond() throws InterruptedException {
        secondCategory = searchCategory(1);
        secondCategory.click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/bytovaya-tehnika/");
    }

}
