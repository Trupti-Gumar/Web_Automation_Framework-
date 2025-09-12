package Help_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.Help_ContactUs_SavingsCustomersActions;
import utils.SeleniumDriver;


public class Help_ContactUs_SavingsCustomersSteps {
	
	Help_ContactUs_SavingsCustomersActions help_contactus_savingsCustomerAction = new 
			Help_ContactUs_SavingsCustomersActions();
  
	@Given("On the Aldermore Home page")
	public void i_am_on_aldermore_Home_page() throws InterruptedException {
		SeleniumDriver.openPage(SeleniumDriver.getPageUrl());

		try {

			boolean isCookieButtonPresent = SeleniumDriver.isElementPresent(help_contactus_savingsCustomerAction.AcceptCookiesBtn());

			if (isCookieButtonPresent) {

				SeleniumDriver.waitForElementClickable(help_contactus_savingsCustomerAction.AcceptCookiesBtn());

				SeleniumDriver.clickElementWithJavaScript(help_contactus_savingsCustomerAction.AcceptCookiesBtn());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@When("I navigate to the ContactUs page under Help and Support option")
	public void i_navigate_to_the_contact_us_page_under_help_and_support_option() {
		help_contactus_savingsCustomerAction.HelpLink();
		help_contactus_savingsCustomerAction.ContactUSLink();
	}
	
	@Then("See the {string} CTA button")
	public void See_card_CTA_button(String name) {
		String Actual = help_contactus_savingsCustomerAction.getCardName();
		String Expected = name;
		assertEquals(Actual, Expected);
	}
	
	@And("clicked the CTA card button")
	public void Clicked_the_CTA_card_button() {
		help_contactus_savingsCustomerAction.ClickOnCTAButton();
	}
	
	@Then("navigated to respective {string} page")
	public void Navigated_to_respective_Page(String header) {
		String Actual = help_contactus_savingsCustomerAction.getSavingsCustomersPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I navigate to Savings customers page")
	public void i_navigate_to_Savings_customers_page() {
		help_contactus_savingsCustomerAction.ClickOnCTAButton();
	}
	
	@Then("I should see the {string} under the page")
	public void i_should_see_the_Cardheader_under_the_page(String header) {
		String Actual = help_contactus_savingsCustomerAction.getSubheader();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should be click on Contact information for savings customers accordian and it should expand")
	public void i_should_click_on_Contact_information_for_savings_customers_accordian_and_it_should_expand() {
		help_contactus_savingsCustomerAction.ClickExpandOptions();
		boolean Actual = SeleniumDriver.isElementPresent(help_contactus_savingsCustomerAction.getOptions());
		boolean Expected = true;
		SeleniumDriver.moveToElement(help_contactus_savingsCustomerAction.getOptions());
	    assertEquals(Actual, Expected);
		
	}
}
