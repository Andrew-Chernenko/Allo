package Pages;

import Pages.BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class ProductListPage extends BasePage {

    @FindBy(xpath = ".//div[contains(@class,'product-card v-loaded')]")
    public List<WebElement> productCart;

    public ProductListPage(WebDriver driver) {
        super(driver);
        waitLoadComponent();
    }

    @Override
    public void waitLoadComponent() {
        waitUtils.waitVisibilityAllElementsWithMiddleWait(productCart);
    }
}
