package com.trackman;

import com.trackman.workflow.DeletionPlannedRoundsFlow;
import com.trackman.workflow.FetchPlannedRoundsFlow;
import core.BasePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FetchPlannedRoundTest extends BasePage {
    private FetchPlannedRoundsFlow fetchPlannedRoundsFlow;

    @BeforeClass
    public void setUp() {
        fetchPlannedRoundsFlow = new FetchPlannedRoundsFlow();
    }
    @AfterClass
    public void tearDown() {
        // This will clear cache and reset the driver for the next test class
        tearDownDriver();
    }
    @Test
    public void testDeleteRound() {
        fetchPlannedRoundsFlow.plannedRoundsFetch();
    }
}
