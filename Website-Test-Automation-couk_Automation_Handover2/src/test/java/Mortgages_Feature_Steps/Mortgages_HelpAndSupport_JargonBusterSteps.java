package Mortgages_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.actions.Mortgages_HelpAndSupport_JargonBusterActions;

public class Mortgages_HelpAndSupport_JargonBusterSteps {
	Mortgages_HelpAndSupport_JargonBusterActions JargonActions = new 
			Mortgages_HelpAndSupport_JargonBusterActions();
	
	@Then("{string} CTA button")
	public void CardName_CTA_button(String header) {
		String Actual = JargonActions.getCardName();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("CTA button will be clicked")
	public void CTA_button_will_be_clicked() {
		JargonActions.clickOnCTAButton();
	}
	
	@Then("Naviagte to respective {string} page")
	public void navigated_to_respective_page(String header) {
		String Actual = JargonActions.getPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("Naviagte to Mortgage jargon buster page")
	public void navigated_to_mortgage_jarson_buster_page() {
		JargonActions.clickOnCTAButton();		
	}
	
	@And("I will click on the {string}")
	public void i_will_click_on_the_CTALink(String header) {
		String Actual = JargonActions.getCTALinkText();
		String Expected = header;
	    assertEquals(Actual, Expected);
		JargonActions.ClickOnCTALink();
	}
	
	@Then("I will navigate to {string} page")
	public void i_will_navigate_to_CTAPagetitle(String header) {
		String Actual = JargonActions.getCTAPageTitle();
		String Exprcted = header;
		assertEquals(Actual, Exprcted);
	}
}
