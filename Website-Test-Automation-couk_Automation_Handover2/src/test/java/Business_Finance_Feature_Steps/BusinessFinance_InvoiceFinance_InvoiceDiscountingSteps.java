package Business_Finance_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusinessFinance_InvoiceFinance_InvoiceDiscountingActions;
import utils.SeleniumDriver;

public class BusinessFinance_InvoiceFinance_InvoiceDiscountingSteps {

	BusinessFinance_InvoiceFinance_InvoiceDiscountingActions businessFinance_InvoiceFinance_InvoiceDiscountingActions = new BusinessFinance_InvoiceFinance_InvoiceDiscountingActions();

	@Then("I should see Invoice Discounting card on the page")
	public void i_should_see_invoice_discounting_card_on_the_page() {

		SeleniumDriver
				.moveToElement(businessFinance_InvoiceFinance_InvoiceDiscountingActions.invoiceDiscountingCardLink());

	}

	@When("I click on Invoice Discounting card CTA button")
	public void i_click_on_invoice_discounting_card_cta_button() {

		SeleniumDriver
				.clickOnElement(businessFinance_InvoiceFinance_InvoiceDiscountingActions.invoiceDiscountingCardLink());
	}

	@Then("I should redirected to Invoice Discounting page")
	public void i_should_redirected_to_invoice_discounting_page() {

		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "Invoice Discounting | Aldermore Bank";
		assertEquals(Actual, Expected);

	}

	@Then("I should see {string} on Invoice Discounting page header")
	public void verifyInvoiceDiscountingHeader(String header) {

		String Actual = SeleniumDriver
				.GetElementText(businessFinance_InvoiceFinance_InvoiceDiscountingActions.invoiceDiscountingHeader());
		String Expected = header;
		SeleniumDriver
				.moveToElement(businessFinance_InvoiceFinance_InvoiceDiscountingActions.invoiceDiscountingHeader());
		assertEquals(Actual, Expected);

	}

	@Then("I should see the {string} as a quick links")
	public void i_should_see_the_as_a_quick_links(String header) {

		String Actual = businessFinance_InvoiceFinance_InvoiceDiscountingActions.verifyQuickLinks(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@When("I click on At a glance option")
	public void i_click_on_at_a_glance_option() {

		SeleniumDriver.clickOnElement(businessFinance_InvoiceFinance_InvoiceDiscountingActions.AtAglanceLink());
	}

	@Then("I should see the {string} as sub header on the Product Card")
	public void i_should_see_the_as_sub_header_on_the_paragraph(String header) {

		String Actual = SeleniumDriver
				.GetElementText(businessFinance_InvoiceFinance_InvoiceDiscountingActions.ProductCardHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on {string} on the Product Card and redirected to corrosponding page")
	public void i_should_see_the_on_the_paragraph(String header) {

		String Actual = SeleniumDriver
				.getPageTitle(businessFinance_InvoiceFinance_InvoiceDiscountingActions.InvoiceFinanceFAQLink());
		String Expected = "Frequently Asked Questions: Invoice Finance | Aldermore Bank";
		assertEquals(Actual, Expected);

	}

	@When("I click on {string} option")
	public void i_click_on_who_is_it_for_option(String title) {

		businessFinance_InvoiceFinance_InvoiceDiscountingActions.moveToImgcopySection(title);

	}

	@Then("I should see the {string} as a header on Image Section")
	public void i_should_see_the_as_a_header_on_image_section(String header) {

		String Actual = businessFinance_InvoiceFinance_InvoiceDiscountingActions.getImageCopyHeaders(header);
		String Expected = header;
		assertEquals(Actual, Expected);

	}

	@When("I click on How does it work? option")
	public void i_click_on_how_does_it_work_option() {

		SeleniumDriver.clickOnElement(businessFinance_InvoiceFinance_InvoiceDiscountingActions.HowdoesitworkLink());
	}

	@Then("I should see the {string} as a header on progress bar")
	public void i_should_see_the_as_a_header_on_progress_bar(String header) {

		String Actual = SeleniumDriver
				.GetElementText(businessFinance_InvoiceFinance_InvoiceDiscountingActions.ProcessBlockHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(businessFinance_InvoiceFinance_InvoiceDiscountingActions.ProcessBlockHeader());
		assertEquals(Actual, Expected);

	}

	@When("I click on FAQs option")
	public void i_click_on_fa_qs_option() {

		SeleniumDriver.clickOnElement(businessFinance_InvoiceFinance_InvoiceDiscountingActions.FAQsLink());
	}

	@Then("I should see the {string} as a header for the Invoice Discounting FAQs")
	public void i_should_see_the_as_a_header_for_the_invoice_discounting_fa_qs(String header) {

		String Actual = SeleniumDriver.GetElementText(
				businessFinance_InvoiceFinance_InvoiceDiscountingActions.InvoiceDiscountingFAQsHeader());
		String Expected = header;
		SeleniumDriver
				.moveToElement(businessFinance_InvoiceFinance_InvoiceDiscountingActions.InvoiceDiscountingFAQsHeader());
		assertEquals(Actual, Expected);

	}

	@Then("I should see the Invoice Discounting FAQs Accordians on the Invoice Discounting page")
	public void i_should_see_the_invoice_discounting_fa_qs_accordians_on_the_invoice_discounting_page() {

		SeleniumDriver.clickOnElement(
				businessFinance_InvoiceFinance_InvoiceDiscountingActions.InvoiceDiscountingFAQsAccordian());

		boolean Actual = SeleniumDriver.isElementPresent(
				businessFinance_InvoiceFinance_InvoiceDiscountingActions.InvoiceDiscountingFAQsTextBlock());
		boolean Expected = true;
		SeleniumDriver.moveToElement(
				businessFinance_InvoiceFinance_InvoiceDiscountingActions.InvoiceDiscountingFAQsAccordian());
		assertEquals(Actual, Expected);
	}

	@Then("I should see the more card header {string} on Invoice Discounting FAQs section")
	public void i_should_see_the_more_card_header_on_invoice_discounting_fa_qs_section(String header) {

		String Actual = SeleniumDriver
				.GetElementText(businessFinance_InvoiceFinance_InvoiceDiscountingActions.MoreCardTitle());
		String Expected = header;
		SeleniumDriver.moveToElement(businessFinance_InvoiceFinance_InvoiceDiscountingActions.MoreCardTitle());
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on View Invoice Finance FAQs CTA button and should be redirected to {string} page")
	public void i_should_be_able_to_click_on_view_invoice_finance_fa_qs_cta_button_and_should_be_redirected_to_page(
			String title) {

		String Actual = SeleniumDriver
				.getPageTitle(businessFinance_InvoiceFinance_InvoiceDiscountingActions.MoreCardlink());
		String Expected = "Frequently Asked Questions: Invoice Finance | Aldermore Bank";

		assertEquals(Actual, Expected);
	}

	@When("I click on Documents option")
	public void i_click_on_documents_option() {

		SeleniumDriver.clickOnElement(businessFinance_InvoiceFinance_InvoiceDiscountingActions.DocumentsLink());
	}

	@Then("I should see the {string} Cards under Documents option")
	public void i_should_see_the_cards_under_documents_option(String title) {

		String Actual = businessFinance_InvoiceFinance_InvoiceDiscountingActions.getDocumentCardsHeader(title);
		String Expected = title;

		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} process block step")
	public void i_should_see_the_process_block_step(String title) {

		String Actual = businessFinance_InvoiceFinance_InvoiceDiscountingActions.getProcessBlockStepHeaders(title);
		String Expected = title;

		assertEquals(Actual, Expected);
	}

	@Then("I should see {string} present on the yellow banner")
	public void i_should_see_present_on_the_yellow_banner(String header) {

		String Actual = SeleniumDriver
				.GetElementText(businessFinance_InvoiceFinance_InvoiceDiscountingActions.YellowBanner());
		String Expected = header;
		SeleniumDriver.moveToElement(businessFinance_InvoiceFinance_InvoiceDiscountingActions.YellowBanner());
		assertEquals(Actual, Expected);
	}

	@Then("I should able to click on the yellow banner abd redirected to {string} page")
	public void i_should_able_to_click_on_the_yellow_banner_abd_redirected_to_page(String title) {

		String Actual = SeleniumDriver
				.getPageTitle(businessFinance_InvoiceFinance_InvoiceDiscountingActions.YellowBanner());
		String Expected = title;

		//assertEquals(Actual, Expected);
		assertTrue(Actual.contains(Expected), "Invalid page");
	}

	@Then("I should be able to click on the Find out more on the Bad debt protection image copy link and redirected to the respective page")

	public void verifyImagercopyLink() {

	}

}
