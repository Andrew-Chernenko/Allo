package Pages;
import BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends BasePage {

    @FindBy(xpath = ".//div[@class='tiny-slider tiny-slider__content top-banner__slider']")
    private WebElement topBanner;

    public CategoryPage(WebDriver driver) {
        super(driver);
        waitLoadComponent();
    }

    public String returnUrl(){
        waitUtils.waitLoadingPageWithJavaScript();
        return driver.getCurrentUrl();
    }

    @Override
    public void waitLoadComponent() {
        waitUtils.waitElementVisibilityWithMiddleWait(topBanner);
    }
}
