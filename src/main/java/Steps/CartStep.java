package Steps;
import Pages.CartPage;
import Pages.MainPage;
import Steps.BaseStep.Controller;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TypeTextUtils;
import utils.WaitUtils;

public class CartStep {

    protected WaitUtils waitUtils;
    protected Controller controller;
    protected TypeTextUtils typeTextUtils;
    protected String oldCardValue;
    protected CartPage cartPage;
    protected MainPage mainPage;

    public CartStep(Controller controller) {
        this.controller = controller;
        waitUtils = new WaitUtils(controller.getDriver());
        typeTextUtils = new TypeTextUtils(controller.getDriver());
    }

    @Given("^We take cart value")
    public void we_take_cart_value() {
        mainPage = new MainPage(controller.getDriver());
        oldCardValue = waitUtils.getElementWhenVisibleMinimumWait(mainPage.cart).getText();
    }

    @When("^We wait ordering pup-up")
    public void we_wait_ordering_pup_up(){
        cartPage = new CartPage(controller.getDriver());
        waitUtils.waitElementWithMiddleWaitAndClick(cartPage.btnOrdering);
        waitUtils.waitLoadingPageWithJavaScript();
    }

    @Then("^We see changing the counter of items in the cart")
    public void we_see_changing_the_counter_of_items_in_the_cart() {
        cartPage = new CartPage(controller.getDriver());
        waitUtils.waitElementVisibilityWithMiddleWait(cartPage.productCartPopUp);
        Assert.assertNotEquals(oldCardValue, waitUtils.getElementWhenVisibleMinimumWait(mainPage.cart).getText());
    }
}
