package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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


    public void inputTitle(String text) {
        actionWithOurElements.enterText(titleOfTenderForEdit, text);
    }

    public void inputDescription(String text) {
        actionWithOurElements.enterText(descriptionBelowThreshold, text);
    }

    public void clickSwitchButton() {
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
}
