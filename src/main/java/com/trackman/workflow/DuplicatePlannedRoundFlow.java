package com.trackman.workflow;

import com.trackman.action.PlanVirtualGolfRoundAction;
import com.trackman.action.ResultGoldRoundAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class DuplicatePlannedRoundFlow {
    private static final Logger logger = LoggerFactory.getLogger(BrowseAllCoursesFlow.class);

    ResultGoldRoundAction resultGoldRoundAction;
    CreatePlannedRoundsFlow createPlannedRoundsFlow = new CreatePlannedRoundsFlow();
    public DuplicatePlannedRoundFlow()
    {
        resultGoldRoundAction = new ResultGoldRoundAction();
    }
    public void duplicatePlannedFlow(String roundName)
    {
        logger.info("<---Duplicate Planned Round script is running--->");
        createPlannedRoundsFlow.plannedRoundsCreation(roundName);
        resultGoldRoundAction.click_getMenuButton();
        resultGoldRoundAction.click_duplicateRoundButton();
        String duplicateName= resultGoldRoundAction.return_roundNameTitle();
        logger.info("New text:"+duplicateName);
        Assert.assertEquals(duplicateName,roundName+" (Copy)");
        logger.info("Duplicate is created");
    }

}