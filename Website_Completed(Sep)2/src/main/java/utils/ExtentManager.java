/*package utils;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() throws IOException {
        if (extent == null) {
            String reportPath = System.getProperty("user.dir") + "/reports/ExtentReport.html";
            ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
            reporter.loadXMLConfig(System.getProperty("user.dir") + "/reports/extent-config.xml");

            extent = new ExtentReports();
            extent.attachReporter(reporter);
            extent.setSystemInfo("Tester", "Automation Engineer");
            extent.setSystemInfo("Environment", "PreProd");
        }
        return extent;
    }
}*/
package utils;

import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;
    private static ExtentTest test;

    private static String reportPath = System.getProperty("user.dir") + "/reports/ExtentReport.html";
    private static String configPath = System.getProperty("user.dir") + "/reports/extent-config.xml";
    private static String screenshotDir = System.getProperty("user.dir") + "/reports/screenshots/";

    public static ExtentReports getInstance() throws IOException {
        if (extent == null) {
            // Ensure screenshot directory exists
            File screenshotFolder = new File(screenshotDir);
            if (!screenshotFolder.exists()) {
                screenshotFolder.mkdirs();
            }

            ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
            reporter.loadXMLConfig(configPath);

            extent = new ExtentReports();
            extent.attachReporter(reporter);
            extent.setSystemInfo("Automation Engineer", "Trupti Gumar");
            extent.setSystemInfo("Environment", "PreProd");
        }
        return extent;
    }

    public static ExtentTest createTest(String testName, String description) throws IOException {
        test = getInstance().createTest(testName, description);
        return test;
    }

    public static ExtentTest getTest() {
        return test;
    }

    public static String getScreenshotDir() {
        return screenshotDir;
    }
}

