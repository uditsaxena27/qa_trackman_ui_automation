package com.trackman;

import com.trackman.workflow.ResultGoldRoundFlow;
import core.BasePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ResultGolfRoundTest extends BasePage {

    ResultGoldRoundFlow resultGoldRoundFlow;
    @BeforeClass
    public void setupPage()
        {
            resultGoldRoundFlow = new ResultGoldRoundFlow();
        }
    @AfterClass
    public void tearDown() {
        // This will clear cache and reset the driver for the next test class
        tearDownDriver();
    }
    @Test
    public void run()
        {
            resultGoldRoundFlow.verify_ResultGoldRoundFlow("Test Round");
        }
}
