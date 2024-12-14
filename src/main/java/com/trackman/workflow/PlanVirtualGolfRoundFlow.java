package com.trackman.workflow;

import com.trackman.action.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlanVirtualGolfRoundFlow {

    UserProfileAction userProfileAction;
    HomeAction homeAction;
    MyPlannedRoundsAction myPlannedRoundsAction;
    SelectCourseAction selectCourseAction;
    GolfDetailsAction golfDetailsAction;
    private static final Logger logger = LoggerFactory.getLogger(BrowseAllCoursesFlow.class);

    public PlanVirtualGolfRoundFlow()
    {
        userProfileAction = new UserProfileAction();
        homeAction = new HomeAction();
        myPlannedRoundsAction = new MyPlannedRoundsAction();
        selectCourseAction = new SelectCourseAction();
        golfDetailsAction = new GolfDetailsAction();
    }
    public void VirtualGolfRound() {
        logger.info("<---Planned virtual gold round script is running--->");
        LoginFlow user_login = new LoginFlow();
        user_login.login();

        userProfileAction.click_mainContainer();
        homeAction.click_myPlannedRoundsTile();
        myPlannedRoundsAction.click_actionButton();
        selectCourseAction.click_searchBox();
        selectCourseAction.click_courseImage();
        golfDetailsAction.clickPlanVirtualGolfRoundButton();
    }
}
