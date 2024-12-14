package com.trackman.action;

import com.trackman.pages.UserProfilePage;
import com.trackman.utils.MobileActionUtils;

public class UserProfileAction {
    UserProfilePage userProfilePage;
    MobileActionUtils mobileActionUtils;
    public UserProfileAction()
    {
        userProfilePage = new UserProfilePage();
        mobileActionUtils = new MobileActionUtils();
    }
    public void click_mainContainer()
    {
        mobileActionUtils.clickOnElement(userProfilePage.get_mainContainer());
    }
}
