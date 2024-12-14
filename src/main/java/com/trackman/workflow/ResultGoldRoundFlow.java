package com.trackman.workflow;

import com.trackman.action.ResultGoldRoundAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResultGoldRoundFlow {
    private static final Logger logger = LoggerFactory.getLogger(BrowseAllCoursesFlow.class);

    ResultGoldRoundAction resultGoldRoundAction;
    CreatePlannedRoundsFlow createPlannedRoundsFlow = new CreatePlannedRoundsFlow();
    public ResultGoldRoundFlow()
    {
        resultGoldRoundAction = new ResultGoldRoundAction();
    }
    public void verify_ResultGoldRoundFlow(String roundName)
    {
        logger.info("<---Result Golf Round script is running--->");
        createPlannedRoundsFlow.plannedRoundsCreation(roundName);
        resultGoldRoundAction.click_getMenuButton();
    }
}
