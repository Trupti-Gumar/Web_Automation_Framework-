package Mortgages_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.Mortgages_MortgagesHelpAndSupport_MortgagesFAQActions;

public class Mortgages_MortgagesHelpAndSupport_MortgagesFAQStpes {

	Mortgages_MortgagesHelpAndSupport_MortgagesFAQActions FAQsActions = new 
			Mortgages_MortgagesHelpAndSupport_MortgagesFAQActions();
	
	
	@Then("CTA button {string} displayed")
	public void CTA_button_card_name_displayed(String header) {
		String Actual = FAQsActions.getCardName();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("CTA button clicked")
	public void CTA_button_clicked() {
		FAQsActions.clickedFAQs();
	}
	
	@Then("{string} page will be displayed")
	public void PageTitle_page_will_be_displayed(String header) {
		String Actual = FAQsActions.getPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I naviagte to Mortgages FAQ page")
	public void i_navigate_to_mortgages_FAQs_page() {
		FAQsActions.clickedFAQs();
	}
	
	@And("I will see the {string} on the page")
	public void i_will_see_the_header_on_page(String header) {
		String Actual = FAQsActions.getSubheader(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	
	@Then("{string} present on the page")
	public void i_see_cards_present_on_the_page(String header) {
		String Actual = FAQsActions.getCardsName(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@When("I click {string}")
	public void I_click_CTA_button(String header) {
		FAQsActions.clickTheCTAlink(header);
	}
	
	@Then("I redirected to cardName {string}")
	public void i_redirected_to_cardName(String header) {
		String Actual = FAQsActions.getPageTitle(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
}
