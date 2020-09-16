package utils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TypeTextUtils {
    private WebDriver driver;
    private WaitUtils waitUtils;

    public TypeTextUtils(WebDriver driver){
        this.driver = driver;
        waitUtils = new WaitUtils(this.driver);
    }
    public void sendText(WebElement element, String text) {
        waitUtils.waitElementVisibilityWithMaximumWait(element);
        element.sendKeys(text);
    }

    public void pushKeys(WebElement element, Keys keys) {
        waitUtils.waitElementVisibilityWithMaximumWait(element);
        element.sendKeys(keys);
    }

}
