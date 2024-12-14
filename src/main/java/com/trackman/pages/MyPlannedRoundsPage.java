package com.trackman.pages;

import core.BasePage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.trackman.config.Constants.wait_value;

public class MyPlannedRoundsPage extends BasePage {

    public MyPlannedRoundsPage() {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized.");
        }
        wait = new WebDriverWait(driver, wait_value);
    }
    //Elements on My Planned Rounds Page
    public MobileElement get_planVirtualGoldRoundButton()  {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id='dk.TrackMan.Range:id/actionButton']")));
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
