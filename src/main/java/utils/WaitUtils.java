package utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;

public class WaitUtils {

    final int MINIMUMLIMIT = 1;
    final int MIDDLELIMIT = 3;
    final int MAXIMUMLIMIT = 5;
    WebDriver driver;

    public WaitUtils(WebDriver driver){
        this.driver = driver;
    }

    public WebElement waitElementClickable(WebElement element,int timeout){
        WebElement wait = (new WebDriverWait(driver,timeout))
                .until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement waitElementClickableWithMinimumWait(WebElement element){
        return waitElementClickable(element,MINIMUMLIMIT);
    }

    public WebElement waitElementClickableWithMiddleWait(WebElement element){
        return waitElementClickable(element,MIDDLELIMIT);
    }

    public WebElement waitElementClickableWithMaximumWait(WebElement element){
        return waitElementClickable(element,MAXIMUMLIMIT);
    }

    public void waitLoadingPage(int timeout){
        Wait<WebDriver> wait = new WebDriverWait(driver,timeout);
        wait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply (WebDriver driver){
                return String
                        .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
                        .equals("complete");
            }
        });
    }
}
