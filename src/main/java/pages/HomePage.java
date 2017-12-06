package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//button[@id='btn_create_purchase']")
    public WebElement buttonCreatePurchase;

    @FindBy(xpath = ".//a[@href='/Plan/Create']")
    public WebElement planPurchase;

    @FindBy(xpath = ".//a[@href = '/Purchase/Create/BelowThreshold']")
    public WebElement belowThresholdPurchase;

}
