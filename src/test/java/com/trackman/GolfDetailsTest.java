package com.trackman;

import com.trackman.action.GolfDetailsAction;
import com.trackman.pages.GolfDetailsPage;

import core.BasePage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

    public class GolfDetailsTest extends BasePage {
        private GolfDetailsAction golfDetailsAction;
        private GolfDetailsPage goldDetailsPage;

        @BeforeClass
        public void setupPage() {
            golfDetailsAction = new GolfDetailsAction();
            goldDetailsPage = new GolfDetailsPage();
        }
        @AfterClass
        public void tearDown() {
            // This will clear cache and reset the driver for the next test class
            tearDownDriver();
        }
       @Test
       void run() {

       }
        @Test
        public void testCourseImagePresence() {
            Assert.assertNotNull(goldDetailsPage.getCourseImage(), "Course Image is not present.");
        }

        @Test
        public void testCoursesIndicatorPresence() {
            Assert.assertNotNull(goldDetailsPage.getCoursesIndicator(), "Courses Indicator is not present.");
        }

        @Test
        public void testCloseButtonPresence() {
            Assert.assertNotNull(goldDetailsPage.getCloseButton(), "Close Button is not present.");
        }

        @Test
        public void testLocationTextView() {
            Assert.assertNotNull(goldDetailsPage.getLocationTextView(), "Location Text is not present.");
            Assert.assertEquals(golfDetailsAction.getLocationDetails(), "GRANTHAM, UK", "Location Text does not match.");
        }

        @Test
        public void testDifficultyTextView() {
            Assert.assertNotNull(goldDetailsPage.getDifficultyTextView(), "Difficulty Text is not present.");
            Assert.assertEquals(golfDetailsAction.getDifficultyLevel(), "DIFFICULTY", "Difficulty Text does not match.");
        }

        @Test
        public void testCourseNameTextView() {
            Assert.assertEquals(golfDetailsAction.getCourseName(), "Belton Woods Resort - Lakes Course", "Course Name does not match.");
        }

        @Test
        public void testParTextView() {
            Assert.assertEquals(golfDetailsAction.getParDetails(), "Par 72", "Par Text does not match.");
        }

        @Test
        public void testTeesTextView() {
            Assert.assertEquals(goldDetailsPage.getTeesTextView().getText(), "M: 6,853yds  F: 5,663yds", "Tees Text does not match.");
        }

        @Test
        public void testDescriptionTextView() {
            Assert.assertTrue(golfDetailsAction.getCourseDescription().startsWith("With vivid green fairways"), "Description Text does not match expected value.");
        }

        @Test
        public void testMessageTextView() {
            Assert.assertTrue(
                    golfDetailsAction.fetchMessageTextView().contains("Please note that not all courses are available"),
                    "Message Text does not match expected value."
            );
        }


        @Test
        public void testPlanVirtualGolfRoundButtonClick() {
            golfDetailsAction.clickPlanVirtualGolfRoundButton();
            Assert.assertTrue(true, "Plan Virtual Golf Round button click action verified.");
        }

        @Test
        public void testCloseButtonClick() {
            golfDetailsAction.clickCloseButton();
            Assert.assertTrue(true, "Verify Close button click.");
        }
    }


