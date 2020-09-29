package Steps.BaseStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Controller {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setupController() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Office\\Downloads\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        this.driver = new ChromeDriver(options);
        this.driver.manage().window().maximize();
    }

    public void teardownController() {
        driver.quit();
    }
}
