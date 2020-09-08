package BaseTest;
import Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utils.Sleeper;


public class BaseTest {
    protected WebDriver driver;
    public static String link = "https://allo.ua/";
    protected Sleeper sleeper;

    @BeforeTest
    protected void driverInittilizator() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Office\\Downloads\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        sleeper = new Sleeper();
        Thread.sleep(3000);
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
