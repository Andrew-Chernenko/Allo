package Pages;
import Pages.BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterMenuPage extends BasePage {

    @FindBy(xpath = ".//form[@id='form-validate-register']")
    public WebElement registerMenu;

    @FindBy(xpath = ".//input[@id='v-register-name']")
    public WebElement inputRegisterName;

    @FindBy(xpath = ".//input[@id='v-register_telephone_number']")
    public WebElement inputRegisterPhone;

    @FindBy(xpath = ".//input[@id='v-register-email']")
    public WebElement inputRegisterEmail;

    @FindBy(xpath = ".//input[@id='vregister-password']")
    public WebElement inputRegisterPassword;

    @FindBy(xpath = ".//button[@name='send']")
    public WebElement succesRegisterBtn;

    public RegisterMenuPage(WebDriver driver) {
        super(driver);
        waitLoadComponent();
    }

    @Override
    public void waitLoadComponent() {
        waitUtils.waitElementVisibilityWithMiddleWait(registerMenu);
    }
}
