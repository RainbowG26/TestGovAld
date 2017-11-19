package TenderTests;

import org.junit.Test;
import parentTest.ParentTest;

public class PlanTest extends ParentTest {

    @Test
    public void createPlan() throws Exception {
        loginPage.loginUser("test.gov.user@yopmail.com", "123456");
        planPage.clickButtonCreatePurchase();
        planPage.clickPlanPurchase();
        planPage.inputPlanTitle("Тест Создание Плана закупок");
        planPage.inputPlanDescription("Создание Примечания к Плану закупок");
        planPage.inputPlanBudget("1000");
        planPage.selectCurrenciesDropDown("string:UAH");
        planPage.planStartCalendar();
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
        planPage.procurementSubjectDescription00("Монитор");
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
    }
}
