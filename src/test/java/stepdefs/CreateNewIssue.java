package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import pages.MainPage;
import pages.ReportedByMeIssuesPage;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;

public class CreateNewIssue {
    private static String xpathForIssueUpdatedAllert = "//div[@class='aui-message aui-message-success success closeable shadowed aui-will-close']";
    private static String xpathForComment = "//div[@class='action-body flooded']";

    @Then("^I create new issue$")
    public void iCreateNewIssue() throws Throwable {
        MainPage.createNewIssue("summaryText test issue", "descriptionText test issue");

    }

    @Then("^I try create new issue without summary$")
    public void iTryCreateNewIssueWithoutSummary() throws Throwable {
        MainPage.createIssueWithoutSummary();
    }

    @And("^I update Issue Description$")
    public void iUpdateIssueDescription() throws Throwable {
        ReportedByMeIssuesPage.updateIssueDescription("summaryText test issue", "updated description");
    }

    @Then("^I should see issue has been updated$")
    public void iShouldSeeIssueHasBeenUpdated() throws Throwable {
        assertEquals($(By.xpath(xpathForIssueUpdatedAllert)).getText().contains("has been updated"), true);
    }

    @And("^I delete created issue$")
    public void iDeleteCreatedIssue() throws Throwable {
        ReportedByMeIssuesPage.deleteIssueReportedByMe("summaryText test issue");
    }

    @And("^I create new comment with \"([^\"]*)\"$")
    public void iCreateNewCommentWith(String comment) throws Throwable {
        ReportedByMeIssuesPage.createComment("summaryText test issue", comment);
    }

    @Then("^I should see comment with \"([^\"]*)\"$")
    public void iShouldSeeCommentWith(String comment) throws Throwable {
        assertEquals(ReportedByMeIssuesPage.at(), true);
        assertEquals($(By.xpath(xpathForComment)).getText().contains(comment), true);
    }

    @Then("^I can read comment with \"([^\"]*)\"Comment text\"$")
    public void iCanReadCommentWithCommentText(String comment) throws Throwable {
        assertEquals(ReportedByMeIssuesPage.readComment().contains(comment), true);
    }

    @And("^update comment with \"([^\"]*)\"$")
    public void updateCommentWith(String updatedComment) throws Throwable {
        ReportedByMeIssuesPage.updateComment(updatedComment);
    }

    @And("^I delete comment$")
    public void iDeleteComment() throws Throwable {
        ReportedByMeIssuesPage.deleteComment();
    }

    @Then("^I should see text \"([^\"]*)\"$")
    public void iShouldSeeText(String textNoComment) throws Throwable {
        assertEquals(ReportedByMeIssuesPage.findDeletedCommentText().getText().contains(textNoComment), true);
    }
}
