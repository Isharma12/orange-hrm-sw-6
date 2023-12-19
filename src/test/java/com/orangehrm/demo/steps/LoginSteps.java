package com.orangehrm.demo.steps;

import com.orangehrm.demo.pages.DashboardPage;
import com.orangehrm.demo.pages.HomePage;
import com.orangehrm.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginSteps {
    @Then("I get a message {string}")
    public void iGetAMessage(String message) {
        Assert.assertEquals(new DashboardPage().verifyTextDashboard(), message, "Incorrect text");
    }

    @Then("I should see the logo")
    public void iShouldSeeTheLogo() {
        new HomePage().verifyOrangeHrmLogo();
    }

    @And("I click on user profile logo")
    public void iClickOnUserProfileLogo() {
        new DashboardPage().clickOnUserProfileLogo();
    }

    @And("I click on log out button")
    public void iClickOnLogOutButton() {
        new DashboardPage().clickOnLogout();
    }

    @And("I logout successfully")
    public void iLogoutSuccessfully() {
    }

    @Then("I should get a text {string}")
    public void iShouldGetAText(String loginPanel) {
        Assert.assertEquals(new LoginPage().verifyErrorMessage(), loginPanel, "Incorrect text");

    }

    @And("I enter an user {string}")
    public void iEnterAnUser(String user) {
        new LoginPage().enterUsername(user);
    }

    @And("I enter a password {string}")
    public void iEnterAPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login Button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should get a error message {string}")
    public void iShouldGetAErrorMessage(String error) {
        Assert.assertEquals(new LoginPage().verifyErrorMessage(), error, "Incorrect message");
    }
}


