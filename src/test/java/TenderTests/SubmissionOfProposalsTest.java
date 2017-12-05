package TenderTests;

import org.junit.Test;
import parentTest.ParentTest;

public class SubmissionOfProposalsTest extends ParentTest {

    @Test
    public void addSubmissionOfProposals() {
        loginPage.loginUser("provider@yopmail.com", "123456");

    }
}
