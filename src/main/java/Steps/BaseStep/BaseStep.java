package Steps.BaseStep;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseStep {
    Controller controller;
    public static String link = "https://allo.ua/";

    public BaseStep(Controller controller) {
        this.controller = controller;
    }

    @Before(order = 1)
    public void driverInitializator() {
        controller.setupController();
    }

    @Before(order = 2)
    public void moveToSite(){
        controller.getDriver().navigate().to(link);
    }

    @After
    public void exit() {
        controller.teardownController();
    }
}
