package com.trackman.workflow;

import com.trackman.action.*;
import core.BasePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreatePlannedRoundsFlow extends BasePage {
private static final Logger logger = LoggerFactory.getLogger(BrowseAllCoursesFlow.class);

    PlannedRoundsAction plannedRoundsAction;

    public CreatePlannedRoundsFlow()
    {
        plannedRoundsAction = new PlannedRoundsAction();
    }
    public void plannedRoundsCreation(String RoundName) {

        logger.info("<---Planned Rounds Creation script is running--->");
        LoginFlow user_login = new LoginFlow();
        user_login.login();

        plannedRoundsAction.click_mainContainer();
        plannedRoundsAction.click_plannedRoundsTile();
        plannedRoundsAction.click_actionButton();
        plannedRoundsAction.click_searchBox();
        plannedRoundsAction.click_courseImage();
        plannedRoundsAction.click_virtualGoldRoundButton();
        plannedRoundsAction.click_roundNameBox(RoundName);
        plannedRoundsAction.click_saveRoundButton();
        plannedRoundsAction.fetch_roundNameTextView();
    }
}