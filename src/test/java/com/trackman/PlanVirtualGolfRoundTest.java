package com.trackman;

import com.trackman.pages.PlanVirtualGolfRoundPage;
import com.trackman.workflow.PlanVirtualGolfRoundFlow;
import core.BasePage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PlanVirtualGolfRoundTest extends BasePage {

    PlanVirtualGolfRoundFlow planVirtualGolfRoundFlow;
    PlanVirtualGolfRoundPage planVirtualGolfRoundPage;
    @BeforeClass
    public void setupPage() {
        planVirtualGolfRoundFlow= new PlanVirtualGolfRoundFlow();
        planVirtualGolfRoundPage= new PlanVirtualGolfRoundPage();
    }
    @AfterClass
    public void tearDown() {
        // This will clear cache and reset the driver for the next test class
        tearDownDriver();
    }
    @Test
    public void run()
    {
    planVirtualGolfRoundFlow.VirtualGolfRound();
    }
    @Test(priority = 1)
    public void testCloseButtonPresence() {
        Assert.assertNotNull(planVirtualGolfRoundPage.getCloseButton(), "Close Button is not present on the page.");
    }

    @Test(priority = 2)
    public void testToolbarTextPresence() {
        Assert.assertNotNull(planVirtualGolfRoundPage.get_ToolbarText(), "Toolbar Text is not present on the page.");
    }

    @Test(priority = 3)
    public void testRoundNameSearchBoxPresence() {
        Assert.assertNotNull(planVirtualGolfRoundPage.getRoundNameSearchBox(), "Round Name Search Box is not present on the page.");
    }

    @Test(priority = 4)
    public void testCourseImagePresence() {
        Assert.assertNotNull(planVirtualGolfRoundPage.getCourseImage(), "Course Image is not present on the page.");
    }

    @Test(priority = 5)
    public void testCourseNamePresence() {
        Assert.assertNotNull(planVirtualGolfRoundPage.getCourseName(), "Course Name Text is not present on the page.");
    }

    @Test(priority = 6)
    public void testSaveRoundButtonPresence() {
        Assert.assertNotNull(planVirtualGolfRoundPage.getSaveRoundButton(), "Save Round Button is not present on the page.");
    }
}

