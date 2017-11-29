package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "btn_create_purchase")
    private WebElement buttonCreatePurchase;

    @FindBy(xpath = ".//a[@href='/Plan/Create']")
    private WebElement planPurchase;

    @FindBy(xpath = ".//a[@href = '/Purchase/Create/BelowThreshold']")
    private WebElement belowThresholdPurchase;

    public void clickButtonCreatePurchase() {
        actionWithOurElements.clickOnElement(buttonCreatePurchase);
    }

    public void clickPlanPurchase() {
        actionWithOurElements.clickOnElementByLocator(planPurchase);
    }

    public void clickBelowThresholdPurchase(){
        actionWithOurElements.clickOnElementByLocator(belowThresholdPurchase);
    }
}
