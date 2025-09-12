/*package utils;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utils.ScreenshotUtils;
import utils.SeleniumDriver;

import java.io.IOException;

import org.testng.*;

public class ExtentTestNGListener implements ITestListener {
    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> testThread = new ThreadLocal<>();

    @Override
    public void onStart(ITestContext context) {
        if (extent == null) {
            String reportPath = System.getProperty("user.dir") + "/reports/ExtentReport.html";
            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
            try {
				spark.loadXMLConfig(System.getProperty("user.dir") + "/reports/extent-config.xml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            extent = new ExtentReports();
            extent.attachReporter(spark);
            extent.setSystemInfo("Tester", "Automation Engineer");
            extent.setSystemInfo("Environment", "PreProd");
        }
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest test = extent.createTest(result.getMethod().getMethodName());
        testThread.set(test);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        String screenshotPath = ScreenshotUtils.captureScreenshot(
            SeleniumDriver.getDriver(), result.getMethod().getMethodName(), "PASS"
        );
        testThread.get().pass("Test passed")
                  .addScreenCaptureFromPath(screenshotPath);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String screenshotPath = ScreenshotUtils.captureScreenshot(
            SeleniumDriver.getDriver(), result.getMethod().getMethodName(), "FAIL"
        );
        testThread.get().fail("Test failed: " + result.getThrowable())
                  .addScreenCaptureFromPath(screenshotPath);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        testThread.get().skip("Test skipped: " + result.getThrowable());
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}*/
package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.*;

import java.io.IOException;

public class ExtentTestNGListener implements ITestListener {

    private static ThreadLocal<ExtentTest> testThread = new ThreadLocal<>();
    private static ExtentTest summaryNode; // keep reference to summary node

    @Override
    public void onStart(ITestContext context) {
        try {
            ExtentReports extent = ExtentManager.getInstance();
            // Create summary node FIRST so it stays at the top of the report
            summaryNode = extent.createTest("Execution Summary");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestStart(ITestResult result) {
        try {
            ExtentTest test = ExtentManager.createTest(
                    result.getMethod().getMethodName(),
                    result.getMethod().getDescription()
            );
            testThread.set(test);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        String screenshotPath = ScreenshotUtils.captureScreenshot(
                SeleniumDriver.getDriver(), result.getMethod().getMethodName(), "PASS"
        );
        testThread.get().pass("Test Passed")
                  .addScreenCaptureFromPath(screenshotPath);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String screenshotPath = ScreenshotUtils.captureScreenshot(
                SeleniumDriver.getDriver(), result.getMethod().getMethodName(), "FAIL"
        );
        testThread.get().fail("Test Failed: " + result.getThrowable())
                  .addScreenCaptureFromPath(screenshotPath);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        String screenshotPath = ScreenshotUtils.captureScreenshot(
                SeleniumDriver.getDriver(), result.getMethod().getMethodName(), "SKIP"
        );
        testThread.get().skip("Test Skipped: " + result.getThrowable())
                  .addScreenCaptureFromPath(screenshotPath);
    }

    @Override
    public void onFinish(ITestContext context) {
        int total = context.getAllTestMethods().length;
        int passed = context.getPassedTests().size();
        int failed = context.getFailedTests().size();
        int skipped = context.getSkippedTests().size();

        if (summaryNode != null) {
            summaryNode.info("Total Tests: " + total);
            summaryNode.pass("Passed: " + passed);
            summaryNode.fail("Failed: " + failed);
            summaryNode.skip("Skipped: " + skipped);
        }

        try {
            ExtentManager.getInstance().flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


