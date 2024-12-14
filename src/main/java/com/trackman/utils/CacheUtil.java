package com.trackman.utils;

import com.trackman.workflow.BrowseAllCoursesFlow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class CacheUtil {
    private static final Logger logger = LoggerFactory.getLogger(BrowseAllCoursesFlow.class);

    public static void clearAppCache(String packageName) {
        try {
            Process process = Runtime.getRuntime().exec("adb shell pm clear " + packageName);
            process.waitFor();
            //logger.info("Cache cleared for Trackman app: " + packageName);
        } catch (IOException | InterruptedException e) {
            logger.info("Error occurred while clearing app cache for Trackman app");
            e.printStackTrace();
        }
    }
}
