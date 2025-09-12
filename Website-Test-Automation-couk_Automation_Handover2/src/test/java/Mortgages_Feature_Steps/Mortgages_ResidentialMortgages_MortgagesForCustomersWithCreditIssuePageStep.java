package Mortgages_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.Mortgages_ResidentialMortgages_MortgagesForCustomersWithCreditIssuePageActions;
import utils.SeleniumDriver;

public class Mortgages_ResidentialMortgages_MortgagesForCustomersWithCreditIssuePageStep{
	Mortgages_ResidentialMortgages_MortgagesForCustomersWithCreditIssuePageActions CustomerCreditIssue = 
			new Mortgages_ResidentialMortgages_MortgagesForCustomersWithCreditIssuePageActions();
	
	
	@Given("I am on Aldermore page")
	public void i_am_on_aldermore_page(){
		SeleniumDriver.openPage(SeleniumDriver.getPageUrl());
	}
	
	@When("I navigate to Mortgages dropdown options")
	public void i_navigate_to_mortgages_dropdown_options() {
		SeleniumDriver.clickElement(CustomerCreditIssue.MortgageNavigationLink(), "Mortgages for customers with credit issues");
	}
	
	@Then("I should see {string} in the dropdown")
	public void i_should_see_option_in_the_dropdown(String header) {
		String Actual = CustomerCreditIssue.gettheOption();
		String Expected = header;
		assertEquals(Actual, Expected);
		
		
	}
	
	@When ("I click on the option")
	public void i_click_on_the_option(){
		CustomerCreditIssue.clickontheOption();
		
	}

	@Then ("I should be redirected to {string} page")
	public void i_should_be_redirected_to_title_page(String header) {
		String Actual = CustomerCreditIssue.getTheRedirectedPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I navigate to Mortgages for customers with credit issue page")
	public void i_navigate_to_mortgages_for_customer_with_credit_issue_page() {
		CustomerCreditIssue.clickontheOption();
	}
	
	@Then("I should see the {string} on Image section in the page")
	public void i_should_see_the_header_on_image_section_in_the_page(String header) {
		String Actual = CustomerCreditIssue.verifyTheHeader();
		String Expected = header; 
		assertEquals(Actual, Expected);
	}
	
	@And("I should see the Customer Credit mortgages FAQs header {string} on page") 
	public void i_should_see_the_Customer_credit_mortgage_FAQs_header_on_page(String header) {
		
		String Actual = CustomerCreditIssue.getFAQsHeader();
		String Expected = header;
		assertEquals(Actual, Expected);
		
	}
	
	@And("I should see the more card header {string} on Customer Credit Issue section")
	public void i_should_see_the_more_card_header_on_FAQs_section(String value) {
		String Actual;
		String Expected;
		switch(value) {
		case "Not found what you're looking for?":
			Actual = CustomerCreditIssue.getMorecardheader();
			Expected = "Not found what you're looking for?";
			break;
		default:
			throw new IllegalArgumentException("Invalid value: " + value);
		}
		assertEquals(Actual, Expected);
		
	}
	
	
	@And("I should click on CTA button and should be redirected to {string} page")
	public void i_should_click_on_FAQs_CTA_button_and_should_be_redirected_to(String header)
	{
		String Actual = CustomerCreditIssue.getMorecardCTA();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("I should see {string} present on the page")
	public void i_should_see_cardheader_present_on_the_page(String header) {
		String Actual = CustomerCreditIssue.verifyTheCardHeader(header);
		String Expected = header;
		assertEquals(Actual, Expected);
		
	}
}
