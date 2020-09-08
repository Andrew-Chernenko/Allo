import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends MainPage {

    private WebElement inputLogin;
    private WebElement inputPassword;
    private WebElement btnSucces;

    @Test
    public void checkLogin() throws InterruptedException {
        setLoginCkick();
        Thread.sleep(1000);
        inputLogin = setInputLogin();
        inputLogin.sendKeys("test123@gmail.com");
        inputPassword = setInputPassword();
        inputPassword.sendKeys("qwerty12345");
        btnSucces = setBtnSucces();
        Assert.assertTrue(btnSucces.isEnabled());
    }
}
