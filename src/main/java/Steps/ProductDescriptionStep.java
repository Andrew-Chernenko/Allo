package Steps;
import Pages.ProductDescriptionPage;
import Steps.BaseStep.Controller;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import utils.WaitUtils;

public class ProductDescriptionStep {

    protected WaitUtils waitUtils;
    protected Controller controller;
    protected ProductDescriptionPage productDescriptionPage;

    public ProductDescriptionStep(Controller controller){
        this.controller = controller;
        waitUtils = new WaitUtils(controller.getDriver());
    }

    @Then("Pages must contains {string}")
    public void pages_must_contains(String text){
        waitUtils.waitLoadingPageWithJavaScript();
        productDescriptionPage = new ProductDescriptionPage(controller.getDriver());
        Assert.assertEquals(true, waitUtils.getElementWhenVisibleMiddleWait(productDescriptionPage.productName)
                .getText().contains(text));
    }
}
