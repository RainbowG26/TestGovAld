package tenderTests;

import org.junit.Test;
import parentTest.ParentTest;

public class PlanTest extends ParentTest {

    public PlanTest() {
    }

    @Test
    public void createPlan() throws Exception {
        actionWithElements.openUrl(" https://test-gov.ald.in.ua/purchases");
        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(loginPage.clickloginPopUp);
        actionWithElements.clickOnElementByLocator(loginPage.clickButtonLogin);
        actionWithElements.enterText(loginPage.fieldEmail, "test.gov.user@yopmail.com");
        actionWithElements.enterText(loginPage.fieldPassword, "123456");
        actionWithElements.clickOnElementByLocator(loginPage.buttonSubmitLogin);
        actionWithElements.isElementPresent(homePage.buttonCreatePurchase);
        actionWithElements.isElementPresent(loginPage.NameMyTenders);

        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(homePage.buttonCreatePurchase);
        actionWithElements.clickOnElementByLocator(homePage.planPurchase);

        actionWithElements.enterText(planPage.fieldTitle, "Тест Створення Плана закупівель");
        actionWithElements.enterText(planPage.fieldDescription, "Тест Створення Плана закупівель");
        actionWithElements.enterText(planPage.fieldBudget, "1000");
        actionWithElements.selectValueInDropDownByValue(planPage.selectCurrencies, "string:UAH");
        actionWithElements.inputCalendarDataTime(5);
        actionWithElements.selectValueInDropDownByValue(planPage.yearSelect, "number:2017");
        actionWithElements.selectValueInDropDownByValue(planPage.purchaseType, "3");
        actionWithElements.clickOnElementByLocator(planPage.classifier212015);
        actionWithElements.enterText(planPage.searchClassifierText, "30231300-0");
        actionWithElements.isElementPresent1(planPage.visibleCheckbox);
        actionWithElements.clickOnElementByLocator(planPage.addClassifier);
        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(planPage.otherClassifier);
        actionWithElements.enterText(planPage.searchClassifierText, "3121");
        actionWithElements.isElementPresent1(planPage.visibleCheckbox);
        actionWithElements.clickOnElementByLocator(planPage.addClassifier);
        actionWithElements.waitABit(5);
        actionWithElements.scrollPage();
        actionWithElements.clickOnElementByLocator(planPage.kekvClassifier);
        actionWithElements.enterText(planPage.searchClassifierText, "2000");
        actionWithElements.isElementPresent1(planPage.visibleCheckbox);
        actionWithElements.clickOnElementByLocator(planPage.addClassifier);
        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(planPage.saveChangesPlanNextStep);

        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(planPage.addProcurementSubject0);
        actionWithElements.enterText(planPage.procurementSubjectDescription00, "Монітор");
        actionWithElements.enterText(planPage.procurementSubjectQuantity00, "100");
        actionWithElements.selectValueInDropDownByValue(planPage.selectUnit00, "H87");
        actionWithElements.clickOnElementByLocator(planPage.classifier212015_);
        actionWithElements.enterText(planPage.searchClassifierText, "30231300-0");
        actionWithElements.isElementPresent1(planPage.visibleCheckbox);
        actionWithElements.clickOnElementByLocator(planPage.addClassifier);
        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(planPage.btnOtherClassifier);
        actionWithElements.enterText(planPage.searchClassifierText, "000");
        actionWithElements.isElementPresent1(planPage.visibleCheckbox);
        actionWithElements.clickOnElementByLocator(planPage.addClassifier);
        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(planPage.update00);
        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(planPage.movePlanView);
        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(planPage.publishBtn);
        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(planPage.imposeECP);
        actionWithElements.waitABit(5);
        actionWithElements.selectTextInDropDownByText(planPage.selectCSK, "Локальні сертифікати");
        actionWithElements.upLoadFile(planPage.filePathPKCerts, "UserSert");
        actionWithElements.upLoadFile(planPage.filePathPKey, "Key6");
        actionWithElements.enterText(planPage.pKeyPassword, "qwerty");
        actionWithElements.clickOnElementByLocator(planPage.pKeyReadButton);
        actionWithElements.clickOnElement(planPage.signDataButton);
        actionWithElements.waitABit(5);

        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(planPage.publishBtn);

        actionWithElements.isElementPresent1(planPage.displayedIDTender);
    }
}
