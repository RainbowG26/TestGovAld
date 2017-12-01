package TenderTests;

import org.junit.Test;
import parentTest.ParentTest;

public class BelowThresholdTest extends ParentTest {

    @Test
    public void createBelowThreshold() throws Exception {
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
        belowThresholdPage.clickNextStepButton();

        belowThresholdPage.addProcurementSubject0();
        belowThresholdPage.procurementSubjectDescription00("Молоко");
        belowThresholdPage.procurementSubjectQuantity00("1000");
        belowThresholdPage.selectUnit00("NMP");
        belowThresholdPage.clickClassifier212015_();
        belowThresholdPage.searchClassifier212015("03333000-4");
        belowThresholdPage.elementDisplayedClassifierId();
        belowThresholdPage.addClassifier();
        belowThresholdPage.clickOtherClassifier();
        belowThresholdPage.searchOtherClassifier("000");
        belowThresholdPage.elementDisplayedOtherClassifierId();
        belowThresholdPage.addOtherClassifier();
        belowThresholdPage.deliveryTimeStartCalendar(40);
        belowThresholdPage.deliveryTimeEndCalendar(30);
        belowThresholdPage.selectCountries00("1");
        belowThresholdPage.selectRegions00("11");
        belowThresholdPage.inputZipCode00("08500");
        belowThresholdPage.inputLocality00("Київ");
        belowThresholdPage.inputStreet00("вул. Маршала Жукова 45");
        belowThresholdPage.inputCoordinatesLatitude00("23");
        belowThresholdPage.inputCoordinatesLongitude00("89");
        belowThresholdPage.clickUpdate00();
        belowThresholdPage.clickNextStepButton();

        belowThresholdPage.addFeatures0();
        belowThresholdPage.inputFeatureTitle00("Яготинське молоко пастеризоване");
        belowThresholdPage.inputFeatureDescription00("Вироблено в Україні на заводі");
        belowThresholdPage.clickPosition();
        belowThresholdPage.selectFeatureItem00("Молоко");
        belowThresholdPage.clickClearButton();
        belowThresholdPage.inputFeatureEnumTitle000("Початок");
        belowThresholdPage.inputFeatureEnumDescription000("Початок коментару");
        belowThresholdPage.clickAddFeatureEnum00();
        belowThresholdPage.inputFeatureEnumValue001("10");
        belowThresholdPage.inputFeatureEnumTitle001("Початок");
        belowThresholdPage.inputFeatureEnumDescription001("Початок коментару");
        belowThresholdPage.clickUpdateFeature00();

        belowThresholdPage.clickDocumentsTab();
        belowThresholdPage.clickUploadDocument();
        belowThresholdPage.selectCategoryDocument("biddingDocuments");
        belowThresholdPage.selectDocumentFileTo("Tender");
        belowThresholdPage.attachDocumentToTender("DocTender");
    }
}
