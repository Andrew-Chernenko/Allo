import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ThemeSwitchTest extends MainPage {

    private String color;

    @Test
    public void checkColor() throws InterruptedException {
        searchCheckBox();
        searchHeader();
        headerColor = Color.fromString(headerColor).asHex();
        color = headerColor;
        checkBox.click();
        Thread.sleep(3000);
        searchHeader();
        headerColor = Color.fromString(headerColor).asHex();
        Assert.assertNotEquals(color, headerColor);

    }
}
