@SmokeTest
Feature: Smoke Test
  As user of the jira
  I should see main links available on jira site

  Background: User navigates to Jira home page
    Given I am on the Jira home page on URL "http://jira.hillel.it:8080/login.jsp"
    Then I should see "Welcome to Hillel IT School JIRA" message

  Scenario: Dashboard link available
    When I fill in Username with "webinar5"
    And I fill in Password with "webinar5"
    And I click on the Log In button
    Then I am on the System Dashboard page on URL "http://jira.hillel.it:8080/secure/Dashboard.jspa"
    Then I should see Dashboard link
    Then I am logout

  Scenario: Projects link available
    When I fill in Username with "webinar5"
    And I fill in Password with "webinar5"
    And I click on the Log In button
    Then I am on the System Dashboard page on URL "http://jira.hillel.it:8080/secure/Dashboard.jspa"
    Then I should see Projects link
    Then I am logout

  Scenario: Issue link available
    When I fill in Username with "webinar5"
    And I fill in Password with "webinar5"
    And I click on the Log In button
    Then I am on the System Dashboard page on URL "http://jira.hillel.it:8080/secure/Dashboard.jspa"
    Then I should see Issue link
    Then I am logout

  Scenario: Boards link available
    When I fill in Username with "webinar5"
    And I fill in Password with "webinar5"
    And I click on the Log In button
    Then I am on the System Dashboard page on URL "http://jira.hillel.it:8080/secure/Dashboard.jspa"
    Then I should see Boards link
    Then I am logout

  Scenario: Tests link available
    When I fill in Username with "webinar5"
    And I fill in Password with "webinar5"
    And I click on the Log In button
    Then I am on the System Dashboard page on URL "http://jira.hillel.it:8080/secure/Dashboard.jspa"
    Then I should see Tests link
    Then I am logout