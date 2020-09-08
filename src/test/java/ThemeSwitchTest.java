import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ThemeSwitchTest extends MainPage {

    private String color;
    private String headerColor;
    protected WebElement checkBox;

    @Test
    public void checkColor() throws InterruptedException {
        checkBox = searchCheckBox();
        headerColor = searchHeader();
        headerColor = Color.fromString(headerColor).asHex();
        color = headerColor;
        checkBox.click();
        Thread.sleep(3000);
        headerColor = searchHeader();
        headerColor = Color.fromString(headerColor).asHex();
        Assert.assertNotEquals(color, headerColor);
    }
}
