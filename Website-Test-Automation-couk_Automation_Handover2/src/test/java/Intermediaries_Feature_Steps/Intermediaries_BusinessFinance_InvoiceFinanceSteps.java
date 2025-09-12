package Intermediaries_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Then;
import pages.actions.Intermediaries_BusinessFinance_InvoiceFinanceActions;
import utils.SeleniumDriver;

public class Intermediaries_BusinessFinance_InvoiceFinanceSteps {
	
	Intermediaries_BusinessFinance_InvoiceFinanceActions InvoiceFinanceActions = 
			              new Intermediaries_BusinessFinance_InvoiceFinanceActions();

	
	@Then("I click on Invoice Finance page")
	public void i_should_see_the_option_for_the_invoice_fincane_page() {
		SeleniumDriver.clickElementWithJavaScript(InvoiceFinanceActions.InvoiceFinance_Intermediaries());
	}
	
	@Then("I should see the {string} for the Invoice finance Home page")
	public void i_should_see_the_header_for_the_invoice_finance_home_page(String header) {
		String Actual = SeleniumDriver.GetElementText(InvoiceFinanceActions.getTitle());
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should see the {string} as the header for the Masthead black box on Invoice Finance page")
	public void i_should_see_the_quicklink_as_the_header_for_the_masthead_black_box_on_invoice_finance_page(String header) {
		String Actual = SeleniumDriver.GetElementText(InvoiceFinanceActions.getBlackboxheader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should be able to click on the {string} link present on the Invoice Finance page and redirected to the {string} page")
	public void i_should_be_able_to_click_on_the_link_present_on_the_invoice_finance_page_and_redirected_to_the_page(String header, String title) {
		String Actual = InvoiceFinanceActions.getPageTitle(header);
		String Expected = title;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should see the {string} as USP sub header on the Invoice Finance Page")
	public void i_should_see_the_USP_sub_header_on_the_Invoice_Finane_page(String header) {
		String Actual = InvoiceFinanceActions.getUSPheader(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should see the {string} on the Invoice Finance Page")
	public void i_should_see_the_ImageHeader_on_the_invoice_Fincnace_page(String header) {
		String Actual = InvoiceFinanceActions.getImageHeader(header);
		String Expected = header;
		assertEquals(Actual, Expected);	
	}
	
	@Then("I should see the {string} present on the Invoice Finance page")
	public void i_should_see_the_Banner_present_on_the_Invoice_Finance_page(String header) {
		String Actual = SeleniumDriver.GetElementText(InvoiceFinanceActions.getCTABannerheader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I click and redirected to {string}")
	public void i_click_and_redirected_to_pageTitle(String Page) {
		String Actual = InvoiceFinanceActions.getCTABannerTitle();
		String Expected = Page;
		assertEquals(Actual, Expected);
	}
	
}
