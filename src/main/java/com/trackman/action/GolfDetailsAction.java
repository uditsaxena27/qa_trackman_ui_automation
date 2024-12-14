package com.trackman.action;

import com.trackman.pages.GolfDetailsPage;
import com.trackman.utils.MobileActionUtils;

public class GolfDetailsAction {
    GolfDetailsPage golfDetailsPage;
    MobileActionUtils mobileActionUtils;
    public GolfDetailsAction()
    {
        golfDetailsPage = new GolfDetailsPage();
        mobileActionUtils = new MobileActionUtils();
    }

    // Actions for interaction

    public void clickCourseImage() {
        mobileActionUtils.clickOnElement(golfDetailsPage.getCourseImage());
    }
    public void clickCloseButton() {
        mobileActionUtils.clickOnElement(golfDetailsPage.getCloseButton());
    }

    public void clickPlanVirtualGolfRoundButton() {
        mobileActionUtils.clickOnElement(golfDetailsPage.submit_PlanVirtualGolfRoundButton());
    }

    public String getCourseName() {
       return golfDetailsPage.getCourseNameTextView().getText();
    }

    public String getParDetails() {
        return golfDetailsPage.getParTextView().getText();
    }

    public String getDifficultyLevel() {
        return golfDetailsPage.getDifficultyTextView().getText();
    }

    public String getLocationDetails() {
        return golfDetailsPage.getLocationTextView().getText();
    }

    public String getCourseDescription() {
        return golfDetailsPage.getDescriptionTextView().getText();
    }

    public String fetchMessageTextView() {
        return golfDetailsPage.getMessageTextView().getText();
    }
}
