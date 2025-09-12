package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import pages.actions.Intermediaries_MortgageHomePage_Actions;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHomePage_Steps {
	
	Intermediaries_MortgageHomePage_Actions MortgageHomePage_Actions = new Intermediaries_MortgageHomePage_Actions();

	@Then("I click on the Mortgages dropdown")
	public void i_click_on_the_mortgages_dropdown() {
	    
		SeleniumDriver.clickElementWithJavaScript(MortgageHomePage_Actions.MortgageDropdown());
	    
	}

	@Then("I click on Mortgages Home")
	public void i_click_on_mortgages_home() {
	   
		SeleniumDriver.clickElementWithJavaScript(MortgageHomePage_Actions.MortgageHomeLink());
	    
	}

	@Then("I should navigate to Mortgage Home page")
	public void i_should_navigate_to_mortgage_home_page() {
	    
	    String Actual = SeleniumDriver.getDriver().getTitle();
	    String Expected = "Mortgage Intermediaries | Aldermore Bank";
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Mortgage Home page")
	public void i_should_see_the_as_the_header_for_the_mortgage_home_page(String header) {
	    
		String Actual = SeleniumDriver.GetElementText(MortgageHomePage_Actions.MastheadHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Masthead black box")
	public void i_should_see_the_as_the_header_for_the_masthead_black_box(String header) {
	    
		String Actual = SeleniumDriver.GetElementText(MortgageHomePage_Actions.MastheadBlackBoxHeader());
	    String Expected = header;
	    SeleniumDriver.moveToElement(MortgageHomePage_Actions.MastheadBlackBoxHeader());
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the {string} link and redirected to the {string} page")
	public void i_should_be_able_to_click_on_the_link_and_redirected_to_the_page(String header, String title) {
	    
		String Actual = MortgageHomePage_Actions.getMastheadBlackboxLinkPage(header);
	    String Expected = title;
	    
	    assertTrue(Actual.contains(Expected), "Page not found");
	}

/*	@Then("I should see the {string} as USP sub header on the Mortgage Home page")
	public void i_should_see_the_as_usp_sub_header_on_the_mortgage_home_page(String header) {
	    
		String Actual = MortgageHomePage_Actions.getUSPHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	    
	} */

	@Then("I should see {string} card on the Mortgage Home page")
	public void i_should_see_card_on_the_mortgage_home_page(String header) {
	    
		String Actual = MortgageHomePage_Actions.getCardHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the {string} card on the Mortgage Home page and redirected to {string} page")
	public void i_should_be_able_to_click_on_the_card_on_the_mortgage_home_page_and_redirected_to_page(String header, String title) {
	    
		String Actual = MortgageHomePage_Actions.getCardLinkPageTitle(header) ;
	    String Expected = title;
	    
	    assertTrue(Actual.contains(Expected), "Page not found");
	}

	@Then("I should see the {string} as the header for the {string}  image copy section on the Mortgage Home page")
	public void i_should_see_the_as_the_header_for_the_image_copy_section_on_the_mortgage_home_page(String header, String headerNum) {
	    
		String Actual = MortgageHomePage_Actions.getImageCopyHeader(headerNum) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	    
	}

	@Then("I should see the Mortgage intermediary FAQs header {string}  on Mortgage Home page")
	public void i_should_see_the_mortgage_intermediary_fa_qs_header_on_mortgage_home_page(String header) {
	    
		String Actual = SeleniumDriver.GetElementText(MortgageHomePage_Actions.AccordianHeader());
	    String Expected = header;
	    SeleniumDriver.moveToElement(MortgageHomePage_Actions.AccordianHeader());
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to expand the accordian on Mortgage Home page")
	public void i_should_be_able_to_expand_the_accordian_on_mortgage_home_page() {
	    
	    SeleniumDriver.clickOnElement(MortgageHomePage_Actions.AccordianLink());
	    boolean Actual = SeleniumDriver.isElementPresent(MortgageHomePage_Actions.AccordianText());
	    boolean Expected = true;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on {string} link and redirected to the {string} page")
	public void i_should_be_able_to_click_on_link_and_redirected_to_the_page(String header, String title) {
	    
		String Actual = MortgageHomePage_Actions.getUsfulLinkPageTitle(header) ;
	    String Expected = title;
	    
	    assertTrue(Actual.contains(Expected), "Page not found");	    
	}
	
	@Then("I should see {string} login card header on the Mortgage Home page")
	public void i_should_see_login_card_header_on_the_mortgage_home_page(String header) {
	    
		String Actual = MortgageHomePage_Actions.getLoginCardHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}
	
	@Then("I should be able to click on the {string} logincardbutton and redirected to the {string} page")
	public void i_should_be_able_to_click_on_the_logincardbutton_and_redirected_to_the_page(String header, String title) {
	    
		String Actual = MortgageHomePage_Actions.getLoginCardLinkPage(header);
	    String Expected = title;
	    
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
	
	
	
}
