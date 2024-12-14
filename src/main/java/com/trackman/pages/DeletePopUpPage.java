package com.trackman.pages;

import com.trackman.workflow.BrowseAllCoursesFlow;
import core.BasePage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static com.trackman.config.Constants.wait_value;

public class DeletePopUpPage extends BasePage {
    public DeletePopUpPage() {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized. Ensure driver setup is complete before instantiating GolfDetailsPage.");
        }
        wait = new WebDriverWait(driver, wait_value);
    }

    public MobileElement popUpText() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/alertTitle']")));
    }
    public MobileElement cancelButton() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@resource-id='android:id/button2']")));
    }
    public MobileElement deleteButton() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@resource-id='android:id/button1']")));
    }
}
