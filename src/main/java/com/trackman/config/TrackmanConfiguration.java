package com.trackman.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TrackmanConfiguration {
        public static TrackmanConfigModel getBaseConfiguration() throws IOException {
            Properties props = loadProperties();
            return new TrackmanConfigModel(
                    props.getProperty("trackman.platform_name"),
                    props.getProperty("trackman.device_name_os"),
                    props.getProperty("trackman.appPackage"),
                    props.getProperty("trackman.appActivity"),
                    props.getProperty("trackman.automation_name"),
                    props.getProperty("trackman.local.appium.url")
            );
        }

        public static Properties loadProperties() throws IOException {
            Properties configuration = new Properties();
            InputStream inputStream = TrackmanConfiguration.class
                    .getClassLoader()
                    .getResourceAsStream("application.properties");
            configuration.load(inputStream);
            inputStream.close();
            return configuration;
        }

    }
