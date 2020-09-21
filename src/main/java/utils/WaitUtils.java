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

    public void waitInvisibleOfElement(WebElement element,int timeout){
        Boolean wait = (new WebDriverWait(driver,timeout))
                .until(ExpectedConditions.invisibilityOf(element));
    }

    public void waitInVisibleElementMinimumWait(WebElement element){
        waitInvisibleOfElement(element,MINIMUMLIMIT);
    }

    public void waitInVisibleElementMiddleWait(WebElement element){
        waitInvisibleOfElement(element,MIDDLELIMIT);
    }

    public void waitInVisibleElementMaximumWait(WebElement element){
        waitInvisibleOfElement(element,MAXIMUMLIMIT);
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

    public void waitElementClickable(WebElement element, int timeout){
        WebElement wait = (new WebDriverWait(driver,timeout))
                .until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void waitElementWithMinimumWaitAndClick(WebElement element){
         waitElementClickable(element,MINIMUMLIMIT);
    }

    public void waitElementWithMiddleWaitAndClick(WebElement element){
        waitElementClickable(element,MIDDLELIMIT);
    }

    public void waitElementWithMaximumWaitAndClick(WebElement element){
         waitElementClickable(element,MAXIMUMLIMIT);
    }

    public void waitElementVisibility(WebElement element,int timeout){
        WebElement wait = (new WebDriverWait(driver,timeout))
                .until(ExpectedConditions.visibilityOf(element));
    }

    public void waitElementVisibilityWithMinimumWait(WebElement element){
         waitElementVisibility(element,MINIMUMLIMIT);
    }

    public void waitElementVisibilityWithMiddleWait(WebElement element){
         waitElementVisibility(element,MIDDLELIMIT);
    }

    public void waitElementVisibilityWithMaximumWait(WebElement element){
        waitElementVisibility(element,MAXIMUMLIMIT);
    }

    public WebElement getElementWhenVisible(WebElement element,int timeout){
        WebElement wait = (new WebDriverWait(driver,timeout))
                .until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement getElementWhenVisibleMinimumWait(WebElement element){
        return getElementWhenVisible(element,MINIMUMLIMIT);
    }

    public WebElement getElementWhenVisibleMiddleWait(WebElement element){
        return getElementWhenVisible(element,MIDDLELIMIT);
    }

    public WebElement getElementWhenVisibleMaximumWait(WebElement element){
        return getElementWhenVisible(element,MAXIMUMLIMIT);
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
