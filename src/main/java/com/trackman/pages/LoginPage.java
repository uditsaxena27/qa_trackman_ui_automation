package com.trackman.pages;

import core.BasePage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.trackman.config.Constants.wait_value;

public class LoginPage extends BasePage {
    private WebDriverWait wait;

    public LoginPage() {
        // Initialize WebDriverWait after driver is properly set
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized. Ensure driver setup is complete before instantiating LoginPage.");
        }
        wait = new WebDriverWait(driver, wait_value);
    }
public MobileElement get_AllowButton() {
    return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")));
    }

    public MobileElement get_quickLoginButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id='dk.TrackMan.Range:id/quickLoginButton']")));
    }
    public MobileElement get_confirmButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='ConfirmButton']")));
    }
    public MobileElement get_signIn() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.Button[@text='SIGN IN'])[1]")));
    }
    public MobileElement get_usernameButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@resource-id='Email']")));
    }
    public MobileElement get_passwordButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@resource-id='Password']")));
    }

    public MobileElement get_e5() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.ViewGroup[@resource-id='dk.TrackMan.Range:id/mainContainer']/android.widget.FrameLayout/android.widget.ImageView")));
    }
    public MobileElement get_signInButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='SignInButton']")));
    }
    }

