package loginTests;

import org.junit.Test;
import parentTest.ParentTest;


public class LoginTest extends ParentTest {


    public LoginTest() {
    }

    @Test //аннотацию Junit
    public void validLogOn() {
        actionWithElements.openUrl(" https://test-gov.ald.in.ua/purchases");
        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(loginPage.clickloginPopUp);
        actionWithElements.clickOnElementByLocator(loginPage.clickButtonLogin);
        actionWithElements.enterText(loginPage.fieldEmail, "test.gov.user@yopmail.com");
        actionWithElements.enterText(loginPage.fieldPassword, "123456");
        actionWithElements.clickOnElementByLocator(loginPage.buttonSubmitLogin);
        actionWithElements.isElementPresent(homePage.buttonCreatePurchase);
        actionWithElements.waitABit(5);
        actionWithElements.checkAC("xpath - .//div[@id='myTenders'] not found",
                actionWithElements.isElementPresent(loginPage.NameMyTenders), true);
    }
}
