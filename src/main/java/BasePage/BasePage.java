package BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtils;
import utils.TypeTextUtils;

public class BasePage {

   protected WebDriver driver;
   protected TypeTextUtils typeTextUtils;
   protected WaitUtils waitUtils;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        typeTextUtils = new TypeTextUtils();
        waitUtils = new WaitUtils(driver);
        PageFactory.initElements(driver, this);
    }

}
