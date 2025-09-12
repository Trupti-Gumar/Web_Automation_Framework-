package Business_Finance_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.InvoiceFinance_FactoringActions;
import utils.SeleniumDriver;

public class BusinessFinance_InvoiceFinance_FactoringSteps {
	
	InvoiceFinance_FactoringActions invoiceFinance_FactoringActions = new InvoiceFinance_FactoringActions();

	
	@Then("I should see Factoring card on the page")
	public void i_should_see_factoring_card_on_the_page() {
	    
	    SeleniumDriver.moveToElement(invoiceFinance_FactoringActions.FactoringCard());
	}

	@When("I click on Factoring card CTA button")
	public void i_click_on_factoring_card_cta_button() {
	    
		SeleniumDriver.clickOnElement(invoiceFinance_FactoringActions.FactoringCard());
	}

	@Then("I should redirected to Factoring page")
	public void i_should_redirected_to_factoring_page() {
	    
	    String Actual= SeleniumDriver.getDriver().getTitle();
	    String Expected ="Invoice Factoring | Aldermore Bank";
	    assertEquals(Actual, Expected);
	}

	@Then("I should see {string} on Factoring page header")
	public void i_should_see_on_factoring_page_header(String header) {
	    
		String Actual = SeleniumDriver
				.GetElementText(invoiceFinance_FactoringActions.MastheadHeader());
		String Expected = header;
		SeleniumDriver
				.moveToElement(invoiceFinance_FactoringActions.MastheadHeader());
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as a quick links on Factoring page")
	public void i_should_see_the_as_a_quick_links_on_factoring_page(String header) {
	    
		String Actual = invoiceFinance_FactoringActions.verifyQuickLinks(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as sub header on the Factoring Product Card")
	public void i_should_see_the_as_sub_header_on_the_factoring_product_card(String header) {
	    
		String Actual = SeleniumDriver
				.GetElementText(invoiceFinance_FactoringActions.ProductCardHeader());
		String Expected = header;
		SeleniumDriver
				.moveToElement(invoiceFinance_FactoringActions.ProductCardHeader());
		assertEquals(Actual, Expected);
	    
	}
	@Then("I click on {string} option on Factoring page")
	public void ClickOnOptions(String Title) {
		
	invoiceFinance_FactoringActions.moveToImgcopySection(Title);
		
	}

	@Then("I should see the {string} as a {string} Image copy header on Factoring page")
	public void i_should_see_the_as_a_image_copy_header_on_factoring_page(String header ,String headerNum) {
	    
		String Actual = invoiceFinance_FactoringActions.getImageCopyHeaders(headerNum);
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the link on the Helping businesses like yours image copy link and redirected to the respective page")
	public void i_should_be_able_to_click_on_the_link_on_the_helping_businesses_like_yours_image_copy_link_and_redirected_to_the_respective_page() {
	    
		String Actual = SeleniumDriver.getPageTitle(invoiceFinance_FactoringActions.ImageCopyHeader3Link());
		String Expected = "Prolog Fulfilment - Invoice Finance Case Study | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as a header on progress bar on Factoring page")
	public void i_should_see_the_as_a_header_on_progress_bar_on_factoring_page(String header) {
	    
		String Actual = SeleniumDriver
				.GetElementText(invoiceFinance_FactoringActions.ProcessBlockHeader());
		String Expected = header;
		SeleniumDriver
				.moveToElement(invoiceFinance_FactoringActions.ProcessBlockHeader());
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as a header for the Factoring FAQs")
	public void i_should_see_the_as_a_header_for_the_factoring_fa_qs(String header) {
	    
		String Actual = SeleniumDriver
				.GetElementText(invoiceFinance_FactoringActions.FAQHeader());
		String Expected = header;
		SeleniumDriver
				.moveToElement(invoiceFinance_FactoringActions.FAQHeader());
		assertEquals(Actual, Expected);
	}

	@Then("I should see the Factoring FAQs Accordians on the Factoring page")
	public void i_should_see_the_factoring_fa_qs_accordians_on_the_factoring_page() {
	    
		SeleniumDriver.clickOnElement(
				invoiceFinance_FactoringActions.Accordian());

		boolean Actual = SeleniumDriver.isElementPresent(
				invoiceFinance_FactoringActions.AccordianTextBlock());
		boolean Expected = true;
		SeleniumDriver.moveToElement(
				invoiceFinance_FactoringActions.Accordian());
		assertEquals(Actual, Expected);
	}

	@Then("I should see the more card header {string} on Factoring FAQs section")
	public void i_should_see_the_more_card_header_on_factoring_fa_qs_section(String header) {
	    
		String Actual = SeleniumDriver
				.GetElementText(invoiceFinance_FactoringActions.MoreCardHeader());
		String Expected = header;
		SeleniumDriver
				.moveToElement(invoiceFinance_FactoringActions.MoreCardHeader());
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} Cards under Documents option on Fatoring page")
	public void i_should_see_the_cards_under_documents_option_on_fatoring_page(String header) {
	    
		String Actual = SeleniumDriver
				.GetElementText(invoiceFinance_FactoringActions.FactoringProductSheetCard());
		String Expected = header;
		SeleniumDriver
				.moveToElement(invoiceFinance_FactoringActions.FactoringProductSheetCard());
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} process block step on Fatoring page")
	public void i_should_see_the_process_block_step_on_fatoring_page(String header) {
	    
		String Actual = invoiceFinance_FactoringActions.getProcessBlockStepHeaders(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should see {string} present on the yellow banner on Fatoring page")
	public void i_should_see_present_on_the_yellow_banner_on_fatoring_page(String header) {
	   
		String Actual = SeleniumDriver
				.GetElementText(invoiceFinance_FactoringActions.YellowCTABanner());
		String Expected = header;
		SeleniumDriver
				.moveToElement(invoiceFinance_FactoringActions.YellowCTABanner());
		assertEquals(Actual, Expected);
	    
	}

	@Then("I should able to click on the yellow banner and redirected to {string} page")
	public void i_should_able_to_click_on_the_yellow_banner_and_redirected_to_page(String header) {
	    
		String Actual = SeleniumDriver.getPageTitle(invoiceFinance_FactoringActions.YellowCTABanner());
		String Expected = header;
		//assertEquals(Actual, Expected);
		assertTrue(Actual.contains(Expected), "Displayed page title is: "+Actual);
	}
	
	@And("I should see the invoice finance card and should be able to click on the link")
	public void invoiceFinanceCard() {
	    
		String Actual = SeleniumDriver.getPageTitle(invoiceFinance_FactoringActions.invoiceFinanceCard());
		String Expected = "Invoice Finance Solutions for Businesses | Aldermore Bank";
		//assertEquals(Actual, Expected);
		assertTrue(Actual.contains(Expected), "Displayed page title is: "+Actual);
	}
	
	@And("I should see the invoice finance FAQ card and should be able to click on the link")
	public void invoiceFinanceCardFAQ() {
	    
		String Actual = SeleniumDriver.getPageTitle(invoiceFinance_FactoringActions.invoiceFinanceFAQCard());
		String Expected = "Frequently Asked Questions: Invoice Finance | Aldermore Bank";
		//assertEquals(Actual, Expected);
		assertTrue(Actual.contains(Expected), "Displayed page title is: "+Actual);
	}
	
	@And("I should see the Customer stories card and should be able to click on the link")
	public void CustomerStoriesCardFAQ() {
	    
		String Actual = SeleniumDriver.getPageTitle(invoiceFinance_FactoringActions.customerStoriesCard());
		String Expected = "Business Finance Customer Stories | Aldermore bank";
		//assertEquals(Actual, Expected);
		assertTrue(Actual.contains(Expected), "Displayed page title is: "+Actual);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
