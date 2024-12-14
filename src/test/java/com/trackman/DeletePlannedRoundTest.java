package com.trackman;

import com.trackman.pages.ResultGolfRoundPage;
import com.trackman.workflow.DeletionPlannedRoundsFlow;
import core.BasePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeletePlannedRoundTest extends BasePage {
    private DeletionPlannedRoundsFlow deletionPlannedRoundsFlow;

    @BeforeClass
    public void setUp() {
        deletionPlannedRoundsFlow = new DeletionPlannedRoundsFlow();
    }
    @AfterClass
    public void tearDown() {
        // This will clear cache and reset the driver for the next test class
        tearDownDriver();
    }
    @Test
    public void testDeleteRound() {
        deletionPlannedRoundsFlow.deletePlannedRoundsFlow();
    }
}

