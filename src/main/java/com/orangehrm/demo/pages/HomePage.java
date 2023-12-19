package com.orangehrm.demo.pages;

import com.orangehrm.demo.utilities.Utility;
import dev.failsafe.internal.util.Assert;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility
{
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement search;

    @CacheLookup
    @FindBy(xpath = "//li[1]//a[1]//span[1]")
    WebElement admin;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='PIM']")
    WebElement pIM;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Leave']")
    WebElement leave;

    @CacheLookup
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Dashboard']")
    WebElement dashboard;

    @CacheLookup
    @FindBy(xpath = "(//img[@alt='orangehrm-logo'])[2]")
    WebElement orangeHrmLogo;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='client brand banner']")
    WebElement logo;


    @CacheLookup
    @FindBy()
    WebElement welcomeText;

    public void clickOnSearch() {
        clickOnElement(search);
        log.info("Clicking on search button : " + search.toString());
    }

    public void clickOnAdmin() {
        clickOnElement(admin);
        log.info("Clicking on admin : " + admin.toString());
    }

    public void clickOnPIM() {
        clickOnElement(pIM);
        log.info("Clicking on PIM : " + pIM.toString());
    }

    public void clickOnLeave() {
        clickOnElement(leave);
        log.info("Clicking on leave button : " + leave.toString());
    }

    public void clickOnDashboard() {
        clickOnElement(dashboard);
        log.info("Clicking on dashboard : " + dashboard.toString());
    }

    public void verifyOrangeHrmLogo() {
        boolean logoPresent = logo.isDisplayed();
        Assert.isTrue(true, "Error", logoPresent);
        log.info("Get logo : " + logo.toString());
    }
}