package Mortgages_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.actions.Mortgages_CommercialMortgagesActions;

public class Mortgages_CommercialMortgagesSteps {
	
	Mortgages_CommercialMortgagesActions CommericalAction = new Mortgages_CommercialMortgagesActions();
	
	@Then("I see the {string} as option")
	public void i_see_the_headerlink_as_option(String header) {
		String Actual = CommericalAction.getCommericalDropdownOption();
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@And("I see and click link")
	public void i_see_and_click_link() {
		CommericalAction.clickTheLink();
	}
	
	@Then("I redirected to {string}")
	public void i_redirected_to_option_pageTitle(String header){
		String Actual = CommericalAction.getRedirectedPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
		
	}
	
	@Then("I navigated to Commercial mortgages page")
	public void i_navigated_to_commercial_mortgages_page() {
		CommericalAction.clickTheLink();
	}
	
	@Then("I should see the {string} on the page")
	public void i_should_see_the_USPSection_on_the_page(String header) {
		String Actual = CommericalAction.getUSPSectionHeader(header).replaceAll("£", "");
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should see the Image section {string} on the page")
	public void i_should_see_the_image_section_header(String header)
	{
		CommericalAction.verifyTheImageSectionHeader(header);
	}
	
	@Then("I see the {string} on the page")
	public void i_should_see_the_cardHeader_on_the_page(String header) {
		String Actual = CommericalAction.getCardHeader(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I click the {string} and redirected to the {string}")
	public void i_click_the_bottomLink_and_redirected_to_the_pageTitle(String bottomLink, String PageTitle) {
		CommericalAction.verifytheBottomLink(bottomLink);
		String Actual = CommericalAction.getBottomLinkPageTitle();
		String Expected = PageTitle;
		assertEquals(Actual, Expected);
	}
	
	@Then ("I see {string} on the page")
	public void i_see_blackBoxHeader_on_the_page(String header) {
		String Actual = CommericalAction.getBlackBoxheader();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	
}
