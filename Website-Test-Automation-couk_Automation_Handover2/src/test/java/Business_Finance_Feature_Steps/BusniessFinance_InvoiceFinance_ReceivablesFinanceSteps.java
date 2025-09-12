package Business_Finance_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusniessFinance_InvoiceFinance_ReceivablesFinanceActions;
import utils.SeleniumDriver;

public class BusniessFinance_InvoiceFinance_ReceivablesFinanceSteps {
	
	BusniessFinance_InvoiceFinance_ReceivablesFinanceActions BSInvoiceFinance_ReceivablesFinanceActions = new BusniessFinance_InvoiceFinance_ReceivablesFinanceActions();

	@Then("I should see Receivables Finance card on the page")
	public void i_should_see_receivables_finance_card_on_the_page() {
	    
	    SeleniumDriver.moveToElement(BSInvoiceFinance_ReceivablesFinanceActions.ReceivablesFinanceCardLink());
	}

	@When("I click on Receivables Finance card CTA button")
	public void i_click_on_receivables_finance_card_cta_button() {
	    
		SeleniumDriver.clickOnElement(BSInvoiceFinance_ReceivablesFinanceActions.ReceivablesFinanceCardLink());
	    
	}

	@Then("I should redirected to Receivables Finance page")
	public void i_should_redirected_to_receivables_finance_page() {
	    
		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "Receivables Finance | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should see {string} on Receivables Finance page header")
	public void i_should_see_on_receivables_finance_page_header(String header) {
	    
		String Actual = SeleniumDriver
				.GetElementText(BSInvoiceFinance_ReceivablesFinanceActions.MastheadHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(BSInvoiceFinance_ReceivablesFinanceActions.MastheadHeader());
		assertEquals(Actual, Expected);
	    
	}

	@When("I click on {string} option on Receivables Finance page")
	public void i_click_on_option_on_receivables_finance_page(String link) {
	    
		BSInvoiceFinance_ReceivablesFinanceActions.ClickImageCopyHeaders(link);
	}

	@Then("I should see the {string} as a header for Image copy Section on Receivables Finance page")
	public void i_should_see_the_as_a_header_for_image_copy_section_on_receivables_finance_page(String header) {
	    
		String Actual = SeleniumDriver.GetElementText(BSInvoiceFinance_ReceivablesFinanceActions.ImageCopyHeader1()) ;
		String Expected = header;
		
		assertEquals(Actual, Expected);
	    
	}

	@When("I click on How does it work? option on Receivables Finance page")
	public void i_click_on_how_does_it_work_option_on_receivables_finance_page() {
	    
	    SeleniumDriver.clickOnElement(BSInvoiceFinance_ReceivablesFinanceActions.QuickLink2());
	}

	@Then("I should see the {string} as a header on progress bar on Receivables Finance page")
	public void i_should_see_the_as_a_header_on_progress_bar_on_receivables_finance_page(String header) {
	    
		String Actual = SeleniumDriver
				.GetElementText(BSInvoiceFinance_ReceivablesFinanceActions.ProcessBlockHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(BSInvoiceFinance_ReceivablesFinanceActions.ProcessBlockHeader());
		assertEquals(Actual, Expected);
	    
	}

	@Then("I should see the {string} process block step on Receivables Finance page")
	public void i_should_see_the_process_block_step_on_receivables_finance_page(String header) {
	    
		String Actual = BSInvoiceFinance_ReceivablesFinanceActions.getProcessBlockStepHeaders(header) ;
		String Expected = header;
		
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as USP sub header on Receivables Finance page")
	public void i_should_see_the_as_usp_sub_header_on_receivables_finance_page(String header) {
	    
		String Actual = BSInvoiceFinance_ReceivablesFinanceActions.getUSPSubHeaders(header) ;
		String Expected = header;
		
		assertEquals(Actual, Expected);
	}

	@When("I click on Documents option on Receivables Financepage")
	public void i_click_on_documents_option_on_receivables_financepage() {
	    
		SeleniumDriver.clickOnElement(BSInvoiceFinance_ReceivablesFinanceActions.QuickLink5());
	}

	@Then("I should see the {string} Cards under Documents option on Receivables Finance page")
	public void i_should_see_the_cards_under_documents_option_on_receivables_finance_page(String header) {
	    
		String Actual = SeleniumDriver
				.GetElementText(BSInvoiceFinance_ReceivablesFinanceActions.ReceivablesFinanceProductSheet());
		String Expected = header;
		SeleniumDriver.moveToElement(BSInvoiceFinance_ReceivablesFinanceActions.ReceivablesFinanceProductSheet());
		assertEquals(Actual, Expected);
	}

	@Then("I should see {string} CTA banner on the Receivables Finance page")
	public void i_should_see_cta_banner_on_the_receivables_finance_page(String header) {
	    
		String Actual = SeleniumDriver
				.GetElementText(BSInvoiceFinance_ReceivablesFinanceActions.YellowCTABanner());
		String Expected = header;
		SeleniumDriver.moveToElement(BSInvoiceFinance_ReceivablesFinanceActions.YellowCTABanner());
		assertEquals(Actual, Expected);
	}

}
