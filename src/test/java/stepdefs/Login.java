package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DashboardPage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertEquals;

public class Login {
    @Given("^I am on the Jira home page on URL \"([^\"]*)\"$")
    public void iAmOnTheJiraHomePageOnURL(String loginPageUrl) throws Throwable {
        open(loginPageUrl);
    }

    @Then("^I should see \"([^\"]*)\" message$")
    public void iShouldSeeMessage(String welcomeMessage) throws Throwable {
        assertEquals(LoginPage.findWellcomeMessage().getText().contains(welcomeMessage), true);
    }


    @When("^I fill in Username with \"([^\"]*)\"$")
    public void iFillInUsernameWith(String login) throws Throwable {
        LoginPage.findUsernameTextBox().setValue(login);
    }

    @And("^I fill in Password with \"([^\"]*)\"$")
    public void iFillInPasswordWith(String password) throws Throwable {
        LoginPage.findPasswordTextBox().setValue(password);
    }

    @And("^I click on the Log In button$")
    public void iClickOnTheLogInButton() throws Throwable {
        LoginPage.findLoginButton().click();
    }

    @Then("^I am on the System Dashboard page on URL \"([^\"]*)\"$")
    public void iAmOnTheSystemDashboardPageOnURL(String dashboardUrl) throws Throwable {
        assertEquals(DashboardPage.findCurrentUrl().contains(dashboardUrl), true);
    }

    @Then("^I should see \"([^\"]*)\" error message$")
    public void iShouldSeeErrorMessage(String errorMessage) throws Throwable {
        assertEquals(LoginPage.findErrorMessage().getText().contains(errorMessage), true);
    }

    @Then("^I am loguot$")
    public void iAmLoguot() throws Throwable {
        DashboardPage.logout();
    }
}
