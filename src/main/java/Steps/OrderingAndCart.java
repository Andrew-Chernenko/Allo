package Steps;
import BaseStep.Controller;
import Pages.CartPage;
import Pages.MainPage;
import Pages.OrderingPage;
import Pages.ProductListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.TypeTextUtils;
import utils.WaitUtils;
import java.util.List;

public class OrderingAndCart {

    protected MainPage mainPage;
    protected WaitUtils waitUtils;
    protected Controller controller;
    protected TypeTextUtils typeTextUtils;
    protected ProductListPage productListPage;
    protected String oldCardValue;
    protected CartPage cartPage;
    protected OrderingPage orderingPage;

    public OrderingAndCart(Controller controller) {
        this.controller = controller;
        waitUtils = new WaitUtils(controller.getDriver());
        typeTextUtils = new TypeTextUtils(controller.getDriver());
    }

    @Given("^Take cart value")
    public void takeCartValue() {
        waitUtils.waitLoadingPageWithJavaScript();
        mainPage = new MainPage(controller.getDriver());
        oldCardValue = waitUtils.getElementWhenVisibleMinimumWait(mainPage.cart).getText();
    }

    @When("Search product {string}")
    public void addProductToCart(String text) {
        waitUtils.waitElementWithMiddleWaitAndClick(mainPage.searchBox);
        typeTextUtils.sendText(mainPage.searchBox, text);
        typeTextUtils.pushKeys(mainPage.searchBox, Keys.ENTER);
        waitUtils.waitLoadingPageWithJavaScript();
    }

    @When("Add product to cart with model {string}")
    public void add_product_to_cart(String model){
        productListPage = new ProductListPage(controller.getDriver());
        List<WebElement> products = waitUtils.waitVisibilityAllElementsWithMiddleWait(productListPage.productCart);
        for (WebElement webElement : products) {
            if (webElement.getText().contains(model)) {
                webElement.findElement(By.xpath(".//button[contains(@class,'buy-button--animation')]")).click();
                break;
            }
        }
    }

    @Then("^Сhanging the counter of items in the cart")
    public void checkChange() {
        cartPage = new CartPage(controller.getDriver());
        waitUtils.waitElementVisibilityWithMiddleWait(cartPage.productCartPopUp);
        Assert.assertNotEquals(oldCardValue, waitUtils.getElementWhenVisibleMinimumWait(mainPage.cart).getText());
    }

    @Given("^Open site and init page")
    public void openAdnInitPage() {
        waitUtils.waitLoadingPageWithJavaScript();
        mainPage = new MainPage(controller.getDriver());
    }

    @When("Search {string}")
    public void search(String text){
        waitUtils.waitElementWithMiddleWaitAndClick(mainPage.searchBox);
        typeTextUtils.sendText(mainPage.searchBox, "Айфон");
        typeTextUtils.pushKeys(mainPage.searchBox, Keys.ENTER);
        waitUtils.waitLoadingPageWithJavaScript();
    }

    @When("Add product to the cart with model {string}")
    public void Ordering(String model) {
        productListPage = new ProductListPage(controller.getDriver());
        List<WebElement> products = waitUtils.waitVisibilityAllElementsWithMiddleWait(productListPage.productCart);
        for (WebElement webElement : products) {
            if (webElement.getText().contains(model)) {
                webElement.findElement(By.xpath(".//button[contains(@class,'buy-button--animation')]")).click();
                break;
            }
        }
    }

    @When("^Wait ordering pup-up")
    public void wait_ordering_pup_up(){
        cartPage = new CartPage(controller.getDriver());
        waitUtils.waitElementWithMiddleWaitAndClick(cartPage.btnOrdering);
        waitUtils.waitLoadingPageWithJavaScript();
    }

    @When("Ordering set name {string}")
    public void ordering_set_name(String name){
        orderingPage = new OrderingPage(controller.getDriver());
        System.out.println(name);
        typeTextUtils.sendText(orderingPage.fieldName, name);
    }

    @When("Ordering set phoneNumber {string}")
    public void ordering_set_phoneNumber(String phoneNumber){
        typeTextUtils.sendText(orderingPage.fieldTelephone, phoneNumber);
    }

    @When("Ordering set email {string}")
    public void ordering_set_email(String email){
        typeTextUtils.sendText(orderingPage.fieldEmail, email);
    }

    @Then("Button success ordering should be enabled {string}")
    public void checkOrderingButton(String name) {
        if (name.isEmpty()) {
            Assert.assertFalse(waitUtils.getElementWhenVisibleMiddleWait(orderingPage.btnCheckOut).isEnabled());
        } else {
            Assert.assertTrue(waitUtils.getElementWhenVisibleMiddleWait(orderingPage.btnCheckOut).isEnabled());
        }
    }
}
