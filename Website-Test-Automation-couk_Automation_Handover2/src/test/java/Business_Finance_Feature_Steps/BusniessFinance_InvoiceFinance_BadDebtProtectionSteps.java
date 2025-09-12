package Business_Finance_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusniessFinance_InvoiceFinance_BadDebtProtectionActions;
import utils.SeleniumDriver;

public class BusniessFinance_InvoiceFinance_BadDebtProtectionSteps {
	
	BusniessFinance_InvoiceFinance_BadDebtProtectionActions BSInvoiceFinance_BadDebtProtectionActions = new BusniessFinance_InvoiceFinance_BadDebtProtectionActions();

	@Then("I should see Bad Debt Protection card on the page")
	public void i_should_see_bad_debt_protection_card_on_the_page() {
	    
		SeleniumDriver.moveToElement(BSInvoiceFinance_BadDebtProtectionActions.BadDebtProtectionCard()); 
	}

	@When("I click on Bad Debt Protection card CTA button")
	public void i_click_on_bad_debt_protection_card_cta_button() {
	    
		SeleniumDriver.clickOnElement(BSInvoiceFinance_BadDebtProtectionActions.BadDebtProtectionCard());
	}

	@Then("I should redirected to Bad Debt Protection page")
	public void i_should_redirected_to_bad_debt_protection_page() {
	    
		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "Bad Debt Protection | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should see {string} on Bad Debt Protection page header")
	public void i_should_see_on_bad_debt_protection_page_header(String header) {
	    
		String Actual = SeleniumDriver
				.GetElementText(BSInvoiceFinance_BadDebtProtectionActions.MastheadHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(BSInvoiceFinance_BadDebtProtectionActions.MastheadHeader());
		assertEquals(Actual, Expected);
	    
	}

	@Then("I should see the {string} as Video block header on Bad Debt Protection page")
	public void i_should_see_the_as_video_block_header_on_bad_debt_protection_page(String header) {
	    
		String Actual = SeleniumDriver
				.GetElementText(BSInvoiceFinance_BadDebtProtectionActions.VideoBlockHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(BSInvoiceFinance_BadDebtProtectionActions.VideoBlockHeader());
		assertEquals(Actual, Expected);
	}

	@When("I click on {string} option on Bad Debt Protection page")
	public void i_click_on_option_on_bad_debt_protection_page(String title) {
	    
		 BSInvoiceFinance_BadDebtProtectionActions.ClickImageCopyHeaders(title);
		
		
	}

	@Then("I should see the {string} as a header for Image copy Section on Bad Debt Protection page")
	public void i_should_see_the_as_a_header_for_image_copy_section_on_bad_debt_protection_page(String header) {
	    
		String Actual = BSInvoiceFinance_BadDebtProtectionActions.getImageCopyHeaders(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as USP sub header on Bad Debt Protection page")
	public void i_should_see_the_as_usp_sub_header_on_bad_debt_protection_page(String header) {
	    
		String Actual = BSInvoiceFinance_BadDebtProtectionActions.getUSPSubHeaders(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should see Blog Quote on Bad Debt Protection page")
	public void i_should_see_blog_quote_on_bad_debt_protection_page() {
	   
		boolean Actual = SeleniumDriver.isElementPresent(BSInvoiceFinance_BadDebtProtectionActions.BlogQuoteComponent());
		boolean Expected = true;
		assertEquals(Actual, Expected);
	    
	}

	@When("I click on Documents option on Bad Debt Protection page")
	public void i_click_on_documents_option_on_bad_debt_protection_page() {
	    
	    SeleniumDriver.clickOnElement(BSInvoiceFinance_BadDebtProtectionActions.QuickLink5());
	}

	@Then("I should see the {string} Cards under Documents option on Bad Debt Protection page")
	public void i_should_see_the_cards_under_documents_option_on_bad_debt_protection_page(String header) {
	    
		String Actual = SeleniumDriver
				.GetElementText(BSInvoiceFinance_BadDebtProtectionActions.BadDebtProtectionProductSheet());
		String Expected = header;
		SeleniumDriver.moveToElement(BSInvoiceFinance_BadDebtProtectionActions.BadDebtProtectionProductSheet());
		assertEquals(Actual, Expected);
	}

	@Then("I should see {string} CTA banner on the Bad Debt Protection page")
	public void i_should_see_cta_banner_on_the_bad_debt_protection_page(String header) {
	    
		String Actual = SeleniumDriver
				.GetElementText(BSInvoiceFinance_BadDebtProtectionActions.YellowCTABanner());
		String Expected = header;
		SeleniumDriver.moveToElement(BSInvoiceFinance_BadDebtProtectionActions.YellowCTABanner());
		assertEquals(Actual, Expected);
	}
}
