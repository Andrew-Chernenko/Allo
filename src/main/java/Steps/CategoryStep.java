package Steps;
import Pages.CategoryPage;
import Steps.BaseStep.Controller;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import utils.WaitUtils;

public class CategoryStep {

    protected WaitUtils waitUtils;
    protected Controller controller;
    protected CategoryPage categoryPage;

    public CategoryStep(Controller controller){
        this.controller = controller;
        waitUtils = new WaitUtils(controller.getDriver());
    }

    @Then("We will be on this url {string}")
    public void we_will_be_on_this_url(String currentUrl) {
        categoryPage = new CategoryPage(controller.getDriver());
        Assert.assertEquals(controller.getDriver().getCurrentUrl(), currentUrl);
    }
}
