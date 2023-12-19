package com.orangehrm.demo.pages;

import com.orangehrm.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends Utility{

    private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    WebElement textDashboard;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    WebElement userProfileLogo;

    @CacheLookup
    @FindBy(linkText = "Logout")
    WebElement logout;


    public String verifyTextDashboard() {
        String dashboardText = getTextFromElement(textDashboard);
        log.info("Get dashboard text : " + textDashboard.toString());
        return dashboardText;
    }

    public void clickOnUserProfileLogo() {
        clickOnElement(userProfileLogo);
        log.info("Clicking on user profile logo : " + userProfileLogo.toString());
    }

    public void clickOnLogout() {
        mouseHoverToElementAndClick(logout);
        log.info("Clicking on logout button : " + logout.toString());
    }

}

