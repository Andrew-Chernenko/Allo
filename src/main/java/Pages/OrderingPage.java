package Pages;
import Pages.BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderingPage extends BasePage {

    @FindBy(xpath = ".//input[@id='onepage-customer-name']")
    public WebElement fieldName;

    @FindBy(xpath = ".//input[@id='onepage-customer-telephone']")
    public WebElement fieldTelephone;

    @FindBy(xpath = ".//input[@id='onepage-customer-email']")
    public WebElement fieldEmail;

    @FindBy(xpath = ".//button[@id='second-step-button']")
    public WebElement btnCheckOut;

    public OrderingPage(WebDriver driver) {
        super(driver);
        waitLoadComponent();
    }

    @Override
    public void waitLoadComponent() {
        waitUtils.waitElementVisibilityWithMiddleWait(fieldName);
    }
}
