package Business_Finance_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessFinance_PropertyDevelopmentFinanceActions;
import utils.SeleniumDriver;

public class BusinessFinance_PropertyDevelopmentFinanceSteps {
	
	BusinessFinance_PropertyDevelopmentFinanceActions BF_PropertyDevelopmentFinanceActions = new BusinessFinance_PropertyDevelopmentFinanceActions();

	@When("I click on the Property Development Finance option")
	public void i_click_on_the_property_development_finance_option() {
		
		SeleniumDriver.clickOnElement(BF_PropertyDevelopmentFinanceActions.propertyDevelopmentFinanceFAQLink());
	   
	    SeleniumDriver.clickOnElement(BF_PropertyDevelopmentFinanceActions.PropertyDevelopmentFinanceLink());
	}

	@Then("I should be naviagated to Property Development Finance page")
	public void i_should_be_naviagated_to_property_development_finance_page() {
	   
		SeleniumDriver.waitForPageToLoad();
	    String Actual= SeleniumDriver.getDriver().getTitle();
	    String Expected = "Property Development Finance | Aldermore Bank";
	    assertEquals(Actual, Expected);
	}

	@Then("I should see {string} on Property Development Finance page header")
	public void i_should_see_on_property_development_finance_page_header(String header) {
	   
		String Actual= SeleniumDriver.GetElementText(BF_PropertyDevelopmentFinanceActions.MastheadHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected);
	}

	@Then("I should see {string} as the header for the Masthead blck box on the page")
	public void i_should_see_as_the_header_for_the_masthead_blck_box_on_the_page(String header) {
	   
		String Actual= SeleniumDriver.GetElementText(BF_PropertyDevelopmentFinanceActions.MastheadBlackboxHeader());
	    String Expected = header;
	    assertEquals(Actual, Expected); 
	}

	@Then("I should see the {string} as USP sub header on Property Development Finance page")
	public void i_should_see_the_as_usp_sub_header_on_property_development_finance_page(String header) {
	   
		String Actual= BF_PropertyDevelopmentFinanceActions.getUSPHeader(header);
	    String Expected = header;
	    assertTrue(Actual.contains(Expected));
	}

	@Then("I should see the {string} as a header for Image copy Section on Property Development Finance page")
	public void i_should_see_the_as_a_header_for_image_copy_section_on_property_development_finance_page(String header) {
	   
		String Actual= BF_PropertyDevelopmentFinanceActions.getImageCopyHeader(header);
	    String Expected = header;
	    assertEquals(Actual, Expected); 
	}

	@Then("I should see the {string} Card on Property Development Finance page")
	public void i_should_see_the_card_on_property_development_finance_page(String header) {
	   
		String Actual= BF_PropertyDevelopmentFinanceActions.getCardHeader(header);
	    String Expected = header;
	    assertEquals(Actual, Expected); 
	}

	@Then("I should be able to click on  {string} card and redirected to {string} pages")
	public void i_should_be_able_to_click_on_card_and_redirected_to_respective_pages(String header,String title) {
	   
		String Actual= BF_PropertyDevelopmentFinanceActions.getCardLinkPageTitle(header);
	    String Expected = title;
	    assertTrue(Actual.contains(Expected));
	    
	}
}
