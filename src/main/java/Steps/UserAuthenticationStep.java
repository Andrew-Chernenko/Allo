package Steps;
import BaseStep.Controller;
import Pages.LoginMenuPage;
import Pages.MainPage;
import Pages.RegisterMenuPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.EntityData.User;
import utils.TypeTextUtils;
import utils.WaitUtils;

public class UserAuthenticationStep {

    protected User user;
    protected LoginMenuPage loginMenuPage;
    protected RegisterMenuPage registerMenuPage;
    protected MainPage mainPage;
    protected WaitUtils waitUtils;
    protected TypeTextUtils typeTextUtils;
    protected Controller controller;

    public UserAuthenticationStep(Controller controller) {
        this.controller = controller;
        waitUtils = new WaitUtils(controller.getDriver());
        typeTextUtils = new TypeTextUtils(controller.getDriver());
    }

    @Given("^Set login and password")
    public void setLoginData() {
        user = new User();
        user.setEmail("test123@gmail.com");
        user.setPassword("qwerty12345");
    }

    @When("^We wait a login pop-up")
    public void We_wait_a_login_pop_up() {
        mainPage = new MainPage(controller.getDriver());
        waitUtils.waitElementWithMiddleWaitAndClick(mainPage.loginBtn);
        loginMenuPage = new LoginMenuPage(controller.getDriver());
        waitUtils.waitElementVisibilityWithMiddleWait(loginMenuPage.loginMenu);
    }

    @When("^We try login with this data")
    public void login(){
        typeTextUtils.sendText(loginMenuPage.fieldLogin, user.getEmail());
        typeTextUtils.sendText(loginMenuPage.fieldPassword, user.getPassword());
    }

    @Then("^Button login should be enabled")
    public void successLogin() {
        Assert.assertTrue(waitUtils.getElementWhenVisibleMaximumWait(loginMenuPage.btnSuccessLogin).isEnabled());
    }

    @Given("^Registered email")
    public void setLogin() {
        user = new User();
        user.setEmail("test@gmail.com");
    }

    @When("^We click button for recovery password")
    public void passwordRecovery() {
        mainPage = new MainPage(controller.getDriver());
        waitUtils.waitElementWithMiddleWaitAndClick(mainPage.loginBtn);
        loginMenuPage = new LoginMenuPage(controller.getDriver());
        waitUtils.waitElementVisibilityWithMiddleWait(loginMenuPage.btnRecoveryPassword);
    }

    @When("^We send email for recovery password")
    public void we_send_email_for_recovery_password(){
        typeTextUtils.sendText(loginMenuPage.inputRecoveryPassword, user.getEmail());
    }

    @Then("^Button send message should be enabled")
    public void checkBtn() {
        Assert.assertTrue(waitUtils.getElementWhenVisibleMaximumWait(loginMenuPage.btnSendCodeRecoveryPassword).isEnabled());
    }

    @Given("^Set Name,Phone number, Email and Password")
    public void setRegistrationData() {
        user = new User();
        user.setName("Андрей");
        user.setPhone("956765444");
        user.setEmail("test12345612355@gmail.com");
        user.setPassword("qwerty12345");
    }

    @When("^We click to register button")
    public void registration() {
        mainPage = new MainPage(controller.getDriver());
        waitUtils.waitElementWithMiddleWaitAndClick(mainPage.loginBtn);
        loginMenuPage = new LoginMenuPage(controller.getDriver());
        waitUtils.waitElementWithMiddleWaitAndClick(mainPage.btnRegister);
    }

    @When("^We wait a register pop-up")
    public void we_wait_a_register_pop_up(){
        registerMenuPage = new RegisterMenuPage(controller.getDriver());
        waitUtils.waitElementVisibilityWithMiddleWait(registerMenuPage.registerMenu);
    }

    @When("^We try to register new account with this data")
    public void we_try_to_register_new_account_with_this_data(){
        typeTextUtils.sendText(registerMenuPage.inputRegisterName, user.getName());
        typeTextUtils.sendText(registerMenuPage.inputRegisterPhone, user.getPhone());
        typeTextUtils.sendText(registerMenuPage.inputRegisterEmail, user.getEmail());
        typeTextUtils.sendText(registerMenuPage.inputRegisterPassword, user.getPassword());
    }

    @Then("^Button registration should be enabled")
    public void checkSuccessRegistration() {
        Assert.assertTrue(waitUtils.getElementWhenVisibleMaximumWait(registerMenuPage.succesRegisterBtn).isEnabled());
    }
}
