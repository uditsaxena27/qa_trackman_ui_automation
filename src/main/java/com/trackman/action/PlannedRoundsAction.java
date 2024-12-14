package com.trackman.action;

import com.trackman.pages.PlannedRoundsPage;
import com.trackman.utils.MobileActionUtils;
import com.trackman.workflow.BrowseAllCoursesFlow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

import static com.trackman.config.TestData.TRACKMAN_GOLF_FIELDNAME;
import static com.trackman.config.TestData.TRACKMAN_GOLF_ROUNDNAME;
import static core.BasePage.driver;

public class PlannedRoundsAction {
    private static final Logger logger = LoggerFactory.getLogger(BrowseAllCoursesFlow.class);

    PlannedRoundsPage plannedRoundsPage = new PlannedRoundsPage();
    MobileActionUtils mobileActionUtils = new MobileActionUtils();
    // All Action Methods of Planned Round Page

    public void click_plannedRoundsTile()
    {
        mobileActionUtils.clickOnElement(plannedRoundsPage.get_plannedRoundsTile());
    }

    public void click_mainContainer()
    {
        mobileActionUtils.clickOnElement(plannedRoundsPage.get_mainContainer());
    }
    public void click_actionButton()
    {
        mobileActionUtils.clickOnElement(plannedRoundsPage.get_actionButton());
    }
    public void click_searchBox()
    {
        mobileActionUtils.clickOnElement(plannedRoundsPage.get_searchBox());
       mobileActionUtils.passValueOnField(plannedRoundsPage.get_searchBox(), TRACKMAN_GOLF_FIELDNAME.getData_testEnvironment());
        driver.hideKeyboard();
    }
    public void click_virtualGoldRoundButton()
    {
        mobileActionUtils.clickOnElement(plannedRoundsPage.get_virtualGoldRoundButton());
    }
    public void click_roundNameBox(String roundName)
    {
        mobileActionUtils.clickOnElement(plannedRoundsPage.select_searchBoxRoundName());
        plannedRoundsPage.select_searchBoxRoundName().clear();
        mobileActionUtils.passValueOnField(plannedRoundsPage.select_searchBoxRoundName(),roundName);
        driver.hideKeyboard();
    }

    public void click_saveRoundButton()
    {
        mobileActionUtils.clickOnElement(plannedRoundsPage.get_saveRoundButton());
    }
    public void fetch_roundNameTextView()
    {
        if(Objects.equals(plannedRoundsPage.get_roundNameTextView().getText(), TRACKMAN_GOLF_ROUNDNAME.getData_testEnvironment()))
        {
            logger.info("Virtual Gold Round is created");
        }
    }
    public void click_courseImage()
    {
        mobileActionUtils.clickOnElement(plannedRoundsPage.get_courseImage());
    }

}
