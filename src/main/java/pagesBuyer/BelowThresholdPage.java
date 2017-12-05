package pagesBuyer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class BelowThresholdPage extends ParentPage {


    public BelowThresholdPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "titleOfTenderForEdit")
    private WebElement titleOfTenderForEdit;

    @FindBy(id = "description")
    private WebElement descriptionBelowThreshold;

    @FindBy(id = "is_vat")
    private WebElement switchButton;

    @FindBy(id = "select_currencies")
    private WebElement selectCurrencies;

    @FindBy(id = "is_multilot")
    private WebElement switchButtonMultiLot;

    @FindBy(id = "budget")
    private WebElement fieldBudget;

    @FindBy(id = "min_step_percentage")
    private WebElement minStepPricePercentage;

    @FindBy(xpath = ".//button[@id = 'next_step' and @class = 'btn btn-success']")
    private WebElement nextStepButton;

    @FindBy(xpath = ".//button[@class='btn btn-primary ng-scope']")
    private WebElement addProcurementSubject0;

    @FindBy(xpath = ".//input[@class='form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']")
    private WebElement procurementSubjectDescription00;

    @FindBy(xpath = ".//input[@class='form-control ng-pristine ng-untouched ng-isolate-scope ng-empty ng-invalid ng-invalid-required ng-valid-pattern']")
    private WebElement procurementSubjectQuantity00;

    @FindBy(xpath = ".//select[@class='form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']")
    private WebElement selectUnit00;

    @FindBy(id = "cls_click_")
    private WebElement cls_click_;

    @FindBy(id = "search-classifier-text")
    private WebElement searchClassifierText;

    @FindBy(xpath = ".//*[contains(@id,'anchor')]")
    private WebElement visibleCheckbox;

    @FindBy(id = "add-classifier")
    private WebElement addClassifier;

    @FindBy(xpath = ".//button[@itemid = 'otherClassifier']")
    private WebElement otherClassifier;

    @FindBy(xpath = ".//select[@ng-model = 'ngModelCountry']")
    private WebElement select_countries00;

    @FindBy(xpath = ".//select[@ng-model = 'ngModelRegion']")
    private WebElement select_regions00;

    @FindBy(xpath = ".//input[@ng-model = 'procurementSubject.address.zipCode']")
    private WebElement zip_code_00;

    @FindBy(xpath = ".//input[@ng-model ='procurementSubject.address.locality']")
    private WebElement locality_00;

    @FindBy(xpath = ".//input[@ng-model = 'procurementSubject.address.street']")
    private WebElement street_00;

    @FindBy(xpath = ".//input[@ng-model = 'procurementSubject.address.latutide']")
    private WebElement latutide_00; //latitude

    @FindBy(xpath = ".//input[@ng-model = 'procurementSubject.address.longitude']")
    private WebElement longitude_00;

    @FindBy(xpath = ".//button[@class='btn btn-success ng-scope']")
    private WebElement update_00;

    @FindBy(xpath = ".//button[@class='btn btn-primary']")
    private WebElement cancelProcurementSubject00;

    @FindBy(xpath = ".//a[@class='btn btn-default hgreen']")
    private WebElement editProcurementsSubject00;

    @FindBy(xpath = ".//a[@class='btn btn-default ng-scope']")
    private WebElement deleteConfirmProcurementSubject00;

    @FindBy(id = "add_features0")
    private WebElement add_features0;

    @FindBy(xpath = ".//input[@ng-model = 'features.title']")
    private WebElement featureTitle_0_0;

    @FindBy(xpath = ".//input[@ng-model ='features.description']")
    private WebElement featureDescription_0_0;

    @FindBy(xpath = ".//label[@for = 'featureOf_0_0']")
    private WebElement position;

    @FindBy(xpath = ".//select[@ng-model = 'features.relatedItemGuid']")
    private WebElement featureItem_0_0;

    @FindBy(xpath = ".//button[@class = 'btn btn-sm btn-danger ng-scope']")
    private WebElement clearButton;

    @FindBy(xpath = ".//input[@ng-model = 'featureEnum.title']")
    private WebElement featureEnumTitle_0_0_0;

    @FindBy(xpath = ".//input[@ng-model = 'featureEnum.description']")
    private WebElement featureEnumDescription_0_0_0;

    @FindBy(xpath = ".//button[@ng-click= 'addFeatureEnum(lotPurchasePlan, features)']")
    private WebElement addFeatureEnum_0_0;

    @FindBy(xpath = ".//input[@ng-model='featureEnum.value' and @class = 'form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required ng-valid-pattern']")
    private WebElement featureEnumValue_0_0_1;

    @FindBy(xpath = ".//input[@ng-model = 'featureEnum.title' and @class='form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']")
    private WebElement featureEnumTitle_0_0_1;

    @FindBy(xpath = ".//input[@ng-model = 'featureEnum.description' and @class='form-control ng-pristine ng-untouched ng-valid ng-empty']")
    private WebElement featureEnumDescription_0_0_1;

    @FindBy(xpath = ".//button[@ng-click = 'deleteFeatureEnum(lotPurchasePlan, features, featureEnum); validateWeight(lotPurchasePlan, features)']")
    private WebElement deleteFeatureEnum;

    @FindBy(xpath = ".//button[@id = 'updateFeature_0_0' and @class = 'btn btn-success']")
    private WebElement updateFeature_0_0;

    @FindBy(id = "documents-tab")
    private WebElement documentsTab;

    @FindBy(id = "upload_document")
    private WebElement uploadDocument;

    @FindBy(id = "categorySelect")
    private WebElement categorySelect;

    @FindBy(id = "documentOfSelect")
    private WebElement documentOfSelect;

    @FindBy(xpath = ".//input[@id = 'fileInput' and @type = 'file']")
    private WebElement buttonAttachDocument;

    @FindBy(id = "save_file")
    private WebElement saveFile;

    @FindBy(id = "movePurchaseView")
    private WebElement movePurchaseView;

    @FindBy(id = "publishPurchase")
    private WebElement publishPurchase;

    @FindBy(xpath = ".//button[@ng-if = 'purchase.purchaseControl.ecpBtn']")
    private WebElement purchaseECP;

    @FindBy(xpath = ".//*[@id='purchaseProzorroId']")
    private WebElement purchaseProzorroId;

    public void inputTitle(String text) {
        actionWithOurElements.enterText(titleOfTenderForEdit, text);
    }

    public void inputDescription(String text) {
        actionWithOurElements.enterText(descriptionBelowThreshold, text);
    }

    public void clickSwitchButton() {
        utils.waitABit(5);
        actionWithOurElements.setCheckboxState(switchButton, "clicked");
    }

    public void selectCurrenciesDropDown(String valueOfType) {
        actionWithOurElements.selectValueInDropDownByValue(selectCurrencies, valueOfType);
    }

    public void clickSwitchButtonMultiLot() {
        actionWithOurElements.setCheckboxState(switchButtonMultiLot, "unclicked");
    }

    public void inputBudget(String price) {
        actionWithOurElements.enterText(fieldBudget, price);
    }

    public void inputMinStepPricePercentage(String price) {
        actionWithOurElements.enterText(minStepPricePercentage, price);
    }

    public void periodEnquiryStartCalendar(int minute) {
        actionWithOurElements.inputCalendarDataTime(minute);
    }

    public void periodEnquiryEndCalendar(int minute) {
        actionWithOurElements.inputCalendarDataTime(minute);
    }

    public void periodEnquiryStartSubmissionOfTenderProposals(int minute) {
        actionWithOurElements.inputCalendarDataTime(minute);
    }

    public void periodEnquiryEndSubmissionOfTenderProposals(int minute) {
        actionWithOurElements.inputCalendarDataTime(minute);
    }

    public void clickNextStepButton() {
        utils.scrollPageDown();
        utils.waitABit(5);
        actionWithOurElements.clickOnElementByLocator(nextStepButton);
    }

    public void addProcurementSubject0() {
        utils.waitABit(5);
        actionWithOurElements.clickOnElementByLocator(addProcurementSubject0);
    }

    public void procurementSubjectDescription00(String text) {
        actionWithOurElements.enterText(procurementSubjectDescription00, text);
    }

    public void procurementSubjectQuantity00(String number) {
        actionWithOurElements.enterText(procurementSubjectQuantity00, number);
    }

    public void selectUnit00(String valueOfType) {
        actionWithOurElements.selectValueInDropDownByValue(selectUnit00, valueOfType);
    }

    public void clickClassifier212015_() {
        actionWithOurElements.clickOnElement(cls_click_);
    }

    public void searchClassifier212015(String number) {
        actionWithOurElements.enterText(searchClassifierText, number);
    }

    public void elementDisplayedClassifierId() throws Exception {
        actionWithOurElements.isElementPresent1(visibleCheckbox);
    }

    public void addClassifier() {
        actionWithOurElements.clickOnElement(addClassifier);
    }

    public void clickOtherClassifier() {
        utils.waitABit(5); //Метод waitABit Static, он напрямую вызывается без приложения к конкретному объекту этого класса
        actionWithOurElements.clickOnElementByLocator(otherClassifier);
    }

    public void searchOtherClassifier(String number) {
        actionWithOurElements.enterText(searchClassifierText, number);
    }

    public void elementDisplayedOtherClassifierId() throws Exception {
        actionWithOurElements.isElementPresent1(visibleCheckbox);
    }

    public void addOtherClassifier() {
        actionWithOurElements.clickOnElement(addClassifier);
    }

    public void deliveryTimeStartCalendar(int minute) {
        actionWithOurElements.inputCalendarDataTime(minute);
    }

    public void deliveryTimeEndCalendar(int day) {
        actionWithOurElements.inputCalendarDataTime(day);
    }

    public void selectCountries00(String valueOfType) {
        utils.waitABit(5);
        actionWithOurElements.selectValueInDropDownByValue(select_countries00, valueOfType);
    }

    public void selectRegions00(String valueOfType) {
        utils.waitABit(5);
        actionWithOurElements.selectValueInDropDownByValue(select_regions00, valueOfType);
    }

    public void inputZipCode00(String zipCode) {
        actionWithOurElements.enterText(zip_code_00, zipCode);
    }

    public void inputLocality00(String location) {
        actionWithOurElements.enterText(locality_00, location);
    }

    public void inputStreet00(String street) {
        actionWithOurElements.enterText(street_00, street);
    }

    public void inputCoordinatesLatitude00(String latitude) {
        actionWithOurElements.enterText(latutide_00, latitude);
    }

    public void inputCoordinatesLongitude00(String longitude) {
        actionWithOurElements.enterText(longitude_00, longitude);
    }

    public void clickUpdate00() throws Exception {
        utils.scrollPageDown();
        utils.waitABit(5);
        actionWithOurElements.clickOnElementByLocator(update_00);
    }

    public void addFeatures0() {
        utils.waitABit(5);
        actionWithOurElements.clickOnElement(add_features0);
    }


    public void inputFeatureTitle00(String text) {
        actionWithOurElements.enterText(featureTitle_0_0, text);
    }

    public void inputFeatureDescription00(String text) {
        actionWithOurElements.enterText(featureDescription_0_0, text);
    }

    public void clickPosition() {
        actionWithOurElements.clickOnElementByLocator(position);
    }

    public void selectFeatureItem00(String valueOfType) {
        actionWithOurElements.selectTextInDropDownByText(featureItem_0_0, valueOfType);
    }

    public void clickClearButton() {
        utils.scrollPageDown();
        actionWithOurElements.clickOnElementByLocator(clearButton);
    }

    public void inputFeatureEnumTitle000(String text) {
        actionWithOurElements.enterText(featureEnumTitle_0_0_0, text);
    }

    public void inputFeatureEnumDescription000(String text) {
        actionWithOurElements.enterText(featureEnumDescription_0_0_0, text);
    }

    public void clickAddFeatureEnum00() {
        actionWithOurElements.clickOnElementByLocator(addFeatureEnum_0_0);
    }

    public void inputFeatureEnumValue001(String number) {
        actionWithOurElements.enterText(featureEnumValue_0_0_1, number);
    }

    public void inputFeatureEnumTitle001(String text) {
        actionWithOurElements.enterText(featureEnumTitle_0_0_1, text);
    }

    public void inputFeatureEnumDescription001(String text) {
        actionWithOurElements.enterText(featureEnumDescription_0_0_1, text);
    }

    public void clickUpdateFeature00() {
        actionWithOurElements.clickOnElementByLocator(updateFeature_0_0);
    }

    public void clickDocumentsTab() {
        utils.scrollPageUp();
        utils.waitABit(5);
        actionWithOurElements.clickOnElement(documentsTab);
    }

    public void clickUploadDocument() {
        utils.waitABit(5);
        actionWithOurElements.clickOnElement(uploadDocument);
    }

    public void selectCategoryDocument(String valueOfType) {
        actionWithOurElements.selectValueInDropDownByValue(categorySelect, valueOfType);
    }

    public void selectDocumentFileTo(String valueOfType) {
        actionWithOurElements.selectValueInDropDownByValue(documentOfSelect, valueOfType);
    }

    public void attachDocumentToTender(String key) throws IOException {
        actionWithOurElements.upLoadFile(buttonAttachDocument, key);
    }

    public void clickSaveFile() {
        actionWithOurElements.clickOnElement(saveFile);
    }

    public void movePurchaseView() {
        utils.waitABit(5);
        actionWithOurElements.clickOnElement(movePurchaseView);
    }

    public void publishPurchase() {
        utils.waitABit(10);
        actionWithOurElements.clickOnElement(publishPurchase);
    }

    public void purchaseECP() {
        utils.waitABit(5);
        actionWithOurElements.clickOnElementByLocator(purchaseECP);
    }

    public void findIdTender() {
        //String nameId = actionWithOurElements.getText(purchaseProzorroId);
        String megaID = webDriver.findElement(By.xpath(".//*[@id='purchaseProzorroId']")).getText();
        logger.info("ID = " + megaID);
    }
}
