import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LanguageSwitchTest extends MainPage {


    @Test
    public void checkSwap() throws InterruptedException {
        searchHeader();
        headerColor = Color.fromString(headerColor).asHex();
        if (headerColor.equals("#323232")) {
            swapLanguageNightTheme();
        } else {
            swapLanguageDayTheme();
        }
        Thread.sleep(2000);
        Assert.assertNotEquals(driver.getCurrentUrl(), link);


    }
}
