package runners;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.SeleniumDriver;

@CucumberOptions(features = { "src/test/resources/MotorFinance_FeatureFiles/" }, glue = {
		"MotorFinance_Feature_Steps" }, /*tags="@YellowCTABanner",*/ monochrome = true, plugin = {"pretty","html:target/cucumber-html-report/MotorFinance.html",
				"json:target/cucumber-reports/help.json", "junit:target/cucumber-reports/MotorFinance.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty",
		/* "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm" */ })

public class MotorFinance_Runner extends AbstractTestNGCucumberTests {

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
