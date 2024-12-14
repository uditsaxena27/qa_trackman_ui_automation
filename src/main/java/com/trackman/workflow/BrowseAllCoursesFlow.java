package com.trackman.workflow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.trackman.action.BrowseAllCoursesAction;
import com.trackman.action.HomeAction;

public class BrowseAllCoursesFlow {
BrowseAllCoursesAction browseAllCoursesAction;
HomeAction homeAction;
private static final Logger logger = LoggerFactory.getLogger(BrowseAllCoursesFlow.class);

public BrowseAllCoursesFlow()
    {
        browseAllCoursesAction= new BrowseAllCoursesAction();
        homeAction= new HomeAction();
    }
    public void browseAllCourses() {
        logger.info("<---Browse All Courses script is running--->");
        homeAction.click_allowButton();
        browseAllCoursesAction.click_get_browseAllButton();
        browseAllCoursesAction.enter_searchTerm();
        browseAllCoursesAction.click_courseButton();

    }

}
