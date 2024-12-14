package com.trackman.workflow;

import com.trackman.action.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SignUpFlow {
    private static final Logger logger = LoggerFactory.getLogger(BrowseAllCoursesFlow.class);

    HomeAction homeAction;
    SignUpAction signUpAction;
    public SignUpFlow()
    {
        homeAction = new HomeAction();
        signUpAction = new SignUpAction();
    }
    public void signUp() {
        logger.info("<---Sign-Up script is running--->");

        homeAction.click_allowButton();

        signUpAction.click_quickloginbutton();
        signUpAction.click_confirmButton();
        signUpAction.click_createProfileButton();

        signUpAction.click_signUpWithEmailButton();
        signUpAction.click_fullNameButton();
        signUpAction.set_username();
        signUpAction.nextButton();
        signUpAction.set_password();
        signUpAction.click_confirmPasswordButton();
        signUpAction.click_get_nextPasswordButton();
        //click_firstCheckbox();
        signUpAction.click_secondCheckbox();
        signUpAction.click_NextButton_Checkbox();
        signUpAction.click_get_createAccountButton();
        signUpAction.set_playerNameButton();
        signUpAction.click_doneButton();
        signUpAction.click_actionButton();

        logger.info("Sign-Up process completed successfully.");
    }
}
