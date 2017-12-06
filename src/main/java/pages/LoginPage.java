package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage {

    public LoginPage(WebDriver driver) { //Мы передадим webDriver там где мы создаем/тестов
        super(driver); //его мы передадим в родительский класс ParentPage
    }

    @FindBy(xpath = ".//li[@id='liLoginNoAuthenticated']")
    public WebElement clickloginPopUp;

    @FindBy(xpath = ".//a[@id='butLoginPartial']")
    public WebElement clickButtonLogin;

    @FindBy(xpath = ".//input[@id='Email']")
    public WebElement fieldEmail;

    @FindBy(xpath = ".//input[@id='Password']")
    public WebElement fieldPassword;

    @FindBy(xpath = ".//button[@id='submitLogin']")
    public WebElement buttonSubmitLogin;

    @FindBy(xpath = ".//div[@id='myTenders']")
    public WebElement NameMyTenders;

    @FindBy(xpath = ".//div[@class = 'panel-body']")
    public WebElement PanelBody;
}
