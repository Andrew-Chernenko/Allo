package BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtils;
import utils.TypeTextUtils;

public abstract class BasePage implements CheckLoadComponentInterface {

   protected WebDriver driver;
   protected TypeTextUtils typeTextUtils;
   protected WaitUtils waitUtils;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        typeTextUtils = new TypeTextUtils(driver);
        waitUtils = new WaitUtils(driver);
        PageFactory.initElements(driver, this);
    }
}
