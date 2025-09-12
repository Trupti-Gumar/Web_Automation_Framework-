package MotorFinance_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.MotorFinance_Actions;
import utils.SeleniumDriver;

public class MotorFinance_Steps {
	
	MotorFinance_Actions motorFinance_Actions = new MotorFinance_Actions();

	@Given("I am on the Aldermore home page")
	public void i_am_on_the_aldermore_home_page() {
	    
		SeleniumDriver.openPage(SeleniumDriver.getPageUrl());

		try {

			boolean isCookieButtonPresent = SeleniumDriver.isElementPresent(motorFinance_Actions.AcceptCookiesBtn());

			if (isCookieButtonPresent) {

				SeleniumDriver.waitForElementClickable(motorFinance_Actions.AcceptCookiesBtn());

				SeleniumDriver.clickElementWithJavaScript(motorFinance_Actions.AcceptCookiesBtn());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@When("I navigate to Motor Finance page")
	public void I_navigate_to_Motor_Finance_page() {
	    
		SeleniumDriver.clickOnElement(motorFinance_Actions.MotorfinanceLink());
		SeleniumDriver.clickOnElement(motorFinance_Actions.MotorFinanceLink());
	}
	
	@Then("I should be able to click on the {string} link present on the Motor Finance page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_the_link_present_on_the_Motor_Finance_page_and_redirected_to_the_page(String header, String title) {
	   
		String Actual = motorFinance_Actions.MotorFinancePageHeader(header);
	    String Expected = title;
	    
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
		
}
