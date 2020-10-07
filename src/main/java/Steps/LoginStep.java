package Steps;
import Steps.BaseStep.Controller;
import Pages.LoginMenuPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TypeTextUtils;
import utils.WaitUtils;

public class LoginStep {

    protected LoginMenuPage loginMenuPage;
    protected WaitUtils waitUtils;
    protected TypeTextUtils typeTextUtils;
    protected Controller controller;

    public LoginStep(Controller controller) {
        this.controller = controller;
        waitUtils = new WaitUtils(controller.getDriver());
        typeTextUtils = new TypeTextUtils(controller.getDriver());
    }

    @When("^We wait a login pop-up")
    public void we_wait_a_login_pop_up() {
        loginMenuPage = new LoginMenuPage(controller.getDriver());
        waitUtils.waitElementVisibilityWithMiddleWait(loginMenuPage.loginMenu);
    }

    @When("We set registered Email {string}")
    public void we_set_registered_email(String email) {
        loginMenuPage = new LoginMenuPage(controller.getDriver());
        typeTextUtils.sendText(loginMenuPage.fieldEmail, email);
    }

    @When("We set registered Password {string}")
    public void we_set_registered_password(String password){
        loginMenuPage = new LoginMenuPage(controller.getDriver());
        typeTextUtils.sendText(loginMenuPage.fieldPassword, password);
    }

    @Then("^Button login should be enabled")
    public void button_login_should_be_enabled() {
        loginMenuPage = new LoginMenuPage(controller.getDriver());
        Assert.assertTrue(waitUtils.getElementWhenVisibleMaximumWait(loginMenuPage.btnSuccessLogin).isEnabled());
    }

    @When("^We click button for recovery password")
    public void we_click_button_for_recovery_password() {
        loginMenuPage = new LoginMenuPage(controller.getDriver());
        waitUtils.waitElementWithMiddleWaitAndClick(loginMenuPage.btnRecoveryPassword);
    }

    @Then("^Button send message should be enabled")
    public void button_send_message_should_be_enabled() {
        loginMenuPage = new LoginMenuPage(controller.getDriver());
        Assert.assertTrue(waitUtils.getElementWhenVisibleMaximumWait(loginMenuPage.btnSendCodeRecoveryPassword).isEnabled());
    }

    @When("^We click to register button")
    public void we_click_to_register_button() {
        loginMenuPage = new LoginMenuPage(controller.getDriver());
        waitUtils.waitElementWithMiddleWaitAndClick(loginMenuPage.btnRegister);
    }
}
