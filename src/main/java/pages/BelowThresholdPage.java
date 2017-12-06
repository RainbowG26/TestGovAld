package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BelowThresholdPage extends ParentPage {


    public BelowThresholdPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//input[@id='titleOfTenderForEdit']")
    public WebElement titleOfTenderForEdit;

    @FindBy(xpath = ".//input[@id='description']")
    public WebElement descriptionBelowThreshold;

    @FindBy(xpath = ".//md-switch[@id='is_vat']")
    public WebElement switchButton;

    @FindBy(xpath = ".//select[@id='select_currencies']")
    public WebElement selectCurrencies;

    @FindBy(xpath = ".//md-switch[@id='is_multilot']")
    public WebElement switchButtonMultiLot;

    @FindBy(xpath = ".//input[@id='budget']")
    public WebElement fieldBudget;

    @FindBy(xpath = ".//input[@id='min_step_percentage']")
    public WebElement minStepPricePercentage;

    @FindBy(xpath = ".//button[@id='next_step' and @class = 'btn btn-success']")
    public WebElement nextStepButton;

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

    @FindBy(xpath = ".//input[@id='search-classifier-text']")
    public WebElement searchClassifierText;

    @FindBy(xpath = ".//*[contains(@id,'anchor')]")
    public WebElement visibleCheckbox;

    @FindBy(xpath = ".//button[@id='add-classifier']")
    public WebElement addClassifier;

    @FindBy(xpath = ".//button[@itemid='otherClassifier']")
    public WebElement otherClassifier;

    @FindBy(xpath = ".//select[@ng-model='ngModelCountry']")
    public WebElement select_countries00;

    @FindBy(xpath = ".//select[@ng-model='ngModelRegion']")
    public WebElement select_regions00;

    @FindBy(xpath = ".//input[@ng-model='procurementSubject.address.zipCode']")
    public WebElement zip_code_00;

    @FindBy(xpath = ".//input[@ng-model='procurementSubject.address.locality']")
    public WebElement locality_00;

    @FindBy(xpath = ".//input[@ng-model='procurementSubject.address.street']")
    public WebElement street_00;

    @FindBy(xpath = ".//input[@ng-model='procurementSubject.address.latutide']")
    public WebElement coordinatesLatitude00; //latitude

    @FindBy(xpath = ".//input[@ng-model='procurementSubject.address.longitude']")
    public WebElement сoordinatesLongitude00;

    @FindBy(xpath = ".//button[@class='btn btn-success ng-scope']")
    public WebElement update_00;

    @FindBy(xpath = ".//button[@class='btn btn-primary']")
    public WebElement cancelProcurementSubject00;

    @FindBy(xpath = ".//a[@class='btn btn-default hgreen']")
    public WebElement editProcurementsSubject00;

    @FindBy(xpath = ".//a[@class='btn btn-default ng-scope']")
    public WebElement deleteConfirmProcurementSubject00;

    @FindBy(xpath = ".//button[@id='add_features0']")
    public WebElement add_features0;

    @FindBy(xpath = ".//input[@ng-model='features.title']")
    public WebElement featureTitle_0_0;

    @FindBy(xpath = ".//input[@ng-model='features.description']")
    public WebElement featureDescription_0_0;

    @FindBy(xpath = ".//label[@for='featureOf_0_0']")
    public WebElement position;

    @FindBy(xpath = ".//select[@ng-model='features.relatedItemGuid']")
    public WebElement featureItem_0_0;

    @FindBy(xpath = ".//button[@class='btn btn-sm btn-danger ng-scope']")
    public WebElement clearButton;

    @FindBy(xpath = ".//input[@ng-model='featureEnum.title']")
    public WebElement featureEnumTitle_0_0_0;

    @FindBy(xpath = ".//input[@ng-model='featureEnum.description']")
    public WebElement featureEnumDescription_0_0_0;

    @FindBy(xpath = ".//button[@ng-click='addFeatureEnum(lotPurchasePlan, features)']")
    public WebElement addFeatureEnum_0_0;

    @FindBy(xpath = ".//input[@ng-model='featureEnum.value' and @class = 'form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required ng-valid-pattern']")
    public WebElement featureEnumValue_0_0_1;

    @FindBy(xpath = ".//input[@ng-model='featureEnum.title' and @class='form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']")
    public WebElement featureEnumTitle_0_0_1;

    @FindBy(xpath = ".//input[@ng-model='featureEnum.description' and @class='form-control ng-pristine ng-untouched ng-valid ng-empty']")
    public WebElement featureEnumDescription_0_0_1;

    @FindBy(xpath = ".//button[@ng-click='deleteFeatureEnum(lotPurchasePlan, features, featureEnum); validateWeight(lotPurchasePlan, features)']")
    public WebElement deleteFeatureEnum;

    @FindBy(xpath = ".//button[@id='updateFeature_0_0' and @class = 'btn btn-success']")
    public WebElement updateFeature_0_0;

    @FindBy(xpath = ".//a[@id='documents-tab']")
    public WebElement documentsTab;

    @FindBy(xpath = ".//div[@id='upload_document']")
    public WebElement uploadDocument;

    @FindBy(xpath = ".//select[@id='categorySelect']")
    public WebElement categorySelect;

    @FindBy(xpath = ".//select[@id='documentOfSelect']")
    public WebElement documentOfSelect;

    @FindBy(xpath = ".//input[@id='fileInput' and @type = 'file']")
    public WebElement buttonAttachDocument;

    @FindBy(xpath = ".//button[@id='save_file']")
    public WebElement saveFile;

    @FindBy(xpath = ".//button[@id='movePurchaseView']")
    public WebElement movePurchaseView;

    @FindBy(xpath = ".//button[@id='publishPurchase']")
    public WebElement publishPurchase;

    @FindBy(xpath = ".//button[@ng-if='purchase.purchaseControl.ecpBtn']")
    public WebElement purchaseECP;

    @FindBy(xpath = ".//*[@id='purchaseProzorroId']")
    public WebElement purchaseProzorroId;

    public void findIdTender() {
        //String nameId = actionWithElements.getText(purchaseProzorroId);
        String megaID = webDriver.findElement(By.xpath(".//*[@id='purchaseProzorroId']")).getText();
        logger.info("ID = " + megaID);
    }
}