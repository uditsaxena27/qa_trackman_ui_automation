package com.trackman.action;

import com.trackman.pages.BrowseAllCoursesPage;
import com.trackman.utils.MobileActionUtils;


import static core.BasePage.driver;

public class BrowseAllCoursesAction {
    BrowseAllCoursesPage browseAllCoursesPage;
    MobileActionUtils mobileActionUtils;
    public BrowseAllCoursesAction()
    {
        browseAllCoursesPage = new BrowseAllCoursesPage();
        mobileActionUtils = new MobileActionUtils();
    }

    public void click_get_browseAllButton() {
        mobileActionUtils.clickOnElement(browseAllCoursesPage.get_browseAllButton());
    }
    public void enter_searchTerm() {
        mobileActionUtils.clickOnElement(browseAllCoursesPage.get_searchbox());
        mobileActionUtils.passValueOnField(browseAllCoursesPage.get_searchbox(),"Lakeside Golf");
        driver.hideKeyboard();
    }
    public void click_courseButton() {

        mobileActionUtils.clickOnElement(browseAllCoursesPage.get_courseButton());
    }
    public boolean verify_courseButton() {
        return mobileActionUtils.elementIsPresent(browseAllCoursesPage.get_CloseButton());
    }
    public boolean verify_LocationTextView() {
        return mobileActionUtils.elementIsPresent(browseAllCoursesPage.get_LocationTextView());
    }
    public boolean verify_DificultyTextView() {
        return mobileActionUtils.elementIsPresent(browseAllCoursesPage.get_DifficultyTextView());
    }
    public boolean verify_CourseNameTextView() {
        return mobileActionUtils.elementIsPresent(browseAllCoursesPage.get_CourseNameTextView());
    }
    public boolean verify_ParTextView() {
        return mobileActionUtils.elementIsPresent(browseAllCoursesPage.get_ParTextView());
    }
    public boolean verify_TeesTextView() {
        return mobileActionUtils.elementIsPresent(browseAllCoursesPage.get_TeesTextView());
    }
    public boolean verify_DescriptionTextView() {
        return mobileActionUtils.elementIsPresent(browseAllCoursesPage.get_DescriptionTextView());
    }
    public boolean verify_MessageTextView() {
        return mobileActionUtils.elementIsPresent(browseAllCoursesPage.get_MessageTextView());
    }
}
