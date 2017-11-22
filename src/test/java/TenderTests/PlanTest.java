package TenderTests;

import libs.Fff;
import org.junit.Test;
import parentTest.ParentTest;

public class PlanTest extends ParentTest {

    @Test
    public void createPlan() throws Exception {
        loginPage.loginUser("test.gov.user@yopmail.com", "123456");
        planPage.clickButtonCreatePurchase();
        planPage.clickPlanPurchase();
        planPage.inputPlanTitle("Тест Створення Плана закупівель");
        planPage.inputPlanDescription("Тест Створення Плана закупівель");
        planPage.inputPlanBudget("1000");
        planPage.selectCurrenciesDropDown("string:UAH");
        planPage.planStartCalendar(2);
        planPage.selectYear("number:2017");
        planPage.selectPurchaseType("3");
        planPage.clickClassifier212015();
        planPage.searchClassifier212015("30000000-9");
        planPage.elementPresentClassifierId();
        planPage.addClassifier();
        planPage.clickOtherClassifier();
        planPage.searchOtherClassifier("3121");
        planPage.elementPresentOtherClassifierId();
        planPage.addOtherClassifier();
        planPage.clickKekvClassifier();
        planPage.searchKekvClassifier("2000");
        planPage.elementPresentKekvClassifier();
        planPage.addKekvClassifier();
        planPage.saveChangesPlanNextStep();

        planPage.addProcurementSubject0();
        planPage.procurementSubjectDescription00("Монітор");
        planPage.procurementSubjectQuantity00("100");
        planPage.selectUnit00("H87");
        planPage.clickClassifier212015_();
        planPage.searchClassifier212015("30000000-9");
        planPage.elementPresentClassifierId();
        planPage.addClassifier();
        planPage.btnOtherClassifier();
        planPage.searchOtherClassifier("000");
        planPage.elementPresentOtherClassifierId();
        planPage.addClassifier();
        planPage.clickUpdate00();
        planPage.btnMovePlanView();

        planPage.publishBtn();

        planPage.imposeECP();
        planPage.selectCSK("Локальні сертифікати");
        planPage.choosePKCertsButton();

        planPage.uploadFile(Fff.ECP);
    }
}
