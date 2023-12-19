package com.orangehrm.demo.pages;

import com.orangehrm.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Utility {

    private static final Logger log = LogManager.getLogger(AdminPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='User Management']")
    WebElement userManagement;

    @CacheLookup
    @FindBy(xpath = "//li[@class='oxd-topbar-body-nav-tab --parent']")
    WebElement job;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Organization']")
    WebElement organization;

    public void clickOnUserManagement() {
        clickOnElement(userManagement);
        log.info("Clicking on user management : " + userManagement.toString());
    }

    public void clickOnJob() {
        clickOnElement(job);
        log.info("Clicking on job : " + job.toString());
    }

    public void clickOnOrganization() {
        clickOnElement(organization);
        log.info("Clicking on organisation : " + organization.toString());
    }

}