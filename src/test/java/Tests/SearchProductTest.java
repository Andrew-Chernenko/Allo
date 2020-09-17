package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTest extends BaseTest {

    @Test
    public void searchProductEngLanguage() {
        MainPage page = new MainPage(driver);
        page.doSearch("Vacuum cleaner");
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/catalogsearch/result/?q=Vacuum%20cleaner");
    }

    @Test
    public void searchProductRusLanguage() {
        MainPage page = new MainPage(driver);
        page.doSearch("Айфон");
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/catalogsearch/result/?q=iphone");
    }
}
