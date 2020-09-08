import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends MainPage {

    private WebElement inputRegisterName;
    private WebElement inputRegisterPhone;
    private WebElement inputRegisterEmail;
    private WebElement inputRegisterPassword;
    private WebElement succesRegisterBtn;

    @Test
    public void registerCheck() throws InterruptedException {
        setRegisterClick();
        Thread.sleep(2000);
        inputRegisterName = setInputRegisterName();
        inputRegisterName.sendKeys("Андрей");
        inputRegisterPhone = setInputRegisterPhone();
        inputRegisterPhone.sendKeys("956765444");
        inputRegisterEmail = setInputRegisterEmail();
        inputRegisterEmail.sendKeys("test12345612355@gmail.com");
        inputRegisterPassword = setInputRegisterPassword();
        inputRegisterPassword.sendKeys("qwerty12345");
        succesRegisterBtn = setSuccesRegisterBtn();
        Assert.assertTrue(succesRegisterBtn.isEnabled());
    }
}
