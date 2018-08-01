@CreateIssueTest @stable
Feature: Create Issue Test
  As user of jira
  I want create issue

  Background: User navigates to Jira home page
    Given I am on the Jira home page on URL "http://jira.hillel.it:8080/login.jsp"
    Then I should see "Welcome to Hillel IT School JIRA" message

  Scenario: Create Issue
    When I fill in Username with "webinar5"
    And I fill in Password with "webinar5"
    And I click on the Log In button
    Then I am on the System Dashboard page on URL "http://jira.hillel.it:8080/secure/Dashboard.jspa"
    Then I create new issue
    Then I should see alert with created issue with "summaryText test issue"
    And I delete created issue
    Then I am logout

  Scenario: Create Issue without summary
    When I fill in Username with "webinar5"
    And I fill in Password with "webinar5"
    And I click on the Log In button
    Then I am on the System Dashboard page on URL "http://jira.hillel.it:8080/secure/Dashboard.jspa"
    Then I try create new issue without summary
    Then I am logout
