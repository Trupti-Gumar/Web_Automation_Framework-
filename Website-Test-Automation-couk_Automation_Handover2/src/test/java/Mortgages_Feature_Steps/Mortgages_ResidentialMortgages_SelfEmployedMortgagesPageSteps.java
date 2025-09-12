package Mortgages_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.Mortgages_ResidentialMortgages_SelfEmployedMortgagesActions;
import utils.SeleniumDriver;

public class Mortgages_ResidentialMortgages_SelfEmployedMortgagesPageSteps {
	
	Mortgages_ResidentialMortgages_SelfEmployedMortgagesActions SelfEmployed = new Mortgages_ResidentialMortgages_SelfEmployedMortgagesActions();
	
	@Given("I am on a Aldermore page")
	public void i_am_on_a_aldermore_page() throws InterruptedException {
		SeleniumDriver.openPage(SeleniumDriver.getPageUrl());
		try {
		boolean Cookies = SeleniumDriver.isElementPresent(SelfEmployed.OneTrustCookies());
		if(Cookies = true) {
			
			SeleniumDriver.waitForElementClickable(SelfEmployed.OneTrustCookies());
			SeleniumDriver.clickElement(SelfEmployed.OneTrustCookies(), "Accept All Cookies");

		}
		}
		catch(Exception e)
		{
			
		}
	}
	
	@When("I navigate to Mortgage dropdown option")
	public void i_navigate_to_mortgages_dropdown_option() throws InterruptedException {
		SeleniumDriver.clickElement(SelfEmployed.MortgageNavigationLink(), "Mortgages Navigation Link");
	}
	
	@Then("I should see {string} in dropdown")
	public void i_should_see_menulink_in_dropdown(String header) {
		String Actual = SelfEmployed.verifyTheOption();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("I click on the dropdown option.")
	public void i_click_on_the_dropdown_option() {
		SelfEmployed.Clickontheoption();
	}
	
	@Then("I should be redirected to the option {string}")
	public void i_should_be_redirected_to_the_option(String header) {
		String Actual = SelfEmployed.getPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@And("I navigate to Self-employed mortgages page")
	public void i_navigate_to_Self_Employed_Mortgages_page() {
		SelfEmployed.Clickontheoption();
	}
	
	@Then ("I should see {string} on the Image section")
	public void i_should_see_the_header_on_ImageSection(String header) {
		String Expected = SelfEmployed.verifyResidentialMortgageImageSectionHeader();
		String Actual = header;
		assertEquals(Actual, Expected);
		
	}
	
	@Then("I should see the Self-employed mortgages FAQs {string} on page")
	public void i_should_see_the_self_employed_mortgages_FAQs_on_page(String header) {
		String Actual = SelfEmployed.getFAQsTitle();
		String Expected = header;
        assertEquals(Actual, Expected);
	}
	
	@And("I should see the more card header {string} on Self-Employed page section")
	public void i_should_see_the_more_card_header_on_FAQs_section(String value) {
		String Actual;
		String Expected;
		switch(value) {
		case "Not found what you're looking for?":
			Actual = SelfEmployed.getMorecardheader();
			Expected = "Not found what you're looking for?";
			break;
		default:
			throw new IllegalArgumentException("Invalid value: " + value);
		}
		assertEquals(Actual, Expected);
		
	}
	
	@And("I should click on CTA button and should redirected to {string} page")
	public void i_should_click_on_FAQs_CTA_button_and_should_be_redirected_to(String header)
	{
		String Actual = SelfEmployed.getMorecardCTA();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("I should see {string} present on page")
	public void i_should_see_cardheader_present_on_the_page(String header) {
		String Actual = SelfEmployed.verifyTheCardHeader(header);
		String Expected = header;
		assertEquals(Actual, Expected);
		
	}
	
	
}
