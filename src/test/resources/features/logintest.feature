@regression
Feature: Login Test Feature
  In Order to perform successful Login
  As a Admin
  I should verify different scenarios for login

  Background: User is on login page
    Given I am on login page

  @sanity @smoke
  Scenario: User should login successfully
    When I login to the application
    And I navigate to the Home page
    Then I get a message "Dashboard"

  @sanity
  Scenario: User should see the logo on homepage successfully
    When I login to the application
    And I navigate to the Home page
    Then I should see the logo

  Scenario: User should logout successfully
    When I login to the application
    And I navigate to the Home page
    And I click on user profile logo
    And I click on log out button
    And I logout successfully
    Then I should get a text "Login"

  Scenario Outline: User should get error message for invalid credentials
    And I enter an user "<username>"
    And I enter a password "<password>"
    And I click on login Button
    Then I should get a error message "<errorMessage>"

    Examples:
      | username          | password | errorMessage        |
      |                   |          | Required            |
      | test123@gmail.com |          | Required            |
      |                   | test123  | Required            |
      | test123@gmail.com | test123  | Invalid credentials |