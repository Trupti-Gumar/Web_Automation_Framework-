package utils;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utils.SeleniumDriver;

public class ExtentManager  {
	private static ExtentReports extent;
	public static String fileName;
	public static String destFile;
	private static final ThreadLocal<ExtentTest> extentTestMap = new ThreadLocal<ExtentTest>();

	public static ExtentReports createInstance(String fileName) {
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(fileName);

		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setDocumentTitle(fileName);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setReportName(fileName);

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Automation Tester", "Trupti Gumar");
		extent.setSystemInfo("Organization", "Aldermore");
		extent.setSystemInfo("Project Name", "CMS");
		
		return extent;
	}

	public static void captureScreenshot() {
		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		File screenshot = ((TakesScreenshot) SeleniumDriver.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			
			destFile = "C:\\Users\\Trupti.Gumar\\git\\Web_Automation_Framework-\\Website_Completed(Sep)2\\screenshots\\" +fileName;
			//C:\Users\Trupti.Gumar\git\Web_Automation_Framework-\Website_Completed(Sep)2
			//destFile = "C:\\Users\\Vasantrao.Kulkarni\\eclipse-workspace\\FormAutomation\\Screenshots\\" + fileName;
			FileUtils.copyFile(screenshot, new File(destFile));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.setProperty("org.uncommons.reportng.escape-output", "false");

	}
	/*
	 * public static synchronized ExtentTest createTest(String testName) {
	 * ExtentTest test = extent.createTest(testName); extentTestMap.set(test);
	 * return test; }
	 */
	//log4j.rootLogger=INFO, CONSOLE;
	//log4j.logger.freemarker.cache = INFO, CONSOLE

}