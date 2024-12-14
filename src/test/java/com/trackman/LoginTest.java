package com.trackman;

import com.trackman.workflow.LoginFlow;
import core.BasePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends BasePage {
     LoginFlow loginPage;

     @BeforeClass
    public void setUp() {
                                 // driver is initialized first
    loginPage = new LoginFlow(); // Instantiate LoginTest after driver setup
    }
    @AfterClass
    public void tearDown() {
        // This will clear cache and reset the driver for the next test class
        tearDownDriver();
    }
        @Test
        public void testLogin() {
        loginPage.login_Completion();
        }
}
