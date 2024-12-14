package core;

import com.trackman.config.DriverConfig;
import com.trackman.config.TrackmanConfigModel;
import com.trackman.workflow.BrowseAllCoursesFlow;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


import static com.trackman.utils.CacheUtil.clearAppCache;
import static com.trackman.config.Constants.wait_value;
import static com.trackman.config.TrackmanConfiguration.getBaseConfiguration;

public class BasePage {
    public static AppiumDriver<MobileElement> driver;
    public static TrackmanConfigModel trackmanConfigModel;
    public WebDriverWait wait;
    private static final Logger logger = LoggerFactory.getLogger(BrowseAllCoursesFlow.class);

    @BeforeSuite
    public void mobiledriver_setup() {
        try {
            trackmanConfigModel = getBaseConfiguration();
            clearAppCache("dk.TrackMan.Range");
            driver = DriverConfig.getDriver(); // Ensure DriverConfig returns a valid driver instance
            if (driver == null) {
                throw new IllegalStateException("Driver is not initialized");
            }
            wait = new WebDriverWait(driver, wait_value);
        }
        catch (Exception e) {
            logger.info("Problem in appium setup");
            e.printStackTrace();
    }
}
    @BeforeClass
    public void setUpDriver() {
        try {
            clearAppCache("dk.TrackMan.Range");
            DriverConfig.resetDriver(); // Ensure a clean session
            driver = DriverConfig.getDriver(); // Reinitialize the driver
            if (driver == null) {
                throw new IllegalStateException("Driver is not initialized");
            }
            wait = new WebDriverWait(driver, wait_value);
        } catch (Exception e) {
            logger.info("Error during driver setup: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDownDriver() {
        try {
            if (driver != null) {
                driver.quit();
                clearAppCache("dk.TrackMan.Range");
            }
        } catch (Exception e) {
            logger.info("Error during driver teardown: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @AfterSuite
    public void close_mobileDriver_connection() {
        if (driver != null) {
            driver.quit();
            logger.info("Driver connection closed");
        }
    }
}
