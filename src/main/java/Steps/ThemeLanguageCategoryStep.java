package Steps;
import Pages.CategoryPage;
import Pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import utils.WaitUtils;

public class ThemeLanguageCategoryStep {

    protected MainPage mainPage;
    protected WaitUtils waitUtils;
    protected Controller controller;
    protected String headerColor;
    protected String category;
    protected CategoryPage categoryPage;

    public ThemeLanguageCategoryStep(Controller controller) {
        this.controller = controller;
        waitUtils = new WaitUtils(controller.getDriver());
    }

    @Given("^Main page on the site")
    public void initializationPage() {
        waitUtils.waitLoadingPageWithJavaScript();
        mainPage = new MainPage(controller.getDriver());
    }

    @When("^We try click to the switch-box")
    public void switchTheme() {
        waitUtils.waitElementVisibilityWithMiddleWait(mainPage.header);
        headerColor = mainPage.header.getCssValue("background-color");
        headerColor = Color.fromString(headerColor).asHex();
        waitUtils.waitElementWithMiddleWaitAndClick(mainPage.checkBoxThemeSwitch);
        waitUtils.waitLoadingPageWithJavaScript();
    }

    @Then("^Header change color to black")
    public void checkColor() {
        String newColor;
        waitUtils.waitElementVisibilityWithMiddleWait(mainPage.header);
        newColor = mainPage.header.getCssValue("background-color");
        newColor = Color.fromString(newColor).asHex();
        Assert.assertNotEquals(newColor, headerColor);
    }

    @Given("^Main page on the Ukrainian language")
    public void initPage() {
        waitUtils.waitLoadingPageWithJavaScript();
        mainPage = new MainPage(controller.getDriver());
    }

    @When("^We try swap language")
    public void switchLanguage() {
        waitUtils.waitElementWithMiddleWaitAndClick(mainPage.languageSwitch);
        waitUtils.getElementWhenVisibleMiddleWait(mainPage.languageAfterSwap);
        waitUtils.waitLoadingPageWithJavaScript();
    }

    @Then("^New url")
    public void checkUrl() {
        Assert.assertNotEquals(controller.getDriver().getCurrentUrl(), BaseStep.link);
    }

    @Given("^Main page")
    public void page() {
        waitUtils.waitLoadingPageWithJavaScript();
        mainPage = new MainPage(controller.getDriver());
    }

    @When("We click to the same category {string}")
    public void switchCategory(String category) {
        if (category.equals("Смартфоны и телефоны") || category.equals("Смартфони та телефони")) {
            waitUtils.waitElementWithMiddleWaitAndClick(mainPage.firstCategory);
            waitUtils.waitLoadingPageWithJavaScript();
        } else {
            waitUtils.waitElementWithMiddleWaitAndClick(mainPage.secondCategory);
            waitUtils.waitLoadingPageWithJavaScript();
        }
    }

    @Then("We will be on this url {string}")
    public void check(String currentUrl) {
        waitUtils.waitLoadingPageWithJavaScript();
        categoryPage = new CategoryPage(controller.getDriver());
        Assert.assertEquals(controller.getDriver().getCurrentUrl(), currentUrl);
    }
}
