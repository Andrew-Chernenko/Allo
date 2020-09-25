//package Tests;
//import Steps.BaseStep;
//import Pages.MainPage;
//import Pages.RegisterMenuPage;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import utils.EntityData.User;
//
//public class RegistrationTest extends BaseStep {
//
//    @Test
//    public void registerCheck() {
//        User user = new User();
//        user.setName("Андрей");
//        user.setPhone("956765444");
//        user.setEmail("test12345612355@gmail.com");
//        user.setPassword("qwerty12345");
//        MainPage page = new MainPage(driver);
//        RegisterMenuPage registerMenuPage = page.registerBtnClick();
//        registerMenuPage.setInputRegisterData(user);
//        Assert.assertTrue(registerMenuPage.isCheckSuccesRegisterBtn());
//    }
//}
