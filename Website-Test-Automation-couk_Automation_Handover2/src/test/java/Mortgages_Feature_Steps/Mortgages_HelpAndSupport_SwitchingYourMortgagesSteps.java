package Mortgages_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.actions.Mortgages_HelpAndSupport_SwitchingYourMortgagesActions;


public class Mortgages_HelpAndSupport_SwitchingYourMortgagesSteps {
	
	Mortgages_HelpAndSupport_SwitchingYourMortgagesActions SwitchActions 
	= new Mortgages_HelpAndSupport_SwitchingYourMortgagesActions();

	@Then("{string} CTA is visible")
	public void Card_name_is_visible(String header) {
		String Actual = SwitchActions.getCardNameText();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("clicked CTA button")
	public void clickedCTAbutton() {
		SwitchActions.clickedCTAbutton();
	}
	
	@Then("{string} will be visible")
	public void PageTitle_will_be_visible(String header) {
		String Actual = SwitchActions.getPagetitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I naviagte to Switching your mortgage page")
	public void i_navigate_to_switching_your_mortagge_page() {
		SwitchActions.clickedCTAbutton();
	}
	
	@And("I can see {string} on the page")
	public void I_see_subheader_on_the_page(String header) {
		String Actual = SwitchActions.getSubheader(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("{string} header present on page")
	public void ImageSection_header_present_on_page(String header) {
		String Actual = SwitchActions.getImageSectionheader(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
}
