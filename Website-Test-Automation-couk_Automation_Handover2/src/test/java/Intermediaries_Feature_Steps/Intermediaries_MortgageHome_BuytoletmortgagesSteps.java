package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import pages.actions.Intermediaries_MortgageHome_BuytoletmortgagesActions;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_BuytoletmortgagesSteps {
	
	Intermediaries_MortgageHome_BuytoletmortgagesActions BuytoletmortgagesActions = new Intermediaries_MortgageHome_BuytoletmortgagesActions();

	@Then("I click on Buy to let mortgages link")
	public void i_click_on_Buy_to_let_mortgages_link() {
		
		SeleniumDriver.waitForElementClickable(BuytoletmortgagesActions.BuytoletmortgagesLink());
	   
	    SeleniumDriver.clickElementWithJavaScript(BuytoletmortgagesActions.BuytoletmortgagesLink());
	}

	@Then("I should navigate to Buy to let mortgages page")
	public void i_should_navigate_to_Buy_to_let_mortgages_page() {
	   
		String Actual = SeleniumDriver.getDriver().getTitle();
	    String Expected = "Buy to Let Mortgage Intermediaries | Aldermore Bank";
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Buy to let mortgages page")
	public void i_should_see_the_as_the_header_for_the_Buy_to_let_mortgages_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(BuytoletmortgagesActions.MastheadHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Masthead black box on the Buy to let mortgages page")
	public void i_should_see_the_as_the_header_for_the_masthead_black_box_on_the_Buy_to_let_mortgages_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(BuytoletmortgagesActions.MastheadBlackboxHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the {string} link present on the Buy to let mortgages page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_the_link_present_on_the_Buy_to_let_mortgages_page_and_redirected_to_the_page(String header, String title) {
	   
		String Actual = BuytoletmortgagesActions.getMastheadBlackboxLinkPage(header);
	    String Expected = title;
	    
	    assertTrue(Actual.contains(Expected), "Page not found");
	}

	@Then("I should see the {string} as USP sub header on the Buy to let mortgages page")
	public void i_should_see_the_as_usp_sub_header_on_the_Buy_to_let_mortgages_page(String header) {
	   
		String Actual = BuytoletmortgagesActions.getUSPHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the {string} image copy section on the Buy to let mortgages page")
	public void i_should_see_the_as_the_header_for_the_image_copy_section_on_the_Buy_to_let_mortgages_page(String header, String headerNum) {
	   
		String Actual = BuytoletmortgagesActions.getImageCopyHeader(headerNum) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I shoud be able to click on {string} link on Buy to let mortgages page and redirected to the {string} page")
	public void i_shoud_be_able_to_click_on_link_on_Buy_to_let_mortgages_page_and_redirected_to_the_page(String header, String title) {
	   
		String Actual = BuytoletmortgagesActions.getUsfulLinkPageTitle(header) ;
	    String Expected = title;
	    
	    assertTrue(Actual.contains(Expected), "Page not found");
	    
	}

	@Then("I should see this {string} card on the Buy to let mortgages page")
	public void i_should_see_this_card_on_the_Buy_to_let_mortgages_page(String header) {
	    
		String Actual = BuytoletmortgagesActions.getCardHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on this {string} cardlink and redirected to the {string} page")
	public void i_should_be_able_to_click_on_this_cardlink_and_redirected_to_the_page(String header, String pageTitle) {
	    
		String Actual = BuytoletmortgagesActions.getPageTitle(pageTitle);
	    String Expected = pageTitle;
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
	
	@Then("I should see {string} login card header on the Buy to let mortgages page")
	public void i_should_see_login_card_header_on_the_Buy_to_let_mortgages_page(String header) {
	    
		String Actual = BuytoletmortgagesActions.getLoginCardHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}
	
	@Then("I should be able to click on the {string} login card button and redirected to the {string} page")
	public void i_should_be_able_to_click_on_the_login_card_button_and_redirected_to_the_page(String header, String title) {
	    
		String Actual = BuytoletmortgagesActions.getLoginCardLinkPage(header);
	    String Expected = title;
	    
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
	
	
}
