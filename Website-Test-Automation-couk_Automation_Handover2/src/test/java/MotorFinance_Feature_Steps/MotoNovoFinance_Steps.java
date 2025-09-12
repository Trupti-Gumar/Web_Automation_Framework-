package MotorFinance_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.MotoNovoFinance_Actions;
import utils.SeleniumDriver;

public class MotoNovoFinance_Steps {
	
	MotoNovoFinance_Actions motoNovoFinance_Actions = new MotoNovoFinance_Actions();

	@Given("I am on Aldermore home page")
	public void i_am_on_aldermore_home_page() {
	    
		SeleniumDriver.openPage(SeleniumDriver.getPageUrl());

		try {

			boolean isCookieButtonPresent = SeleniumDriver.isElementPresent(motoNovoFinance_Actions.AcceptCookiesBtn());

			if (isCookieButtonPresent) {

				SeleniumDriver.waitForElementClickable(motoNovoFinance_Actions.AcceptCookiesBtn());

				SeleniumDriver.clickElementWithJavaScript(motoNovoFinance_Actions.AcceptCookiesBtn());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@When("I navigate to MotoNovo Finance page")
	public void I_navigate_to_MotoNovo_Finance_page() throws InterruptedException {
		SeleniumDriver.clickOnElement(motoNovoFinance_Actions.MotorfinanceLink());
		SeleniumDriver.clickOnElement(motoNovoFinance_Actions.MotoNovoFinanceLink());
	}
	
	@Then("I should be able to click on the {string} link present on the MotoNovo Finance page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_the_link_present_on_the_MotoNovo_Finance_page_and_redirected_to_the_page(String header, String pageTitle) {
		
	   
		String Actual = motoNovoFinance_Actions.MotoNovoFinancePageHeader(pageTitle);
	    String Expected = pageTitle;	    
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
		
}
