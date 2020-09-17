package Pages;
import BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(xpath = ".//button[@class='order-now']")
    private WebElement btnOrdering;

    @FindBy(xpath = ".//div[@class='cart-popup__body']")
    private WebElement productCartPopUp;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void orderBtnClick() {
        waitUtils.waitElementWithMiddleWaitAndClick(btnOrdering);
    }

    public void cartPopUp(){
        waitUtils.waitElementVisibilityWithMiddleWait(productCartPopUp);
    }
}
