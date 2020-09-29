package Steps;
import Steps.BaseStep.Controller;
import Pages.LoginMenuPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.EntityData.User;
import utils.TypeTextUtils;
import utils.WaitUtils;

public class LoginStep {

    protected User user;
    protected LoginMenuPage loginMenuPage;
    protected WaitUtils waitUtils;
    protected TypeTextUtils typeTextUtils;
    protected Controller controller;

    public LoginStep(Controller controller) {
        this.controller = controller;
        waitUtils = new WaitUtils(controller.getDriver());
        typeTextUtils = new TypeTextUtils(controller.getDriver());
    }

    @When("^We set user data")
    public void we_set_user_data() {
        user = new User();
        user.setEmail("test123@gmail.com");
        user.setPassword("qwerty12345");
    }

    @When("^We wait a login pop-up")
    public void we_wait_a_login_pop_up() {
        loginMenuPage = new LoginMenuPage(controller.getDriver());
        waitUtils.waitElementVisibilityWithMiddleWait(loginMenuPage.loginMenu);
    }

    @When("^We try login with this data")
    public void we_try_login_with_this_data(){
        typeTextUtils.sendText(loginMenuPage.fieldLogin, user.getEmail());
        typeTextUtils.sendText(loginMenuPage.fieldPassword, user.getPassword());
    }

    @Then("^Button login should be enabled")
    public void button_login_should_be_enabled() {
        Assert.assertTrue(waitUtils.getElementWhenVisibleMaximumWait(loginMenuPage.btnSuccessLogin).isEnabled());
    }

    @When("^We set a password recovery email")
    public void we_set_a_password_recovery_email() {
        user = new User();
        user.setEmail("test@gmail.com");
    }

    @When("^We click button for recovery password")
    public void we_click_button_for_recovery_password() {
        loginMenuPage = new LoginMenuPage(controller.getDriver());
        waitUtils.waitElementWithMiddleWaitAndClick(loginMenuPage.btnRecoveryPassword);
    }

    @When("^We input email for recovery password")
    public void we_input_email_for_recovery_password(){
        typeTextUtils.sendText(loginMenuPage.inputRecoveryPassword, user.getEmail());
    }

    @Then("^Button send message should be enabled")
    public void button_send_message_should_be_enabled() {
        Assert.assertTrue(waitUtils.getElementWhenVisibleMaximumWait(loginMenuPage.btnSendCodeRecoveryPassword).isEnabled());
    }

    @When("^We click to register button")
    public void we_click_to_register_button() {
        loginMenuPage = new LoginMenuPage(controller.getDriver());
        waitUtils.waitElementWithMiddleWaitAndClick(loginMenuPage.btnRegister);
    }
}
