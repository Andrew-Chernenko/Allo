package Pages;
import BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.EntityData.User;

public class OrderingPage extends BasePage {

    @FindBy(xpath = ".//input[@id='onepage-customer-name']")
    private WebElement fieldName;

    @FindBy(xpath = ".//input[@id='onepage-customer-telephone']")
    private WebElement fieldTelephone;

    @FindBy(xpath = ".//input[@id='onepage-customer-email']")
    private WebElement fieldEmail;

    @FindBy(xpath = ".//button[@id='second-step-button']")
    private WebElement btnCheckOut;

    public OrderingPage(WebDriver driver) {
        super(driver);
        waitLoadComponent();
    }

    public void setFieldOrdering(User user) {
        waitUtils.waitLoadingPageWithJavaScript();
        typeTextUtils.sendText(fieldName,user.getName());
        typeTextUtils.sendText(fieldTelephone,user.getPhone());
        typeTextUtils.sendText(fieldEmail,user.getEmail());
    }

    public boolean isCheckBtnCheckOut(){
        return waitUtils.waitElementVisibilityWithMinimumWait(btnCheckOut).isEnabled();
    }

    @Override
    public void waitLoadComponent() {
        waitUtils.waitElementVisibilityWithMiddleWait(fieldName);
    }
}
