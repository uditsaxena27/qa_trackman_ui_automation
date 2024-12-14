package com.trackman;

import com.trackman.pages.ResultGolfRoundPage;
import com.trackman.workflow.CreatePlannedRoundsFlow;
import core.BasePage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.trackman.config.TestData.TRACKMAN_GOLF_ROUNDNAME;

public class CreatePlannedRoundsTest extends BasePage {
    private CreatePlannedRoundsFlow createPlannedRoundsFlow;
    ResultGolfRoundPage resultGolfRoundPage;
    @BeforeClass
    public void setUp() {
        createPlannedRoundsFlow = new CreatePlannedRoundsFlow();
        resultGolfRoundPage= new ResultGolfRoundPage();
    }
    @AfterClass
    public void tearDown() {
        // This will clear cache and reset the driver for the next test class
        tearDownDriver();
    }
    @Test
    public void createPlannedRounds() {
            createPlannedRoundsFlow.plannedRoundsCreation(TRACKMAN_GOLF_ROUNDNAME.getData_testEnvironment());
            Assert.assertTrue(resultGolfRoundPage.getMenuButton().isDisplayed(), "Planned Round is not created succesfully");
            resultGolfRoundPage.getMenuButton().click();
            resultGolfRoundPage= new ResultGolfRoundPage();
    }
}
