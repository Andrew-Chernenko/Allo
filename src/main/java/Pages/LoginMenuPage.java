package Pages;
import BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.EntityData.User;

public class LoginMenuPage extends BasePage {

    @FindBy(xpath = ".//div[@id='customer-popup-menu']")
    private WebElement loginMenu;

    @FindBy(xpath = ".//input[@id='auth']")
    private WebElement fieldLogin;

    @FindBy(xpath = ".//input[@id='v-login-password']")
    private WebElement fieldPassword;

    @FindBy(xpath = ".//button[@class='modal-submit-button']")
    private WebElement btnSuccesLogin;

    @FindBy(xpath = ".//a[@class='forgot-password']")
    private WebElement btnRecoveryPassword;

    @FindBy(xpath = ".//input[@id='auth']")
    private WebElement inputRecoveryPassword;

    @FindBy(xpath = ".//button[@class='modal-submit-button']")
    private WebElement btnSendCodeRecoveryPassword;

    public LoginMenuPage(WebDriver driver) {
        super(driver);
        waitLoadComponent();
    }

    public void setFieldLoginProcces(User user){
        waitUtils.waitElementVisibilityWithMiddleWait(loginMenu);
        typeTextUtils.sendText(fieldLogin,user.getEmail());
        typeTextUtils.sendText(fieldPassword,user.getPassword());
    }

    public boolean isCheckSuccesRegisterBtn(){
        return waitUtils.getElementWhenVisibleMaximumWait(btnSuccesLogin).isEnabled();
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
