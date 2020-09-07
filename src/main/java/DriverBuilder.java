import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class DriverBuilder {
    protected WebDriver driver;
    static String link = "https://allo.ua/";

    @BeforeMethod
    protected void driverInittilizator() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Office\\Downloads\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.navigate().to(link);
        Thread.sleep(3000);
    }


    @AfterMethod
    protected void exit() {

        driver.quit();
    }
}
