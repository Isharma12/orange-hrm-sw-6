package com.orangehrm.demo.steps;

import com.orangehrm.demo.pages.AddUserPage;
import com.orangehrm.demo.pages.HomePage;
import com.orangehrm.demo.pages.LoginPage;
import com.orangehrm.demo.pages.ViewSystemUsersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UserSteps {
    @Given("I am on login page")
    public void iAmOnLoginPage() {
    }

    @When("I login to the application")
    public void iLoginToTheApplication() {
        new LoginPage().clickOnLoginButton();
    }

    @And("I navigate to the Home page")
    public void iNavigateToTheHomePage() {
    }

    @And("I click on Admin")
    public void iClickOnAdmin() {
        new HomePage().clickOnAdmin();
    }

    @And("I get a user text {string}")
    public void iGetAUserText(String user) {
        Assert.assertEquals(new ViewSystemUsersPage().verifyTextSystemUsers(), user, "Incorrect text");
    }

    @And("I click on add button")
    public void iClickOnAddButton() {
        new ViewSystemUsersPage().clickOnAddButton();
    }

    @And("I get a add user text {string}")
    public void iGetAAddUserText(String addUser) {
        Assert.assertEquals(new AddUserPage().verifyTextAddUser(), addUser, "Incorrect text");
    }

    @And("I select a role admin")
    public void iSelectARoleAdmin() {
        new AddUserPage().selectUserRoll("Admin");
    }

    @And("I enter employee name {string}")
    public void iEnterEmployeeName(String employee) {
        new AddUserPage().enterEmployeeName(employee);
    }

    @And("I enter user name {string}")
    public void iEnterUserName(String userName) {
        new AddUserPage().enterUserName(userName);
    }

    @And("I select status disable")
    public void iSelectStatusDisable() {
        new AddUserPage().SelectStatusFromDropdown();
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new AddUserPage().enterPassword(password);
    }

    @And("I enter confirm password {string}")
    public void iEnterConfirmPassword(String confirmPassword) {
        new AddUserPage().enterConfirmPassword(confirmPassword);
    }

    @And("I click on save button")
    public void iClickOnSaveButton() {
        new AddUserPage().clickOnSaveButton();
    }

    @Then("I get a successfully save message {string}")
    public void iGetASuccessfullySaveMessage(String saved) {
        Assert.assertEquals(new AddUserPage().verifyTextSuccessfullySaved(), saved, "Incorrect message");
    }

    @And("I enter user")
    public void iEnterUser() {
        new ViewSystemUsersPage().enterUserName("Linda.Anderson");
    }

    @And("I select user role")
    public void iSelectUserRole() {
        new ViewSystemUsersPage().selectUserRoll();
    }

    @And("I click on status")
    public void iClickOnStatus() {
        new ViewSystemUsersPage().selectStatusFromDropdown();
    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        new ViewSystemUsersPage().clickOnSearchButton();
    }

    @Then("I get a user name in the list {string}")
    public void iGetAUserNameInTheList(String user) {
        new ViewSystemUsersPage().verifyTheSearchResultList("Linda.Anderson");
    }

    @And("I click on check box")
    public void iClickOnCheckBox() {
        new ViewSystemUsersPage().tickOnCheckBox();
    }

    @And("I click on delete button")
    public void iClickOnDeleteButton() {
        new ViewSystemUsersPage().clickOnDeleteButton();
    }

    @And("I can see the popup")
    public void iCanSeeThePopup() {
        new ViewSystemUsersPage().verifyThePopUpWindowIsDisplayed();
    }

    @And("I click on ok button in popup")
    public void iClickOnOkButtonInPopup() {
//        new ViewSystemUsersPage().acceptAlert();
        new ViewSystemUsersPage().clickOnYesButton();
    }

    @Then("I should get a message {string}")
    public void iShouldGetAMessage(String message) {
        Assert.assertEquals(new ViewSystemUsersPage().getTextFromAlert(), message, "successfully deleted");
    }

    @And("I enter username {string}")
    public void iEnterUsername(String userName) {
        new ViewSystemUsersPage().enterUserName(userName);
    }

    @And("I select userRole {string}")
    public void iSelectUserRole(String role) {
        new ViewSystemUsersPage().selectUserRoll();
    }

    @And("I enter employee {string}")
    public void iEnterEmployee(String employee) {
        new ViewSystemUsersPage().enterEmployeeName(employee);
    }

    @And("I select status {string}")
    public void iSelectStatus(String status) {
        new ViewSystemUsersPage().selectStatusFromDropdown();
    }

    @And("I get a message record found {string}")
    public void iGetAMessageRecordFound(String message) {
        Assert.assertEquals(new ViewSystemUsersPage().verifyTextRecordFound(), message, "Incorrect text");
    }

    @And("I get userName {string}")
    public void iGetUserName(String username) {
        Assert.assertEquals(new ViewSystemUsersPage().verifyUsernameLabel(), username, "Incorrect name");
    }

    @Then("I click on reset tab")
    public void iClickOnResetTab() {
        new ViewSystemUsersPage().clickOnResetButton();
    }


}




