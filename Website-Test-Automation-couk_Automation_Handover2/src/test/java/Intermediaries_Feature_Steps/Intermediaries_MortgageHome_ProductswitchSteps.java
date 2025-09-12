package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import pages.actions.Intermediaries_MortgageHome_ProductswitchActions;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_ProductswitchSteps {
	
	Intermediaries_MortgageHome_ProductswitchActions ProductswitchActions = new Intermediaries_MortgageHome_ProductswitchActions();

	@Then("I click on Product switch link")
	public void i_click_on_Product_switch_link() {
		
		SeleniumDriver.waitForElementClickable(ProductswitchActions.ProductswitchLink());
	   
	    SeleniumDriver.clickElementWithJavaScript(ProductswitchActions.ProductswitchLink());
	}

	@Then("I should navigate to Product switch page")
	public void i_should_navigate_to_Product_switch_page() {
	   
		String Actual = SeleniumDriver.getDriver().getTitle();
	    String Expected = "Mortgage Product Switch - Intermediaries | Aldermore Bank";
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Product switch page")
	public void i_should_see_the_as_the_header_for_the_Product_switch_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(ProductswitchActions.MastheadHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Masthead black box on the Product switch page")
	public void i_should_see_the_as_the_header_for_the_masthead_black_box_on_the_Product_switch_page(String header) {
	   
		String Actual = SeleniumDriver.GetElementText(ProductswitchActions.MastheadBlackboxHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the {string} link present on the Product switch page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_the_link_present_on_the_Product_switch_page_and_redirected_to_the_page(String header, String title) {
	   
		String Actual = ProductswitchActions.getMastheadBlackboxLinkPage(header);
	    String Expected = title;
	    
	    assertTrue(Actual.contains(Expected), "Page not found");
	}

	@Then("I should see the {string} as USP sub header on the Product switch page")
	public void i_should_see_the_as_usp_sub_header_on_the_Product_switch_page(String header) {
	   
		String Actual = ProductswitchActions.getUSPHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the {string} image copy section on the Product switch page")
	public void i_should_see_the_as_the_header_for_the_image_copy_section_on_the_Product_switch_page(String header, String headerNum) {
	   
		String Actual = ProductswitchActions.getImageCopyHeader(headerNum) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I should see this {string} useful documents card on the Product switch page")
	public void i_should_see_this_useful_documents_card_on_the_Product_switch_page(String header) {
	    
		String Actual = ProductswitchActions.getDocumentsCardHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on this {string} cardlink on the Product switch page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_this_cardlink_on_the_Product_switch_page_and_redirected_to_the_page(String header, String pageTitle) {
	    
		String Actual = ProductswitchActions.getPageTitle(pageTitle);
	    String Expected = pageTitle;
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
	
	@Then("I should see this {string} Banner on the Product switch page")
	public void i_should_see_this_Banner_on_the_Product_switch_page(String header) {
	    
		String Actual = ProductswitchActions.getBannerHeader(header) ;
	    String Expected = header;
	    
	    assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the {string} Banner on the Product switch page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_the_Banner_on_the_Product_switch_page_and_redirected_to_the_page(String header, String pageTitle) {
	    
		String Actual = ProductswitchActions.getBannerPageTitle(pageTitle);
	    String Expected = pageTitle;
	    assertTrue(Actual.contains(Expected), "Page not found");
	}
		
	
}
