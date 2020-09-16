package Pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BasePage.BasePage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage {

    @FindBy(xpath = ".//div[contains(@class,'product-card v-loaded')]")
    private List<WebElement> productCart;

    @FindBy(xpath = ".//span[@class='shopping-cart__count']")
    private WebElement cart;

    @FindBy(xpath = ".//input[@id='search-form__input']")
    private WebElement searchBox;

    @FindBy(xpath = ".//div[@class='main-header-second-line-wrapper']")
    private WebElement header;

    @FindBy(xpath = ".//div[@class='language']//div[@class='switcher-toggle']")
    private WebElement languageSwitch;

    @FindBy(xpath = ".//div[@class='user-block-authentication']//*[local-name()='svg']")
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

    @FindBy(xpath = ".//li[@class='login-tab']")
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

    @FindBy(xpath = ".//p[contains(text(),'Бытовая техника') or contains( text(), 'Побутова техніка')]")
    private WebElement secondCategory;

    @FindBy(xpath = ".//div[@class='header-theme']//div[@class='switcher-toggle']")
    private WebElement checkBoxThemeSwitch;

    @FindBy(xpath = ".//div[@id='customer-popup-menu']")
    private WebElement loginMenu;

    @FindBy(xpath = ".//form[@id='form-validate-register']")
    private WebElement registerMenu;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String takeCartValue() {
        return cart.getText();
    }

    public String getHeaderColor() {
        String headerColor;
        waitUtils.waitLoadingPage(7);
        headerColor = header.getCssValue("background-color");
        return Color.fromString(headerColor).asHex();
    }

    public void swapLanguageClick() {
        waitUtils.waitElementClickableWithMiddleWait(languageSwitch);
        waitUtils.waitLoadingPage(3);
    }

    public void loginClickBtn() {
        waitUtils.waitElementClickableWithMiddleWait(loginBtn);
        waitUtils.waitElementVisibilityWithMiddleWait(loginMenu);
    }

    public void orderBtnClick() {
        waitUtils.waitElementClickableWithMiddleWait(btnOrdering);
    }

    public void btnRecoveryPasswordClick() {
        btnRecoveryPassword.click();
    }

    public void registerBtnClick() {
        waitUtils.waitElementVisibilityWithMiddleWait(loginBtn);
        loginBtn.click();
        waitUtils.waitElementVisibilityWithMiddleWait(btnRegister);
        btnRegister.click();
        waitUtils.waitElementVisibilityWithMiddleWait(registerMenu);
    }

    public void firstCategoryClick() {
        waitUtils.waitElementClickableWithMiddleWait(firstCategory);
        waitUtils.waitLoadingPage(7);
    }

    public void secondCategoryClick() {
        waitUtils.waitElementClickableWithMiddleWait(secondCategory);
        waitUtils.waitLoadingPage(7);
    }

    public void checkBoxThemeSwitchClick() {
        checkBoxThemeSwitch.click();
        waitUtils.waitLoadingPage(7);
    }

    public void doSearch(String text) {
        waitUtils.waitElementClickableWithMiddleWait(searchBox);
        typeTextUtils.sendText(searchBox,text);
        typeTextUtils.pushKeys(searchBox,Keys.ENTER);
        waitUtils.waitVisibilityAllElementsWithMaximumWait(productCart);
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

    public void setFieldNameOnOrdering(String text) {
        waitUtils.waitElementVisibilityWithMiddleWait(fieldName);
        typeTextUtils.sendText(fieldName,text);
    }

    public void setFieldTelephoneOnOrdering(String text) {
        waitUtils.waitElementVisibilityWithMiddleWait(fieldTelephone);
        typeTextUtils.sendText(fieldTelephone,text);
    }

    public void setFieldEmailOnOrdering(String text) {
        waitUtils.waitElementVisibilityWithMiddleWait(fieldEmail);
        typeTextUtils.sendText(fieldEmail,text);
    }

    public boolean isCheckBtnCheckOut(){
        waitUtils.waitElementVisibilityWithMiddleWait(btnCheckOut);
        return btnCheckOut.isEnabled();
    }

    public void setInputRecoveryPassword(String text) {
        typeTextUtils.sendText(inputRecoveryPassword,text);
    }

    public boolean isCheckBtnSendCodeRecoveryPassword(){
        return btnSendCodeRecoveryPassword.isEnabled();
    }

    public void setInputRegisterName(String text) {
        typeTextUtils.sendText(inputRegisterName,text);
    }

    public void setInputRegisterPhone(String text) {
        typeTextUtils.sendText(inputRegisterPhone,text);
    }

    public void setInputRegisterEmail(String text) {
        typeTextUtils.sendText(inputRegisterEmail,text);
    }

    public void setInputRegisterPassword(String text) {
        typeTextUtils.sendText(inputRegisterPassword,text);
    }

    public boolean isCheckSuccesRegisterBtn(){
        return succesRegisterBtn.isEnabled();
    }
}