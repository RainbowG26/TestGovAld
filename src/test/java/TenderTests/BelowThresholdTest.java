package TenderTests;

import org.junit.Test;
import parentTest.ParentTest;

public class BelowThresholdTest extends ParentTest{

    @Test
    public void createBelowThreshold(){
        loginPage.loginUser("test.gov.user@yopmail.com", "123456");
        homePage.clickButtonCreatePurchase();
        homePage.clickBelowThresholdPurchase();
        belowThresholdPage.inputTitle("Тест Допорогова закупівля");
        belowThresholdPage.inputDescription("Тест Допорогова закупівля");
        belowThresholdPage.clickSwitchButton();
        belowThresholdPage.selectCurrenciesDropDown("string:UAH");
        belowThresholdPage.clickSwitchButtonMultiLot();
        belowThresholdPage.inputBudget("10000");
        belowThresholdPage.inputMinStepPricePercentage("1");
        belowThresholdPage.periodEnquiryStartCalendar(5);
        belowThresholdPage.periodEnquiryEndCalendar(10);
        belowThresholdPage.periodEnquiryStartSubmissionOfTenderProposals(10);
        belowThresholdPage.periodEnquiryEndSubmissionOfTenderProposals(15);
    }
}
