package com.orangehrm.demo.pages;

import com.orangehrm.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends Utility
{
    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());

    @CacheLookup
    @FindBy(css = " body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > " +
            "form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")
    WebElement userRole;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;

    @CacheLookup
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement usernameField;

    @CacheLookup
    @FindBy(xpath = "(//div[contains(text(),'-- Select --')])[2]")
    WebElement status;

    @CacheLookup
    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "(//input[@type='password'])[2]")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement saveButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    WebElement cancelButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']")
    WebElement textSuccessfullySaved;

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Add User']")
    WebElement textAddUser;


    public void selectUserRoll(String admin) {
        sendTextToElement(userRole, admin);
        log.info("Select user role from: " + userRole.toString());
    }

    public void enterUserName(String userName) {
        sendTextToElement(usernameField, userName);
        log.info("Enter user name : " + userName + " in username field " + usernameField.toString());
    }

    public void enterEmployeeName(String name) {
        sendTextToElement(employeeName, name);
        log.info("Enter employee name : " + name + " in employee field " + employeeName.toString());
    }

    public void SelectStatusFromDropdown() {
        selectByVisibleTextFromDropDown(status, "Enabled");
        log.info("Select status enable from dropdown : " + status.toString());
    }

    public void enterPassword(String passWord) {
        sendTextToElement(password, passWord);
        log.info("Enter password : " + passWord + " in password field " + password.toString());
    }

    public void enterConfirmPassword(String confirmPassWord) {
        sendTextToElement(confirmPassword, confirmPassWord);
        log.info("Enter Confirm password : " + confirmPassWord + " in Confirm password field " + confirmPassword.toString());
    }

    public void clickOnSaveButton() {
        clickOnElement(saveButton);
        log.info("Clicking on save button : " + saveButton.toString());
    }

    public void clickOnCancelButton() {
        clickOnElement(cancelButton);
        log.info("Clicking on cancel button : " + cancelButton.toString());
    }

    public String verifyTextSuccessfullySaved() {
        String saveMessage = getTextFromElement(textSuccessfullySaved);
        log.info("Get successfully saved message : " + textSuccessfullySaved.toString());
        return saveMessage;
    }

    public String verifyTextAddUser() {
        String user = getTextFromElement(textAddUser);
        log.info("Get add user text : " + textAddUser.toString());
        return user;
    }

}