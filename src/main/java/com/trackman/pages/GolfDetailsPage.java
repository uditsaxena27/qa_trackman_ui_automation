package com.trackman.pages;

import core.BasePage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.trackman.config.Constants.wait_value;


public class GolfDetailsPage extends BasePage {
    private final WebDriverWait wait;

    public GolfDetailsPage() {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized. Ensure driver setup is complete before instantiating GolfDetailsPage.");
        }
        wait = new WebDriverWait(driver, wait_value);
    }

    // Locators for elements in the Golf Details page
    public MobileElement getCourseImage() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[@resource-id='dk.TrackMan.Range:id/courseImageView']")));
    }

    public MobileElement getCoursesIndicator() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/coursesIndicator']")));
    }

    public MobileElement getCloseButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@resource-id='dk.TrackMan.Range:id/closeButtonImageView']")));
    }

    public MobileElement getLocationTextView() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/locationTextView']")));
    }

    public MobileElement getDifficultyTextView() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/difficultyTextView']")));
    }

    public MobileElement getCourseNameTextView() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/courseNameTextView']")));
    }

    public MobileElement getParTextView() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/parTextView']")));
    }

    public MobileElement getTeesTextView() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/teesTextView']")));
    }

    public MobileElement getDescriptionTextView() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/descriptionTextView']")));
    }

    public MobileElement getMessageTextView() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/messageTextView']")));
    }

    public MobileElement submit_PlanVirtualGolfRoundButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id='dk.TrackMan.Range:id/selectButton']")));
    }
    public MobileElement get_virtualGoldRoundButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id='dk.TrackMan.Range:id/selectButton']")));
    }


}
