package com.trackman.pages;

import core.BasePage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.trackman.config.Constants.wait_value;

public class HomePage extends BasePage {

    public HomePage() {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized.");
        }
        wait = new WebDriverWait(driver, wait_value);
    }


    // Locators and methods for interacting with elements on the Home Page
    public MobileElement get_myPlannedRoundsTile() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.view.View[@resource-id='dk.TrackMan.Range:id/shadowView'])[1]")));
    }

    public MobileElement get_AllowButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")));
    }

    public MobileElement get_RangeTab() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.LinearLayout[@content-desc='Range']")));
    }

    public MobileElement get_MyPlannedRoundsView() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.ViewGroup[@resource-id='dk.TrackMan.Range:id/myPlannedRoundsView']")));
    }

    public MobileElement get_BrowseCoursesCard() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.ViewGroup[@resource-id='dk.TrackMan.Range:id/browseCoursesCard']")));
    }


    public MobileElement get_QuickLoginButton() {
         return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id='dk.TrackMan.Range:id/quickLoginButton']")));
    }


    public MobileElement get_PlayView() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@resource-id='dk.TrackMan.Range:id/playView']")));
    }

    public MobileElement get_MeTab() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.LinearLayout[@content-desc='Me']")));
    }

    public MobileElement get_NewTab() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.LinearLayout[@content-desc='New']")));
    }

    public MobileElement get_TournamentsTab() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.LinearLayout[@content-desc='Tournaments']")));
    }

    public MobileElement get_LocationsTab() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.LinearLayout[@content-desc='Locations']")));
    }
}
