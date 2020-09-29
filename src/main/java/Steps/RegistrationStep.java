package Steps;
import Pages.RegisterMenuPage;
import Steps.BaseStep.Controller;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.EntityData.User;
import utils.TypeTextUtils;
import utils.WaitUtils;

public class RegistrationStep {

    protected WaitUtils waitUtils;
    protected TypeTextUtils typeTextUtils;
    protected Controller controller;
    protected User user;
    protected RegisterMenuPage registerMenuPage;

    public RegistrationStep(Controller controller){
        this.controller = controller;
        waitUtils = new WaitUtils(controller.getDriver());
        typeTextUtils = new TypeTextUtils(controller.getDriver());
    }

    @When("^We set Name,Phone number, Email and Password")
    public void setRegistrationData() {
        user = new User();
        user.setName("Андрей");
        user.setPhone("956765444");
        user.setEmail("test12345612355@gmail.com");
        user.setPassword("qwerty12345");
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
    public void button_registration_should_be_enabled() {
        Assert.assertTrue(waitUtils.getElementWhenVisibleMaximumWait(registerMenuPage.succesRegisterBtn).isEnabled());
    }

}
