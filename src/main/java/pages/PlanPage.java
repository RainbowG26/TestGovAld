package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDateTime;

public class PlanPage extends ParentPage {


    public PlanPage(WebDriver webDriver) {
        super(webDriver);
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

    @FindBy(id = "add-classifier")
    private WebElement addClassifier;

    @FindBy(id = "dialogContent")
    private WebElement dialogContent;

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

    public void planStartCalendar() {
        actionWithOurElements.inputCalendarDataTime();
    }

    public void selectYear(String valueOfType){
        actionWithOurElements.selectValueInDropDownByValue(yearSelect, valueOfType);
    }

    public void selectPurchaseType(String valueOfType){
        actionWithOurElements.selectValueInDropDownByValue(purchaseType, valueOfType);
    }

    public void clickClassifier212015(){
        actionWithOurElements.clickOnElement(clsClick);
    }

    public void searchClassifier212015(String number){
        actionWithOurElements.enterText(searchClassifierText, number);
    }

    public void addClassifier(){
        actionWithOurElements.clickOnElement(addClassifier);
    }
}