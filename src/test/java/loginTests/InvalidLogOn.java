package loginTests;

import org.junit.Test;
import parentTest.ParentTest;

public class InvalidLogOn extends ParentTest {

    //Конструктор - используй вебдрайвер обьект который обьявлен в родителе.
    public InvalidLogOn() {
    }

    @Test
    public void invalidLogOn() {
        loginPage.openLoginPage();
        loginPage.clickloginPopUpWindow();
        loginPage.clickButtonLoginForm();
        loginPage.enterLoginToInput("fjghskbv37284@yopmail.com");
        loginPage.enterPasswordToInput("qwerty123");
        loginPage.clickOnSubmitButton();
        loginPage.xpathPresentInvalidLogOn();
        checkAC("Locator './/div[@class = 'panel-body']' not found",
                loginPage.isPanelBodyPresent(),true);
        //Assert метод assertTrue который проверяет правильность Actual result
        //метод isDisplayed ждет булевскую переменную True/False показывает и обращается к webDriver
        // !webDriver - инвертирует в обратную сторону True/False False/True //Дописываем сообщение перед webDriver.findElement только при False
        //Assert.assertTrue("Assert work!",webDriver.findElement(By.xpath(".//span[text()='Створити']")).isDisplayed());
    }
}