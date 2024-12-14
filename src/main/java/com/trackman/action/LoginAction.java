package com.trackman.action;

import com.trackman.pages.LoginPage;
import com.trackman.utils.MobileActionUtils;
import com.trackman.workflow.BrowseAllCoursesFlow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.trackman.config.TestData.TRACKMAN_LOGIN_USERNAME;
import static com.trackman.config.TestData.TRACKMAN_PASSWORD;
import static core.BasePage.driver;

public class LoginAction {
    LoginPage loginPage;
    MobileActionUtils mobileActionUtils;
    private static final Logger logger = LoggerFactory.getLogger(BrowseAllCoursesFlow.class);

    public LoginAction() {
        loginPage = new LoginPage();
        mobileActionUtils = new MobileActionUtils();
    }

    // Actions for interaction
    public void click_allowButton() {
        try {
            mobileActionUtils.clickOnElement(loginPage.get_AllowButton());
            logger.info("Notification popup handled by clicking 'Allow'.");
        } catch (Exception e) {
            logger.info("Notification popup not displayed.");
        }
    }

    public void quickloginbutton() {
        mobileActionUtils.clickOnElement(loginPage.get_quickLoginButton());
    }

    public void confirmButton() {
        mobileActionUtils.clickOnElement(loginPage.get_confirmButton());
    }

    public void set_username() {
        mobileActionUtils.clickOnElement(loginPage.get_usernameButton());
        mobileActionUtils.passValueOnField(loginPage.get_usernameButton(), TRACKMAN_LOGIN_USERNAME.getData_testEnvironment());
    }

    public void set_password() {
        mobileActionUtils.clickOnElement(loginPage.get_passwordButton());
        mobileActionUtils.passValueOnField(loginPage.get_passwordButton(), TRACKMAN_PASSWORD.getData_testEnvironment());
        driver.hideKeyboard();
    }

    public void signIn() {
        mobileActionUtils.clickOnElement(loginPage.get_signIn());
    }

    public void e5() {
        mobileActionUtils.clickOnElement(loginPage.get_e5());
    }

    void signInButton() {
        mobileActionUtils.clickOnElement(loginPage.get_signInButton());
    }

}