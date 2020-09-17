package Pages;
import BasePage.BasePage;
import org.openqa.selenium.WebDriver;

public class CategoryPage extends BasePage {

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public String returnUrl(){
        waitUtils.waitLoadingPageWithJavaScript();
        return driver.getCurrentUrl();
    }

}
