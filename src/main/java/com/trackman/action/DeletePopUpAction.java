package com.trackman.action;

import com.trackman.pages.DeletePopUpPage;
import com.trackman.utils.MobileActionUtils;

public class DeletePopUpAction {
    DeletePopUpPage deletePopUpPage;
    MobileActionUtils mobileActionUtils;
    public DeletePopUpAction()
    {
        deletePopUpPage = new DeletePopUpPage();
        mobileActionUtils = new MobileActionUtils();
    }
    // Action
    public void verify_popUpText()
    {
        mobileActionUtils.elementIsPresent(deletePopUpPage.popUpText());
    }

    public void validate_cancelButton()
    {
        mobileActionUtils.elementIsPresent(deletePopUpPage.cancelButton());
    }
    public void validate_deleteButton()
    {
        mobileActionUtils.clickOnElement(deletePopUpPage.deleteButton());
    }
}
