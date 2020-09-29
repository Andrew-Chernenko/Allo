package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Pages.BasePage.BasePage;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class MainPage extends BasePage {

    @FindBy(xpath = ".//span[@class='shopping-cart__count']")
    public WebElement cart;

    @FindBy(xpath = ".//input[@id='search-form__input']")
    public WebElement searchBox;

    @FindBy(xpath = ".//div[@class='main-header-second-line-wrapper']")
    public WebElement header;

    @FindBy(xpath = ".//div[@class='language']//div[@class='switcher-toggle']")
    public WebElement languageSwitch;

    @FindBy(xpath = ".//div[@class='user-block-authentication']//*[local-name()='svg']")
    public WebElement loginBtn;

    @FindBy(xpath = ".//p[contains(text(),'Смартфоны и телефоны') or contains( text(), 'Смартфони та телефони')]")
    public WebElement firstCategory;

    @FindBy(xpath = ".//p[contains(text(),'Бытовая техника') or contains( text(), 'Побутова техніка')]")
    public WebElement secondCategory;

    @FindBy(xpath = ".//div[@class='header-theme']//div[@class='switcher-toggle']")
    public WebElement checkBoxThemeSwitch;

    @FindBy(xpath = ".//div[@class='banner__gradient']")
    public WebElement slider;

    @FindBy(xpath = ".//span[@class='language__ru active']")
    public WebElement languageAfterSwap;

    public MainPage(WebDriver driver) {
        super(driver);
        waitLoadComponent();
    }

    @Override
    public void waitLoadComponent() {
        waitUtils.waitElementVisibilityWithMiddleWait(header);
        waitUtils.waitElementVisibilityWithMiddleWait(loginBtn);
        waitUtils.waitElementVisibilityWithMiddleWait(firstCategory);
        waitUtils.waitElementVisibilityWithMiddleWait(slider);
    }
}