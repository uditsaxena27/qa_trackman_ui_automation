package com.trackman.pages;
import core.BasePage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.trackman.config.Constants.wait_value;

public class ResultGolfRoundPage extends BasePage {
    public ResultGolfRoundPage() {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized. Ensure driver setup is complete before instantiating PlanVirtualGolfRoundPage.");
        }
        wait = new WebDriverWait(driver, wait_value);

    }
    public MobileElement getMenuButton() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[@resource-id='dk.TrackMan.Range:id/moreImageView']")));

    }
    public MobileElement bottomSheet() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("    //android.view.ViewGroup[@resource-id='dk.TrackMan.Range:id/sheetContainer']")));
    }
    public MobileElement bottomSheetTitle() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/roundNameTextView']")));
    }
    public MobileElement roundNameTitle() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/roundNameTextView']")));
    }

    public MobileElement editRoundButton() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/editRoundTextView']")));
    }
    public MobileElement duplicateRoundButton() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/duplicateRoundTextView']")));

    }
    public MobileElement deleteRoundButton() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/deleteRoundTextView']")));
    }

    public MobileElement getTitleAfterDelete() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='dk.TrackMan.Range:id/toolbarTextView']")));
    }
}
