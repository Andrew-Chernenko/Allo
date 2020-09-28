package Steps;
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

    @When("^Search product and add to the cart")
    public void addProductToCart() {
        waitUtils.waitElementWithMiddleWaitAndClick(mainPage.searchBox);
        typeTextUtils.sendText(mainPage.searchBox, "Samsung");
        typeTextUtils.pushKeys(mainPage.searchBox, Keys.ENTER);
        waitUtils.waitLoadingPageWithJavaScript();
        productListPage = new ProductListPage(controller.getDriver());
        List<WebElement> products = waitUtils.waitVisibilityAllElementsWithMiddleWait(productListPage.productCart);
        for (WebElement webElement : products) {
            if (webElement.getText().contains("SM-N985FZNGSEK")) {
                webElement.findElement(By.xpath(".//button[contains(@class,'buy-button--animation')]")).click();
                break;
            }
        }
        cartPage = new CartPage(controller.getDriver());
        waitUtils.waitElementVisibilityWithMiddleWait(cartPage.productCartPopUp);
    }

    @Then("^Сhanging the counter of items in the cart")
    public void checkChange() {
        String newCardValue = waitUtils.getElementWhenVisibleMinimumWait(mainPage.cart).getText();
        Assert.assertNotEquals(oldCardValue, newCardValue);
    }

    @Given("^Open site and init page")
    public void openAdnInitPage() {
        waitUtils.waitLoadingPageWithJavaScript();
        mainPage = new MainPage(controller.getDriver());
        waitUtils.waitElementWithMiddleWaitAndClick(mainPage.searchBox);
        typeTextUtils.sendText(mainPage.searchBox, "Айфон");
        typeTextUtils.pushKeys(mainPage.searchBox, Keys.ENTER);
        waitUtils.waitLoadingPageWithJavaScript();
    }

    @When("Add product to the cart and ordering set {string} and {string} and {string}")
    public void Ordering(String name, String phoneNumber, String email) {
        productListPage = new ProductListPage(controller.getDriver());
        List<WebElement> products = waitUtils.waitVisibilityAllElementsWithMiddleWait(productListPage.productCart);
        for (WebElement webElement : products) {
            if (webElement.getText().contains("MWM02")) {
                webElement.findElement(By.xpath(".//button[contains(@class,'buy-button--animation')]")).click();
                break;
            }
        }
        cartPage = new CartPage(controller.getDriver());
        waitUtils.waitElementWithMiddleWaitAndClick(cartPage.btnOrdering);
        waitUtils.waitLoadingPageWithJavaScript();
        orderingPage = new OrderingPage(controller.getDriver());
        typeTextUtils.sendText(orderingPage.fieldName, name);
        typeTextUtils.sendText(orderingPage.fieldTelephone, phoneNumber);
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
