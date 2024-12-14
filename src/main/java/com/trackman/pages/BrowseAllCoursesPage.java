package com.trackman.pages;

import core.BasePage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.trackman.config.Constants.wait_value;

public class BrowseAllCoursesPage extends BasePage {

    public BrowseAllCoursesPage() {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized. Ensure driver setup is complete before instantiating SignUpPage.");
        }
        wait = new WebDriverWait(driver, wait_value);
    }

    // Locators for interacting with elements
    public MobileElement get_AllowButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")));
    }
    public MobileElement get_browseAllButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.view.View[@resource-id='dk.TrackMan.Range:id/shadowView'])[2]")));
    }
    public MobileElement get_searchbox() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.AutoCompleteTextView[@resource-id='dk.TrackMan.Range:id/search_src_text']")));
    }
    public MobileElement get_courseButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@resource-id='dk.TrackMan.Range:id/courseImageView']")));
    }
    public MobileElement get_CloseButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@resource-id='dk.TrackMan.Range:id/closeButtonImageView']")));
    }

    public MobileElement get_LocationTextView() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/locationTextView']")));
    }

    public MobileElement get_DifficultyTextView() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/difficultyTextView']")));
    }

    public MobileElement get_CourseNameTextView() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/courseNameTextView']")));
    }

    public MobileElement get_ParTextView() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/parTextView']")));
    }

    public MobileElement get_TeesTextView() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/teesTextView']")));
    }

    public MobileElement get_DescriptionTextView() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/descriptionTextView']")));
    }

    public MobileElement get_MessageTextView() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/messageTextView']")));
    }

}