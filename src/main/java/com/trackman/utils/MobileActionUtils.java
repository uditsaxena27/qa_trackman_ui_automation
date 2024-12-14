package com.trackman.utils;

import core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;

public class MobileActionUtils {

    public void clickOnElement(MobileElement element)
    {
        if(element.isDisplayed() && element.isEnabled())
        {
            element.click();
        }
    }
    public void passValueOnField(MobileElement element,String input_value)
    {
        if(element.isDisplayed() && element.isEnabled())
        {
            element.sendKeys(input_value);
        }
    }
    public boolean elementIsPresent(MobileElement element)
    {
        return element.isDisplayed();

    }
}
