package Tests;
import BaseTest.BaseTest;
import Pages.MainPage;
import Pages.ProductListPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTest extends BaseTest {

    @Test
    public void searchProductEngLanguage() {
        MainPage page = new MainPage(driver);
        page.doSearch("Vacuum cleaner");
        ProductListPage productListPage = new ProductListPage(driver);
        Assert.assertEquals(productListPage.returnUrl(), "https://allo.ua/ua/catalogsearch/result/?q=Vacuum%20cleaner");
    }

    @Test
    public void searchProductRusLanguage() {
        MainPage page = new MainPage(driver);
        page.doSearch("Айфон");
        ProductListPage productListPage = new ProductListPage(driver);
        Assert.assertEquals(productListPage.returnUrl(), "https://allo.ua/ua/catalogsearch/result/?q=iphone");
    }
}
