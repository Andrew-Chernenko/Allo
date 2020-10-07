package Steps;
import Steps.BaseStep.Controller;
import Pages.OrderingPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TypeTextUtils;
import utils.WaitUtils;

public class OrderingStep {

    protected WaitUtils waitUtils;
    protected Controller controller;
    protected TypeTextUtils typeTextUtils;
    protected OrderingPage orderingPage;

    public OrderingStep(Controller controller) {
        this.controller = controller;
        waitUtils = new WaitUtils(controller.getDriver());
        typeTextUtils = new TypeTextUtils(controller.getDriver());
    }

    @When("We set name on Ordering page {string}")
    public void we_set_name_on_Ordering_page(String name){
        orderingPage = new OrderingPage(controller.getDriver());
        typeTextUtils.sendText(orderingPage.fieldName, name);
    }

    @When("We set phoneNumber on Ordering page {string}")
    public void we_set_phoneNumber_on_Ordering_page(String phoneNumber){
        orderingPage = new OrderingPage(controller.getDriver());
        typeTextUtils.sendText(orderingPage.fieldTelephone, phoneNumber);
    }

    @When("We set email on Ordering page {string}")
    public void we_set_email_on_Ordering_page(String email){
        orderingPage = new OrderingPage(controller.getDriver());
        typeTextUtils.sendText(orderingPage.fieldEmail, email);
    }

    @Then("We check button success ordering should be enabled {string}")
    public void we_check_button_success_ordering_should_be_enabled(String name) {
        orderingPage = new OrderingPage(controller.getDriver());
        if (name.isEmpty()) {
            Assert.assertFalse(waitUtils.getElementWhenVisibleMiddleWait(orderingPage.btnCheckOut).isEnabled());
        } else {
            Assert.assertTrue(waitUtils.getElementWhenVisibleMiddleWait(orderingPage.btnCheckOut).isEnabled());
        }
    }
}
