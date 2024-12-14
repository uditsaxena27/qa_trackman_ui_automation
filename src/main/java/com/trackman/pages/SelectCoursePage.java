package com.trackman.pages;

import core.BasePage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.trackman.config.Constants.wait_value;

public class SelectCoursePage extends BasePage {
    public SelectCoursePage() {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized.");
        }
        wait = new WebDriverWait(driver, wait_value);
    }
    public MobileElement get_searchBox() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.AutoCompleteTextView[@resource-id='dk.TrackMan.Range:id/search_src_text']")));
    }
    public MobileElement get_courseImage() {
        return driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='dk.TrackMan.Range:id/courseImageView']"));
    }
}
