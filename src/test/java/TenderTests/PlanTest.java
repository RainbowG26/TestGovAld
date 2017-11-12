package TenderTests;

import org.junit.Test;
import parentTest.ParentTest;

public class PlanTest extends ParentTest{

    @Test
    public void createPlan(){
        loginPage.loginUser("test.gov.user@yopmail.com", "123456");
        planPage.clickButtonCreatePurchase();
        planPage.clickPlanPurchase();
        planPage.inputPlanTitle("Тест Создание Плана закупок");
        planPage.inputPlanDescription("Создание Примечания к Плану закупок");
        planPage.inputPlanBudget("1000");
        planPage.selectCurrenciesDropDown("string:UAH");
        planPage.planStartCalendar();
    }
}
