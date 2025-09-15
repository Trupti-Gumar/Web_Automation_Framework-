package runners;

import org.openqa.selenium.WebDriver;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//tags = "@Savings_Product_Card",

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.SeleniumDriver;

@CucumberOptions(features = { "src/test/resources/HomePage_FeatureFiles/" }, glue = {
		"steps","HomePage_Steps" },tags="@AldermoreHomePage",  monochrome = true, plugin = { "html:target/cucumber-html-report/cucumber.html",
				"json:target/cucumber-reports/cucumber.json", "junit:target/cucumber-reports/cucumber.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty",
				/*"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"*/ })
public class TestRunner extends AbstractTestNGCucumberTests {

	private static WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public static void setUp() {

		SeleniumDriver.setUpDriver();
		driver = SeleniumDriver.getDriver();
		
		SeleniumDriver.initializePropertyFile();
		

	}

	@AfterClass(alwaysRun = true)
	public static void tearDown() {

		SeleniumDriver.tearDown();
	}

}