package com.orangehrm.demo.pages;

import com.orangehrm.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ViewSystemUsersPage extends Utility {
    private static final Logger log = LogManager.getLogger(ViewSystemUsersPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='System Users']")
    WebElement systemUsers;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement usernameField;

    @CacheLookup
    @FindBy(xpath = "(//div[contains(text(),'-- Select --')])[1]")
    WebElement userRole;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;

    @CacheLookup
    @FindBy(xpath = "(//div[contains(text(),'-- Select --')])[2]")
    WebElement status;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = ("//div[contains(text(),'Linda.Anderson')]"))
    WebElement searchResult;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement resetButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement addButton;

    @CacheLookup
    @FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
    WebElement deleteButton;

    @CacheLookup
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span']")
    WebElement recordFound;
    @CacheLookup
    @FindBy(xpath = "(//div[contains(text(),'Admin')])[2]")
    WebElement textAdmin;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement tickOnCheckBox;

    @CacheLookup
    @FindBy(xpath = ("(//div[@role='document'])[1]"))
    WebElement popUpWindow;

    @CacheLookup
    @FindBy(xpath = ("//button[normalize-space()='Yes, Delete']"))
    WebElement yesButton;

    @CacheLookup
    @FindBy(xpath = ("//label[normalize-space()='Username']"))
    WebElement verifyUsername;


    public String verifyTextSystemUsers() {
        String users = getTextFromElement(systemUsers);
        log.info("Get system user text from : " + systemUsers.toString());
        return users;
    }

    public void enterUserName(String userName) {
        sendTextToElement(usernameField, userName);
        log.info("Enter User name : " + userName + " in username field " + usernameField.toString());
    }

    public void selectUserRoll() {
        sendTextToElement(userRole, "Admin");
        log.info("Enter user role : " + "Admin" + " " + userRole.toString());
    }

    public void enterEmployeeName(String name) {
        sendTextToElement(employeeName, name);
        log.info("Enter employee name : " + name + " in employee name field " + employeeName.toString());
    }

    public void selectStatusFromDropdown() {
        sendTextToElement(status, "Enabled");
        log.info("Enter status : " + "Enabled" + " in status box " + status.toString());
    }

    public void clickOnSearchButton() {
        mouseHoverToElementAndClick(searchButton);
        log.info("Clicking on search button : " + searchButton.toString());
    }

    public void clickOnResetButton() {
        clickOnElement(resetButton);
        log.info("Clicking on reset button : " + resetButton.toString());
    }

    public String verifyUsernameLabel() {
        String user = getTextFromElement(verifyUsername);
        log.info("Get user name " + verifyUsername.toString());
        return user;
    }

    public void clickOnAddButton() {
        clickOnElement(addButton);
        log.info("Clicking on add button : " + addButton.toString());
    }

//    public String verifyTextDeletedSuccessfully() {
//        String record = getTextFromElement(recordFound);
//        log.info("Get deleted successfully text : " + recordFound.toString());
//        return record;
//    }

    public String verifyTextRecordFound() {
        String record = getTextFromElement(recordFound);
        log.info("Get deleted successfully text : " + recordFound.toString());
        return record;
    }

    public void verifyTheSearchResultList(String text) {
        verifyThatTextIsDisplayed(searchResult, text);
        log.info("Get text : " + text + searchResult.toString());
    }


    public String verifyTextAdmin() {
        String admin = getTextFromElement(textAdmin);
        log.info("Get admin text : " + textAdmin.toString());
        return admin;
    }

    public void tickOnCheckBox() {
        clickOnElement(tickOnCheckBox);
        log.info("Clicking on check box : " + tickOnCheckBox.toString());
    }

    public void clickOnDeleteButton() {
        clickOnElement(deleteButton);
        log.info("Clicking on delete button : " + deleteButton.toString());
    }

    public void verifyThePopUpWindowIsDisplayed() {
        verifyThatElementIsDisplayed(popUpWindow);
        log.info("Get popup window : " + popUpWindow.toString());
    }

    public void clickOnYesButton() {
        clickOnElement(yesButton);
        log.info("Click on yes : " + yesButton.toString());
    }


}