package Tests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features =  "src/test/Scenario/",
        glue = "src/main/Steps/"
)

public class TestRunersTest {
}
