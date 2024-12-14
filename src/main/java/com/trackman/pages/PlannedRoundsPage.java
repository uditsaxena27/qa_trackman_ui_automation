package com.trackman.pages;

import core.BasePage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.trackman.config.Constants.wait_value;


public class PlannedRoundsPage extends BasePage {
    //Driver initialisation
    public PlannedRoundsPage() {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized. Ensure driver setup is complete before instantiating PlannedRoundsPage.");
        }
        wait = new WebDriverWait(driver, wait_value);
    }

    // All Elements Locators in Planned Round Journey
    public MobileElement get_mainContainer() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.ViewGroup[@resource-id='dk.TrackMan.Range:id/mainContainer']/android.widget.FrameLayout/android.widget.ImageView")));
    }

    public MobileElement get_actionButton()  {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id='dk.TrackMan.Range:id/actionButton']")));
    }

    public MobileElement get_plannedRoundsTile() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.view.View[@resource-id='dk.TrackMan.Range:id/shadowView'])[1]")));
    }

    public MobileElement get_searchBox() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.AutoCompleteTextView[@resource-id='dk.TrackMan.Range:id/search_src_text']")));
    }

    public MobileElement get_courseImage() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@resource-id='dk.TrackMan.Range:id/courseImageView']")));
    }

    public MobileElement get_virtualGoldRoundButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id='dk.TrackMan.Range:id/selectButton']")));
    }

    public MobileElement select_searchBoxRoundName() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@resource-id='dk.TrackMan.Range:id/roundNameEditText']")));}

    public MobileElement get_saveRoundButton() {
    return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id='dk.TrackMan.Range:id/saveButton']")));
}

public MobileElement get_roundNameTextView() {
    return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/roundNameTextView']")));
}

public MobileElement getCloseButton()
{
    return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@resource-id='dk.TrackMan.Range:id/closeImageView']")));
}


    public MobileElement itemToBeDeleted()
    {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.view.View[@resource-id='dk.TrackMan.Range:id/gradientView'])[1]")));
    }
}
