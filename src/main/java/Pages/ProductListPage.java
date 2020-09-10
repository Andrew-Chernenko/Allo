package Pages;
import BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.SleeperUtils;
import java.util.List;

public class ProductListPage extends BasePage {

    @FindBy(xpath = "//div[@class='product-card__content']//button")
    private List<WebElement> product;

    public ProductListPage(WebDriver driver) {
        super(driver);
    }

    public void buyProductBtnClick(int element) throws InterruptedException {
        System.out.println(product.size());
        if (element <= 27 && element >= 0) {
            SleeperUtils.threadSleep(1);
            product.get(element).click();
            SleeperUtils.threadSleep(4);
        }
    }
}
