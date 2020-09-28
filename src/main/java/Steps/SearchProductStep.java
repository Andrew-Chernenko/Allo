package Steps;
import BaseStep.Controller;
import Pages.MainPage;
import Pages.ProductDescriptionPage;
import Pages.ProductListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.TypeTextUtils;
import utils.WaitUtils;

import java.util.List;

public class SearchProductStep {

    protected MainPage mainPage;
    protected WaitUtils waitUtils;
    protected Controller controller;
    protected TypeTextUtils typeTextUtils;
    protected ProductListPage productListPage;
    ProductDescriptionPage productDescriptionPage;

    public SearchProductStep(Controller controller) {
        this.controller = controller;
        waitUtils = new WaitUtils(controller.getDriver());
        typeTextUtils = new TypeTextUtils(controller.getDriver());
    }

    @Given("^Initialization MainPage")
    public void intinMainPage() {
        waitUtils.waitLoadingPageWithJavaScript();
        mainPage = new MainPage(controller.getDriver());
    }

    @When("We search some product {string}")
    public void search(String product) {
        waitUtils.waitElementWithMiddleWaitAndClick(mainPage.searchBox);
        typeTextUtils.sendText(mainPage.searchBox, product);
        typeTextUtils.pushKeys(mainPage.searchBox, Keys.ENTER);
    }


    @Then("We click to the product with {string}")
    public void pageContains(String text) {
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

    @Then("Pages must contains {string}")
    public void pages_must_contains(String text){
        productDescriptionPage = new ProductDescriptionPage(controller.getDriver());
        waitUtils.waitLoadingPageWithJavaScript();
        Assert.assertEquals(true, waitUtils.getElementWhenVisibleMiddleWait(productDescriptionPage.productName)
                .getText().contains(text));
    }

    @Given("^Open main page")
    public void createPage() {
        waitUtils.waitLoadingPageWithJavaScript();
        mainPage = new MainPage(controller.getDriver());
    }

    @When("We search product {string}")
    public void searchProduct(String product) {
        waitUtils.waitElementWithMiddleWaitAndClick(mainPage.searchBox);
        typeTextUtils.sendText(mainPage.searchBox, product);
        typeTextUtils.pushKeys(mainPage.searchBox, Keys.ENTER);
    }

    @Then("We will be on this {string}")
    public void assertUrl(String currentUrl) {
        waitUtils.waitLoadingPageWithJavaScript();
        productListPage = new ProductListPage(controller.getDriver());
        waitUtils.waitVisibilityAllElementsWithMiddleWait(productListPage.productCart);
        Assert.assertEquals(controller.getDriver().getCurrentUrl(), currentUrl);
    }
}
