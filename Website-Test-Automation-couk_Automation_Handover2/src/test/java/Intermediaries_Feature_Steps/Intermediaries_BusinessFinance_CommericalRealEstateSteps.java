package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import io.cucumber.java.en.Then;
import pages.actions.Intermediaries_BusinessFinance_CommericalRealEstateActions;
import utils.SeleniumDriver;

public class Intermediaries_BusinessFinance_CommericalRealEstateSteps {
	
	Intermediaries_BusinessFinance_CommericalRealEstateActions RealEstateActions = new 
			Intermediaries_BusinessFinance_CommericalRealEstateActions();

	@Then("I click on Commercial Real Estate")
	public void i_click_on_commercial_real_estate() {
		SeleniumDriver.clickElementWithJavaScript(RealEstateActions.clickOnCommercialRealEstate());
		
	}
	
	@Then("I should see the {string} for the Real Commercial Estate Page")
	public void i_should_see_the_header_for_the_Real_commerical_estate_page(String header) {
		String Actual = SeleniumDriver.GetElementText(RealEstateActions.getRealCommercialEstateHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should see the {string} as the header for the Masthead black box on Real Commercial Estate Page")
	public void i_should_see_header_for_the_Masthead_black_box_on_real_commercial_estate_page(String header) {
		String Actual = SeleniumDriver.GetElementText(RealEstateActions.getBlackBoxheader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should be able to click on the {string} link present on the Real Commercial Estate Page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_the_links_present_on_the_real_Commercial_Estate_and_redirected_to_the_PageTitle(String header, String Page) {
		String Actual = SeleniumDriver.getPageTitle(RealEstateActions.getQuickLinkPageTitle(header));
		String Expected = Page;
		assertFalse(Actual.contains(Expected));
	}
	
	@Then("I should see the {string} section header present on the page")
	public void i_should_see_the_USP_section_present_on_the_page(String header) {
		String Actual = RealEstateActions.getUSPHeader(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should see the {string} on Real Commercial Estate Page")
	public void i_should_see_the_ImageHeader_on_Real_Commercial_Estate_Page(String header) {
		String Actual = RealEstateActions.getImageHeader(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should see the {string} present on the page and should redirected to {string} after clicking")
	public void i_should_see_the_CardHeader_present_on_the_page_and_should_redirected_to_Page_after_clicking(String header, String Page){
		String Actual = SeleniumDriver.getPageTitle(RealEstateActions.getCardHeaderPageTitle(header));
		String Expected = Page;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should see the {string} present on the Real Commercial Estate Page and redirected to {string}")
	public void i_should_see_the_CTABanner_and_redirected_on_PageTitle_page(String header, String Page) {
		String Actual = RealEstateActions.getCTAPageTitle(header);
		String Expected = Page;
		assertEquals(Actual, Expected);
	}
	
}
