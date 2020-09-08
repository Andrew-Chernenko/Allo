import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PasswordRecoveryTest extends MainPage {

    private WebElement inputRecovery;
    private WebElement btnRecovery;

    @Test
    public void passwordRecovery() throws InterruptedException {
        setLoginCkick();
        Thread.sleep(1000);
        setRecoveryBtn();
        Thread.sleep(2000);
        inputRecovery = setInputRecovery();
        Thread.sleep(1000);
        inputRecovery.sendKeys("test@gmail.com");
        btnRecovery = setBtnRecovery();
        Assert.assertTrue(btnRecovery.isEnabled());
    }
}
