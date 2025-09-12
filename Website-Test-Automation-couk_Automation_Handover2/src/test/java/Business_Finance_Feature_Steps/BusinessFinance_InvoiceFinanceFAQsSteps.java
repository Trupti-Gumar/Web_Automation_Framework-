package Business_Finance_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessFinance_InvoiceFinanceFAQsActions;
import utils.SeleniumDriver;

public class BusinessFinance_InvoiceFinanceFAQsSteps {

	BusinessFinance_InvoiceFinanceFAQsActions businessFinance_InvoiceFinanceFAQsActions = new BusinessFinance_InvoiceFinanceFAQsActions();
	
	@When("I click on the Invoice Finance FAQ option")
	public void i_click_on_the_invoice_finance_faq_option() {
	    
		SeleniumDriver.clickOnElement(businessFinance_InvoiceFinanceFAQsActions.InvoiceFinanceFAQLink());
	}

	@Then("I should be naviagated to Invoice Finance FAQ page")
	public void i_should_be_naviagated_to_invoice_finance_faq_page() {
	    
		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "Frequently Asked Questions: Invoice Finance | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should see the Invoice Finance FAQs header {string}  on Invoice Finance FAQ page")
	public void i_should_see_the_invoice_finance_fa_qs_header_on_invoice_finance_faq_page(String header ) {
	   
		String Actual = SeleniumDriver.GetElementText(businessFinance_InvoiceFinanceFAQsActions.InvoiceFinanceFAQHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should see the Invoice Finance FAQs Accordians on the Invoice Finance FAQ page")
	public void i_should_see_the_invoice_finance_fa_qs_accordians_on_the_invoice_finance_faq_page() {
	   
		SeleniumDriver.clickOnElement(businessFinance_InvoiceFinanceFAQsActions.InvoiceFinanceFAQAccordian());
		
		boolean Actual = SeleniumDriver.isElementPresent(businessFinance_InvoiceFinanceFAQsActions.InvoiceFinanceFAQTextBlock());
		boolean Expected = true;
		assertEquals(Actual, Expected);
		
	}

	@Then("I should be able to click on Invoice Finance CTA button and should be directed to {string} page")
	public void i_should_be_able_to_click_on_invoice_finance_cta_button_and_should_be_directed_to_page(String header) {
	   
		String Actual=SeleniumDriver.getPageTitle(businessFinance_InvoiceFinanceFAQsActions.InvoiceFinanceBackLink());
		String Expected = header;
		//assertEquals(Actual, Expected);
		assertTrue(Actual.contains(Expected), "Invalid Page");
	}
}
