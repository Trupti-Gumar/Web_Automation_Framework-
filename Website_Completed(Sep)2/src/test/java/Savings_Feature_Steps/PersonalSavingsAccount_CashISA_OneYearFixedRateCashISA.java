package Savings_Feature_Steps;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CashISAPageActions;
import pages.actions.OneYearFixedRateCashISAActions;
import utils.SeleniumDriver;

public class PersonalSavingsAccount_CashISA_OneYearFixedRateCashISA {

	CashISAPageActions cashISAPageActions = new CashISAPageActions();

	OneYearFixedRateCashISAActions oneYearFixedRateCashISAActions = new OneYearFixedRateCashISAActions();

	@Then("I should see One Year Fixed Rate Cash ISA  Product Card")
	public void i_should_see_year_fixed_rate_cash_isa_product_card() {

		cashISAPageActions.moveToOneYearFixedRateISAProductCard();
	}

	@When("I click on the view account button for the One Year Fixed Rate Cash ISA Product Card")
	public void i_click_on_the_view_account_button_for_the_year_fixed_rate_cash_isa_product_card() {

		SeleniumDriver.clickOnElement(cashISAPageActions.OneYearISAViewLink());
	}

	@Then("I should navigate to One Year Fixed Rate Cash ISA page")
	public void i_should_navigate_to_year_fixed_rate_cash_isa_page() {

		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "1 Year Fixed Rate Cash ISA - Personal Savings | Aldermore Bank";
		assertEquals(Actual, Expected);

	}

	@Then("I should see the {string} as the header for the One Year Fixed Rate Cash ISA page")
	public void i_should_see_the_as_the_header_for_the_year_fixed_rate_cash_isa_page(String header) {

		String Actual = SeleniumDriver.GetElementText(oneYearFixedRateCashISAActions.OneYearFixedRateISAHeader());
		String Expected = header;
		assertEquals(Actual, Expected);

	}

	@Then("I should see the One Year Fixed Rate Cash ISA Product Card")
	public void i_should_see_the_year_fixed_rate_cash_isa_product_card() {

		SeleniumDriver.moveToElement(oneYearFixedRateCashISAActions.TermValue());

	}

	@When("I check the {string} on the One Year Fixed Rate Cash ISA Product Card")
	public void i_check_the_on_the_year_fixed_rate_cash_isa_product_card(String string) {

	}

	@Then("I should see the {string} value as {string} on the One Year Fixed Rate Cash ISA Product Card")
	public void i_should_see_the_value_as_on_the_year_fixed_rate_cash_isa_product_card(String content, String value) {

		String ActualText;
		String Expectedtext;

		switch (content) {
		case "Interest rate(*AER)":
			ActualText = SeleniumDriver.GetElementText(oneYearFixedRateCashISAActions.InterestRateValue());
			Expectedtext = value;

			break;
		case "Gross monthly interest":
			ActualText = SeleniumDriver.GetElementText(oneYearFixedRateCashISAActions.GrossMonthlyInterestValue());
			Expectedtext = value;

			break;

		case "Gross annual interest":
			ActualText = SeleniumDriver.GetElementText(oneYearFixedRateCashISAActions.GrossAnnualInterestValue());
			Expectedtext = value;

			break;

		case "Minimum opening balance":
			ActualText = oneYearFixedRateCashISAActions.getOpeningBalanceValue();
			Expectedtext = value;
			break;
		case "Term":
			ActualText = SeleniumDriver.GetElementText(oneYearFixedRateCashISAActions.TermValue());
			Expectedtext = value;
			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + value);
		}
		SeleniumDriver.moveToElement(oneYearFixedRateCashISAActions.TermValue());
		assertEquals(ActualText, Expectedtext);
	}

	@Then("I should see the Product summary FAQs header {string}  on One Year Fixed Rate Cash ISA page")
	public void i_should_see_the_product_summary_fa_qs_header_on_year_fixed_rate_cash_isa_page(String header) {

		String Actual = SeleniumDriver.GetElementText(oneYearFixedRateCashISAActions.ProductSummaryFAQHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(oneYearFixedRateCashISAActions.ProductSummaryFAQHeader());
		assertEquals(Actual, Expected);

	}

	@Then("I should see the Product summary FAQs Accordians on the One Year Fixed Rate Cash ISA section")
	public void i_should_see_the_product_summary_fa_qs_accordians_on_the_year_fixed_rate_cash_isa_section() {

		SeleniumDriver.moveToElement(oneYearFixedRateCashISAActions.ProductSummaryAccordian());
	}

	@Then("I should see the Yellow CTA banner on the One Year Fixed Rate Cash ISA page")
	public void i_should_see_the_yellow_cta_banner_on_the_year_fixed_rate_cash_isa_page() {

		boolean Actual = SeleniumDriver.isElementPresent(oneYearFixedRateCashISAActions.YellowCTABanner());
		boolean Expected = true;
		SeleniumDriver.moveToElement(oneYearFixedRateCashISAActions.YellowCTABanner());
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on Yellow CTA banner on One Year Fixed Rate Cash ISA page and rediredcted to the corresponding page")
	public void i_should_be_able_to_click_on_yellow_cta_banner_on_year_fixed_rate_cash_isa_page_and_rediredcted_to_the_corresponding_page() {

		SeleniumDriver.clickOnElement(oneYearFixedRateCashISAActions.YellowCTABanner());

		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "Apply for a 1 Year Fixed Rate Cash ISA | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the {string}  image copy section on the One Year Fixed Rate Cash ISA page")
	public void i_should_see_the_as_the_header_for_the_image_copy_section_on_the_year_fixed_rate_cash_isa_page(
			String header, String headerNum) {

		String Actual;
		String Expected;
		switch (headerNum) {
		case "First":
			Actual = SeleniumDriver.GetElementText(oneYearFixedRateCashISAActions.ImageCopyHeader1());
			Expected = header;

			break;
		case "Second":
			Actual = SeleniumDriver.GetElementText(oneYearFixedRateCashISAActions.ImageCopyHeader2());
			Expected = header;
			break;

		case "Third":
			Actual = SeleniumDriver.GetElementText(oneYearFixedRateCashISAActions.ImageCopyHeader3());
			Expected = header;
			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + headerNum);

		}
		assertEquals(Actual, Expected);
	}

	@Then("I should see the Cash ISA FAQs header {string}  on One Year Fixed Rate Cash ISA page")
	public void i_should_see_the_cash_isa_fa_qs_header_on_year_fixed_rate_cash_isa_page(String header) {

		String Actual = SeleniumDriver.GetElementText(oneYearFixedRateCashISAActions.CashISAFAQHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(oneYearFixedRateCashISAActions.CashISAFAQHeader());
		assertEquals(Actual, Expected);
	}

	@Then("I should see the Cash ISA FAQs Accordians on the One Year Fixed Rate Cash ISA section")
	public void i_should_see_the_cash_isa_fa_qs_accordians_on_the_year_fixed_rate_cash_isa_section() {

		boolean Actual = SeleniumDriver.isElementPresent(oneYearFixedRateCashISAActions.CashISAFAQccordian());
		boolean Expected = true;
		SeleniumDriver.moveToElement(oneYearFixedRateCashISAActions.CashISAFAQccordian());
		assertEquals(Actual, Expected);
	}

	@Then("I should be click on the Cash ISA FAQs accordian and it should expand")
	public void i_should_be_click_on_the_cash_isa_fa_qs_accordian_and_it_should_expand() {

		SeleniumDriver.clickOnElement(oneYearFixedRateCashISAActions.CashISAFAQccordian());

		boolean Actual = SeleniumDriver.isElementPresent(oneYearFixedRateCashISAActions.CashISAFAQAccordianTextBlock());
		boolean Expected = true;
		SeleniumDriver.moveToElement(oneYearFixedRateCashISAActions.CashISAFAQAccordianTextBlock());
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Fixed rate cash ISAs summary box card on the One Year Fixed Rate Cash ISA page")
	public void i_should_see_the_as_the_header_for_the_fixed_rate_cash_is_as_summary_box_card_on_the_year_fixed_rate_cash_isa_page(
			String header) {

		String Actual = SeleniumDriver.GetElementText(oneYearFixedRateCashISAActions.SummaryBoxCardHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(oneYearFixedRateCashISAActions.SummaryBoxCardHeader());
		assertEquals(Actual, Expected);

	}

	@Then("I should be able to click on the download document for Fixed rate cash ISAs summary box card and downlaod the corresponding page")
	public void i_should_be_able_to_click_on_the_download_document_for_fixed_rate_cash_is_as_summary_box_card_and_downlaod_the_corresponding_page() {

		SeleniumDriver.clickOnElement(oneYearFixedRateCashISAActions.SummaryBoxCardDownloadLink());
	}

	@Then("I should see the {string} as the header for the Personal Savings Terms and Conditions card on the One Year Fixed Rate Cash ISA page")
	public void i_should_see_the_as_the_header_for_the_personal_savings_terms_and_conditions_card_on_the_year_fixed_rate_cash_isa_page(
			String header) {

		String Actual = SeleniumDriver.GetElementText(oneYearFixedRateCashISAActions.PersonalSavingsCardHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(oneYearFixedRateCashISAActions.SummaryBoxCardHeader());
		assertEquals(Actual, Expected);

	}

	@Then("I should see the White CTA banner on the One Year Fixed Rate Cash ISA page")
	public void i_should_see_the_white_cta_banner_on_the_year_fixed_rate_cash_isa_page() {

		boolean Actual = SeleniumDriver.isElementPresent(oneYearFixedRateCashISAActions.WhiteCTABanner());
		boolean Expected = true;
		SeleniumDriver.moveToElement(oneYearFixedRateCashISAActions.WhiteCTABanner());
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on White CTA banner on One Year Fixed Rate Cash ISA page and rediredcted to the corresponding page")
	public void i_should_be_able_to_click_on_white_cta_banner_on_year_fixed_rate_cash_isa_page_and_rediredcted_to_the_corresponding_page() {

		SeleniumDriver.clickOnElement(oneYearFixedRateCashISAActions.WhiteCTABanner());

		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "Login | Aldermore";
		assertEquals(Actual, Expected);
	}

	@And("I should be able to click on login link and redirected to the Online Banking login page")
	public void verifyLoginLink() {

		Set<String> windowHandleBefore = SeleniumDriver.getDriver().getWindowHandles();

		int numberOfTabsBefore = windowHandleBefore.size();

		SeleniumDriver.clickOnElement(oneYearFixedRateCashISAActions.loginLinkBlackbox());

		Set<String> windowHandleAfter = SeleniumDriver.getDriver().getWindowHandles();

		int numberOfTabsAfter = windowHandleAfter.size();

		if (numberOfTabsAfter > numberOfTabsBefore) {

			for (String handle : windowHandleAfter) {
				if (!windowHandleBefore.contains(handle)) {
					SeleniumDriver.getDriver().switchTo().window(handle);
					break;
				}
			}
		}

		String pageTitle = SeleniumDriver.getDriver().getTitle();

		String Expected = "Login | Aldermore";

		assertEquals(pageTitle, Expected);

		if (numberOfTabsAfter > numberOfTabsBefore) {

			SeleniumDriver.getDriver().close();

			SeleniumDriver.getDriver().switchTo().window(windowHandleBefore.iterator().next());
		}

	}
	
	@Then("I am redirected to One Year Fixed Rate Cash ISA  account opening form page")
	public void one_year_Cash_Open_Form() {

		String Actual = SeleniumDriver.getPageTitle(oneYearFixedRateCashISAActions.applyNow());
		String Expected = "Apply for a 1 Year Fixed Rate Cash ISA | Aldermore Bank";
		assertEquals(Actual, Expected);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
