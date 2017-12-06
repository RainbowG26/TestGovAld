package loginTests;

import org.junit.Test;
import parentTest.ParentTest;

public class InvalidLogOn extends ParentTest {

    //Конструктор - используй вебдрайвер обьект который обьявлен в родителе.
    public InvalidLogOn() {
    }

    @Test
    public void invalidLogOn() {
        actionWithElements.openUrl(" https://test-gov.ald.in.ua/purchases");
        actionWithElements.clickOnElementByLocator(loginPage.clickloginPopUp);
        actionWithElements.clickOnElementByLocator(loginPage.clickButtonLogin);
        actionWithElements.enterText(loginPage.fieldEmail, "test.gov.user@yopmail.com");
        actionWithElements.enterText(loginPage.fieldPassword, "sdfgsdf321");
        actionWithElements.clickOnElementByLocator(loginPage.buttonSubmitLogin);
        actionWithElements.isElementPresent(loginPage.buttonSubmitLogin);
        actionWithElements.waitABit(5);
        actionWithElements.checkAC("xpath './/div[@class = 'panel-body']' not found",
                actionWithElements.isElementPresent(loginPage.PanelBody),true);
        //Assert метод assertTrue который проверяет правильность Actual result
        //метод isDisplayed ждет булевскую переменную True/False показывает и обращается к webDriver
        // !webDriver - инвертирует в обратную сторону True/False False/True //Дописываем сообщение перед webDriver.findElement только при False
        //Assert.assertTrue("Assert work!",webDriver.findElement(By.xpath(".//span[text()='Створити']")).isDisplayed());
    }
}