package com.trackman.action;

import com.trackman.pages.SignUpPage;
import com.trackman.pages.UserProfilePage;
import com.trackman.utils.MobileActionUtils;
import com.trackman.workflow.BrowseAllCoursesFlow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.trackman.config.TestData.*;
import static core.BasePage.driver;

public class SignUpAction {
    SignUpPage signUpPage;
    MobileActionUtils mobileActionUtils;
    private static final Logger logger = LoggerFactory.getLogger(BrowseAllCoursesFlow.class);

    public SignUpAction()
    {
        signUpPage = new SignUpPage();
        mobileActionUtils = new MobileActionUtils();
    }

    void click_allowButton()
    {
        try {
            mobileActionUtils.clickOnElement(signUpPage.get_AllowButton());
            logger.info("Notification popup handled by clicking 'Allow'.");
        }
        catch (Exception e)
        {
            logger.info("Notification popup not displayed.");
        }
    }
    public void click_quickloginbutton()
    {
        mobileActionUtils.clickOnElement(signUpPage.get_quickLoginButton());
    }

    public void click_createProfileButton()
    {
        mobileActionUtils.clickOnElement(signUpPage.get_createProfileButton());
    }

    public void click_confirmButton()
    {
        mobileActionUtils.clickOnElement(signUpPage.get_confirmButton());
    }


    public void click_signUpWithEmailButton()
    {
        mobileActionUtils.clickOnElement(signUpPage.get_signUpWithEmailButton());
    }
    public void click_fullNameButton()
    {
        mobileActionUtils.clickOnElement(signUpPage.get_fullNameButton());
        mobileActionUtils.passValueOnField(signUpPage.get_fullNameButton(),TRACKMAN_FULLNAME.getData_testEnvironment());
        driver.hideKeyboard();
    }

    public void set_username()
    {
        mobileActionUtils.clickOnElement(signUpPage.get_usernameButton());
        mobileActionUtils.passValueOnField(signUpPage.get_usernameButton(),TRACKMAN_USERNAME.getData_testEnvironment());
        driver.hideKeyboard();
    }
    public void nextButton() {
        mobileActionUtils.clickOnElement(signUpPage.get_nextButton());
    }
    public void set_password()
    {
        mobileActionUtils.clickOnElement(signUpPage.get_passwordButton());
        mobileActionUtils.passValueOnField(signUpPage.get_passwordButton(),TRACKMAN_PASSWORD.getData_testEnvironment());
        driver.hideKeyboard();
    }
    public void click_confirmPasswordButton()
    {
        mobileActionUtils.clickOnElement(signUpPage.get_confirmPasswordButton());
        mobileActionUtils.passValueOnField(signUpPage.get_confirmPasswordButton(),TRACKMAN_PASSWORD.getData_testEnvironment());
        driver.hideKeyboard();
    }
    public void click_get_nextPasswordButton() {
        mobileActionUtils.clickOnElement(signUpPage.get_nextPasswordButton());
    }

    void click_firstCheckbox()
    {
        mobileActionUtils.clickOnElement(signUpPage.get_firstCheckbox());

    }
    public void click_secondCheckbox() {
        mobileActionUtils.clickOnElement(signUpPage.get_secondCheckbox());
    }
    public void click_NextButton_Checkbox()
    {
        mobileActionUtils.clickOnElement(signUpPage.get_NextButton_Checkbox());
    }

    public void click_get_createAccountButton()
    {
        mobileActionUtils.clickOnElement(signUpPage.get_createAccountButton());
    }
    public void set_playerNameButton()
    {
        mobileActionUtils.clickOnElement(signUpPage.get_playerNameButton());
        mobileActionUtils.passValueOnField(signUpPage.get_playerNameButton(),TRACKMAN_PLAYERNAME.getData_testEnvironment());
        driver.hideKeyboard();
    }
    public void click_doneButton()
    {
        mobileActionUtils.clickOnElement(signUpPage.get_doneButton());
    }
    public void click_actionButton()
    {
        mobileActionUtils.clickOnElement(signUpPage.get_actionButton());
    }


}
