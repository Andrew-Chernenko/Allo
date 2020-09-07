import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends MainPage {

    @Test
    public void registerCheck() throws InterruptedException {
        setRegisterClick();
        Thread.sleep(2000);
        setInputRegisterName();
        inputRegisterName.sendKeys("Андрей");
        setInputRegisterPhone();
        inputRegisterPhone.sendKeys("956765444");
        setInputRegisterEmail();
        inputRegisterEmail.sendKeys("test12345612355@gmail.com");
        setInputRegisterPassword();
        inputRegisterPassword.sendKeys("qwerty12345");
        setSuccesRegisterBtn();
        Assert.assertTrue(succesRegisterBtn.isEnabled());
    }
}
