package com.trackman;

import com.trackman.action.BrowseAllCoursesAction;
import com.trackman.pages.BrowseAllCoursesPage;
import com.trackman.workflow.BrowseAllCoursesFlow;
import core.BasePage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrowseAllCoursesTest extends BasePage {
    private BrowseAllCoursesFlow browseAllCoursesFlow;
    BrowseAllCoursesPage browseAllCoursesPage;
    BrowseAllCoursesAction browseAllCoursesAction;

    @BeforeClass
    public void setUp() {
        browseAllCoursesFlow = new BrowseAllCoursesFlow();
        browseAllCoursesPage= new BrowseAllCoursesPage();
        browseAllCoursesAction= new BrowseAllCoursesAction();
    }
    @AfterClass
    public void tearDown() {
        // This will clear cache and reset the driver for the next test class
        tearDownDriver();
    }
    @Test
    public void testbrowseAllCourses() {

        browseAllCoursesFlow.browseAllCourses();
    }

    @Test(priority = 2)
    public void validateCloseButton() {

        Assert.assertTrue(browseAllCoursesAction.verify_courseButton(), "Close Button is not getting displayed");
    }

    @Test(priority = 3)
    public void validateLocationButton() {

        Assert.assertTrue(browseAllCoursesAction.verify_LocationTextView(), "Location TextView is not getting displayed");
    }

    @Test(priority = 4)
    public void validateDifficultyText() {

        Assert.assertTrue(browseAllCoursesAction.verify_DificultyTextView(), "Difficulty TextView is not getting displayed");
    }

    @Test(priority = 5)
    public void validateDCourseName() {

        Assert.assertTrue(browseAllCoursesAction.verify_CourseNameTextView(), "Course Name TextView is not getting displayed");
    }

    @Test(priority = 6)
    public void validateParText() {

        Assert.assertTrue(browseAllCoursesAction.verify_ParTextView(), "Par TextView is not getting displayed");
    }

    @Test(priority = 7)
    public void validateTeesText() {

        Assert.assertTrue(browseAllCoursesAction.verify_TeesTextView(), "Tees TextView is not getting displayed");
    }

    @Test(priority = 8)
    public void validateDescription() {

        Assert.assertTrue(browseAllCoursesAction.verify_DescriptionTextView(), "Description TextView is not getting displayed");
    }

    @Test(priority = 9)
    public void validateMessage() {

        Assert.assertTrue(browseAllCoursesAction.verify_MessageTextView(), "Message TextView is not getting displayed");
    }
}

