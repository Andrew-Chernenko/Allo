package Pages;
import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class ProductListPage extends BasePage {

    @FindBy(xpath = ".//div[contains(@class,'product-card v-loaded')]")
    private List<WebElement> productCart;

    public ProductListPage(WebDriver driver) {
        super(driver);
    }

    public void productBtnClick(String text) {
        List<WebElement> products = waitUtils.waitVisibilityAllElementsWithMiddleWait(productCart);
        for (WebElement webElement : products) {
            if (webElement.getText().contains(text)) {
                webElement.findElement(By.xpath(".//button[contains(@class,'buy-button--animation')]")).click();
                break;
            }
        }
    }

    public void navigateToProductDescriptionPage(String element) {
        List<WebElement> products = waitUtils.waitVisibilityAllElementsWithMiddleWait(productCart);
        for (WebElement webElement : products) {
            if (webElement.getText().contains(element)) {
                webElement.click();
                break;
            }
        }
    }

    public String returnUrl(){
        List<WebElement> products = waitUtils.waitVisibilityAllElementsWithMiddleWait(productCart);
        return driver.getCurrentUrl();
    }
}
