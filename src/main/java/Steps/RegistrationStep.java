package Steps;
import Pages.RegisterMenuPage;
import Steps.BaseStep.Controller;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TypeTextUtils;
import utils.WaitUtils;

public class RegistrationStep {

    protected WaitUtils waitUtils;
    protected TypeTextUtils typeTextUtils;
    protected Controller controller;
    protected RegisterMenuPage registerMenuPage;

    public RegistrationStep(Controller controller){
        this.controller = controller;
        waitUtils = new WaitUtils(controller.getDriver());
        typeTextUtils = new TypeTextUtils(controller.getDriver());
    }

    @When("We set name {string}")
    public void setRegistrationData(String name) {
        typeTextUtils.sendText(registerMenuPage.inputRegisterName, name);
    }

    @When("We set phone number {string}")
    public void we_set_phone_number(String phoneNumber){
        typeTextUtils.sendText(registerMenuPage.inputRegisterPhone, phoneNumber);
    }

    @When("We set email {string}")
    public void we_set_email(String email){
        typeTextUtils.sendText(registerMenuPage.inputRegisterEmail, email);
    }

    @When("We set password {string}")
    public void we_set_password(String password){
        typeTextUtils.sendText(registerMenuPage.inputRegisterPassword, password);
    }

    @When("^We wait a register pop-up")
    public void we_wait_a_register_pop_up(){
        registerMenuPage = new RegisterMenuPage(controller.getDriver());
        waitUtils.waitElementVisibilityWithMiddleWait(registerMenuPage.registerMenu);
    }

    @Then("^Button registration should be enabled")
    public void button_registration_should_be_enabled() {
        Assert.assertTrue(waitUtils.getElementWhenVisibleMaximumWait(registerMenuPage.succesRegisterBtn).isEnabled());
    }

}
