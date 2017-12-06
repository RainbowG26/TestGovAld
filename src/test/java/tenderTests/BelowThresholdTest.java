package tenderTests;

import org.junit.Test;
import parentTest.ParentTest;

public class BelowThresholdTest extends ParentTest {

    public BelowThresholdTest() {
    }

    @Test
    public void createBelowThreshold() throws Exception {
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
        actionWithElements.clickOnElementByLocator(homePage.belowThresholdPurchase);

        actionWithElements.enterText(belowThresholdPage.titleOfTenderForEdit, "Тест Допорогова закупівля");
        actionWithElements.enterText(belowThresholdPage.descriptionBelowThreshold, "Тест Допорогова закупівля");
        actionWithElements.setCheckboxState(belowThresholdPage.switchButton, "clicked");
        actionWithElements.selectValueInDropDownByValue(belowThresholdPage.selectCurrencies, "string:UAH");
        actionWithElements.setCheckboxState(belowThresholdPage.switchButtonMultiLot, "unclicked"); //Без лотовый
        actionWithElements.enterText(belowThresholdPage.fieldBudget, "10000");
        actionWithElements.enterText(belowThresholdPage.minStepPricePercentage, "1");
        actionWithElements.inputCalendarDataTime(5);
        actionWithElements.inputCalendarDataTime(10);
        actionWithElements.inputCalendarDataTime(10);
        actionWithElements.inputCalendarDataTime(15);
        actionWithElements.scrollPageDown();
        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(belowThresholdPage.nextStepButton);

        actionWithElements.inputCalendarDataTime(5);
        actionWithElements.clickOnElementByLocator(belowThresholdPage.addProcurementSubject0);
        actionWithElements.enterText(belowThresholdPage.procurementSubjectDescription00, "Молоко");
        actionWithElements.enterText(belowThresholdPage.procurementSubjectQuantity00, "1000");
        actionWithElements.selectValueInDropDownByValue(belowThresholdPage.selectUnit00, "NMP");
        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(belowThresholdPage.classifier212015_);
        actionWithElements.enterText(belowThresholdPage.searchClassifierText, "03333000-4");
        actionWithElements.isElementPresent1(belowThresholdPage.visibleCheckbox);
        actionWithElements.clickOnElementByLocator(belowThresholdPage.addClassifier);
        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(belowThresholdPage.otherClassifier);
        actionWithElements.enterText(belowThresholdPage.searchClassifierText, "000");
        actionWithElements.isElementPresent1(belowThresholdPage.visibleCheckbox);
        actionWithElements.clickOnElementByLocator(belowThresholdPage.addClassifier);
        actionWithElements.inputCalendarDataTime(40);
        actionWithElements.inputCalendarDataTime(30);
        actionWithElements.selectValueInDropDownByValue(belowThresholdPage.select_countries00, "1");
        actionWithElements.selectValueInDropDownByValue(belowThresholdPage.select_regions00, "11");
        actionWithElements.enterText(belowThresholdPage.zip_code_00, "08500");
        actionWithElements.enterText(belowThresholdPage.locality_00, "Київ");
        actionWithElements.enterText(belowThresholdPage.street_00, "вул. Маршала Жукова 45");
        actionWithElements.enterText(belowThresholdPage.coordinatesLatitude00, "23");
        actionWithElements.enterText(belowThresholdPage.сoordinatesLongitude00, "89");
        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(belowThresholdPage.update_00);
        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(belowThresholdPage.nextStepButton);

        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(belowThresholdPage.add_features0);
        actionWithElements.enterText(belowThresholdPage.featureTitle_0_0, "Яготинське молоко пастеризоване");
        actionWithElements.enterText(belowThresholdPage.featureDescription_0_0, "Вироблено в Україні на заводі");
        actionWithElements.scrollPageDown();
        actionWithElements.clickOnElementByLocator(belowThresholdPage.position);
        actionWithElements.selectTextInDropDownByText(belowThresholdPage.featureItem_0_0, "Молоко");
        actionWithElements.clickOnElementByLocator(belowThresholdPage.clearButton);
        actionWithElements.enterText(belowThresholdPage.featureEnumTitle_0_0_0, "Початок");
        actionWithElements.enterText(belowThresholdPage.featureEnumDescription_0_0_0, "Початок коментару");
        actionWithElements.clickOnElementByLocator(belowThresholdPage.addFeatureEnum_0_0);
        actionWithElements.enterText(belowThresholdPage.featureEnumValue_0_0_1, "10");
        actionWithElements.enterText(belowThresholdPage.featureEnumTitle_0_0_1, "Початок");
        actionWithElements.enterText(belowThresholdPage.featureEnumDescription_0_0_1, "Початок коментару");
        actionWithElements.clickOnElementByLocator(belowThresholdPage.updateFeature_0_0);

        actionWithElements.waitABit(5);
        actionWithElements.scrollPageUp();
        actionWithElements.clickOnElementByLocator(belowThresholdPage.documentsTab);
        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(belowThresholdPage.uploadDocument);
        actionWithElements.selectValueInDropDownByValue(belowThresholdPage.categorySelect, "biddingDocuments");
        actionWithElements.selectValueInDropDownByValue(belowThresholdPage.documentOfSelect, "Tender");
        actionWithElements.upLoadFile(belowThresholdPage.buttonAttachDocument, "DocTender");
        actionWithElements.clickOnElementByLocator(belowThresholdPage.saveFile);
        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(belowThresholdPage.movePurchaseView);

        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(belowThresholdPage.publishPurchase);

        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(belowThresholdPage.purchaseECP);

        planPage.workWithImposeECP("Локальні сертифікати", "UserSert", "Key6", "qwerty");

        actionWithElements.waitABit(5);
        actionWithElements.clickOnElementByLocator(belowThresholdPage.publishPurchase);

        actionWithElements.waitABit(5);
        actionWithElements.isElementPresent1(planPage.displayedIDTender);
        belowThresholdPage.findIdTender();
    }
}