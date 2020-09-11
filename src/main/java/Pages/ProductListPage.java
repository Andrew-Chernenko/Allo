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
        for (WebElement webElement : productCart) {
            if (webElement.getText().contains(text)) {
                webElement.findElement(By.xpath(".//button[contains(@class,'buy-button--animation')]")).click();
                break;
            }
        }
    }

    public void navigateToProductDescriptionPage(String element) {
        for (WebElement webElement : productCart) {
            if (webElement.getText().contains(element)) {
                webElement.click();
                break;
            }
        }
    }
}
