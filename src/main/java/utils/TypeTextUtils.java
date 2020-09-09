package utils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TypeTextUtils {
   private WebDriver driver;

    public TypeTextUtils(WebDriver driver){
        this.driver = driver;
    }


    public void sendText(WebElement element,String text){
        element.sendKeys(text);
    }

    public void pushKeys(WebElement element, Keys keys){
        element.sendKeys(keys);
    }

}
