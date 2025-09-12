package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import pages.actions.Intermediaries_MortgageHome_ResidentialOwnerOccupiedActions;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_ResidentialOwnerOccupiedSteps {
	
	Intermediaries_MortgageHome_ResidentialOwnerOccupiedActions ResidentialOwnerOccupiedActions = new Intermediaries_MortgageHome_ResidentialOwnerOccupiedActions();

	@Then("I click on Residential owner occupied link")
	public void i_click_on_residential_owner_occupied_link() {
		
		SeleniumDriver.waitForElementClickable(ResidentialOwnerOccupiedActions.ResidentialowneroccupiedLink());
	   
	    SeleniumDriver.clickElementWithJavaScript(ResidentialOwnerOccupiedActions.ResidentialowneroccupiedLink());
	}

	@Then("I should navigate to Residential owner occupied page")
	public void i_should_navigate_to_residential_owner_occupied_page() {
	   
		String Actual = SeleniumDriver.getDriver().getTitle();
	    String Expected = "Residential Owner-Occupied Mortgages Intermediaries | Aldermore Bank";
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Residential owner occupied page")
	public void i_should_see_the_as_the_header_for_the_residential_owner_occupied_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(ResidentialOwnerOccupiedActions.MastheadHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Masthead black box on the Residential owner occupied page")
	public void i_should_see_the_as_the_header_for_the_masthead_black_box_on_the_residential_owner_occupied_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(ResidentialOwnerOccupiedActions.MastheadBlackboxHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the {string} link present on the Residential owner occupied page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_the_link_present_on_the_residential_owner_occupied_page_and_redirected_to_the_page(String header, String title) {
	   
		String Actual = ResidentialOwnerOccupiedActions.getMastheadBlackboxLinkPage(header);
	    String Expected = title;
	    
	    assertTrue(Actual.contains(Expected), "Page not found");
	}

	@Then("I should see the {string} as USP sub header on the Residential owner occupied page")
	public void i_should_see_the_as_usp_sub_header_on_the_residential_owner_occupied_page(String header) {
	   
		String Actual = ResidentialOwnerOccupiedActions.getUSPHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the {string}  image copy section on the Residential owner occupied page")
	public void i_should_see_the_as_the_header_for_the_image_copy_section_on_the_residential_owner_occupied_page(String header, String headerNum) {
	   
		String Actual = ResidentialOwnerOccupiedActions.getImageCopyHeader(headerNum) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I shoud be able to clik on {string} link on Residential owner occupied page and redirected to the {string} page")
	public void i_shoud_be_able_to_clik_on_link_on_residential_owner_occupied_page_and_redirected_to_the_page(String header, String title) {
	   
		String Actual = ResidentialOwnerOccupiedActions.getUsfulLinkPageTitle(header) ;
	    String Expected = title;
	    
	    assertTrue(Actual.contains(Expected), "Page not found");
	    
	}

/*	@Then("I shoukd be able to see the {string} CTA banner on Residential owner occupied page")
	public void i_shoukd_be_able_to_see_the_cta_banner_on_residential_owner_occupied_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(ResidentialOwnerOccupiedActions.CTABanner());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should be click on the CTA banner and redirected to the respective page")
	public void i_should_be_click_on_the_cta_banner_and_redirected_to_the_respective_page() {
	   
		String Actual = SeleniumDriver.getPageTitle(ResidentialOwnerOccupiedActions.CTABanner()) ;
	    String Expected = "Log into your Aldermore Online Account | Aldermore Bank";
	    
	    assertTrue(Actual.contains(Expected), "Page not found");
	    
	}*/
}
