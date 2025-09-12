package Mortgages_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.Mortgages_ResidentialMortgages_FirstTimeBuyerMortgagesActions;
import utils.SeleniumDriver;

public class Mortgages_ResidentialMortgages_FirstTimeBuyerMortgagesPageSteps {
	
	Mortgages_ResidentialMortgages_FirstTimeBuyerMortgagesActions mortgageFirstTime = new Mortgages_ResidentialMortgages_FirstTimeBuyerMortgagesActions();
   
   @Then("I should see {string} as a Link in Mortgage dropdown")
   public void i_should_see_header_as_a_link_in_mortgage_dropdown(String header) {
	   String Actual = mortgageFirstTime.verifytheFirstTimeBuyeroption();
	   String Expected = header;
	   assertEquals(Expected, Actual);
	   
   }

	@When("I click on the option link")
	public void i_click_on_the_option_link() {
		mortgageFirstTime.FirstTimeMortgageHeader();
	}
	
	@Then ("I should be redirected to the Mortgage option {string}")
	public void i_should_be_redirected_to_the_mortgage_opion(String header)
	{
		String Actual = mortgageFirstTime.getFirstTimePageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("I navigate to First time buyer mortgages page")
	public void i_navigate_to_first_time_buyer_mortgage_page() {
		SeleniumDriver.clickOnElement(mortgageFirstTime.mortgageFirstTimelink());
		
	}
	
	@Then("I should see the {string} on Image section")
	public void i_should_see_the_header_on_image_section(String header)
	{
		String Actual = mortgageFirstTime.verifyImageSectionheader(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("I should see the First time mortgages FAQs header {string} on page") 
	public void i_should_see_the_first_time_mortgage_FAQs_header_on_page(String header) {
		
		String Actual = mortgageFirstTime.getFAQsHeader();
		String Expected = header;
		assertEquals(Actual, Expected);
		
	}
	
	@And("I should see the more card header {string} on First timer FAQs section")
	public void i_should_see_the_more_card_header_on_FAQs_section(String value) {
		String Actual;
		String Expected;
		switch(value) {
		case "Not found what you're looking for?":
			Actual = mortgageFirstTime.getMorecardheader();
			Expected = "Not found what you're looking for?";
			break;
		default:
			throw new IllegalArgumentException("Invalid value: " + value);
		}
		assertEquals(Actual, Expected);
		
	}
	
	@And("I should click on FAQs CTA button and should be redirected to {string} page")
	public void i_should_click_on_FAQs_CTA_button_and_should_be_redirected_to(String header)
	{
		String Actual = mortgageFirstTime.getMorecardCTA();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And ("I should see {string} present on the First Timer Buyer Page")
	public void i_should_see_cards_present_on_the_first_timer_buyer(String header) {
		String Actual = mortgageFirstTime.getCardHeaderTitle(header);
		String Expected = header;
		assertEquals(Actual, Expected);
		
	}
	
	@When ("I should click the CTA button present on the Image section")
	public void i_should_Click_the_CTA_button_present_on_the_Image_section()
	{
		mortgageFirstTime.verifytheCTAbuttonPresent();
		mortgageFirstTime.ClickOnCTAButton();
		
	}
	
	@Then("I should be redirected to the CTA button title {string}")
	public void i_should_be_redirected_to_the_CTA_button_title(String header) {
		String Actual = mortgageFirstTime.getPagetTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	
}
