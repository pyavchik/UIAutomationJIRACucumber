@EditIssueTest
Feature: Edit Issue Test
  As user of jira
  I want edit issue

  Background: User navigates to Jira home page
    Given I am on the Jira home page on URL "http://jira.hillel.it:8080/login.jsp"
    Then I should see "Welcome to Hillel IT School JIRA" message

  Scenario: update Issue Description Test
    When I fill in Username with "webinar5"
    And I fill in Password with "webinar5"
    And I click on the Log In button
    And I am on the System Dashboard page on URL "http://jira.hillel.it:8080/secure/Dashboard.jspa"
    And I create new issue
    Then I should see alert with created issue with "summaryText test issue"
    And I update Issue Description
    Then I should see issue has been updated
    And I delete created issue
    Then Issue should be deleted
    Then I am logout

  Scenario: create Comment Test
    When I fill in Username with "webinar5"
    And I fill in Password with "webinar5"
    And I click on the Log In button
    And I am on the System Dashboard page on URL "http://jira.hillel.it:8080/secure/Dashboard.jspa"
    And I create new issue
    Then I should see alert with created issue with "summaryText test issue"
    And I create new comment with "Comment text"
    Then I should see comment with "Comment text"
    And I delete created issue
    Then I am logout

  Scenario: read Comment Test
    When I fill in Username with "webinar5"
    And I fill in Password with "webinar5"
    And I click on the Log In button
    And I am on the System Dashboard page on URL "http://jira.hillel.it:8080/secure/Dashboard.jspa"
    And I create new issue
    Then I should see alert with created issue with "summaryText test issue"
    And I create new comment with "Comment text"
    Then I should see comment with "Comment text"
    Then I can read comment with "Comment text"
    And I delete created issue
    Then I am logout

  Scenario: update Comment Test
    When I fill in Username with "webinar5"
    And I fill in Password with "webinar5"
    And I click on the Log In button
    And I am on the System Dashboard page on URL "http://jira.hillel.it:8080/secure/Dashboard.jspa"
    And I create new issue
    Then I should see alert with created issue with "summaryText test issue"
    And I create new comment with "Comment text"
    Then I should see comment with "Comment text"
    And update comment with "Updated comment text"
    Then I should see comment with "Updated comment text"
    And I delete created issue
    Then I am logout

  Scenario: delete Comment Test
    When I fill in Username with "webinar5"
    And I fill in Password with "webinar5"
    And I click on the Log In button
    And I am on the System Dashboard page on URL "http://jira.hillel.it:8080/secure/Dashboard.jspa"
    And I create new issue
    Then I should see alert with created issue with "summaryText test issue"
    And I create new comment with "Comment text"
    Then I should see comment with "Comment text"
    And I delete comment
    Then I should see text "There are no comments yet on this issue."
    And I delete created issue
    Then I am logout