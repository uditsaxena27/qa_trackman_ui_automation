package com.trackman;

import com.trackman.action.HomeAction;
import core.BasePage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeTest extends BasePage {
    private HomeAction homeTest;
    @BeforeClass
    public void setUp() {
        homeTest = new HomeAction(); // Instantiate LoginTest after driver setup
    }
    @AfterClass
    public void tearDown() {
        // This will clear cache and reset the driver for the next test class
        tearDownDriver();
    }
    @Test
    public void validateHome() {
        homeTest.homePage();
    }

    @Test(priority = 1)
    public void validate_MyPlannedRoundsView() {
        Assert.assertTrue(homeTest.verify_MyPlannedRoundsView(),"My Planned Rounds is not getting displayed");
    }

    @Test(priority =2 )
    public void validate_BrowseCoursesCard() {
        Assert.assertTrue(homeTest.verify_BrowseCoursesCard(),"Browse All Courses is not getting displayed");
    }

    @Test(priority =3 )public void validate_QuickLoginButton() {
        Assert.assertTrue(homeTest.verify_QuickLoginButton(),"Quick Login Button is not getting displayed");
    }

    @Test(priority = 4)public void validate_PlayView() {
        Assert.assertTrue(homeTest.verify_PlayView(),"Play View is not getting displayed");
    }

    @Test(priority = 5)public void validate_MeTab() {
        Assert.assertTrue(homeTest.verify_MeTab(),"Me Tab is not getting displayed");
    }


    @Test(priority =6)public void validate_NewTab() {
        Assert.assertTrue(homeTest.verify_NewTab(),"New Tab is not getting displayed");
    }

    @Test(priority = 7)public void validate_TournamentsTab() {
        Assert.assertTrue(homeTest.verify_TournamentsTab(),"Tournaments Tab is not getting displayed");
    }

    @Test(priority =8)public void validate_LocationsTab() {
        Assert.assertTrue(homeTest.verify_LocationsTab(),"Locations Tab is not getting displayed");
    }
}


