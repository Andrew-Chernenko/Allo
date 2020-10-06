package Tests;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@tags",
        features = "src\\test\\java\\Scenario",
        glue = "src\\main\\java\\Steps"
)

public class TestRunersTest extends AbstractTestNGCucumberTests {
}
