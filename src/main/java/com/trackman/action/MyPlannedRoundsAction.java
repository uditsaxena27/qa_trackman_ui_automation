package com.trackman.action;

import com.trackman.pages.MyPlannedRoundsPage;
import com.trackman.utils.MobileActionUtils;

public class MyPlannedRoundsAction {
    MyPlannedRoundsPage myPlannedRoundsPage;
    MobileActionUtils mobileActionUtils;
    public MyPlannedRoundsAction()
    {
        myPlannedRoundsPage = new MyPlannedRoundsPage();
        mobileActionUtils = new MobileActionUtils();
    }
    //Actions
    public void click_actionButton()
    {
        mobileActionUtils.clickOnElement(myPlannedRoundsPage.get_planVirtualGoldRoundButton());
    }
    public void click_getCloseButton()
    {
        mobileActionUtils.clickOnElement(myPlannedRoundsPage.getCloseButton());
    }
    public void click_itemToBeDeleted()
    {
        mobileActionUtils.clickOnElement(myPlannedRoundsPage.itemToBeDeleted());
    }
}
