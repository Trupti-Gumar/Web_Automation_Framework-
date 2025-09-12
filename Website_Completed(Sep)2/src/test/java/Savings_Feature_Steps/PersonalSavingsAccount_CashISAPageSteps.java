package Savings_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import pages.actions.*;
import utils.SeleniumDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PersonalSavingsAccount_CashISAPageSteps {

	CashISAPageActions cashISAPageActions = new CashISAPageActions();

	@When("I navigate to Cash ISAs page")
	public void i_navigate_to_cash_is_as_page() {
		cashISAPageActions.navigateToCashISAPage();
	}

	@Then("I should see the {string} as the header for the Cash ISAs page")
	public void i_should_see_the_as_the_header_for_the_cash_is_as_page(String header) {
		String ActualText = cashISAPageActions.getCashISAHeader();
		String Expectedtext = header;
		assertEquals(ActualText, Expectedtext);
	}

	@Then("I should see the {string} as the header for the {string}  image copy section on the Cash ISAs page")
	public void i_should_see_the_as_the_header_for_the_image_copy_section_on_the_cash_is_as_page(String header,
			String headerNum) {
		String Actual;
		String Expected;
		switch (headerNum) {
		case "First":
			Actual = cashISAPageActions.getImageCopySectionHeader1();
			Expected = header;

			break;
		case "Second":
			Actual = cashISAPageActions.getImageCopySectionHeader2();
			Expected = header;
			break;
		case "Third":
			Actual = cashISAPageActions.getImageCopySectionHeader3();
			Expected = header;
			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + headerNum);

		}
		assertEquals(Actual, Expected);

	}

	@Then("I should be able to click on ISA Transfers  Image copy CTA button and should be redirected to {string} page")
	public void i_should_be_able_to_click_on_isa_transfers_image_copy_cta_button_and_should_be_redirected_to_corresponding_page(
			String title) {
		cashISAPageActions.clickOnISATransferButton();
		String ActualText = SeleniumDriver.getDriver().getTitle();
		String Expectedtext = title;
		assertEquals(ActualText, Expectedtext);
	}

	@Then("I should see the Cash ISA FAQs header {string}  on Cash ISA page")
	public void i_should_see_the_cash_isa_fa_qs_header_on_cash_isa_page(String header) {
		String ActualText = cashISAPageActions.getFAQHeader();
		String Expectedtext = header;
		assertEquals(ActualText, Expectedtext);
	}

	@And("I should see the Accordians on the Cash ISA FAQs section")
	public void i_should_see_the_accordians_on_the_cash_isa_fa_qs_section() {
		boolean Actual = cashISAPageActions.verifyAccordianOnthePage();
		boolean Expected = true;
		assertEquals(Actual, Expected);
	}

	@And("I should see the more card header {string} on Cash ISA FAQs section")
	public void i_should_see_the_more_card_header_on_cash_isa_fa_qs_section(String header) {
		String Actual = cashISAPageActions.getMoreCardHeaderOnFAQ();
		String Expected = header;
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} value as {string} on the {int} year fixed rate cash ISA card page")
	public void i_should_see_the_displayed_on_the_year_fixed_rate_cash_isa_card(String content, String value,
			Integer int1) {

		switch (int1) {
		case 1:
			String ActualText;
			String Expectedtext;
			switch (content) {
			case "Interest rate(*AER)":
				ActualText = cashISAPageActions.getOneYearFixedRateISAProductCardInterestValue();
				Expectedtext = value;

				break;
			case "Minimum opening balance":
				ActualText = cashISAPageActions.getOneYearFixedRateISAOpeningBalanceValue();
				Expectedtext = value;
				break;
			case "Term":
				ActualText = cashISAPageActions.getOneYearFixedRateISATermValue();
				Expectedtext = value;
				break;
			default:
				throw new IllegalArgumentException("Invalid value: " + value);

			}
			cashISAPageActions.moveToOneYearFixedRateISAProductCard();
			assertEquals(ActualText, Expectedtext);
			break;
		case 2:
			String actualText;
			String expectedtext;
			switch (content) {
			case "Interest rate(*AER)":
				actualText = cashISAPageActions.getTwoYearFixedRateISAProductCardInterestValue();
				expectedtext = value;

				break;
			case "Minimum opening balance":
				actualText = cashISAPageActions.getTwoYearFixedRateISAOpeningBalanceValue();
				expectedtext = value;
				break;
			case "Term":
				actualText = cashISAPageActions.getTwoYearFixedRateISATermValue();
				expectedtext = value;
				break;
			default:
				throw new IllegalArgumentException("Invalid value: " + value);

			}
			cashISAPageActions.moveToTwoYearFixedRateISAProductCard();
			assertEquals(actualText, expectedtext);
			break;
		case 3:
			String actualText1;
			String expectedtext1;
			switch (content) {
			case "Interest rate(*AER)":
				actualText1 = cashISAPageActions.getThreeYearFixedRateISAProductCardInterestValue();
				expectedtext1 = value;

				break;
			case "Minimum opening balance":
				actualText1 = cashISAPageActions.getThreeYearFixedRateISAOpeningBalanceValue();
				expectedtext1 = value;
				break;
			case "Term":
				actualText1 = cashISAPageActions.getThreeYearFixedRateISATermValue();
				expectedtext1 = value;
				break;
			default:
				throw new IllegalArgumentException("Invalid value: " + value);

			}
			cashISAPageActions.moveToThreeYearFixedRateISAProductCard();
			assertEquals(actualText1, expectedtext1);
			break;
		default:
			throw new IllegalArgumentException("Invalid value: " + int1);
		}

	}

	@Then("I should see the {string} value as {string} on the {int} day notice cash ISA card page")
	public void i_should_see_the_displayed_on_the_day_notice_cash_isa_card(String content, String value, Integer int1) {

		String ActualText;
		String Expectedtext;

		switch (content) {
		case "Interest rate(*AER)":
			ActualText = cashISAPageActions.getThirtyDaysNoticeCashISAInterestValue();
			Expectedtext = value;

			break;

		case "Minimum opening balance":
			ActualText = cashISAPageActions.getThirtyDaysNoticeCashISAOpeningBalanceValue();
			Expectedtext = value;
			break;
		case "Term":
			ActualText = cashISAPageActions.getThirtyDaysNoticeCashISATermValue();
			Expectedtext = value;
			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + value);
		}
		cashISAPageActions.moveToThirtyDaysNoticeCashISA();
		assertEquals(ActualText, Expectedtext);

	}
}
