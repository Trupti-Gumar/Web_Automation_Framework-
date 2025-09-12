package Mortgages_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.Mortgages_BuyToLetMortgagesActions;
import utils.SeleniumDriver;

public class Mortgages_BuyToLetMortgagesSteps {
	
	Mortgages_BuyToLetMortgagesActions BuyToLetAction = new Mortgages_BuyToLetMortgagesActions();
	
	@When("I see Mortgages dropdown option")
	public void i_see_Mortgages_dropdown_option() {
		SeleniumDriver.clickElement(BuyToLetAction.MortgageNavigationLink(), "Buy To Let Mortgages");
	}
	
	
	@Then("I see {string} as options")
	public void i_see_the_options(String header) {

		String Actual = BuyToLetAction.VerifyBuyToLetOptions();
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@When ("I should click the link")
	public void i_should_click_the_link() {
		BuyToLetAction.ClickOnOptions();
	}
	
	
	@Then("I should redirected to the {string}")
	public void i_should_redirected_to_the(String header) {

		String Actual = BuyToLetAction.getBuyToLetPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I navigate to Buy to let mortgagess page")
	public void i_navigate_to_buy_let_mortgages_page() {
		BuyToLetAction.clickOnBuyToLetOptions();
	}
	
	@And("I should see the {string} as the USP sub header")
	public void i_should_see_the_USPheader_as_sub_header(String value) {
		BuyToLetAction.verifyTheUSPheaderPresent(value);
	}
	
	@Then("I should see {string} as Image copy header")
	public void i_should_see_header_as_Image_copy_header(String header) {
		String Actual = BuyToLetAction.verifyTheImageSectionHeader(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should see {string} for Masthead Black box on Buy to Let Mortages page")
	public void i_should_see_header_for_masthead_black_box(String header) {
		String Actual = BuyToLetAction.getQuickLinkHeader();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should see first {string} in the BlackBox Section")
	public void i_should_see_first_option_in_the_blackbox_section(String option )
	{
		String Actual = BuyToLetAction.getQuickLinkOption1();
		String Expected = option;
		assertEquals(Actual, Expected);
		
	}


	@Then("I should click that option and should be redirected to {string}")
	public void i_should_click_that_option_and_redirected_to(String PageTitle) {
		String Actual = BuyToLetAction.getPageTitleForOption1();
		String Expected = PageTitle;
		assertEquals(Actual, Expected);
		
	}

	@Then("I should see second {string} in the BlackBox Section")
	public void i_should_see_second_option_in_the_blackbox_section(String option )
	{
		String Actual = BuyToLetAction.getQuickLinkOption2();
		String Expected = option;
		assertEquals(Actual, Expected);
		
	}
	

	@Then("I should clicked to the option and should be redirected to {string}")
	public void i_should_clicked_to_the_option_and_redirected_to(String PageTitle) {
		String Actual = BuyToLetAction.getPageTitleForOption2();
		String Expected = PageTitle;
		assertEquals(Actual, Expected);
	}
	
	
	@Then("I should see third {string} in the BlackBox Section")
	public void i_should_see_third_option_in_the_blackbox_section(String option )
	{
		String Actual = BuyToLetAction.getQuickLinkOption3();
		String Expected = option;
		assertEquals(Actual, Expected);
		
	}

	@Then("I clicked to the option and should be redirected to page")
	public void i_clicked_to_the_option_and_redirected_to() {
		boolean Actual = BuyToLetAction.verifythePageTitlepresent();
		boolean Expected = true;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should see {string} CTA button on the page")
	public void i_should_see_the_CTA_button(String header)
	{
		String Actual = BuyToLetAction.verifycardHeaderCTAbutton(header);
		String Expected = header;
		assertEquals(Actual,Expected);
		
	}
	
	@Then("I should see the Buy to let mortgagess FAQs header {string} on page")
	public void i_should_see_the_buy_to_let_mortgages_FAQs(String header) {
		String Actual = BuyToLetAction.verifytheFAQHeader();
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}
	
	@Then("I should see the more card header {string} on Buy to let mortgagess page")
	public void i_should_see_the_more_Card_header(String header) {
		String Actual = BuyToLetAction.verifyMoreCardHeader();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I clicked on FAQs CTA button and should be redirected to {string} page")
	public void i_clicked_on_FAQs_CAT_button_and_redirected_to(String header) {
		String Actual = BuyToLetAction.ClickonCTAbutton();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
}


