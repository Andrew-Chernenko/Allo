//package Tests;
//import Steps.BaseStep;
//import Pages.MainPage;
//import Pages.ProductDescriptionPage;
//import Pages.ProductListPage;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class NavigateToProductTest extends BaseStep {
//
//    @Test
//    public void moveToRefrigerator() {
//        MainPage page = new MainPage(driver);
//        page.doSearch("Холодильник");
//        ProductListPage productListPage = new ProductListPage(driver);
//        productListPage.navigateToProductDescriptionPage("BCD-160MDMJ01");
//        ProductDescriptionPage productDescriptionPage = new ProductDescriptionPage(driver);
//        Assert.assertEquals(true,productDescriptionPage.isContainsProductName("BCD-160MDMJ01"));
//    }
//
//    @Test
//    public void moveToTelephone() {
//        MainPage page = new MainPage(driver);
//        page.doSearch("Samsung");
//        ProductListPage productListPage = new ProductListPage(driver);
//        productListPage.navigateToProductDescriptionPage("SM-N985FZNGSEK");
//        ProductDescriptionPage productDescriptionPage = new ProductDescriptionPage(driver);
//        Assert.assertEquals(true,productDescriptionPage.isContainsProductName("SM-N985FZNGSEK"));
//    }
//}
