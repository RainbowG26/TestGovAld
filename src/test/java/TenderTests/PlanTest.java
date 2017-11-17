package TenderTests;

import org.junit.Test;
import parentTest.ParentTest;

public class PlanTest extends ParentTest {

    @Test
    public void createPlan() {
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
        planPage.isElementClassifierId();
        planPage.addClassifier();
        planPage.clickOtherClassifier();
        planPage.searchOtherClassifier("3121");
        planPage.isElementOtherClassifierId();
    }
}
