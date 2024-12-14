package com.trackman.config;

public class TrackmanConfigModel {
    private final String platform_name;
    private final String device_name_os;
    private final String appPackage;
    private final String appActivity;
    private final String automation_name;
    private final String appium_local_server_url;
//Model
    public TrackmanConfigModel(
            String platform_name,
            String device_name_os,
            String appPackage,
            String appActivity,
            String automation_name,
            String appium_local_server_url)
    {
        this.platform_name = platform_name;
        this.device_name_os = device_name_os;
        this.appPackage = appPackage;
        this.appActivity = appActivity;
        this.automation_name = automation_name;
        this.appium_local_server_url= appium_local_server_url;
    }
    public String getPlatform() {return platform_name;}

    public String getDeviceDetails() {
        return device_name_os;
    }

    public String getAppPackage() {
        return appPackage;
    }

    public String getAppActivity() {
        return appActivity;
    }

    public String getAutomation_Name() {
        return automation_name;
    }

    public String getAppium_local_server_url() { return appium_local_server_url; }

}
