package Tests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features =  "src/test/Scenario/",
        glue = "src/main/java/Steps/"
)

public class TestRunersTest {
}
