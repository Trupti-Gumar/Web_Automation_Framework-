package Mortgages_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.actions.Mortgages_BuyToLetMortgagesForLimitedCompaniesActions;

public class Mortgages_BuyToLetMortgagesForLimitedCompaniesSteps {
	
	Mortgages_BuyToLetMortgagesForLimitedCompaniesActions BuyToLetMortgages = 
			new Mortgages_BuyToLetMortgagesForLimitedCompaniesActions();
	
	@Then("I see {string} as a Link")
	public void i_see_option_as_a_link(String header) {
		String Actual = BuyToLetMortgages.gettheDropDownOption();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("I click link")
	public void i_click_link() {
		BuyToLetMortgages.ClickedTheLink();
		
	}
	
	@Then ("I redirected to the {string} page")
	public void i_redirected_to_the_header_page(String header) {
		String Actual = BuyToLetMortgages.getRedirectedPageTitle();
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I navigate to Buy to let mortgages for limited companies page")
	public void i_navigate_to_Buy_to_let_mortgages_for_limited_companies() {
		BuyToLetMortgages.NavigtetoBuytoLetMortgagesPage();
		
	}
	
	@Then("I see the {string} as the USP sub header")
	public void i_see_the_USP_header_as_the_sub_header(String header) {
		String Expected = BuyToLetMortgages.getUSPheader(header);
		String Actual = header;
		assertEquals(Actual, Expected);
		
	}
	
	@Then("I see the {string} on the Image section")
	public void i_see_the_header_on_the_image_section(String header) {
		String Actual = BuyToLetMortgages.getImageSectionHeader(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then ("I see the Blackbox present on the page and should verify the {string}")
	public void i_see_the_blackbox_present_on_the_page_and_should_verify_the_header(String header){
		String actual = BuyToLetMortgages.getBlackBoxheader();
		String expected = header;
		assertEquals(actual, expected);
		
	}
	
	@Then("{string} is present on the page")
	public void i_should_see_the_cardheader_present_on_the_page(String header) {
		String actual = BuyToLetMortgages.getCardHeaderTitle(header);
        String expected = header;
        assertEquals(actual, expected);
	}
	
	@Then("{string} on the page")
	public void FAQHeader_present_on_the_page(String header) {
		String actual = BuyToLetMortgages.getFAQheaerHeaderTitle();
		String Expected = header;
		assertEquals(actual,Expected);
	}
}
