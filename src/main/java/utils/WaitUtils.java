package utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.function.Function;

public class WaitUtils {

    private final int MINIMUMLIMIT = 5;
    private final int MIDDLELIMIT = 10;
    private final int MAXIMUMLIMIT = 15;
    private WebDriver driver;

    public WaitUtils(WebDriver driver){
        this.driver = driver;
    }

    public WebElement[] waitVisibilityAllElementsForArrayWithMiddleWait(WebElement[] elements){
        List<WebElement> wait = (new WebDriverWait(driver,MIDDLELIMIT))
                .until(ExpectedConditions.visibilityOfAllElements(elements));
        return elements;
    }

    public WebElement waitInvisibleOfElement(WebElement element,int timeout){
        Boolean wait = (new WebDriverWait(driver,timeout))
                .until(ExpectedConditions.invisibilityOf(element));
        return element;
    }

    public WebElement waitInVisibleElementMinimumWait(WebElement element){
        return waitInvisibleOfElement(element,MINIMUMLIMIT);
    }

    public WebElement waitInVisibleElementMiddleWait(WebElement element){
        return waitInvisibleOfElement(element,MIDDLELIMIT);
    }

    public WebElement waitInVisibleElementMaximumWait(WebElement element){
        return waitInvisibleOfElement(element,MAXIMUMLIMIT);
    }

    public List<WebElement> waitVisibilityAllElements(List<WebElement> webElements, int timeout){
        List<WebElement> wait = (new WebDriverWait(driver,timeout))
                .until(ExpectedConditions.visibilityOfAllElements(webElements));
        return webElements;
    }

    public List<WebElement> waitVisibilityAllElementsWithMinimumWait(List<WebElement> webElements){
        return waitVisibilityAllElements(webElements,MINIMUMLIMIT);
    }

    public List<WebElement> waitVisibilityAllElementsWithMiddleWait(List<WebElement> webElements){
        return waitVisibilityAllElements(webElements,MIDDLELIMIT);
    }

    public List<WebElement> waitVisibilityAllElementsWithMaximumWait(List<WebElement> webElements){
        return waitVisibilityAllElements(webElements,MAXIMUMLIMIT);
    }

    public WebElement waitElementClickable(WebElement element, int timeout){
        WebElement wait = (new WebDriverWait(driver,timeout))
                .until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        return element;
    }

    public WebElement waitElementWithMinimumWaitAndClick(WebElement element){
        return waitElementClickable(element,MINIMUMLIMIT);
    }

    public WebElement waitElementWithMiddleWaitAndClick(WebElement element){
        return waitElementClickable(element,MIDDLELIMIT);
    }

    public WebElement waitElementWithMaximumWaitAndClick(WebElement element){
        return waitElementClickable(element,MAXIMUMLIMIT);
    }

    public WebElement waitElementVisibility(WebElement element,int timeout){
        WebElement wait = (new WebDriverWait(driver,timeout))
                .until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement waitElementVisibilityWithMinimumWait(WebElement element){
        return waitElementVisibility(element,MINIMUMLIMIT);
    }

    public WebElement waitElementVisibilityWithMiddleWait(WebElement element){
        return waitElementVisibility(element,MIDDLELIMIT);
    }

    public WebElement waitElementVisibilityWithMaximumWait(WebElement element){
        return waitElementVisibility(element,MAXIMUMLIMIT);
    }

    public void waitLoadingPageWithJavaScript(){
        Wait<WebDriver> wait = new WebDriverWait(driver,MIDDLELIMIT);
        wait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply (WebDriver driver){
                return String
                        .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
                        .equals("complete");
            }
        });
    }
}
