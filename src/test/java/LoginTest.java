import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends MainPage {

    @Test
    public void checkLogin() throws InterruptedException {
        setLoginCkick();
        Thread.sleep(1000);
        setInputLogin();
        inputLogin.sendKeys("test123@gmail.com");
        setInputPassword();
        inputPassword.sendKeys("qwerty12345");
        setBtnSucces();
        Assert.assertTrue(btnSucces.isEnabled());

    }
}
