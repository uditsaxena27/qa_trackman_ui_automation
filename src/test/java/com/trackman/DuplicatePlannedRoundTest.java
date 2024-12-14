package com.trackman;

import com.trackman.workflow.DuplicatePlannedRoundFlow;
import core.BasePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class DuplicatePlannedRoundTest extends BasePage {
    private DuplicatePlannedRoundFlow duplicatePlannedRoundFlow;

    @BeforeClass
    public void setUp() {
        duplicatePlannedRoundFlow = new DuplicatePlannedRoundFlow();
    }
    @AfterClass
    public void tearDown() {
        // This will clear cache and reset the driver for the next test class
        tearDownDriver();
    }
    @Test
    public void testDuplicateRound() {
        duplicatePlannedRoundFlow.duplicatePlannedFlow("Tiger");
    }
}