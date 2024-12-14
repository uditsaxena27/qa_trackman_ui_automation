package com.trackman.pages;

import core.BasePage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.trackman.config.Constants.wait_value;

public class SignUpPage extends BasePage {

    public SignUpPage() {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized. Ensure driver setup is complete before instantiating SignUpPage.");
        }
        wait = new WebDriverWait(driver, wait_value);
    }

    // Locators and methods for interacting with elements
    public MobileElement get_AllowButton() {
        return driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']"));
    }

    public MobileElement get_quickLoginButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id='dk.TrackMan.Range:id/quickLoginButton']")));
    }

    public MobileElement get_confirmButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='ConfirmButton']")));
    }

    public MobileElement get_createProfileButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='CreateTrackmanProfileButton']")));
    }

    public MobileElement get_signUpWithEmailButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='SIGN UP WITH EMAIL']")));
    }

    public MobileElement get_fullNameButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@resource-id='FullName']")));
    }

    public MobileElement get_usernameButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@resource-id='Email']")));
    }

    public MobileElement get_nextButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='NEXT']")));
    }

    public MobileElement get_passwordButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@resource-id='Password']")));
    }

    public MobileElement get_confirmPasswordButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@resource-id='ConfirmPassword']")));
    }

    public MobileElement get_nextPasswordButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='NEXT']")));
    }
    public MobileElement get_firstCheckbox() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.CheckBox[@resource-id='customCheck']")));
    }

    public MobileElement get_secondCheckbox() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.CheckBox[@resource-id='customCheck1']")));
    }
    public MobileElement get_NextButton_Checkbox() {
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='NEXT']")));
    }

    public MobileElement get_createAccountButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='CREATE ACCOUNT']")));
    }
    public MobileElement get_playerNameButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.EditText")));
    }

    public MobileElement get_doneButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='DONE']")));
    }

    public MobileElement get_actionButton() {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("dk.TrackMan.Range:id/actionButton")));
    }
}
