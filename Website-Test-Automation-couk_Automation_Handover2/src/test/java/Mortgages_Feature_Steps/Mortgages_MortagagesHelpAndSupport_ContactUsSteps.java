package Mortgages_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.Mortgages_MortagagesHelpAndSupport_ContactUsActions;

public class Mortgages_MortagagesHelpAndSupport_ContactUsSteps {
	
	Mortgages_MortagagesHelpAndSupport_ContactUsActions ContactAction = new 
			Mortgages_MortagagesHelpAndSupport_ContactUsActions();

	@Then("{string} displayed")
	public void Card_Name_displayed(String header) {
		String Actual = ContactAction.getCardName();
		String Expected = header;
		assertEquals(Actual,Expected);
	}
	
	@When("clicked Card")
	public void Clicked_card() {
		ContactAction.ClickCTA();
	}
	
	@Then("{string} displayed as redirected")
	public void PageTitle_displayed_as_redirected(String header) {
		String Actual = ContactAction.getPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I will navigate to Contact us page")
	public void i_will_naivgate_to_contact_us_page() {
		ContactAction.ClickCTA();
	}
	
	@Then("{string} will be present on the page")
	public void I_will_see_the_subheader_on_the_page(String header) {
		String Actual = ContactAction.getSubheaderTitle(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	
}
