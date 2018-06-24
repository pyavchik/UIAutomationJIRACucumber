package stepdefs;

import cucumber.api.java.en.Then;
import pages.MainPage;

import static org.testng.Assert.assertEquals;

/**
 * Created by pyavchik on 22.06.2018.
 */
public class SmokeTest {
    @Then("^I should see Dashboard link$")
    public void iShouldSeeDashboardLink() throws Throwable {
        assertEquals(MainPage.findDashboardLink().isDisplayed(), true);
    }

    @Then("^I should see Projects link$")
    public void iShouldSeeProjectsLink() throws Throwable {
        assertEquals(MainPage.findProjectsLink().isDisplayed(), true);
    }

    @Then("^I should see Issue link$")
    public void iShouldSeeIssueLink() throws Throwable {
        assertEquals(MainPage.findIssuesLink().isDisplayed(), true);
    }

    @Then("^I should see Boards link$")
    public void iShouldSeeBoardsLink() throws Throwable {
        assertEquals(MainPage.findBoardsLink().isDisplayed(), true);
    }


    @Then("^I should see Tests link$")
    public void iShouldSeeTestsLink() throws Throwable {
        assertEquals(MainPage.findTestsLink().isDisplayed(), true);
    }

}
