@regression
Feature: User Test Feature
  In Order to perform successfully adding user
  As a Admin
  I should verify different scenarios to add user

  Background: Admin is on home page
    Given I am on login page
    When I login to the application
    And I navigate to the Home page
    And I click on Admin
    And I get a user text "System Users"

  @sanity @smoke
  Scenario: Admin should add user successFully().
    And I click on add button
    And I get a add user text "Add User"
    And I select a role admin
    And I enter employee name "Ananya Dash"
    And I enter user name "ananya12"
    And I select status disable
    And I enter password "a123456"
    And I enter confirm password "a123456"
    And I click on save button
    Then I get a successfully save message "Successfully Saved"

  @sanity
  Scenario: Admin should search the created user and verify it
    And I enter user
    And I select user role
    And I click on status
    And I click on search button
    Then I get a user name in the list "user"

  Scenario: Admin should delete the user successFully
    And I enter user
    And I select user role
    And I click on status
    And I click on search button
    And I get a user name in the list "user"
    And I click on check box
    And I click on delete button
    And I can see the popup
    And I click on ok button in popup
    Then I should get a message "Successfully Saved"

  Scenario Outline: Admin should search the user and verify message record found
    And I enter username "<username>"
    And I select userRole "<userRole>"
    And I enter employee "<employeeName>"
    And I select status "<status>"
    And I click on search button
    And I get a message record found "(1) Records Found"
    And I get userName "<username>"
    Then I click on reset tab

    Examples:
      | username     | userRole | employeeName  | status |
      | Admin        | Admin    | Paul Collings | Enable |
      | Cassidy.Hope | ESS      | Cassidy Hope  | Enable |
      | Nina.Patel   | ESS      | Nina Patel    | Enable |
      | Odis.Adalwin | Admin    | Odis Adalwin  | Enable |