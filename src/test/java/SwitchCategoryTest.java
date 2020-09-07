import org.junit.Test;
import org.testng.Assert;

public class SwitchCategoryTest extends MainPage {


    @Test
    public void checkCategoryFirst() throws InterruptedException {
        searchCategory();
        firstCategory.click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/mobilnye-telefony-i-sredstva-svyazi/");
    }

    @Test
    public void checkCategorySecond() throws InterruptedException {
        searchCategory();
        secondCategory.click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/bytovaya-tehnika/");
    }

}
