package Pages;
import BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.EntityData.User;

public class LoginMenuPage extends BasePage {

    @FindBy(xpath = ".//div[@id='customer-popup-menu']")
    public WebElement loginMenu;

    @FindBy(xpath = ".//input[@id='auth']")
    public WebElement fieldLogin;

    @FindBy(xpath = ".//input[@id='v-login-password']")
    public WebElement fieldPassword;

    @FindBy(xpath = ".//button[@class='modal-submit-button']")
    public WebElement btnSuccessLogin;

    @FindBy(xpath = ".//a[@class='forgot-password']")
    public WebElement btnRecoveryPassword;

    @FindBy(xpath = ".//input[@id='auth']")
    public WebElement inputRecoveryPassword;

    @FindBy(xpath = ".//button[@class='modal-submit-button']")
    public WebElement btnSendCodeRecoveryPassword;

    public LoginMenuPage(WebDriver driver) {
        super(driver);
        waitLoadComponent();
    }

    @Override
    public void waitLoadComponent() {
        waitUtils.waitElementVisibilityWithMiddleWait(loginMenu);
    }
}
