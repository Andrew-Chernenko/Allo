package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BaseTest.BasePage;
import org.openqa.selenium.support.FindBy;



public class MainPage extends BasePage {

    @FindBy(className = "shopping-cart__count")
    public WebElement Cart;

    @FindBy(name = "search")
    public WebElement searchBox;
    @FindBy(css = "div.page__wrapper.page__wrapper--category div.page__content div.v-catalog.v-сategory:nth-child(3) div.v-catalog__content:nth-child(1) div.v-catalog__products div.products-layout__container.products-layout--grid:nth-child(3) div.products-layout__item:nth-child(1) div.product-card.v-loaded div.product-card__content:nth-child(3) div.product-card__buy-box > button.buy-button.buy-button--primary.buy-button--default.buy-button--cart.buy-button--animation.buy-button--icon")
    public WebElement telephone;
    @FindBy(css = "div.page__wrapper.home.no-close div.v-header div.main-header-wrapper div.main-header-second-line-wrapper > div.v-header__line.v-header__line--second.page-container.main-header-second-line")
    public WebElement header;
    @FindBy(css = "div.page__wrapper.home.no-close div.v-header div.main-header-wrapper div.main-header-first-line-wrapper div.v-header__line.v-header__line--first.page-container.main-header-first-line div.language span:nth-child(2) > div.switcher-toggle")
    public WebElement nightThemeSwitcher;
    @FindBy(css = "body.white-header:nth-child(2) div.page__wrapper.home.no-close div.v-header div.main-header-wrapper div.main-header-first-line-wrapper div.v-header__line.v-header__line--first.page-container.main-header-first-line div.language span:nth-child(2) > div.switcher-toggle")
    public WebElement dayThemeSwitch;
    @FindBy(className = "authentication__button--login")
    public WebElement loginBtn;
    @FindBy(id = "auth")
    public WebElement fieldLogin;
    @FindBy(name = "password")
    public WebElement fieldPassword;
    @FindBy(className = "modal-submit-button")
    public WebElement btnSuccesLogin;
    @FindBy(css = "div.page__wrapper.page__wrapper--category div.page__content div.v-catalog.v-сategory:nth-child(3) div.v-catalog__content:nth-child(1) div.v-catalog__products div.products-layout__container.products-layout--grid:nth-child(3) div.products-layout__item.without-options-1:nth-child(1) div.product-card.v-loaded div.product-card__content:nth-child(3) > a.product-card__title")
    public WebElement refrigeratorBuyBtn;
    @FindBy(css = "div.page__wrapper.page__wrapper--category div.page__content div.v-catalog.v-сategory:nth-child(3) div.v-catalog__content:nth-child(1) div.v-catalog__products div.products-layout__container.products-layout--grid:nth-child(3) div.products-layout__item:nth-child(1) div.product-card.v-loaded div.product-card__content:nth-child(3) > a.product-card__title")
    public WebElement iphoneBuyBtn;
    @FindBy(xpath = "//button[@class='order-now']")
    public WebElement btnOrdering;
    @FindBy(id = "onepage-customer-name")
    public WebElement fieldName;
    @FindBy(name = "telephone")
    public WebElement fielTelephone;
    @FindBy(name = "email")
    public WebElement fieldEmail;
    @FindBy(xpath = "//button[@id='second-step-button']")
    public WebElement btnCheckOut;
    @FindBy(css = "div.page__wrapper.page__wrapper--category div.page__content div.v-catalog.v-сategory:nth-child(3) div.v-catalog__content:nth-child(1) div.v-catalog__products div.products-layout__container.products-layout--grid:nth-child(3) div.products-layout__item.without-options-1:nth-child(1) div.product-card.v-loaded div.product-card__content:nth-child(3) div.product-card__buy-box > button.buy-button.buy-button--primary.buy-button--default.buy-button--cart.buy-button--animation.buy-button--icon")
    public WebElement microwaveBtnBuy;
    @FindBy(className = "forgot-password")
    public WebElement btnRecoveryPassword;
    @FindBy(xpath = "//input[@id='auth']")
    public WebElement btnSendCodeRecoveryPassword;
    @FindBy(id = "auth")
    public WebElement inputRecoveryPassword;
    @FindBy(className = "authentication__button--register")
    public WebElement btnRegister;
    @FindBy(id = "v-register-name")
    public WebElement inputRegisterName;
    @FindBy(name = "telephone")
    public WebElement inputRegisterPhone;
    @FindBy(id = "v-register-email")
    public WebElement inputRegisterEmail;
    @FindBy(name = "password")
    public WebElement inputRegisterPassword;
    @FindBy(className = "modal-submit-button")
    public WebElement succesRegisterBtn;
    @FindBy(css = "div.page__wrapper.home.no-close div.v-header div.main-header-wrapper div.main-header-third-line-wrapper div.v-header__line.v-header__line--third.page-container.main-header-third-line div.main-header__categories div.menu.js-menu.menu--level-1 ul.menu__list.js-menu__list li.menu__item.item.js-item.js-item--active-current-level:nth-child(1) a.item__link > p.item__title.arrow-icon")
    public WebElement firstCategory;
    @FindBy(css = "div.page__wrapper.home.no-close div.v-header div.main-header-wrapper div.main-header-third-line-wrapper div.v-header__line.v-header__line--third.page-container.main-header-third-line div.main-header__categories div.menu.js-menu.menu--level-1 ul.menu__list.js-menu__list li.menu__item.item.js-item.js-item--active-current-level:nth-child(8) a.item__link > p.item__title.arrow-icon")
    public WebElement secondCategory;
    @FindBy(className = "draggable")
    public WebElement checkBoxThemeSwitch;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String takeCartValue() {
        return Cart.getText();
    }

    public void setTelephone() {
        telephone.click();
    }

    public String getHeaderColor() {
        return header.getCssValue("background-color");
    }

    public void swapLanguageNightTheme() {
        nightThemeSwitcher.click();
    }

    public void swapLanguageDayTheme() {
        dayThemeSwitch.click();
    }

    public void setLoginClick() {
        loginBtn.click();
    }

    public void setRefrigeratorBtnClick() {
        refrigeratorBuyBtn.click();
    }

    public void setIphoneBtnClick() {
        iphoneBuyBtn.click();
    }

    public void orderBtnClick() {
        btnOrdering.click();
    }

    public void microwaveBtnClick() {
        microwaveBtnBuy.click();
    }

    public void btnRecoveryPasswordClick() {
        btnRecoveryPassword.click();
    }

    public void registerBtnClick() {
        btnRegister.click();
    }

    public void firstCategoryClick() {
        firstCategory.click();
    }

    public void secondCategoryClick() {
        secondCategory.click();
    }
    public void checkBoxThemeSwitchClick(){
        checkBoxThemeSwitch.click();
    }


//
//

//

//

//

//

//
//
//

//

//

//

//

//

//

//

//

//


//

//

//

//

//

//



}