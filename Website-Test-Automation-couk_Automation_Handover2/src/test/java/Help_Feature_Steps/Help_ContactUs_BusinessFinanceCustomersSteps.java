package Help_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.actions.Help_ContactUs_BusinessFinanceCustomersActions;
import utils.SeleniumDriver;


public class Help_ContactUs_BusinessFinanceCustomersSteps {
	
	Help_ContactUs_BusinessFinanceCustomersActions help_contactus_businessFinanceCustomerAction = new 
			Help_ContactUs_BusinessFinanceCustomersActions();
  
	@Given("On Aldermore page")
	public void i_am_on_a_aldermore_page() throws InterruptedException {
		SeleniumDriver.openPage(SeleniumDriver.getPageUrl());
		try {
		boolean Cookies = SeleniumDriver.isElementPresent(help_contactus_businessFinanceCustomerAction.OneTrustCookies());
		if(Cookies = true) {
			
			SeleniumDriver.waitForElementClickable(help_contactus_businessFinanceCustomerAction.OneTrustCookies());
			SeleniumDriver.clickElement(help_contactus_businessFinanceCustomerAction.OneTrustCookies(), "Accept All Cookies");

		}
		}
		catch(Exception e)
		{
			
		}
	}
	
	@Then("I navigate to ContactUs page under Help and Support option")
	public void i_navigate_to_contact_us_page_under_help_and_support_option() {

		help_contactus_businessFinanceCustomerAction.HelpLink();
		help_contactus_businessFinanceCustomerAction.ContactUSLink();
	}
	
	@Then("See {string} CTA button")
	public void See_card_CTA_button(String name) {
		String Actual = help_contactus_businessFinanceCustomerAction.getCardName();
		String Expected = name;
		assertEquals(Actual, Expected);
	}
	
	@And("clicked CTA card button")
	public void Clicked_CTA_card_button() {
		help_contactus_businessFinanceCustomerAction.ClickOnCTAButton();
	}
	
	@Then("naviagated to respective {string} page")
	public void Navigated_to_respective_Page(String header) {
		String Actual = help_contactus_businessFinanceCustomerAction.getBusinessFinancePageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I navigate to Business finance customers page")
	public void i_navigated_to_Business_finance_customer_page() {
		help_contactus_businessFinanceCustomerAction.ClickOnCTAButton();
	}
	
	@Then("I should see {string} under the page")
	public void i_should_see_Cardheader_under_the_page(String header) {
		String Actual = help_contactus_businessFinanceCustomerAction.getSubheader();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should be click on Business Finance contact information accordian and it should expand")
	public void i_should_click_on_business_finance_contact_information_accordian_and_it_should_expand() {
		help_contactus_businessFinanceCustomerAction.ClickExpandOptions();
		boolean Actual = SeleniumDriver.isElementPresent(help_contactus_businessFinanceCustomerAction.getOptions());
		boolean Expected = true;
		SeleniumDriver.moveToElement(help_contactus_businessFinanceCustomerAction.getOptions());
	    assertEquals(Actual, Expected);
		
	}
}
