package utils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TypeTextUtils {

    public void sendText(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void pushKeys(WebElement element, Keys keys) {
        element.sendKeys(keys);
    }

}
