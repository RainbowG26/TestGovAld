package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class PlanPage extends ParentPage {

    public PlanPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//input[@id='planTitle']")
    public WebElement fieldTitle;

    @FindBy(xpath = ".//input[@id='planDescription']")
    public WebElement fieldDescription;

    @FindBy(xpath = ".//input[@id='planBudget']")
    public WebElement fieldBudget;

    @FindBy(xpath = ".//select[@id='select_currencies']")
    public WebElement selectCurrencies;

    @FindBy(xpath = ".//input[@id='planStart']")
    public WebElement planStartCalendar;

    @FindBy(xpath = ".//a[@class='btn btn-primary']")
    public WebElement clearFeild;

    @FindBy(xpath = ".//*[@name='year']")
    public WebElement yearSelect;

    @FindBy(xpath = ".//select[@id='purchaseType']")
    public WebElement purchaseType;
    //Повторяется 2 раза
    @FindBy(xpath = ".//button[@id='cls_click']")
    public WebElement classifier212015;

    @FindBy(xpath = ".//input[@id='search-classifier-text']")
    public WebElement searchClassifierText;

    @FindBy(xpath = ".//*[contains(@id,'anchor')]")
    public WebElement visibleCheckbox;

    @FindBy(xpath = ".//button[@id='add-classifier']")
    public WebElement addClassifier;

    @FindBy(xpath = ".//button[@itemid='otherClassifier']")
    public WebElement otherClassifier;

    @FindBy(xpath = ".//button[@itemid='kekvClassifier']")
    public WebElement kekvClassifier;

    @FindBy(xpath = ".//button[@id='saveChangesPlanNextStep']")
    public WebElement saveChangesPlanNextStep;

    @FindBy(xpath = ".//button[@class='btn btn-primary ng-scope']")
    public WebElement addProcurementSubject0;

    @FindBy(xpath = ".//input[@ng-model='procurementSubject.description']")
    public WebElement procurementSubjectDescription00;

    @FindBy(xpath = ".//input[@ng-model='procurementSubject.quantity']")
    public WebElement procurementSubjectQuantity00;

    @FindBy(xpath = ".//select[@ng-model='ngModel']")
    public WebElement selectUnit00;

    @FindBy(xpath = ".//button[@id='cls_click_']")
    public WebElement classifier212015_;

    @FindBy(xpath = ".//button[@id='btn_otherClassifier']")
    public WebElement btnOtherClassifier;

    @FindBy(xpath = ".//button[@class='btn btn-success ng-scope']")
    public WebElement update00;

    @FindBy(xpath = ".//button[@class='btn btn-primary']")
    public WebElement cancelProcurementSubject00;

    @FindBy(xpath = ".//a[@class='btn btn-default hgreen']")
    public WebElement editProcurementsSubject00;

    @FindBy(xpath = ".//a[@class='btn btn-default ng-scope']")
    public WebElement deleteConfirmProcurementSubject00;

    @FindBy(xpath = ".//button[@id='movePlanView']")
    public WebElement movePlanView;

    @FindBy(xpath = ".//button[@ng-if='control.publishBtn' and @ng-click = 'publishPlan()']")
    public WebElement publishBtn;

    @FindBy(xpath = ".//button[@ng-if='control.needEcp']")
    public WebElement imposeECP;

    @FindBy(xpath = ".//select[@id='CAsServersSelect']")
    public WebElement selectCSK;

    @FindBy(xpath = ".//input[@id='ChoosePKCertsInput']")
    public WebElement filePathPKCerts;

    @FindBy(xpath = ".//input[@id='PKeyFileInput' and @type = 'file']")
    public WebElement filePathPKey;

    @FindBy(xpath = ".//input[@id='PKeyPassword']")
    public WebElement pKeyPassword;

    @FindBy(xpath = ".//button[@id='PKeyReadButton']")
    public WebElement pKeyReadButton;

    @FindBy(xpath = ".//button[@id='SignDataButton']")
    public WebElement signDataButton;

    @FindBy(xpath = ".//span[contains(text(),'ID:')]")
    public WebElement displayedIDTender;

    //Method work with impose ECP
    public void workWithImposeECP(String nameOfType, String fileUserSert, String filePKey, String password) throws IOException {
        actionWithElements.waitABit(5);
        actionWithElements.selectTextInDropDownByText(selectCSK, nameOfType);
        actionWithElements.upLoadFile(filePathPKCerts, fileUserSert);
        actionWithElements.upLoadFile(filePathPKey, filePKey);
        actionWithElements.enterText(pKeyPassword, password);
        actionWithElements.clickOnElementByLocator(pKeyReadButton);
        actionWithElements.clickOnElementByLocator(signDataButton);
    }

}