package pagesBuyer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class PlanPage extends ParentPage {

    public PlanPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "planTitle")
    public WebElement fieldTitle;

    @FindBy(id = "planDescription")
    private WebElement fieldDescription;

    @FindBy(id = "planBudget")
    private WebElement fieldBudget;

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

    @FindBy(xpath = ".//input[@id = 'ChoosePKCertsInput']")
    private WebElement filePathPKCerts;

    @FindBy(xpath = ".//input[@id = 'PKeyFileInput' and @type = 'file']")
    private WebElement filePathPKey;

    @FindBy(id = "PKeyPassword")
    private WebElement pKeyPassword;

    @FindBy(id = "PKeyReadButton")
    private WebElement pKeyReadButton;

    @FindBy(id = "SignDataButton")
    private WebElement signDataButton;

    @FindBy(xpath = ".//span[contains(text(),'ID:')]")
    private WebElement displayedIDTender;

    public void inputTitle(String text) {
        actionWithOurElements.enterText(fieldTitle, text);
    }

    public void inputDescription(String text) {
        actionWithOurElements.enterText(fieldDescription, text);
    }

    public void inputBudget(String text) {
        actionWithOurElements.enterText(fieldBudget, text);
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

    public void clickKekvClassifier() {
        utils.waitABit(5);
        actionWithOurElements.clickOnElementByLocator(kekvClassifier);
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
        utils.scrollPageDown();
        utils.waitABit(5);
        actionWithOurElements.clickOnElement(saveChangesPlanNextStep);
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

    public void btnOtherClassifier() {
        utils.waitABit(5);
        actionWithOurElements.clickOnElement(btnOtherClassifier);
    }

    public void clickUpdate00() throws Exception {
        utils.waitABit(5);
        actionWithOurElements.clickOnElementByLocator(update00);
    }

    public void movePlanView() {
        utils.waitABit(5);
        actionWithOurElements.clickOnElement(movePlanView);
    }

    public void publishBtn() {
        utils.waitABit(10);
        actionWithOurElements.clickOnElementByLocator(publishBtn);
    }

    public void imposeECP() {
        actionWithOurElements.clickOnElementByLocator(imposeECP);
    }

    public void selectCSK(String nameOfType) {
        utils.waitABit(10);
        actionWithOurElements.selectTextInDropDownByText(selectCSK, nameOfType);
    }


    public void downloadFileUserSert(String key) throws IOException {
        actionWithOurElements.upLoadFile(filePathPKCerts, key);
    }


    public void downloadFilePKey(String key) throws IOException {
        actionWithOurElements.upLoadFile(filePathPKey, key);
    }

    public void inputPKeyPassword(String text) {
        actionWithOurElements.enterText(pKeyPassword, text);
    }

    public void clickPKeyReadButton() {
        actionWithOurElements.clickOnElement(pKeyReadButton);
    }

    public void clickSignDataButton(){
        utils.waitABit(5);
        actionWithOurElements.clickOnElement(signDataButton);
    }

    public void elementDisplayedIDTender() throws Exception {
        utils.waitABit(5);
        actionWithOurElements.isElementPresent1(displayedIDTender);
    }

    //Method work with impose ECP
    public void workWithImposeECP(String nameOfType, String fileUserSert, String filePKey, String password) throws IOException {
        selectCSK(nameOfType);
        downloadFileUserSert(fileUserSert);
        downloadFilePKey(filePKey);
        inputPKeyPassword(password);
        clickPKeyReadButton();
        clickSignDataButton();
    }
}