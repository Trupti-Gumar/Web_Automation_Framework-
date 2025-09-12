package Business_Finance_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusniessFinance_InvoiceFinanceActions;
import utils.SeleniumDriver;

public class BusniessFinance_InvoiceFinanceSteps {

	BusniessFinance_InvoiceFinanceActions busniessFinance_InvoiceFinanceActions = new BusniessFinance_InvoiceFinanceActions();
	
	@When("I click on the Business finance dropdown option")
	public void clickOnBusinessFinanceDropdown() {

		SeleniumDriver.clickOnElement(busniessFinance_InvoiceFinanceActions.BusinessFinanceDropdown());
	}

	@Then("I should see the Business finance options")
	public void i_should_see_the_business_finance_options() {

		boolean Actual = SeleniumDriver
				.isElementPresent(busniessFinance_InvoiceFinanceActions.BusinessFinanceMenuoptions());
		boolean Expected = true;
		assertEquals(Actual, Expected);
	}

	@When("I click on the Invoice Finance option")
	public void i_click_on_the_invoice_finance_option() {

		SeleniumDriver.clickOnElement(busniessFinance_InvoiceFinanceActions.InvoiceFinanceLink());
	}

	@Then("I should be naviagated to Invoice Finance page")
	public void i_should_be_naviagated_to_invoice_finance_page() {

		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "Invoice Finance Solutions for Businesses | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should see {string} on Invoice Finance page header")
	public void i_should_see_on_invoice_finance_page(String header) {

		String Actual = SeleniumDriver.GetElementText(busniessFinance_InvoiceFinanceActions.InvoiceFinanceHeader());
		String Expected = header;
		assertEquals(Actual, Expected);

	}

	@Then("I should see {string} as header for the Masthead black box")
	public void i_should_see_for_the_masthead_black_box(String header) {

		String Actual = SeleniumDriver.GetElementText(busniessFinance_InvoiceFinanceActions.MastheadBlackboxHeader());
		String Expected = header;
		assertEquals(Actual, Expected);

	}

	@Then("I should see contact number on the Masthead black box")
	public void i_should_see_contact_number_on_the_masthead_black_box() {

		boolean Actual = SeleniumDriver.isElementPresent(busniessFinance_InvoiceFinanceActions.phoneNoOnBlackbox());
		boolean Expected = true;
		assertEquals(Actual, Expected);
	}

	@Then("I should see Request a call back on the Masthead black box")
	public void RequestCallBack() {

		String Actual = SeleniumDriver
				.GetElementText(busniessFinance_InvoiceFinanceActions.RequestCallBackOnBlackbox());
		String Expected = "Request a callback";
		assertEquals(Actual, Expected);
	}

	@Then("I should see Email us on the Masthead black box")
	public void EmailUs() {

		String Actual = SeleniumDriver.GetElementText(busniessFinance_InvoiceFinanceActions.EmailUsOnBlackbox());
		String Expected = "Email us";
		assertEquals(Actual, Expected);
	}

	@Then("I should see the Image copy secion on Invoice Finance page")
	public void i_should_see_the_image_copy_secion_on_invoice_finance_page() {

		SeleniumDriver.moveToElement(busniessFinance_InvoiceFinanceActions.ImageCopyHeader());
	}

	@Then("I should see the {string} as the header for the Image copy secion on Invoice Finance page")
	public void i_should_see_the_as_the_header_for_the_image_copy_secion_on_invoice_finance_page(String header) {

		String Actual = SeleniumDriver.GetElementText(busniessFinance_InvoiceFinanceActions.ImageCopyHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as USP sub header on Invoice Finance page")
	public void i_should_see_the_as_usp_sub_header_on_invoice_finance_page(String header) {

		String Actual = busniessFinance_InvoiceFinanceActions.verifyUSPSubHeaders(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as Image copy header on Invoice Finance page")
	public void i_should_see_the_as_video_block_header_on_invoice_finance_page(String header) {

		String Actual = SeleniumDriver.GetElementText(busniessFinance_InvoiceFinanceActions.ImageCopyHeader2());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} Card on Invoice Finance page")
	public void i_should_see_the_cta_button_on_invoice_finance_page(String header) {

		String Actual = busniessFinance_InvoiceFinanceActions.verifyCardHeaders(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on  {string} card and redirected to respective page")
	public void i_should_be_able_to_click_on_card_and_redirected_to_respective_page(String header) {

		String Actual = busniessFinance_InvoiceFinanceActions.verifyCardPages(header);
		String Expected = header;
		//assertEquals(Actual, Expected);
		assertTrue(Actual.contains(Expected), "Invalid page title");
	}

	@Then("I should see the {string} as Video Block header on Invoice Finance page")
	public void i_should_see_the_as_process_block_header_on_invoice_finance_page(String header) {

		String Actual = SeleniumDriver.GetElementText(busniessFinance_InvoiceFinanceActions.VideoBlockHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} CTA button for the progress bar option")
	public void i_should_see_the_cta_button_for_the_progress_bar_option(String header) {

		String Actual = busniessFinance_InvoiceFinanceActions.verifyProcessBlockLinkHeader(header);
		String Expected = header;
		assertEquals(Actual, Expected);

	}

	@And("I should be able to click on {string} link and redirected to the {string} page")
	public void verifytheProcessblockCTALinkPage(String header, String title) {

		String Actual = busniessFinance_InvoiceFinanceActions.verifyProcessBlockLinkPageTitle(header);
		String Expected = title;
		assertEquals(Actual, Expected);
	}

	/*@When("I click on CTA link")
	public void i_click_on_cta_link() {

	}

	@Then("I should verify the {string} for the progress bar option")
	public void i_should_verify_the_for_the_progress_bar_option(String string) {

	}*/

	@Then("I should see the Invoice Financing FAQs header {string}  on Invoice Finance page")
	public void i_should_see_the_invoice_financing_fa_qs_header_on_invoice_finance_page(String header) {

		String Actual = SeleniumDriver.GetElementText(busniessFinance_InvoiceFinanceActions.InvoiceFinanceFAQHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(busniessFinance_InvoiceFinanceActions.InvoiceFinanceFAQHeader());
		assertEquals(Actual, Expected);
		
	}

	@Then("I should see the Invoice Financing FAQs Accordians on the Invoice Finance page")
	public void i_should_see_the_invoice_financing_fa_qs_accordians_on_the_invoice_finance_page() {
     
		SeleniumDriver.clickOnElement(busniessFinance_InvoiceFinanceActions.InvoiceFinanceFAQAccordian());
		
		boolean Actual = SeleniumDriver.isElementPresent(busniessFinance_InvoiceFinanceActions.InvoiceFinanceFAQTextBlock());
		boolean Expected = true;
		SeleniumDriver.moveToElement(busniessFinance_InvoiceFinanceActions.InvoiceFinanceFAQAccordian());
		assertEquals(Actual, Expected);
	}

	@Then("I should see the more card header {string} on Invoice Financing FAQs section")
	public void i_should_see_the_more_card_header_on_invoice_financing_fa_qs_section(String header) {

		String Actual = SeleniumDriver.GetElementText(busniessFinance_InvoiceFinanceActions.MoreCardHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(busniessFinance_InvoiceFinanceActions.MoreCardHeader());
		assertEquals(Actual, Expected);
		
	}

	@Then("I should be able to click on {string} CTA button and should be redirected to {string} page")
	public void i_should_be_able_to_click_on_cta_button_and_should_be_redirected_to_page(String string,
			String title) {

		String Actual = SeleniumDriver.getPageTitle(busniessFinance_InvoiceFinanceActions.MoreCardLink());
		String Expected = title;
		
		//assertEquals(Actual, Expected);
		assertTrue(Actual.contains(Expected), "Displayed page title is "+Actual );
		
	}

	@Then("I should be able to click on the Image copy CTA link {string} and redirected to {string} page")
	public void i_should_be_able_to_click_on_the_image_copy_cta_link_and_redirected_to_page(String link,
			String title) {
		
		String Actual = busniessFinance_InvoiceFinanceActions.verifyImageCopySectionLinks(link) ;
		String Expected = title;
		
		//assertEquals(Actual, Expected);
		assertTrue(Actual.contains(Expected), "Displayed page title is "+Actual );
		
	}
}
