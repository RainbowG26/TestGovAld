package pagesBuyer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage {

    public LoginPage(WebDriver driver) { //Мы передадим webDriver там где мы создаем/тестов
        super(driver); //его мы передадим в родительский класс ParentPage
    }

    @FindBy(id = "liLoginNoAuthenticated")
    private WebElement clickloginPopUp;

    @FindBy(id = "butLoginPartial")
    private WebElement clickButtonLogin;

    @FindBy(id = "Email")
    private WebElement fieldEmail;

    @FindBy(id = "Password")
    private WebElement fieldPassword;

    @FindBy(id = "submitLogin")
    private WebElement buttonSubmitLogin;

    @FindBy(id = "btn_create_purchase")
    private WebElement buttonCreatePurchase;

    @FindBy(id = "myTenders")
    private WebElement NameMyTenders;

    @FindBy(xpath = ".//div[@class = 'panel-body']")
    private WebElement PanelBody;

    public void openLoginPage() {
        //Вызов метода open который открывает url
        open(" https://test-gov.ald.in.ua/purchases");
    }

    /**
     * Method that will pass click Pop-up window
     */

    public void clickloginPopUpWindow() {
        actionWithOurElements.clickOnElement(clickloginPopUp);
    }

    public void clickButtonLoginForm() {
        actionWithOurElements.clickOnElement(clickButtonLogin);
    }

    public void enterLoginToInput(String login) {
        actionWithOurElements.enterText(fieldEmail, login);
        /**
         try {
         fieldEmail.sendKeys(login);
         webDriver.findElement(By.xpath(".//*[@id='Email']")).sendKeys(login);
         logger.info(login + " was inputted into Input Login");
         } catch (Exception e) {
         logger.error("Can not work with input");
         Assert.fail("Can not work with input");
         }
         }
         **/
    }

    public void enterPasswordToInput(String password) { //метод который будет передавать пароль
        actionWithOurElements.enterText(fieldPassword, password);
    }

    public void clickOnSubmitButton() {
        actionWithOurElements.clickOnElement(buttonSubmitLogin);
    }

    public boolean isElementWithXpathPresent() { //метод возвращает есть ли элемент на этой странице
        return actionWithOurElements.isElementPresent(buttonCreatePurchase);
    }

    public boolean xpathPresentInvalidLogOn() {
        return actionWithOurElements.isElementPresent(buttonSubmitLogin);
    }

    public boolean isNameMyTenderPresent() {
        return actionWithOurElements.isElementPresent(NameMyTenders);
    }

    public boolean isPanelBodyPresent() {
        return actionWithOurElements.isElementPresent(PanelBody);
    }

    public void loginUser(String login, String password) {
        openLoginPage();
        utils.waitABit(5);
        clickloginPopUpWindow();
        clickButtonLoginForm();
        enterLoginToInput(login);
        enterPasswordToInput(password);
        clickOnSubmitButton();
        isElementWithXpathPresent();
        isNameMyTenderPresent();
    }
}
