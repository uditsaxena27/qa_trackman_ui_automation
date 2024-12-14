package com.trackman.config;

public enum TestData {
    TRACKMAN_USERNAME("foreignetrour12345@gmail.com", "foreigntour27@gmail.com"),
    TRACKMAN_PASSWORD("Testtest","Testtest"),
    TRACKMAN_FULLNAME("Automation Tester123","Production Automation"),
    TRACKMAN_PLAYERNAME("PlayerAutomationTester3","PlayerAutomationProduction"),
    TRACKMAN_LOGIN_USERNAME("foreigntour27@gmail.com", "foreigntour27@gmail.com"),
    TRACKMAN_GOLF_ROUNDNAME("Test Golf",""),
    TRACKMAN_GOLF_FIELDNAME("Lakeside Golf","Prod Lakeside Golf"),
    TRACKMAN_UPDATE_GOLF_ROUNDNAME("New Golf","New Golf"),
    TRACKMAN_DUPLICATE_GOLF_ROUNDNAME("Golfer" ,"Golf");
    private final String test;
    private final String production;

    TestData(String test, String production) {

        this.test = test;
        this.production= production;
    }

    public String getData_testEnvironment() {
        return test;
    }
    public String getData_productionEnvironment() {
        return production;
    }

}
