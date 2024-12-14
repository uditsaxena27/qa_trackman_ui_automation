package com.trackman.pages;

import core.BasePage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.trackman.config.Constants.wait_value;

public class UserProfilePage extends BasePage {

    //Driver initialisation
    public UserProfilePage() {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized. Ensure driver setup is complete before instantiating PlannedRoundsPage.");
        }
        wait = new WebDriverWait(driver, wait_value);
    }

    //  Elements Locators in Profile Page
    public MobileElement get_mainContainer() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.ViewGroup[@resource-id='dk.TrackMan.Range:id/mainContainer']/android.widget.FrameLayout/android.widget.ImageView")));
    }
}
