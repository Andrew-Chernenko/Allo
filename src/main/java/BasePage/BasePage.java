package BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.TypeTextUtils;

public class BasePage {

   protected WebDriver driver;
   protected TypeTextUtils typeTextUtils;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        typeTextUtils = new TypeTextUtils(driver);
        PageFactory.initElements(driver, this);
    }

}
