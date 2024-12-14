package com.trackman.action;

import com.trackman.pages.PlanVirtualGolfRoundPage;
import com.trackman.utils.MobileActionUtils;
import com.trackman.workflow.BrowseAllCoursesFlow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static core.BasePage.driver;

public class PlanVirtualGolfRoundAction {
   PlanVirtualGolfRoundPage planVirtualGolfRoundPage = new PlanVirtualGolfRoundPage();

    MobileActionUtils mobileActionUtils = new MobileActionUtils();

    public String fetchToolbarText() {
       return planVirtualGolfRoundPage.get_ToolbarText().getText();
    }

    public void clickRoundNameSearchBox() {
        mobileActionUtils.clickOnElement(planVirtualGolfRoundPage.getRoundNameSearchBox());
    }
    public void setRoundNameSearchBox(String roundName) {
        mobileActionUtils.passValueOnField(planVirtualGolfRoundPage.getRoundNameSearchBox(),roundName);
        driver.hideKeyboard();
    }

    public void clickSaveRoundButton() {
        mobileActionUtils.clickOnElement(planVirtualGolfRoundPage.getSaveRoundButton());
    }


}
