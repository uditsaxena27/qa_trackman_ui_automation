package com.trackman;

import com.trackman.workflow.EditPlannedRoundFlow;
import core.BasePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.trackman.config.TestData.TRACKMAN_UPDATE_GOLF_ROUNDNAME;

public class EditPlannedRoundTest extends BasePage {
    private EditPlannedRoundFlow editPlannedRoundFlow;

    @BeforeClass
    public void setUp() {
        editPlannedRoundFlow = new EditPlannedRoundFlow();
    }
    @AfterClass
    public void tearDown() {
        // This will clear cache and reset the driver for the next test class
        tearDownDriver();
    }
    @Test
    public void testEditRound() {
        editPlannedRoundFlow.editPlannedFlow(TRACKMAN_UPDATE_GOLF_ROUNDNAME.getData_testEnvironment());
    }
}
