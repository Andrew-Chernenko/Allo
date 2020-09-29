package Steps;
import Steps.BaseStep.Controller;
import Pages.ProductListPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import utils.TypeTextUtils;
import utils.WaitUtils;

public class SearchProductStep {

    protected WaitUtils waitUtils;
    protected Controller controller;
    protected TypeTextUtils typeTextUtils;
    protected ProductListPage productListPage;

    public SearchProductStep(Controller controller) {
        this.controller = controller;
        waitUtils = new WaitUtils(controller.getDriver());
        typeTextUtils = new TypeTextUtils(controller.getDriver());
    }

    @Then("We will be on this {string}")
    public void we_will_be_on_this(String currentUrl) {
        waitUtils.waitLoadingPageWithJavaScript();
        productListPage = new ProductListPage(controller.getDriver());
        waitUtils.waitVisibilityAllElementsWithMiddleWait(productListPage.productCart);
        Assert.assertEquals(controller.getDriver().getCurrentUrl(), currentUrl);
    }
}
