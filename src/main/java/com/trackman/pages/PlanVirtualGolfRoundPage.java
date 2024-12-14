package com.trackman.pages;

import core.BasePage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.trackman.config.Constants.wait_value;

public class PlanVirtualGolfRoundPage extends BasePage {

    public PlanVirtualGolfRoundPage() {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized. Ensure driver setup is complete before instantiating GolfDetailsPage.");
        }
        wait = new WebDriverWait(driver, wait_value);
    }

    // All Elements Locators on Plan Virtual Golf  Round
    public MobileElement getCloseButton() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[@resource-id='dk.TrackMan.Range:id/closeButtonImageView']")));
    }

    public MobileElement get_ToolbarText() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/toolbarTextView']")));
    }

    public MobileElement getRoundNameSearchBox() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@resource-id='dk.TrackMan.Range:id/roundNameEditText']")));
    }

    public MobileElement getCourseImage() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[@resource-id='dk.TrackMan.Range:id/courseImageView']")));
    }

    public MobileElement getLocationText() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/locationTextView']")));
    }

    public MobileElement getDifficultyText() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/difficultyTextView']")));
    }

    public MobileElement getCourseName() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/courseNameTextView']")));
    }

    public MobileElement getParText() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/parTextView']")));
    }

    public MobileElement getTeesText() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/teesTextView']")));
    }

    public MobileElement getSaveRoundButton() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@resource-id='dk.TrackMan.Range:id/saveButton']")));
    }

    public MobileElement getMulligansSwitchButton() {
       return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.ViewGroup[@resource-id='dk.TrackMan.Range:id/mulligansSwitchView']")));
    }
}