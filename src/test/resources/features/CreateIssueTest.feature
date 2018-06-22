@CreateIssueTest
Feature: Create Issue Test
  As user of jira
  I want create issue

  Background: User navigates to Jira home page
    Given I am on the Jira home page on URL "http://jira.hillel.it:8080/login.jsp"
    Then I should see "Welcome to Hillel IT School JIRA" message

  Scenario: Successful login
    When I fill in Username with "webinar5"
    And I fill in Password with "webinar5"
    And I click on the Log In button
    Then I am on the System Dashboard page on URL "http://jira.hillel.it:8080/secure/Dashboard.jspa"

    Then I create new issue
    Then I try create new issue without summary

    Then I am loguot


#  Scenario Outline: Failed login using wrong credentials
#    When I fill in Username with "<username>"
#    And I fill in Password with "<password>"
#    And I click on the Log In button
#    Then I should see "<warning>" error message
#    Examples:
#      | username    | password   | warning                                                              |
#      | webinar5    | wrongPass  | Sorry, your username and password are incorrect - please try again.  |
#      | wrongPass   | webinar5   | Sorry, your username and password are incorrect - please try again.  |
