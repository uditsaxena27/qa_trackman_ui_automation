package com.trackman.workflow;

import com.trackman.action.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeletionPlannedRoundsFlow {
    private static final Logger logger = LoggerFactory.getLogger(BrowseAllCoursesFlow.class);

    MyPlannedRoundsAction myPlannedRoundsAction;
    DeletePopUpAction deletePopUpAction;
    ResultGoldRoundAction resultGoldRoundAction;
    FetchPlannedRoundsFlow fetchPlannedRoundsFlow;
    public DeletionPlannedRoundsFlow()
    {
        myPlannedRoundsAction = new MyPlannedRoundsAction();
        resultGoldRoundAction= new ResultGoldRoundAction();
        deletePopUpAction= new DeletePopUpAction();
        fetchPlannedRoundsFlow = new FetchPlannedRoundsFlow();
    }
    public void deletePlannedRoundsFlow()
    {
        logger.info("<---Planned Round Deletion script is running--->");
        fetchPlannedRoundsFlow.plannedRoundsFetch();
        myPlannedRoundsAction.click_itemToBeDeleted();
        resultGoldRoundAction.click_getMenuButton();
        resultGoldRoundAction.click_deleteRoundButton();
        verifyDeletePopUpItems();
        resultGoldRoundAction.verifyTitleAfterDelete();
    }
    void verifyDeletePopUpItems()
    {
        deletePopUpAction.verify_popUpText();
        deletePopUpAction.validate_cancelButton();
        deletePopUpAction.validate_deleteButton();
    }

}