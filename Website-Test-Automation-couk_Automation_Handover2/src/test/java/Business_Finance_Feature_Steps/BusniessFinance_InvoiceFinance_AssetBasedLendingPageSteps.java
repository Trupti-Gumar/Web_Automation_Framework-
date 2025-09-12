package Business_Finance_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BusniessFinance_InvoiceFinance_AssetBasedLendingPageActions;
import utils.SeleniumDriver;

public class BusniessFinance_InvoiceFinance_AssetBasedLendingPageSteps {

	BusniessFinance_InvoiceFinance_AssetBasedLendingPageActions BSInvoiceFinance_AssetBasedLendingPageActions = new BusniessFinance_InvoiceFinance_AssetBasedLendingPageActions();

	@Then("I should see Asset Based Lending card on the page")
	public void i_should_see_asset_based_lending_card_on_the_page() {

		SeleniumDriver.moveToElement(BSInvoiceFinance_AssetBasedLendingPageActions.AssetBasedLendingCardLink());
	}

	@When("I click on Asset Based Lending card CTA button")
	public void i_click_on_asset_based_lending_card_cta_button() {
		
		SeleniumDriver.waitForElementClickable(BSInvoiceFinance_AssetBasedLendingPageActions.AssetBasedLendingCardLink());

		SeleniumDriver.clickOnElement(BSInvoiceFinance_AssetBasedLendingPageActions.AssetBasedLendingCardLink());
	}

	@Then("I should redirected to Asset Based Lending page")
	public void i_should_redirected_to_asset_based_lending_page() {

		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "Asset Based Lending (ABL) | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should see {string} on Asset Based Lending page header")
	public void i_should_see_on_asset_based_lending_page_header(String header) {

		String Actual = SeleniumDriver
				.GetElementText(BSInvoiceFinance_AssetBasedLendingPageActions.AssetBasedLendingHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(BSInvoiceFinance_AssetBasedLendingPageActions.AssetBasedLendingHeader());
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as Video block header on Asset Based Lending page")
	public void i_should_see_the_as_video_block_header_on_asset_based_lending_page(String header) {

		String Actual = SeleniumDriver.GetElementText(BSInvoiceFinance_AssetBasedLendingPageActions.VideoBlockheader());
		String Expected = header;
		SeleniumDriver.moveToElement(BSInvoiceFinance_AssetBasedLendingPageActions.VideoBlockheader());
		assertEquals(Actual, Expected);
	}

	@When("I click on How does it work? option on Asset Based Lending page")
	public void i_click_on_how_does_it_work_option_on_asset_based_lending_page() {

		SeleniumDriver.clickOnElement(BSInvoiceFinance_AssetBasedLendingPageActions.QuickLink2());
	}

	@Then("I should see the {string} as a header on progress bar on Asset Based Lending page")
	public void i_should_see_the_as_a_header_on_progress_bar_on_asset_based_lending_page(String header) {

		String Actual = SeleniumDriver
				.GetElementText(BSInvoiceFinance_AssetBasedLendingPageActions.ProcessBlockHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(BSInvoiceFinance_AssetBasedLendingPageActions.ProcessBlockHeader());
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} process block step on Asset Based Lending page")
	public void i_should_see_the_process_block_step_on_asset_based_lending_page(String header) {

		String Actual = BSInvoiceFinance_AssetBasedLendingPageActions.getProcessBlockStepHeaders(header);
		String Expected = header;
		SeleniumDriver.moveToElement(BSInvoiceFinance_AssetBasedLendingPageActions.ProcessBlockHeader());
		assertEquals(Actual, Expected);
	}

	@When("I click on {string} option on Asset Based Lending page")
	public void i_click_on_option_on_asset_based_lending_page(String header) {

		BSInvoiceFinance_AssetBasedLendingPageActions.ClickImageCopyHeaders(header);

	}

	@Then("I should see the {string} as a header for Image copy Section on Asset Based Lending page")
	public void i_should_see_the_as_a_header_for_image_copy_section_on_asset_based_lending_page(String header) {

		String Actual = BSInvoiceFinance_AssetBasedLendingPageActions.getImageCopyHeaders(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on the Get in touch link on the Who can we help? image copy link and redirected to the respective page")
	public void i_should_be_able_to_click_on_the_get_in_touch_link_on_the_who_can_we_help_image_copy_link_and_redirected_to_the_respective_page() {

		String Actual = SeleniumDriver.getPageTitle(BSInvoiceFinance_AssetBasedLendingPageActions.ImageCopyHeaderLink1());
		String Expected = "Contact information for business finance customers";
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as USP sub header on Asset Based Lending page")
	public void i_should_see_the_as_usp_sub_header_on_asset_based_lending_page(String header) {

		String Actual = BSInvoiceFinance_AssetBasedLendingPageActions.getUSPSubHeaders(header);
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@When("I click on Documents option on Asset Based Lending page")
	public void i_click_on_documents_option_on_asset_based_lending_page() {

		SeleniumDriver.clickOnElement(BSInvoiceFinance_AssetBasedLendingPageActions.QuickLink6());
	}

	@Then("I should see the {string} Cards under Documents option on Asset Based Lending page")
	public void i_should_see_the_cards_under_documents_option_on_asset_based_lending_page(String header) {

		String Actual = SeleniumDriver
				.GetElementText(BSInvoiceFinance_AssetBasedLendingPageActions.ProductSheetHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(BSInvoiceFinance_AssetBasedLendingPageActions.ProductSheetHeader());
		assertEquals(Actual, Expected);
	}

	@Then("I should see {string} CTA banner on the Asset Based Lending page")
	public void YellowCTABannerHeader(String header) {

		String Actual = SeleniumDriver
				.GetElementText(BSInvoiceFinance_AssetBasedLendingPageActions.YellowCTABanner());
		String Expected = header;
		SeleniumDriver.moveToElement(BSInvoiceFinance_AssetBasedLendingPageActions.YellowCTABanner());
		assertEquals(Actual, Expected);
	}

	@When("I should able to click on the yellow CTA banner abd redirected to {string} page")
	public void ClickOnYellowCTABanner(String title) {

		String Actual = SeleniumDriver.getPageTitle(BSInvoiceFinance_AssetBasedLendingPageActions.YellowCTABanner());
		String Expected = title;
		//assertEquals(Actual, Expected);
		assertTrue(Actual.contains(Expected), "Invalid page");
	}
}
