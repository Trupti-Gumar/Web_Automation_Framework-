package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import pages.actions.Intermediaries_MortgageHome_MultipropertybuytoletmortgagesActions;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_MultipropertybuytoletmortgagesSteps {
	
	Intermediaries_MortgageHome_MultipropertybuytoletmortgagesActions MultipropertybuytoletmortgagesActions = new Intermediaries_MortgageHome_MultipropertybuytoletmortgagesActions();

	@Then("I click on Multi property buy to let mortgages link")
	public void i_click_on_Multi_property_buy_to_let_mortgages_link() {
		
		SeleniumDriver.waitForElementClickable(MultipropertybuytoletmortgagesActions.MultipropertybuytoletmortgagesLink());
	   
	    SeleniumDriver.clickElementWithJavaScript(MultipropertybuytoletmortgagesActions.MultipropertybuytoletmortgagesLink());
	}

	@Then("I should navigate to Multi property buy to let mortgages page")
	public void i_should_navigate_to_Multi_property_buy_to_let_mortgages_page() {
	   
		String Actual = SeleniumDriver.getDriver().getTitle();
	    String Expected = "Multi property buy to let mortgages | Aldermore";
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Multi property buy to let mortgages page")
	public void i_should_see_the_as_the_header_for_the_Multi_property_buy_to_let_mortgages_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(MultipropertybuytoletmortgagesActions.MastheadHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Masthead black box on the Multi property buy to let mortgages page")
	public void i_should_see_the_as_the_header_for_the_masthead_black_box_on_the_Multi_property_buy_to_let_mortgages_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(MultipropertybuytoletmortgagesActions.MastheadBlackboxHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the {string} link present on the Multi property buy to let mortgages page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_the_link_present_on_the_Multi_property_buy_to_let_mortgages_page_and_redirected_to_the_page(String header, String title) {
	   
		String Actual = MultipropertybuytoletmortgagesActions.getMastheadBlackboxLinkPage(header);
	    String Expected = title;
	    
	    assertTrue(Actual.contains(Expected), "Page not found");
	}

	@Then("I should see the {string} as USP sub header on the Multi property buy to let mortgages page")
	public void i_should_see_the_as_usp_sub_header_on_the_Multi_property_buy_to_let_mortgages_page(String header) {
	   
		String Actual = MultipropertybuytoletmortgagesActions.getUSPHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the {string} image copy section on the Multi property buy to let mortgages page")
	public void i_should_see_the_as_the_header_for_the_image_copy_section_on_the_Multi_property_buy_to_let_mortgages_page(String header, String headerNum) {
	   
		String Actual = MultipropertybuytoletmortgagesActions.getImageCopyHeader(headerNum) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I shoud be able to click on {string} link on Multi property buy to let mortgages page and redirected to the {string} page")
	public void i_shoud_be_able_to_click_on_link_on_Multi_property_buy_to_let_mortgages_page_and_redirected_to_the_page(String header, String title) {
	   
		String Actual = MultipropertybuytoletmortgagesActions.getUsfulLinkPageTitle(header) ;
	    String Expected = title;
	    
	    assertTrue(Actual.contains(Expected), "Page not found");
	    
	}

	@Then("I should see {string} login card header on the Multi property buy to let mortgages page")
	public void i_should_see_login_card_header_on_the_Multi_property_buy_to_let_mortgages_page(String header) {
	    
		String Actual = MultipropertybuytoletmortgagesActions.getLoginCardHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}
	
	@Then("I should be able to click on the {string} login card button on the Multi property buy to let mortgages page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_the_login_card_button_on_the_Multi_property_buy_to_let_mortgages_page_and_redirected_to_the_page(String header, String title) {
	    
		String Actual = MultipropertybuytoletmortgagesActions.getLoginCardLinkPage(header);
	    String Expected = title;
	    
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
	
	
}
