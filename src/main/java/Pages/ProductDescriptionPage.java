package Pages;
import BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDescriptionPage extends BasePage {

    @FindBy(xpath = ".//h1[@class='product-header__title']")
    public WebElement productName;

    public ProductDescriptionPage(WebDriver driver){
        super(driver);
    }

    @Override
    public void waitLoadComponent() {

    }
}
