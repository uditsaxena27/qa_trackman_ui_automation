package com.trackman.action;

import com.trackman.pages.HomePage;
import com.trackman.utils.MobileActionUtils;
import com.trackman.workflow.BrowseAllCoursesFlow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeAction {

    HomePage homePage;
    MobileActionUtils mobileActionUtils;
    private static final Logger logger = LoggerFactory.getLogger(BrowseAllCoursesFlow.class);

    public HomeAction()
    {
        homePage = new HomePage();
        mobileActionUtils = new MobileActionUtils();
    }
    //Actions
    public void click_myPlannedRoundsTile()
    {
        mobileActionUtils.clickOnElement(homePage.get_myPlannedRoundsTile());
    }
    public void click_RangeTab() {
        mobileActionUtils.clickOnElement(homePage.get_RangeTab());
    }

    public boolean verify_MyPlannedRoundsView() {
        return  mobileActionUtils.elementIsPresent(homePage.get_MyPlannedRoundsView());
    }


    public boolean verify_BrowseCoursesCard() {
        return  mobileActionUtils.elementIsPresent(homePage.get_BrowseCoursesCard());
    }


    public boolean verify_QuickLoginButton() {
        return  mobileActionUtils.elementIsPresent(homePage.get_QuickLoginButton());
    }


    public boolean verify_PlayView() {
        return  mobileActionUtils.elementIsPresent(homePage.get_PlayView());
    }


    public boolean verify_MeTab() {
        return  mobileActionUtils.elementIsPresent(homePage.get_MeTab());
    }

    public boolean verify_NewTab() {
        return  mobileActionUtils.elementIsPresent(homePage.get_NewTab());
    }

    public boolean verify_TournamentsTab() {
        return  mobileActionUtils.elementIsPresent(homePage.get_TournamentsTab());
    }

    public boolean verify_LocationsTab() {
        return  mobileActionUtils.elementIsPresent(homePage.get_LocationsTab());
    }

     public void click_allowButton()
    {
        try {
            mobileActionUtils.clickOnElement(homePage.get_AllowButton());
            logger.info("Notification popup handled by clicking 'Allow'.");
        }
        catch (Exception e)
        {
            logger.info("Notification popup not displayed.");
        }
    }
    // Validate Home Page elements
    public void homePage() {
        click_allowButton();
    }
}
