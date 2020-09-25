package Steps;
import Pages.LoginMenuPage;
import Pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.EntityData.User;
import utils.TypeTextUtils;
import utils.WaitUtils;

public class LoginStep {

    protected User user;
    protected LoginMenuPage loginMenuPage;
    protected MainPage mainPage;
    protected Controller controller;
    protected WaitUtils waitUtils;
    protected TypeTextUtils typeTextUtils;

    public LoginStep(Controller controller){
        this.controller = controller;
        waitUtils = new WaitUtils(controller.getDriver());
        typeTextUtils = new TypeTextUtils(controller.getDriver());
        mainPage = new MainPage(controller.getDriver());
    }

    @Given("^Login and password")
    public void setLoginData() {
        user = new User();
        user.setEmail("test123@gmail.com");
        user.setPassword("qwerty12345");
    }

    @When("^We try to login with this data")
    public void login(){
        loginMenuPage = loginClickBtn();
        setFieldLoginProcces(user);
    }

    @Then("^Button login should be enabled")
    public void successLogin(){
        Assert.assertTrue(isCheckSuccesRegisterBtn());
    }

    public LoginMenuPage loginClickBtn() {
        waitUtils.waitLoadingPageWithJavaScript();
        waitUtils.waitElementWithMiddleWaitAndClick(mainPage.loginBtn);
        return new LoginMenuPage(controller.getDriver());
    }

    public void setFieldLoginProcces(User user){
        waitUtils.waitElementVisibilityWithMiddleWait(loginMenuPage.loginMenu);
        typeTextUtils.sendText(loginMenuPage.fieldLogin,user.getEmail());
        typeTextUtils.sendText(loginMenuPage.fieldPassword,user.getPassword());
    }

    public boolean isCheckSuccesRegisterBtn(){
        return waitUtils.getElementWhenVisibleMaximumWait(loginMenuPage.btnSuccesLogin).isEnabled();
    }
}
