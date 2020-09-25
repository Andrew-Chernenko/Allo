//package Tests;
//import Steps.BaseStep;
//import Pages.CartPage;
//import Pages.ProductListPage;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import Pages.MainPage;
//
//public class AddProductToCartTest extends BaseStep {
//
//    @Test
//    public void checkAddProduct() {
//        MainPage page = new MainPage(driver);
//        String oldCardValue = page.takeCartValue();
//        page.doSearch("Samsung");
//        ProductListPage productListPage = new ProductListPage(driver);
//        productListPage.productBtnClick("SM-N985FZNGSEK");
//        CartPage cartPage = new CartPage(driver);
//        cartPage.cartPopUpAppearing();
//        String newCartValue = page.takeCartValue();
//        Assert.assertNotEquals(oldCardValue, newCartValue);
//    }
//}
