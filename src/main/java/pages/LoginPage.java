package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage {

    public LoginPage(WebDriver driver) { //Мы передадим webDriver там где мы создаем/тестов
        super(driver); //его мы передадим в родительский класс ParentPage
    }

    @FindBy(id = "liLoginNoAuthenticated")
    public WebElement clickloginPopUp;

    @FindBy(id = "butLoginPartial")
    public WebElement clickButtonLogin;

    @FindBy(id = "Email")
    public WebElement fieldEmail;

    @FindBy(id = "Password")
    public WebElement fieldPassword;

    @FindBy(id = "submitLogin")
    public WebElement buttonSubmitLogin;

    @FindBy(id = "btn_create_purchase")
    public WebElement buttonCreatePurchase;

    @FindBy(id = "myTenders")
    public WebElement NameMyTenders;

    @FindBy(xpath = ".//div[@class = 'panel-body']")
    public WebElement PanelBody;
}
