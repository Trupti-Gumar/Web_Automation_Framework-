package Help_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.Help_ContactUs_MortgageCustomersActions;
import utils.SeleniumDriver;


public class Help_ContactUs_MortgageCustomersSteps {
	
	Help_ContactUs_MortgageCustomersActions help_contactus_MotgagesCustomerAction = new 
			Help_ContactUs_MortgageCustomersActions();
  
	@Given("On this Aldermore Home page")
	public void i_am_on_this_aldermore_Home_page() throws InterruptedException {
		SeleniumDriver.openPage(SeleniumDriver.getPageUrl());

		try {

			boolean isCookieButtonPresent = SeleniumDriver.isElementPresent(help_contactus_MotgagesCustomerAction.AcceptCookiesBtn());

			if (isCookieButtonPresent) {

				SeleniumDriver.waitForElementClickable(help_contactus_MotgagesCustomerAction.AcceptCookiesBtn());

				SeleniumDriver.clickElementWithJavaScript(help_contactus_MotgagesCustomerAction.AcceptCookiesBtn());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@When("I navigate to Contact Us page under Help and Support option")
	public void i_navigate_to_the_contact_us_page_under_help_and_support_option() {
		help_contactus_MotgagesCustomerAction.HelpLink();
		help_contactus_MotgagesCustomerAction.ContactUSLink();
	}
	
	@Then("See this {string} CTA button")
	public void See_this_card_CTA_button(String name) {
		String Actual = help_contactus_MotgagesCustomerAction.getCardName();
		String Expected = name;
		assertEquals(Actual, Expected);
	}
	
	@And("clicked on the CTA card button")
	public void Clicked_on_the_CTA_card_button() {
		help_contactus_MotgagesCustomerAction.ClickOnCTAButton();
	}
	
	@Then("navigate to respective {string} page")
	public void Navigate_to_respective_Page(String header) {
		String Actual = help_contactus_MotgagesCustomerAction.getMortgageCustomersPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I navigate to Mortgage customers page")
	public void i_navigate_to_Mortgage_customers_page() {
		help_contactus_MotgagesCustomerAction.ClickOnCTAButton();
	}
	
	@Then("I should see this {string} under the page")
	public void i_should_see_this_Cardheader_under_the_page(String header) {
		String Actual = help_contactus_MotgagesCustomerAction.getSubheader();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should be click on Contact information for mortgage customers accordian and it should expand")
	public void i_should_click_on_Contact_information_for_mortgage_customers_accordian_and_it_should_expand() {
		help_contactus_MotgagesCustomerAction.ClickExpandOptions();
		boolean Actual = SeleniumDriver.isElementPresent(help_contactus_MotgagesCustomerAction.getOptions());
		boolean Expected = true;
		SeleniumDriver.moveToElement(help_contactus_MotgagesCustomerAction.getOptions());
	    assertEquals(Actual, Expected);
		
	}
}
