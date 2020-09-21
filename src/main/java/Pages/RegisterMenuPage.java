package Pages;
import BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.EntityData.User;

public class RegisterMenuPage extends BasePage {

    @FindBy(xpath = ".//form[@id='form-validate-register']")
    private WebElement registerMenu;

    @FindBy(xpath = ".//input[@id='v-register-name']")
    private WebElement inputRegisterName;

    @FindBy(xpath = ".//input[@id='v-register_telephone_number']")
    private WebElement inputRegisterPhone;

    @FindBy(xpath = ".//input[@id='v-register-email']")
    private WebElement inputRegisterEmail;

    @FindBy(xpath = ".//input[@id='vregister-password']")
    private WebElement inputRegisterPassword;

    @FindBy(xpath = ".//button[@name='send']")
    private WebElement succesRegisterBtn;

    public RegisterMenuPage(WebDriver driver) {
        super(driver);
        waitLoadComponent();
    }

    public void setInputRegisterData(User user) {
        waitUtils.waitElementVisibilityWithMiddleWait(registerMenu);
        typeTextUtils.sendText(inputRegisterName,user.getName());
        typeTextUtils.sendText(inputRegisterPhone,user.getPhone());
        typeTextUtils.sendText(inputRegisterEmail,user.getEmail());
        typeTextUtils.sendText(inputRegisterPassword,user.getPassword());
    }

    public boolean isCheckSuccesRegisterBtn(){
        return waitUtils.getElementWhenVisibleMaximumWait(succesRegisterBtn).isEnabled();
    }

    @Override
    public void waitLoadComponent() {
        waitUtils.waitElementVisibilityWithMiddleWait(registerMenu);
    }
}
