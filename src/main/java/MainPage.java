import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends DriverBuilder {


    protected void setIphoneForNavigate() {
        driver.findElement(By.cssSelector("div.page__wrapper.page__wrapper--category div.page__content div.v-catalog.v-сategory:nth-child(3) div.v-catalog__content:nth-child(1) div.v-catalog__products div.products-layout__container.products-layout--grid:nth-child(3) div.products-layout__item:nth-child(1) div.product-card.v-loaded div.product-card__content:nth-child(3) > a.product-card__title"))
                .click();
    }

    protected void setRefrigerator() {
        driver.findElement(By.cssSelector("div.page__wrapper.page__wrapper--category div.page__content div.v-catalog.v-сategory:nth-child(3) div.v-catalog__content:nth-child(1) div.v-catalog__products div.products-layout__container.products-layout--grid:nth-child(3) div.products-layout__item.without-options-1:nth-child(1) div.product-card.v-loaded div.product-card__content:nth-child(3) > a.product-card__title"))
                .click();
    }

    protected void setIphone() {
        driver.findElement(By.cssSelector("div.page__wrapper.page__wrapper--category div.page__content div.v-catalog.v-сategory:nth-child(3) div.v-catalog__content:nth-child(1) div.v-catalog__products div.products-layout__container.products-layout--grid:nth-child(3) div.products-layout__item:nth-child(2) div.product-card.v-loaded div.product-card__content:nth-child(3) div.product-card__buy-box > button.buy-button.buy-button--primary.buy-button--default.buy-button--cart.buy-button--animation.buy-button--icon")).click();
    }

    protected void setTelephone() {
        driver.findElement(By.cssSelector("div.page__wrapper.page__wrapper--category div.page__content div.v-catalog.v-сategory:nth-child(3) div.v-catalog__content:nth-child(1) div.v-catalog__products div.products-layout__container.products-layout--grid:nth-child(3) div.products-layout__item:nth-child(1) div.product-card.v-loaded div.product-card__content:nth-child(3) div.product-card__buy-box > button.buy-button.buy-button--primary.buy-button--default.buy-button--cart.buy-button--animation.buy-button--icon"))
                .click();
    }


    protected WebElement searchSearchBox() {
        return driver.findElement(By.name("search"));
    }

    protected String searchHeader() {
        return driver.findElement(By.cssSelector("div.page__wrapper.home.no-close div.v-header div.main-header-wrapper div.main-header-second-line-wrapper > div.v-header__line.v-header__line--second.page-container.main-header-second-line"))
                .getCssValue("background-color");
    }

    protected WebElement searchCheckBox() {
        return driver.findElement(By.className("draggable"));
    }

    protected void swapLanguageNightTheme() {
        driver.findElement(By.cssSelector("div.page__wrapper.home.no-close div.v-header div.main-header-wrapper div.main-header-first-line-wrapper div.v-header__line.v-header__line--first.page-container.main-header-first-line div.language span:nth-child(2) > div.switcher-toggle")).click();
    }

    protected void swapLanguageDayTheme() {
        driver.findElement(By.cssSelector("body.white-header:nth-child(2) div.page__wrapper.home.no-close div.v-header div.main-header-wrapper div.main-header-first-line-wrapper div.v-header__line.v-header__line--first.page-container.main-header-first-line div.language span:nth-child(2) > div.switcher-toggle")).click();
    }

    protected String takeCartValue() {
        return driver.findElement(By.className("shopping-cart__count")).getText();
    }

    protected WebElement searchCategory(int a) {
        if (a == 0) {
            return driver.findElement(By.cssSelector("div.page__wrapper.home.no-close div.v-header div.main-header-wrapper div.main-header-third-line-wrapper div.v-header__line.v-header__line--third.page-container.main-header-third-line div.main-header__categories div.menu.js-menu.menu--level-1 ul.menu__list.js-menu__list li.menu__item.item.js-item.js-item--active-current-level:nth-child(1) a.item__link > p.item__title.arrow-icon"));

        } else {
            return driver.findElement(By.cssSelector("div.page__wrapper.home.no-close div.v-header div.main-header-wrapper div.main-header-third-line-wrapper div.v-header__line.v-header__line--third.page-container.main-header-third-line div.main-header__categories div.menu.js-menu.menu--level-1 ul.menu__list.js-menu__list li.menu__item.item.js-item.js-item--active-current-level:nth-child(8) a.item__link > p.item__title.arrow-icon"));
        }
    }

    protected void orderBtnSearch() {
        driver.findElement(By.xpath("//button[@class='order-now']")).click();
    }

    protected WebElement nameInputSearch() {
        return driver.findElement(By.id("onepage-customer-name"));
    }

    protected WebElement numberInputSearch() {
        return driver.findElement(By.name("telephone"));
    }

    protected WebElement emailInputSearch() {
        return driver.findElement(By.name("email"));
    }

    protected WebElement lastStepBtnSearch() {
        return driver.findElement(By.xpath("//button[@id='second-step-button']"));
    }

    protected void setRegisterClick() {
        driver.findElement(By.className("authentication__button--register")).click();
    }

    protected WebElement setSuccesRegisterBtn() {
        return driver.findElement(By.className("modal-submit-button"));
    }

    protected WebElement setInputRegisterName() {
        return driver.findElement(By.id("v-register-name"));
    }

    protected WebElement setInputRegisterPhone() {
        return driver.findElement(By.name("telephone"));
    }

    protected WebElement setInputRegisterEmail() {
        return driver.findElement(By.id("v-register-email"));
    }

    protected WebElement setInputRegisterPassword() {
        return driver.findElement(By.name("password"));
    }

    protected void setLoginCkick() {
        driver.findElement(By.className("authentication__button--login")).click();
    }

    protected WebElement setInputLogin() {
        return driver.findElement(By.id("auth"));
    }

    protected WebElement setInputPassword() {
        return driver.findElement(By.name("password"));
    }

    protected WebElement setBtnSucces() {
        return driver.findElement(By.className("modal-submit-button"));
    }

    protected void setRecoveryBtn() {
        driver.findElement(By.className("forgot-password")).click();
    }

    protected WebElement setInputRecovery() {
        return driver.findElement(By.xpath("//input[@id='auth']"));
    }

    protected WebElement setBtnRecovery() {
        return driver.findElement(By.className("modal-submit-button"));
    }
}
