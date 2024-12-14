package com.trackman.action;

import com.trackman.pages.SelectCoursePage;
import com.trackman.utils.MobileActionUtils;

import static com.trackman.config.TestData.TRACKMAN_GOLF_FIELDNAME;
import static core.BasePage.driver;

public class SelectCourseAction {
    SelectCoursePage selectCoursePage;
    MobileActionUtils mobileActionUtils;
    public SelectCourseAction()
    {
        selectCoursePage = new SelectCoursePage();
        mobileActionUtils = new MobileActionUtils();
    }
    //Actions
    public void click_searchBox()
    {
        mobileActionUtils.clickOnElement(selectCoursePage.get_searchBox());
        mobileActionUtils.passValueOnField(selectCoursePage.get_searchBox(), TRACKMAN_GOLF_FIELDNAME.getData_testEnvironment());
        driver.hideKeyboard();
    }
    public void click_courseImage()
    {
        mobileActionUtils.clickOnElement(selectCoursePage.get_courseImage());
    }
}
