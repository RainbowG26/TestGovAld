package pagesProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagesBuyer.ParentPage;

public class SubmissionOfProposalsPage extends ParentPage {

    public SubmissionOfProposalsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "purchaseProzorroId")
    private WebElement purchaseProzorroId;

    public void findIdTender(String IdTender) {

    }
}
