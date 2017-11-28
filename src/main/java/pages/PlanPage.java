package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class PlanPage extends ParentPage {

    public PlanPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "btn_create_purchase")
    private WebElement buttonCreatePurchase;

    @FindBy(xpath = ".//a[@href='/Plan/Create']")
    private WebElement planPurchase;

    @FindBy(id = "planTitle")
    private WebElement planTitle;

    @FindBy(id = "planDescription")
    private WebElement planDescription;

    @FindBy(id = "planBudget")
    private WebElement planBudget;

    @FindBy(id = "select_currencies")
    private WebElement selectCurrencies;

    @FindBy(id = "planStart")
    private WebElement planStartCalendar;

    @FindBy(xpath = ".//a[@class = 'btn btn-primary']")
    private WebElement clearFeild;

    @FindBy(xpath = ".//*[@name = 'year']")
    private WebElement yearSelect;

    @FindBy(id = "purchaseType")
    private WebElement purchaseType;
    //Повторяется 2 раза
    @FindBy(id = "cls_click")
    private WebElement clsClick;

    @FindBy(id = "search-classifier-text")
    private WebElement searchClassifierText;

    @FindBy(xpath = ".//*[contains(@id,'anchor')]")
    private WebElement visibleCheckbox;

    @FindBy(id = "add-classifier")
    private WebElement addClassifier;

    @FindBy(xpath = ".//button[@itemid = 'otherClassifier']")
    private WebElement otherClassifier;

    @FindBy(xpath = ".//button[@itemid = 'kekvClassifier']")
    private WebElement kekvClassifier;

    @FindBy(id = "saveChangesPlanNextStep")
    private WebElement saveChangesPlanNextStep;

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

    @FindBy(id = "btn_otherClassifier")
    private WebElement btnOtherClassifier;

    @FindBy(xpath = ".//button[@class='btn btn-success ng-scope']")
    private WebElement update00;

    @FindBy(xpath = ".//button[@class='btn btn-primary']")
    private WebElement cancelProcurementSubject00;

    @FindBy(xpath = ".//a[@class='btn btn-default hgreen']")
    private WebElement editProcurementsSubject00;

    @FindBy(xpath = ".//a[@class='btn btn-default ng-scope']")
    private WebElement deleteConfirmProcurementSubject00;

    @FindBy(id = "movePlanView")
    private WebElement movePlanView;

    @FindBy(xpath = ".//button[@ng-if = 'control.publishBtn' and @ng-click = 'publishPlan()']")
    private WebElement publishBtn;

    @FindBy(xpath = ".//button[@ng-if = 'control.needEcp']")
    private WebElement imposeECP;

    @FindBy(id = "CAsServersSelect")
    private WebElement selectCSK;

    @FindBy(xpath = ".//input[@id = 'ChoosePKCertsInput' and @type = 'file']")
    private WebElement filePathPKCerts;

    @FindBy(xpath = ".//input[@id = 'PKeyFileInput' and @type = 'file']")
    private WebElement filePathPKey;

    @FindBy(id = "PKeyPassword")
    private WebElement PKeyPassword;

    @FindBy(id = "PKeyReadButton")
    private WebElement PKeyReadButton;

    @FindBy(id = "SignDataButton")
    private WebElement SignDataButton;

    @FindBy(xpath = ".//span[contains(text(),'ID:')]")
    private WebElement displayedIDTender;

    public void clickButtonCreatePurchase() {
        actionWithOurElements.clickOnElement(buttonCreatePurchase);
    }

    public void clickPlanPurchase() {
        actionWithOurElements.clickOnElementByLocator(planPurchase);
    }

    public void inputPlanTitle(String text) {
        actionWithOurElements.enterText(planTitle, text);
    }

    public void inputPlanDescription(String text) {
        actionWithOurElements.enterText(planDescription, text);
    }

    public void inputPlanBudget(String text) {
        actionWithOurElements.enterText(planBudget, text);
    }

    public void selectCurrenciesDropDown(String valueOfType) {
        actionWithOurElements.selectValueInDropDownByValue(selectCurrencies, valueOfType);
    }

    public void planStartCalendar(int minute) {
        actionWithOurElements.inputCalendarDataTime(minute);
    }

    public void selectYear(String valueOfType) {
        actionWithOurElements.selectValueInDropDownByValue(yearSelect, valueOfType);
    }

    public void selectPurchaseType(String valueOfType) {
        actionWithOurElements.selectValueInDropDownByValue(purchaseType, valueOfType);
    }

    public void clickClassifier212015() {
        actionWithOurElements.clickOnElement(clsClick);
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
        actionWithOurElements.clickOnElement(otherClassifier);
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

    public void clickKekvClassifier() {
        utils.waitABit(5);
        actionWithOurElements.clickOnElement(kekvClassifier);
    }

    public void searchKekvClassifier(String number) {
        actionWithOurElements.enterText(searchClassifierText, number);
    }

    public void elementDisplayedKekvClassifier() throws Exception {
        actionWithOurElements.isElementPresent1(visibleCheckbox);
    }

    public void addKekvClassifier() {
        actionWithOurElements.clickOnElement(addClassifier);
    }

    public void saveChangesPlanNextStep() {
        utils.scrollPage();
        utils.waitABit(5);
        actionWithOurElements.clickOnElement(saveChangesPlanNextStep);
    }

    public void addProcurementSubject0() {
        utils.waitABit(5);
        actionWithOurElements.clickOnElement(addProcurementSubject0);
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

    public void btnOtherClassifier() {
        utils.waitABit(5);
        actionWithOurElements.clickOnElement(btnOtherClassifier);
    }

    public void clickUpdate00() throws Exception {
        utils.waitABit(5);
        actionWithOurElements.clickOnElement(update00);
    }

    public void btnMovePlanView() {
        utils.waitABit(5);
        actionWithOurElements.clickOnElement(movePlanView);
    }

    public void publishBtn() {
        utils.waitABit(5);
        actionWithOurElements.clickOnElement(publishBtn);
    }

    public void imposeECP() {
        actionWithOurElements.clickOnElement(imposeECP);
    }

    public void selectCSK(String nameOfType) {
        utils.waitABit(10);
        actionWithOurElements.selectTextInDropDownByText(selectCSK, nameOfType);
    }


    public void downloadFileUserSert(String key) throws IOException {
        actionWithOurElements.downloadFile(filePathPKCerts, key);
    }


    public void downloadFilePKey(String key) throws IOException {
        actionWithOurElements.downloadFile(filePathPKey, key);
    }

    public void inputPKeyPassword(String text) {
        actionWithOurElements.enterText(PKeyPassword, text);
    }

    public void clickPKeyReadButton() {
        actionWithOurElements.clickOnElement(PKeyReadButton);
    }

    public void clickSignDataButton(){
        utils.waitABit(5);
        actionWithOurElements.clickOnElement(SignDataButton);
    }

    public void elementDisplayedIDTender() throws Exception {
        utils.waitABit(5);
        actionWithOurElements.isElementPresent1(displayedIDTender);
    }
}