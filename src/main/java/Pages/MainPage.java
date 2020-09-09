package Pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BasePage.BasePage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import utils.SleeperUtils;

public class MainPage extends BasePage {

    @FindBy(className = "shopping-cart__count")
    private WebElement cart;

    @FindBy(name = "search")
    private WebElement searchBox;

    @FindBy(css = "div.page__wrapper.page__wrapper--category div.page__content div.v-catalog.v-сategory:nth-child(3) div.v-catalog__content:nth-child(1) div.v-catalog__products div.products-layout__container.products-layout--grid:nth-child(3) div.products-layout__item:nth-child(1) div.product-card.v-loaded div.product-card__content:nth-child(3) div.product-card__buy-box > button.buy-button.buy-button--primary.buy-button--default.buy-button--cart.buy-button--animation.buy-button--icon")
    private WebElement telephone;

    @FindBy(css = "div.page__wrapper.home.no-close div.v-header div.main-header-wrapper div.main-header-second-line-wrapper > div.v-header__line.v-header__line--second.page-container.main-header-second-line")
    private WebElement header;

    @FindBy(css = "div.page__wrapper.home.no-close div.v-header div.main-header-wrapper div.main-header-first-line-wrapper div.v-header__line.v-header__line--first.page-container.main-header-first-line div.language span:nth-child(2) > div.switcher-toggle")
    private WebElement nightThemeSwitcher;

    @FindBy(css = "body.white-header:nth-child(2) div.page__wrapper.home.no-close div.v-header div.main-header-wrapper div.main-header-first-line-wrapper div.v-header__line.v-header__line--first.page-container.main-header-first-line div.language span:nth-child(2) > div.switcher-toggle")
    private WebElement dayThemeSwitch;

    @FindBy(className = "authentication__button--login")
    private WebElement loginBtn;

    @FindBy(id = "auth")
    private WebElement fieldLogin;

    @FindBy(name = "password")
    private WebElement fieldPassword;

    @FindBy(className = "modal-submit-button")
    private WebElement btnSuccesLogin;

    @FindBy(css = "div.page__wrapper.page__wrapper--category div.page__content div.v-catalog.v-сategory:nth-child(3) div.v-catalog__content:nth-child(1) div.v-catalog__products div.products-layout__container.products-layout--grid:nth-child(3) div.products-layout__item.without-options-1:nth-child(1) div.product-card.v-loaded div.product-card__content:nth-child(3) > a.product-card__title")
    private WebElement refrigeratorBuyBtn;

    @FindBy(css = "div.page__wrapper.page__wrapper--category div.page__content div.v-catalog.v-сategory:nth-child(3) div.v-catalog__content:nth-child(1) div.v-catalog__products div.products-layout__container.products-layout--grid:nth-child(3) div.products-layout__item:nth-child(1) div.product-card.v-loaded div.product-card__content:nth-child(3) > a.product-card__title")
    private WebElement iphoneBuyBtn;

    @FindBy(xpath = "//button[@class='order-now']")
    private WebElement btnOrdering;

    @FindBy(id = "onepage-customer-name")
    private WebElement fieldName;

    @FindBy(name = "telephone")
    private WebElement fieldTelephone;

    @FindBy(name = "email")
    private WebElement fieldEmail;

    @FindBy(xpath = "//button[@id='second-step-button']")
    private WebElement btnCheckOut;

    @FindBy(css = "div.page__wrapper.page__wrapper--category div.page__content div.v-catalog.v-сategory:nth-child(3) div.v-catalog__content:nth-child(1) div.v-catalog__products div.products-layout__container.products-layout--grid:nth-child(3) div.products-layout__item.without-options-1:nth-child(1) div.product-card.v-loaded div.product-card__content:nth-child(3) div.product-card__buy-box > button.buy-button.buy-button--primary.buy-button--default.buy-button--cart.buy-button--animation.buy-button--icon")
    private WebElement microwaveBtnBuy;

    @FindBy(className = "forgot-password")
    private WebElement btnRecoveryPassword;

    @FindBy(xpath = "//input[@id='auth']")
    private WebElement btnSendCodeRecoveryPassword;

    @FindBy(id = "auth")
    private WebElement inputRecoveryPassword;

    @FindBy(className = "authentication__button--register")
    private WebElement btnRegister;

    @FindBy(id = "v-register-name")
    private WebElement inputRegisterName;

    @FindBy(name = "telephone")
    private WebElement inputRegisterPhone;

    @FindBy(id = "v-register-email")
    private WebElement inputRegisterEmail;

    @FindBy(name = "password")
    private WebElement inputRegisterPassword;

    @FindBy(className = "modal-submit-button")
    private WebElement succesRegisterBtn;

    @FindBy(css = "div.page__wrapper.home.no-close div.v-header div.main-header-wrapper div.main-header-third-line-wrapper div.v-header__line.v-header__line--third.page-container.main-header-third-line div.main-header__categories div.menu.js-menu.menu--level-1 ul.menu__list.js-menu__list li.menu__item.item.js-item.js-item--active-current-level:nth-child(1) a.item__link > p.item__title.arrow-icon")
    private WebElement firstCategory;

    @FindBy(css = "div.page__wrapper.home.no-close div.v-header div.main-header-wrapper div.main-header-third-line-wrapper div.v-header__line.v-header__line--third.page-container.main-header-third-line div.main-header__categories div.menu.js-menu.menu--level-1 ul.menu__list.js-menu__list li.menu__item.item.js-item.js-item--active-current-level:nth-child(8) a.item__link > p.item__title.arrow-icon")
    private WebElement secondCategory;

    @FindBy(className = "draggable")
    private WebElement checkBoxThemeSwitch;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String takeCartValue() {
        return cart.getText();
    }

    public void telephoneBtnClick() throws InterruptedException {
        telephone.click();
        SleeperUtils.threadSleep(4);
    }

    public String getHeaderColor() {
        String headerColor;
        headerColor = header.getCssValue("background-color");
        return Color.fromString(headerColor).asHex();
    }

    public void swapLanguageNightThemeClick() {
        nightThemeSwitcher.click();
    }

    public void swapLanguageDayThemeClick() {
        dayThemeSwitch.click();
    }

    public void loginClickBtn() throws InterruptedException {
        loginBtn.click();
        SleeperUtils.threadSleep(1);
    }

    public void refrigeratorBtnClick() {
        refrigeratorBuyBtn.click();
    }

    public void iphoneBtnClick() {
        iphoneBuyBtn.click();
    }

    public void orderBtnClick() throws InterruptedException {
        btnOrdering.click();
        SleeperUtils.threadSleep(4);
    }

    public void microwaveBtnClick() throws InterruptedException {
        microwaveBtnBuy.click();
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