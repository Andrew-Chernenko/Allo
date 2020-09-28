package Steps;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseStep {
    Controller controller;
    public static String link = "https://allo.ua/";

    public BaseStep(Controller controller) {
        this.controller = controller;
    }

    @Before
    public void driverInittilizator() {
        controller.setupController();
        controller.getDriver().navigate().to(link);
    }

    @After
    public void exit() {
        controller.teardownController();
    }
}
