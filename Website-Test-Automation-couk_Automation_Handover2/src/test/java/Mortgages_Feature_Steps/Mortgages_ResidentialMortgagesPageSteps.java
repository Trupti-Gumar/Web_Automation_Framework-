package Mortgages_Feature_Steps;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.Mortgages_ResidentialMortgagesPageActions;
import utils.SeleniumDriver;

public class Mortgages_ResidentialMortgagesPageSteps {
	
	Mortgages_ResidentialMortgagesPageActions mortgageResidential = new Mortgages_ResidentialMortgagesPageActions();
	
	
	@Then("I should see {string} as a Link")
	public void i_should_see_the_menu(String MenuItem)
	{
		String Actual = mortgageResidential.getMortgageResidentialOptions();
		String Expected = MenuItem;
		assertEquals(Expected, Actual);
	}
	
	@When("I click on the MenuItem link")
	public void i_click_on_the_link() {
		SeleniumDriver.clickOnElement(mortgageResidential.MortgageResidentialLink());
	}
	
	@Then("I should be redirected to the {string} page")
	public void i_should_to_be_redirected_to_the_header_page(String pageTitle)
	{
		String Actual = mortgageResidential.getResidentialMortgagePageHeader();
		String Expected = pageTitle;
		assertEquals(Expected, Actual);
	}
	
	@Then("I navigate to Residential mortgages page")
	public void i_navigate_to_residential_mortgage_page() {
		SeleniumDriver.clickOnElement(mortgageResidential.MortgageResidentialLink());
	}
	
	@Then("I should see the {string} CTA button on Residential mortgages page")
	public void i_should_see_the_cardHeader_CTA_button_on_Residential_mortgages_page(String header) {
		String Actual = mortgageResidential.verifycardHeaderCTAbutton(header);
		String Expected = header;
		assertEquals(Actual,Expected);
		
	}
	
	@Then ("I should click on CTA button and I should be redirected to {string}")
	public void i_should_click_on_CTA_button_and_i_should_be_redirected_to(String value) {
		String ActualText;
		String Expectedtext;

		switch (value) {
		case "Mortgages for customers with credit issues":
			ActualText = mortgageResidential.getCustomersWithCreditIssuesPageTitle();
			Expectedtext = "Mortgages for customers with credit problems| Aldermore Bank";
			break;

		case "Self-employed mortgages":
			ActualText = mortgageResidential.getSelfEmployedMortgagesPageTitle();
			Expectedtext = "Mortgages for the Self-Employed | Aldermore Bank";
			break;
			
		case "First time buyer mortgages":
			ActualText = mortgageResidential.getFirstTimeBuyerMortgagesPageTitle();
			Expectedtext = "Mortgages for First Time Buyers | Aldermore Bank";
			break;
			
//		case "Buy to let for individuals":
//			ActualText = mortgageResidential.getBuytoletforindividualsTitle();
//			Expectedtext = value;
//			break;
			
		case "Why use a mortgage broker? Here’s 10 great reasons":
			ActualText = mortgageResidential.getWhyuseamortgagebrokerPageTitle();
			Expectedtext = "Why use a mortgage broker? Here’s 10 great reasons";
			break;
			
//		case "How to get a self-employed mortgage":
//			ActualText = mortgageResidential.getHowtogetaselfemployedmortgagePageTitle();
//			Expectedtext = value;
//			break;
			
		case "Divorce and mortgages – What you need to know":
			ActualText = mortgageResidential.getDivorceandmortgagesPageTitle();
			Expectedtext = "Divorce and mortgages – What you need to know";
			break;
			
		default:
			throw new IllegalArgumentException("Invalid value: " + value);
		}

		assertEquals(ActualText, Expectedtext);
		
	}
	
	@Then ("I should see the {string} on the Image section")
	public void i_should_see_the_header_on_ImageSection(String header) {
		String Expected = mortgageResidential.verifyResidentialMortgageImageSectionHeader();
		String Actual = header;
		assertEquals(Actual, Expected);
		
	}
	
	@And("I should see the Residential mortgages FAQs header {string} on page")
	public void i_should_see_the_residential_mortgages_FAQs_header_on_page(String header) {
		String Actual = mortgageResidential.verifyFAQsHeader();
		String Expected = header;
		assertEquals(Actual, Expected);
		
	}
	@And("I should see the more card header {string} on FAQs section")
	public void i_should_see_the_more_card_header_on_FAQs_section(String value) {
		String Actual;
		String Expected;
		switch(value) {
		case "Not found what you're looking for?":
			Actual = mortgageResidential.getMorecardheader();
			Expected = "Not found what you're looking for?";
			break;
		default:
			throw new IllegalArgumentException("Invalid value: " + value);
		}
		assertEquals(Actual, Expected);
		
	}
	
	@And("I should be able to click on FAQs CTA button and should be redirected to {string} page")
	public void i_should_be_able_to_click_on_FAQs_CTA_button_and_should_be_redirected_to(String header)
	{
		String Actual = mortgageResidential.getMorecardCTA();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And ("I should see the {string} for Masthead Black box on residential mortgage page")
	public void i_should_see_the_header_for_masthead_black_box_on_residential_mortgage_page(String header)
	{
		String Actual = mortgageResidential.getmastheadBlackbox();
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@And ("I should see the {string} present on masthead Blackbox")
	public void i_should_see_the_options_present_on_masthead_blackbox(String header) {
		String Actual = mortgageResidential.getOption1header();
		String Expected = header;
		assertEquals(Actual, Expected);	
	}
	
	@And("I should click on options present on masthead blackbox and should be redirected to {string}")
	public void i_should_click_on_options_present_on_masthead_blackbox_and_should_be_redirected_to(String header)
	{
		String Actual = mortgageResidential.getOption1PageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And ("I should see {string} present on masthead Blackbox")
	public void i_should_see_options_present_on_masthead_blackbox(String header) {
		String Actual = mortgageResidential.getOption2header();
		String Expected = header;
		assertEquals(Actual, Expected);	
	}
	
	@And("I should click on masthead option and should be redirected to {string}")
	public void i_should_click_on_masthead_option_and_should_be_redirected_to(String header) {
		String Actual=mortgageResidential.getOption2PageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("I should see {string} present on the masthead Blackbox")
	public void i_should_see_present_on_the_masthead_blackbox(String header)
	{
		String Actual = mortgageResidential.getOption3header();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("I should click on the masthead option and should be redirected to {string}")
	public void i_should_click_on_the_masthead_option_and_should_be_redirected_to(String header) {
		String Actual=mortgageResidential.getOption3PageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
}
