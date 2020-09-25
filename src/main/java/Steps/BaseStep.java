package Steps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseStep {
    Controller controller;

    public static String link = "https://allo.ua/";

    public BaseStep(Controller controller){
        this.controller = controller;
    }

    @Before
    public void driverInittilizator() {
        controller.setupController();
    }

//    @BeforeMethod
//    protected void navigateToLink() {
//        driver.navigate().to(link);
//    }

    @After
    public void exit() {
        controller.teardownController();
    }
}
