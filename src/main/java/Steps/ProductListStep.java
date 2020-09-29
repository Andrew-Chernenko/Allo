package Steps;
import Pages.ProductListPage;
import Steps.BaseStep.Controller;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.TypeTextUtils;
import utils.WaitUtils;
import java.util.List;

public class ProductListStep {

    protected ProductListPage productListPage;
    protected Controller controller;
    protected WaitUtils waitUtils;
    protected TypeTextUtils typeTextUtils;

    public ProductListStep(Controller controller){
        this.controller = controller;
        waitUtils = new WaitUtils(controller.getDriver());
        typeTextUtils = new TypeTextUtils(controller.getDriver());
    }

    @When("We add model {string} to cart")
    public void we_add_model_to_cart(String model){
        productListPage = new ProductListPage(controller.getDriver());
        List<WebElement> products = waitUtils.waitVisibilityAllElementsWithMiddleWait(productListPage.productCart);
        for (WebElement webElement : products) {
            if (webElement.getText().contains(model)) {
                webElement.findElement(By.xpath(".//button[contains(@class,'buy-button--animation')]")).click();
                break;
            }
        }
    }

    @Then("We click to the product with {string}")
    public void we_click_to_the_product(String text) {
        waitUtils.waitLoadingPageWithJavaScript();
        productListPage = new ProductListPage(controller.getDriver());
        List<WebElement> products = waitUtils.waitVisibilityAllElementsWithMiddleWait(productListPage.productCart);
        for (WebElement webElement : products) {
            if (webElement.getText().contains(text)) {
                webElement.click();
                break;
            }
        }
    }
}
