import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LanguageSwitchTest extends MainPage {

    private String headerColor;

    @Test
    public void checkSwap() throws InterruptedException {
        headerColor = searchHeader();
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
