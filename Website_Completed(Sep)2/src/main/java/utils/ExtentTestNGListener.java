package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//Extent listner class

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.model.ReportStats;

import io.qameta.allure.Allure;

public class ExtentTestNGListener implements ITestListener, ISuiteListener {
	String testName;
	public InputStream is;

	static Date d = new Date();
	static String fileName = "Extent_" + d.toString().replace(":", "_").replace(" ", "_") + ".html";
	//static String AllureFileName = "Allure" + d.toString().replace(":", "_").replace(" ", "_") + ".html";
	
	private static ExtentReports extent = ExtentManager
			.createInstance(System.getProperty("user.dir") + "\\reports\\" + fileName);

	public static ThreadLocal<ExtentTest> testReport = new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {

		ExtentTest test = extent
				.createTest(result.getTestClass().getName() + "     @TestCase : " + result.getMethod().getMethodName());
		testReport.set(test);
		testReport.get().info(result.getMethod().getDescription());
		

	}

	public void onTestSuccess(ITestResult result) {

		String methodName = result.getMethod().getMethodName();
		ExtentManager.captureScreenshot();
		testReport.get().pass("<b>" + "<font color=" + "green>" + "Screenshot of pass" + "</font>" + "</b>",
				MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.destFile).build());
		String logText = "<b>" + "TEST CASE:- " + methodName.toUpperCase() + " PASSED" + "</b>";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
		testReport.get().pass(m);

	}

	public void onTestFailure(ITestResult result) {

		String excepionMessage = Arrays.toString(result.getThrowable().getStackTrace());

		testReport.get()
				.fail("<details>" + "<summary>" + "<b>" + "<font color=" + "red>" + "Exception Occured:Click to see"
						+ "</font>" + "</b >" + "</summary>" + excepionMessage.replaceAll(",", "<br>") + "</details>"
						+ " \n");
		ExtentManager.captureScreenshot();
		testReport.get().fail("<b>" + "<font color=" + "red>" + "Screenshot of failure" + "</font>" + "</b>",
				MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.destFile).build());

		String failureLogg = "TEST CASE FAILED";
		Markup m = MarkupHelper.createLabel(failureLogg, ExtentColor.RED);
		testReport.get().log(Status.FAIL, m);
		
		//Allure Screenshot
		
		try {
			is = new FileInputStream(ExtentManager.destFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Allure.addAttachment("Screenshot", is);

	}

	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		String logText = "<b>" + "Test Case:- " + methodName + " Skipped" + "</b>";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
		testReport.get().skip(m);

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}
	
	public static class ReportUtil {

	    public static void logStepWithScreenshot(String message) {
	        try {
	            // Capture screenshot and store path in ExtentManager.destFile
	            ExtentManager.captureScreenshot();

	            // Log the message with screenshot to Extent report
	            ExtentTest test = ExtentTestNGListener.testReport.get();
	            if (test != null) {
	                test.info(message,
	                        MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.destFile).build());
	            } else {
	                System.out.println("Test report instance is null. Cannot log message: " + message);
	            }

	            // Also attach screenshot to Allure
	            FileInputStream is = new FileInputStream(ExtentManager.destFile);
	            Allure.addAttachment("Screenshot", is);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

		if (extent != null) {

			extent.flush();
		}

	}

}