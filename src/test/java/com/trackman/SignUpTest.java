package com.trackman;

import com.trackman.workflow.SignUpFlow;
import core.BasePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SignUpTest extends BasePage {
    private SignUpFlow signUpFlow;
    @BeforeClass
    public void setUp() {
        signUpFlow = new SignUpFlow();
    }
    @AfterClass
    public void tearDown() {
        // This will clear cache and reset the driver for the next test class
        tearDownDriver();
    }
    @Test
    public void testSignUp() {
        signUpFlow.signUp();
    }

}
