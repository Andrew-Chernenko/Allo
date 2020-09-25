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
    public WebElement btnSuccesLogin;

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

    public void btnRecoveryPasswordClick() {
        waitUtils.waitElementVisibilityWithMiddleWait(btnRecoveryPassword);
        waitUtils.waitElementWithMinimumWaitAndClick(btnRecoveryPassword);
    }

    public void setInputRecoveryPassword(User user) {
        typeTextUtils.sendText(inputRecoveryPassword,user.getEmail());
    }

    public boolean isCheckBtnSendCodeRecoveryPassword(){
        return waitUtils.getElementWhenVisibleMaximumWait(btnSendCodeRecoveryPassword).isEnabled();
    }

    @Override
    public void waitLoadComponent() {
        waitUtils.waitElementVisibilityWithMiddleWait(loginMenu);
    }
}
