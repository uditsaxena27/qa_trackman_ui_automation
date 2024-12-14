package com.trackman.workflow;

import com.trackman.action.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FetchPlannedRoundsFlow {
    HomeAction homeAction;
    MyPlannedRoundsAction myPlannedRoundsAction;
    UserProfileAction userProfileAction;
    private static final Logger logger = LoggerFactory.getLogger(BrowseAllCoursesFlow.class);

    public FetchPlannedRoundsFlow()
    {
        homeAction = new HomeAction();
        userProfileAction = new UserProfileAction();
        myPlannedRoundsAction = new MyPlannedRoundsAction();

    }
    public void plannedRoundsFetch() {

        logger.info("<---Planned Rounds Fetch script is running--->");
        LoginFlow user_login = new LoginFlow();
        user_login.login();

        userProfileAction.click_mainContainer();
        homeAction.click_myPlannedRoundsTile();
        myPlannedRoundsAction.click_getCloseButton();
    }
}
