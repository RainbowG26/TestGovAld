package loginTests;

import org.junit.Test;
import parentTest.ParentTest;


public class LoginTest1 extends ParentTest {


    @Test //аннотацию Junit
    public void validLogOn() {
        loginPage.openLoginPage();
        loginPage.clickloginPopUpWindow();
        loginPage.clickButtonLoginForm();
        loginPage.enterLoginToInput("test.gov.user@yopmail.com");
        loginPage.enterPasswordToInput("123456");
        loginPage.clickOnSubmitButton();
        loginPage.isElementWithXpathPresent();
        checkAC("id = 'myTenders' not found",
                loginPage.isNameMyTenderPresent(), true);
    }
}
