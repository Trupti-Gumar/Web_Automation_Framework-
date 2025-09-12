package MotorFinance_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.MotorFinancebyMotoNovo_Actions;
import utils.SeleniumDriver;

public class MotorFinancebyMotoNovo_Steps {
	
	MotorFinancebyMotoNovo_Actions motorFinancebyMotoNovo_Actions = new MotorFinancebyMotoNovo_Actions();

	@Given("I am on a Aldermore home page")
	public void i_am_on_a_aldermore_home_page() {
	    
		SeleniumDriver.openPage(SeleniumDriver.getPageUrl());

		try {

			boolean isCookieButtonPresent = SeleniumDriver.isElementPresent(motorFinancebyMotoNovo_Actions.AcceptCookiesBtn());

			if (isCookieButtonPresent) {

				SeleniumDriver.waitForElementClickable(motorFinancebyMotoNovo_Actions.AcceptCookiesBtn());

				SeleniumDriver.clickElementWithJavaScript(motorFinancebyMotoNovo_Actions.AcceptCookiesBtn());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@When("I navigate to Motor Finance By MotoNovo page")
	public void I_navigate_to_Motor_Finance_By_MotoNovo_page() {
	    
		SeleniumDriver.clickOnElement(motorFinancebyMotoNovo_Actions.MotorfinanceLink());
		SeleniumDriver.clickOnElement(motorFinancebyMotoNovo_Actions.MotorFinancebyMotoNovoLink());
	}
	
	@Then("I should see the {string} as the header for the Motor Finance By MotoNovo page")
	public void i_should_see_the_as_the_header_for_the_Motor_Finance_By_MotoNovo_page(String header) {

		String Actual = SeleniumDriver.GetElementText(motorFinancebyMotoNovo_Actions.MotorFinancebyMotoNovoPageHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}
		
	@Then("I should see the {string} as the header for the Masthead black box on the Motor Finance By MotoNovo page")
	public void i_should_see_the_as_the_header_for_the_masthead_black_box_on_the_Motor_Finance_By_MotoNovo_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(motorFinancebyMotoNovo_Actions.MastheadBlackboxHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	} 

	@Then("I should be able to click on the {string} link present on the Motor Finance By MotoNovo page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_the_link_present_on_the_Motor_Finance_By_MotoNovo_page_and_redirected_to_the_page(String header, String title) {
	   
		String Actual = motorFinancebyMotoNovo_Actions.getMastheadBlackboxLinkPage(header);
	    String Expected = title;
	    
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
	
}
