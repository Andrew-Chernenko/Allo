package Pages;
import BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.SleeperUtils;
import java.util.List;

public class ProductListPage extends BasePage {

    @FindBy(xpath = ".//button[contains(@class,'buy-button--animation') and not (contains(@class, 'out-stock'))]")
    private List<WebElement> productBuyBtn;

    public ProductListPage(WebDriver driver) {
        super(driver);
    }

    public void buyProductBtnClick(int element) throws InterruptedException {
        if (element < productBuyBtn.size() && element >= 0) {
            System.out.println(productBuyBtn.size());
            SleeperUtils.threadSleep(1);
            productBuyBtn.get(element).click();
            SleeperUtils.threadSleep(4);
        }
    }
}
