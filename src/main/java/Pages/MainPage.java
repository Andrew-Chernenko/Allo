package Pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BasePage.BasePage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class MainPage extends BasePage {

    @FindBy(xpath = ".//div[contains(@class,'product-card v-loaded')]")
    private List<WebElement> productCart;

    @FindBy(xpath = ".//span[@class='shopping-cart__count']")
    private WebElement cart;

    @FindBy(xpath = ".//input[@id='search-form__input']")
    private WebElement searchBox;

    @FindBy(xpath = ".//div[@class='main-header-second-line-wrapper']")
    private WebElement header;

    @FindBy(xpath = ".//div[@class='language']//div[@class='switcher-toggle']")
    private WebElement languageSwitch;

    @FindBy(xpath = ".//div[@class='user-block-authentication']//*[local-name()='svg']")
    private WebElement loginBtn;

    @FindBy(xpath = ".//li[@class='login-tab']")
    private WebElement btnRegister;

    @FindBy(xpath = ".//p[contains(text(),'Смартфоны и телефоны') or contains( text(), 'Смартфони та телефони')]")
    private WebElement firstCategory;

    @FindBy(xpath = ".//p[contains(text(),'Бытовая техника') or contains( text(), 'Побутова техніка')]")
    private WebElement secondCategory;

    @FindBy(xpath = ".//div[@class='header-theme']//div[@class='switcher-toggle']")
    private WebElement checkBoxThemeSwitch;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String takeCartValue() {
        return waitUtils.waitElementVisibilityWithMinimumWait(cart).getText();
    }

    public String getHeaderColor() {
        String headerColor;
        waitUtils.waitElementVisibilityWithMiddleWait(header);
        headerColor = header.getCssValue("background-color");
        return Color.fromString(headerColor).asHex();
    }

    public void swapLanguageClick() {
        waitUtils.waitElementWithMiddleWaitAndClick(languageSwitch);
        waitUtils.waitLoadingPageWithJavaScript();
    }

    public LoginMenuPage loginClickBtn() {
        waitUtils.waitLoadingPageWithJavaScript();
        waitUtils.waitElementWithMiddleWaitAndClick(loginBtn);
        return new LoginMenuPage(driver);
    }

    public RegisterMenuPage registerBtnClick() {
        waitUtils.waitElementWithMiddleWaitAndClick(loginBtn);
        waitUtils.waitElementWithMiddleWaitAndClick(btnRegister);
        return new RegisterMenuPage(driver);
    }

    public void firstCategoryClick() {
        waitUtils.waitElementWithMiddleWaitAndClick(firstCategory);
        waitUtils.waitLoadingPageWithJavaScript();
    }

    public void secondCategoryClick() {
        waitUtils.waitElementWithMiddleWaitAndClick(secondCategory);
        waitUtils.waitLoadingPageWithJavaScript();
    }

    public void checkBoxThemeSwitchClick() {
        waitUtils.waitElementWithMiddleWaitAndClick(checkBoxThemeSwitch);
        waitUtils.waitLoadingPageWithJavaScript();
    }

    public void doSearch(String text) {
        waitUtils.waitElementWithMiddleWaitAndClick(searchBox);
        typeTextUtils.sendText(searchBox,text);
        typeTextUtils.pushKeys(searchBox,Keys.ENTER);
    }
}