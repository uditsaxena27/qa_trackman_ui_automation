package com.trackman.config;

import com.trackman.workflow.BrowseAllCoursesFlow;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;

import static core.BasePage.trackmanConfigModel;

public class DriverConfig {
    public static AppiumDriver<MobileElement> driver;
    private static final Logger logger = LoggerFactory.getLogger(BrowseAllCoursesFlow.class);

    public static AppiumDriver<MobileElement> getDriver() {
        if(driver ==null) {
            try {
                logger.info("Initializing Appium Driver with the following capabilities:");
                logger.info("Platform Name: " + trackmanConfigModel.getPlatform());
                logger.info("Device Name: " + trackmanConfigModel.getDeviceDetails());
                logger.info("App Package: " + trackmanConfigModel.getAppPackage());
                logger.info("App Activity: " + trackmanConfigModel.getAppActivity());
                logger.info("Appium Server URL: " + trackmanConfigModel.getAppium_local_server_url());


                DesiredCapabilities desiredCapabilities = getDesiredCapabilities();
                URL appiumServerURL = new URL(trackmanConfigModel.getAppium_local_server_url());
                driver = new AndroidDriver<>(appiumServerURL, desiredCapabilities);
                logger.info("App launched successfully");
            }
            catch(Exception e)
            {
                logger.info("Problem in appium setup");
                e.printStackTrace();
            }
        }
    return  driver;
    }

    private static DesiredCapabilities getDesiredCapabilities() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, trackmanConfigModel.getPlatform());
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, trackmanConfigModel.getDeviceDetails());
        desiredCapabilities.setCapability("appium:appPackage", trackmanConfigModel.getAppPackage());
        desiredCapabilities.setCapability("appium:appActivity", trackmanConfigModel.getAppActivity());
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, trackmanConfigModel.getAutomation_Name());
        desiredCapabilities.setCapability("appium:noReset", true);
        return desiredCapabilities;
    }
    public static void resetDriver() {
        if (driver != null) {
            driver.quit();
            driver = null; // Set the driver to null to force reinitialization
        }
    }
}
