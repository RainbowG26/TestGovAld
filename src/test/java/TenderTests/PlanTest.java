package TenderTests;

import libs.ActionWithOurElements;
import org.junit.Test;
import pagesBuyer.PlanPage;
import parentTest.ParentTest;

public class PlanTest extends ParentTest {

    PlanPage planPage = new PlanPage(webDriver);
    public ActionWithOurElements actionWithOurElements;

    @Test
    public void createPlan() throws Exception {
        loginPage.loginUser("test.gov.user@yopmail.com", "123456");
        homePage.clickButtonCreatePurchase();
        homePage.clickPlanPurchase();
        planPage.inputTitle("Тест Створення Плана закупівель");
        actionWithOurElements.enterText(planPage.fieldTitle, "Тест Створення Плана закупівель");
        planPage.inputDescription("Тест Створення Плана закупівель");
        planPage.inputBudget("1000");
        planPage.selectCurrenciesDropDown("string:UAH");
        planPage.planStartCalendar(2);
        planPage.selectYear("number:2017");
        planPage.selectPurchaseType("3");
        planPage.clickClassifier212015();
        planPage.searchClassifier212015("30231300-0");
        planPage.elementDisplayedClassifierId();
        planPage.addClassifier();
        planPage.clickOtherClassifier();
        planPage.searchOtherClassifier("3121");
        planPage.elementDisplayedOtherClassifierId();
        planPage.addOtherClassifier();
        planPage.clickKekvClassifier();
        planPage.searchKekvClassifier("2000");
        planPage.elementDisplayedKekvClassifier();
        planPage.addKekvClassifier();
        planPage.saveChangesPlanNextStep();

        planPage.addProcurementSubject0();
        planPage.procurementSubjectDescription00("Монітор");
        planPage.procurementSubjectQuantity00("100");
        planPage.selectUnit00("H87");
        planPage.clickClassifier212015_();
        planPage.searchClassifier212015("30231300-0");
        planPage.elementDisplayedClassifierId();
        planPage.addClassifier();
        planPage.btnOtherClassifier();
        planPage.searchOtherClassifier("000");
        planPage.elementDisplayedOtherClassifierId();
        planPage.addClassifier();
        planPage.clickUpdate00();
        planPage.movePlanView();

        planPage.publishBtn();

        planPage.imposeECP();
        planPage.selectCSK("Локальні сертифікати");
        planPage.downloadFileUserSert("UserSert");
        planPage.downloadFilePKey("Key6");
        planPage.inputPKeyPassword("qwerty");
        planPage.clickPKeyReadButton();
        planPage.clickSignDataButton();

        planPage.publishBtn();

        planPage.elementDisplayedIDTender();
    }
}
