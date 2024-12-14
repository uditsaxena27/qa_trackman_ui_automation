package com.trackman.workflow;

import com.trackman.action.PlanVirtualGolfRoundAction;
import com.trackman.action.ResultGoldRoundAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import static com.trackman.config.TestData.TRACKMAN_UPDATE_GOLF_ROUNDNAME;

public class EditPlannedRoundFlow {
    private static final Logger logger = LoggerFactory.getLogger(BrowseAllCoursesFlow.class);

    ResultGoldRoundAction resultGoldRoundAction;
    CreatePlannedRoundsFlow createPlannedRoundsFlow = new CreatePlannedRoundsFlow();
    PlanVirtualGolfRoundAction planVirtualGolfRoundAction;
    public EditPlannedRoundFlow()
    {
        resultGoldRoundAction = new ResultGoldRoundAction();
        planVirtualGolfRoundAction= new PlanVirtualGolfRoundAction();
    }
    public void editPlannedFlow(String roundName)
    {
        logger.info("<---Edit Planned Round script is running--->");
        createPlannedRoundsFlow.plannedRoundsCreation(roundName);
        resultGoldRoundAction.click_getMenuButton();
        resultGoldRoundAction.click_editRoundButton();
        Assert.assertEquals(planVirtualGolfRoundAction.fetchToolbarText(),"Plan Virtual Golf round");
        logger.info("User navigated back to Edit Golf Round Page");
        planVirtualGolfRoundAction.clickRoundNameSearchBox();
        planVirtualGolfRoundAction.setRoundNameSearchBox(TRACKMAN_UPDATE_GOLF_ROUNDNAME.getData_testEnvironment());
        planVirtualGolfRoundAction.clickSaveRoundButton();
        Assert.assertEquals(resultGoldRoundAction.return_bottomSheetTitle(),TRACKMAN_UPDATE_GOLF_ROUNDNAME.getData_testEnvironment());
    }
}
