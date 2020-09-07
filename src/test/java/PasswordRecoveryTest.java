import org.testng.Assert;
import org.testng.annotations.Test;

public class PasswordRecoveryTest extends MainPage {

    @Test
    public void passwordRecovery() throws InterruptedException {
        setLoginCkick();
        Thread.sleep(1000);
        setRecoveryBtn();
        Thread.sleep(2000);
        setInputRecovery();
        Thread.sleep(1000);
        inputRecovery.sendKeys("test@gmail.com");
        setBtnRecovery();
        Assert.assertTrue(btnRecovery.isEnabled());


    }
}
