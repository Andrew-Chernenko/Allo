package Pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BasePage.BasePage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import utils.SleeperUtils;

public class MainPage extends BasePage {

    @FindBy(xpath = ".//span[@class='shopping-cart__count']")
    private WebElement cart;

    @FindBy(xpath = ".//input[@id='search-form__input']")
    private WebElement searchBox;

    @FindBy(xpath = ".//div[@class='main-header-second-line-wrapper']")
    private WebElement header;

    @FindBy(xpath = ".//div[@class='language']//div[@class='switcher-toggle']")
    private WebElement languageSwitch;

    @FindBy(xpath = ".//button[@class='authentication__button--login']")
    private WebElement loginBtn;

    @FindBy(xpath = ".//input[@id='auth']")
    private WebElement fieldLogin;

    @FindBy(xpath = ".//input[@id='v-login-password']")
    private WebElement fieldPassword;

    @FindBy(xpath = ".//button[@class='modal-submit-button']")
    private WebElement btnSuccesLogin;

    @FindBy(xpath = ".//button[@class='order-now']")
    private WebElement btnOrdering;

    @FindBy(xpath = ".//input[@id='onepage-customer-name']")
    private WebElement fieldName;

    @FindBy(xpath = ".//input[@id='onepage-customer-telephone']")
    private WebElement fieldTelephone;

    @FindBy(xpath = ".//input[@id='onepage-customer-email']")
    private WebElement fieldEmail;

    @FindBy(xpath = ".//button[@id='second-step-button']")
    private WebElement btnCheckOut;

    @FindBy(xpath = ".//a[@class='forgot-password']")
    private WebElement btnRecoveryPassword;

    @FindBy(xpath = ".//button[@class='modal-submit-button']")
    private WebElement btnSendCodeRecoveryPassword;

    @FindBy(xpath = ".//input[@id='auth']")
    private WebElement inputRecoveryPassword;

    @FindBy(xpath = ".//button[@class='authentication__button--register']")
    private WebElement btnRegister;

    @FindBy(xpath = ".//input[@id='v-register-name']")
    private WebElement inputRegisterName;

    @FindBy(xpath = ".//input[@id='v-register_telephone_number']")
    private WebElement inputRegisterPhone;

    @FindBy(xpath = ".//input[@id='v-register-email']")
    private WebElement inputRegisterEmail;

    @FindBy(xpath = ".//input[@id='vregister-password']")
    private WebElement inputRegisterPassword;

    @FindBy(xpath = ".//button[@name='send']")
    private WebElement succesRegisterBtn;

    @FindBy(xpath = ".//p[contains(text(),'Смартфоны и телефоны') or contains( text(), 'Смартфони та телефони')]")
    private WebElement firstCategory;

    @FindBy(xpath = ".//p[contains(text(),'Побутова техніка') or contains( text(),'Бытовая техника'])")
    private WebElement secondCategory;

    @FindBy(xpath = ".//div[@class='header-theme']//div[@class='switcher-toggle']")
    private WebElement checkBoxThemeSwitch;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String takeCartValue() {
        return cart.getText();
    }

    public String getHeaderColor() {
        String headerColor;
        headerColor = header.getCssValue("background-color");
        return Color.fromString(headerColor).asHex();
    }

    public void swapLanguageThemeClick() throws InterruptedException {
        languageSwitch.click();
        SleeperUtils.threadSleep(1);
    }

    public void loginClickBtn() throws InterruptedException {
        loginBtn.click();
        SleeperUtils.threadSleep(1);
    }

    public void orderBtnClick() throws InterruptedException {
        btnOrdering.click();
        SleeperUtils.threadSleep(4);
    }

    public void btnRecoveryPasswordClick() throws InterruptedException {
        btnRecoveryPassword.click();
        SleeperUtils.threadSleep(2);
    }

    public void registerBtnClick() throws InterruptedException {
        btnRegister.click();
        SleeperUtils.threadSleep(2);
    }

    public void firstCategoryClick() throws InterruptedException {
        firstCategory.click();
        SleeperUtils.threadSleep(3);
    }

    public void secondCategoryClick() throws InterruptedException {
        secondCategory.click();
        SleeperUtils.threadSleep(3);
    }

    public void checkBoxThemeSwitchClick() throws InterruptedException {
        checkBoxThemeSwitch.click();
        SleeperUtils.threadSleep(3);
    }

    public void doSearch(String text) throws InterruptedException {
        typeTextUtils.sendText(searchBox,text);
        typeTextUtils.pushKeys(searchBox,Keys.ENTER);
        SleeperUtils.threadSleep(5);
    }

    public void setFieldLogin(String text){
        typeTextUtils.sendText(fieldLogin,text);
    }

    public void setFieldPassword(String text){
        typeTextUtils.sendText(fieldPassword,text);
    }

    public boolean isCheckBtnSuccesLogin(){
        return btnSuccesLogin.isEnabled();
    }

    public void setFieldNameOnOrdering(String text) throws InterruptedException {
        typeTextUtils.sendText(fieldName,text);
        SleeperUtils.threadSleep(1);
    }

    public void setFieldTelephoneOnOrdering(String text) throws InterruptedException {
        typeTextUtils.sendText(fieldTelephone,text);
        SleeperUtils.threadSleep(1);
    }

    public void setFieldEmailOnOrdering(String text) throws InterruptedException {
        typeTextUtils.sendText(fieldEmail,text);
        SleeperUtils.threadSleep(1);
    }

    public boolean isCheckBtnCheckOut(){
        return btnCheckOut.isEnabled();
    }

    public void setInputRecoveryPassword(String text) throws InterruptedException {
        typeTextUtils.sendText(inputRecoveryPassword,text);
        SleeperUtils.threadSleep(1);
    }

    public boolean isCheckBtnSendCodeRecoveryPassword(){
        return btnSendCodeRecoveryPassword.isEnabled();
    }

    public void setInputRegisterName(String text) throws InterruptedException {
        typeTextUtils.sendText(inputRegisterName,text);
        SleeperUtils.threadSleep(1);
    }

    public void setInputRegisterPhone(String text) throws InterruptedException {
        typeTextUtils.sendText(inputRegisterPhone,text);
        SleeperUtils.threadSleep(1);
    }

    public void setInputRegisterEmail(String text) throws InterruptedException {
        typeTextUtils.sendText(inputRegisterEmail,text);
        SleeperUtils.threadSleep(1);
    }

    public void setInputRegisterPassword(String text) throws InterruptedException {
        typeTextUtils.sendText(inputRegisterPassword,text);
        SleeperUtils.threadSleep(1);
    }

    public boolean isCheckSuccesRegisterBtn(){
        return succesRegisterBtn.isEnabled();
    }
}