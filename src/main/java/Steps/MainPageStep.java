package Steps;
import Pages.MainPage;
import Steps.BaseStep.BaseStep;
import Steps.BaseStep.Controller;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import utils.TypeTextUtils;
import utils.WaitUtils;

public class MainPageStep {

    protected WaitUtils waitUtils;
    protected Controller controller;
    protected TypeTextUtils typeTextUtils;
    protected MainPage mainPage;
    protected String headerColor;

    public MainPageStep(Controller controller){
        this.controller = controller;
        waitUtils = new WaitUtils(controller.getDriver());
        typeTextUtils = new TypeTextUtils(controller.getDriver());
    }

    @Given("^We open site and init page")
    public void we_open_and_init_page() {
        waitUtils.waitLoadingPageWithJavaScript();
        mainPage = new MainPage(controller.getDriver());
    }

    @When("We search product {string}")
    public void we_search_product(String text) {
        mainPage = new MainPage(controller.getDriver());
        waitUtils.waitElementWithMiddleWaitAndClick(mainPage.searchBox);
        typeTextUtils.sendText(mainPage.searchBox, text);
        typeTextUtils.pushKeys(mainPage.searchBox, Keys.ENTER);
        waitUtils.waitLoadingPageWithJavaScript();
    }

    @When("^We take a header color")
    public void we_take_a_header_color() {
        mainPage = new MainPage(controller.getDriver());
        waitUtils.waitElementVisibilityWithMiddleWait(mainPage.header);
        headerColor = mainPage.header.getCssValue("background-color");
        headerColor = Color.fromString(headerColor).asHex();
    }

    @When("^We switched color")
    public void we_switched_color(){
        mainPage = new MainPage(controller.getDriver());
        waitUtils.waitElementWithMiddleWaitAndClick(mainPage.checkBoxThemeSwitch);
        waitUtils.waitLoadingPageWithJavaScript();
    }

    @Then("^Header change color to black")
    public void header_change_color_to_lack() {
        mainPage = new MainPage(controller.getDriver());
        String newColor;
        waitUtils.waitElementVisibilityWithMiddleWait(mainPage.header);
        newColor = mainPage.header.getCssValue("background-color");
        newColor = Color.fromString(newColor).asHex();
        Assert.assertNotEquals(newColor, headerColor);
    }

    @When("^We try swap language")
    public void we_try_swap_language() {
        mainPage = new MainPage(controller.getDriver());
        waitUtils.waitElementWithMiddleWaitAndClick(mainPage.languageSwitch);
        waitUtils.getElementWhenVisibleMiddleWait(mainPage.languageAfterSwap);
        waitUtils.waitLoadingPageWithJavaScript();
    }

    @Then("^We navigate to new url")
    public void we_navigate_to_new_url() {
        Assert.assertNotEquals(controller.getDriver().getCurrentUrl(), BaseStep.link);
    }

    @When("We click to the same category {string}")
    public void we_click_to_the_same_category(String category) {
        mainPage = new MainPage(controller.getDriver());
        if(category.equals("Смартфоны и телефоны") || category.equals("Смартфони та телефони")) {
            waitUtils.waitElementWithMiddleWaitAndClick(mainPage.firstCategory);
            waitUtils.waitLoadingPageWithJavaScript();
        } else {
            waitUtils.waitElementWithMiddleWaitAndClick(mainPage.secondCategory);
            waitUtils.waitLoadingPageWithJavaScript();
        }
    }

    @When("^We click a login button")
    public void we_click_a_login_button(){
        mainPage = new MainPage(controller.getDriver());
        waitUtils.waitElementWithMiddleWaitAndClick(mainPage.loginBtn);
    }

}
