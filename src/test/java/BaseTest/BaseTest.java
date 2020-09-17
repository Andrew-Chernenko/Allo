package BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver;
    public static String link = "https://allo.ua/";

    @BeforeTest
    protected void driverInittilizator() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Office\\Downloads\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @BeforeMethod
    protected void navigateToLink() {
        driver.navigate().to(link);
    }

    @AfterTest
    protected void exit() {
        driver.quit();
    }
}
