package com.trackman.action;

import com.trackman.pages.ResultGolfRoundPage;
import com.trackman.utils.MobileActionUtils;
import com.trackman.workflow.BrowseAllCoursesFlow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class ResultGoldRoundAction {
    private static final Logger logger = LoggerFactory.getLogger(BrowseAllCoursesFlow.class);

    ResultGolfRoundPage resultGoldRoundPage;
    MobileActionUtils mobileActionUtils;
    public ResultGoldRoundAction()
    {
        resultGoldRoundPage = new ResultGolfRoundPage();
        mobileActionUtils = new MobileActionUtils();
    }
    // Action
    public void click_getMenuButton()
    {
        mobileActionUtils.clickOnElement(resultGoldRoundPage.getMenuButton());
    }
    public boolean verify_MenuButton()
    {
        return mobileActionUtils.elementIsPresent(resultGoldRoundPage.getMenuButton());
    }

    void verify_bottomSheetTitle()
    {
        Assert.assertEquals(resultGoldRoundPage.bottomSheetTitle().getText(),"Test Golf");
    }
    public String return_bottomSheetTitle()
    {
        return resultGoldRoundPage.bottomSheetTitle().getText();
    }
    public void click_editRoundButton()
    {
        mobileActionUtils.clickOnElement(resultGoldRoundPage.editRoundButton());
    }
    public void click_duplicateRoundButton()
    {
        mobileActionUtils.clickOnElement(resultGoldRoundPage.duplicateRoundButton());
    }

    public void click_deleteRoundButton()
    {
        mobileActionUtils.clickOnElement(resultGoldRoundPage.deleteRoundButton());
    }
    public void verifyTitleAfterDelete()
    {
        if(resultGoldRoundPage.getTitleAfterDelete().getText().equals("My planned rounds"))
        {
            logger.info("Golf Booking Deleted");
        }
    }
    public String return_roundNameTitle()
    {
        return resultGoldRoundPage.roundNameTitle().getText();
    }


}
