package Mortgages_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.actions.Mortgages_MortgagesHelp_ManagingAndMakingChangesToYourMortgageActions;

public class Mortgages_MortgagesHelp_ManagingAndMakingChangesToYourMortgageSteps {

	Mortgages_MortgagesHelp_ManagingAndMakingChangesToYourMortgageActions ManageActions =
			new Mortgages_MortgagesHelp_ManagingAndMakingChangesToYourMortgageActions();
	
	@Then("I see the {string} CTA button")
	public void i_see_the_cards_in_the_page(String header) {
		String Actual = ManageActions.getCardTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@And("Clicked Card CTA Button")
	public void Clicked_card_CTA_button() {
		ManageActions.clickCardButton();
	}

	@Then("Naviagated to {string} page")
	public void Naviagted_to_title_page(String header) {
		String Actual = ManageActions.getPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I navigate to Managing and making changes to your mortgage page")
	public void i_navigate_to_managing_and_making_changes_to_your_mortgage_page() {
		ManageActions.clickCardButton();
	}
	
	@And("I have seen the {string} on the page")
	public void i_should_see_the_header_on_the_page(String header) {
		String Actual = ManageActions.getHeaderOnPage();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("I should see the {string} present under header Title.")
	public void i_should_see_the_subheader_present_under_header_title(String header) {
		String Actual = ManageActions.getSubheaderTitle(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}

}
