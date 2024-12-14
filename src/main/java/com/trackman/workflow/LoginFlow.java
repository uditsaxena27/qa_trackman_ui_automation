package com.trackman.workflow;

import com.trackman.action.LoginAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginFlow {
LoginAction loginAction;
private static final Logger logger = LoggerFactory.getLogger(BrowseAllCoursesFlow.class);

public LoginFlow() {
    loginAction = new LoginAction();
    }

    public void login() {
        logger.info("<---Login script is running--->");
        loginAction.click_allowButton();
        loginAction.quickloginbutton();
        loginAction.confirmButton();
        loginAction.signIn();
        loginAction.set_username();
        loginAction.set_password();
        loginAction.signIn();
    }

    public void login_Completion() {
       login();
        loginAction.e5();
    }
}
