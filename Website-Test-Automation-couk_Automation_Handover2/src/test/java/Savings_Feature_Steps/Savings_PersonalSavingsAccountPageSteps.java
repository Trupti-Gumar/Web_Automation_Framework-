package Savings_Feature_Steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.PersonalSavingsAccountPageActions;
import utils.SeleniumDriver;

public class Savings_PersonalSavingsAccountPageSteps {

	PersonalSavingsAccountPageActions personalSavingsAccountPageActions = new PersonalSavingsAccountPageActions();

	@When("I navigate to Personal Savings Account page")
	public void i_navigate_to_personal_savings_account_page() {
		personalSavingsAccountPageActions.navigateToPersonalSavingsPage();
	}

	@Then("I should see the {string} as the header for the page")
	public void i_should_see_the_as_the_header_for_the_page(String header) {
		String ActualText = personalSavingsAccountPageActions.getpersonalSavingsAccHeaderText();
		String Expectedtext = header;
		assertEquals(ActualText, Expectedtext);
	}

	@Then("I should see the \"(.*?)\" as USP sub header$")
	public void i_should_see_the_as_usp_sub_header(String subHeader) {
		String ActualText;
		String Expectedtext;

		switch (subHeader) {
		case "FSCS Protected":
			ActualText = personalSavingsAccountPageActions.getUSPSubHeaderFCSCText();
			Expectedtext = subHeader;

			break;
		case "Easy account opening":
			ActualText = personalSavingsAccountPageActions.getUSPSubHeaderEasyAccText();
			Expectedtext = subHeader;
			break;
		case "Rated \"excellent\"":
			ActualText = personalSavingsAccountPageActions.getUSPSubHeaderRatedExcellent();
			Expectedtext = subHeader;
			break;

		case "Consistently competitive returns":
			ActualText = personalSavingsAccountPageActions.getUSPSubHeaderConsistently();
			Expectedtext = subHeader;
			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + subHeader);
		}

		assertEquals(ActualText, Expectedtext);
	}

	/*
	 * @Then("I should see the \"Rated \"Excellent\"\" as USP sub header") public
	 * void i_should_see_the_rated_excellent_as_usp_sub_header() {
	 * 
	 * }
	 */

	@Then("I should see the Easy Access Account Product Card")
	public void i_should_see_the_easy_access_account_product_card() {
		personalSavingsAccountPageActions.moveToEasyAccessAccountProductCard();
	}

	@And("I should see the {string} label present on the Product card page")
	public void i_should_see_the_label_present_on_the_product_card_page(String label) {
		String ActualText;
		String Expectedtext;

		switch (label) {
		case "Interest rate (AER*)":
			ActualText = personalSavingsAccountPageActions.getInterestRateLabel();
			Expectedtext = label;

			break;
		case "Term":
			ActualText = personalSavingsAccountPageActions.getTermLabel();
			Expectedtext = label;

			break;
		case "Suitable if you":
			ActualText = personalSavingsAccountPageActions.getSuitableForYouLabel();
			Expectedtext = label;

			break;
		case "*AER stands for annual equivalent rate and illustrates the interest rate if it was paid and compounded once each year.":
			ActualText = personalSavingsAccountPageActions.getAERFullForm();
			Expectedtext = label;

			break;
		case "Minimum opening balance":
			ActualText = personalSavingsAccountPageActions.getMinOpeningBalanceLabel();
			Expectedtext = label;

			break;
		default:
			throw new IllegalArgumentException("Invalid value: " + label);
		}
		personalSavingsAccountPageActions.moveToEasyAccessAccountProductCard();
		assertEquals(ActualText, Expectedtext);

	}

	@When("I check the {string} on the Easy access account card")
	public void i_check_the_on_the_easy_access_account_card(String string) {

	}

	@Then("I should see the \"(.*?)\" value as \"(.*?)\" on the Easy access account card$")
	public void i_should_see_the_displayed_on_the_easy_access_account_card(String content,String value) {
		String ActualText;
		String Expectedtext;

		switch (content) {
		case "Interest rate(*AER)":
			ActualText = personalSavingsAccountPageActions.getEAAInterestRateValue();
			Expectedtext = value;

			break;

		case "Minimum opening balance":
			ActualText = personalSavingsAccountPageActions.getEAAMinOpeningBalanceValue();
			Expectedtext = value;
			break;
		case "Term":
			ActualText = personalSavingsAccountPageActions.getEAATermValue();
			Expectedtext = value;
			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + content);
		}
		personalSavingsAccountPageActions.moveToEasyAccessAccountProductCard();
		assertEquals(ActualText, Expectedtext);
	}

	@Then("I should see the {int} day notice account Product Card")
	public void i_should_see_the_day_notice_account_product_card(Integer int1) {

		/*
		 * switch (int1) { case 30:
		 * personalSavingsAccountPageActions.moveToThirtyDayNoiceAccountProductCard();
		 * break;
		 * 
		 * case 120:
		 * personalSavingsAccountPageActions.moveTo120DayNoiceAccountProductCard();
		 * break;
		 * 
		 * default: throw new IllegalArgumentException("Invalid value: " + int1); }
		 */

	}

	@When("I check the {string} on the {int} day notice account card")
	public void i_check_the_on_the_day_notice_account_card(String value, Integer int1) {

	}

	@Then("I should see the {string} value as {string} on the {int} day notice account card")
	public void i_should_see_the_displayed_on_the_day_notice_account_card(String content,String value, Integer int1) {
		switch (int1) {
		case 30:
			String ActualText;
			String Expectedtext;
			switch (content) {
			case "Interest rate(*AER)":
				ActualText = personalSavingsAccountPageActions.getThirtyDaysInterestValue();
				Expectedtext = value;
				

				break;
			case "Minimum opening balance":
				ActualText = personalSavingsAccountPageActions.getThirtyDaysOpeningBalanceValue();
				Expectedtext = value;
				break;
			case "Term":
				ActualText = personalSavingsAccountPageActions.getThirtyDaysTermValue();
				Expectedtext = value;
				break;
			default:
				throw new IllegalArgumentException("Invalid value: " + value);

			}
			personalSavingsAccountPageActions.moveToThirtyDayNoiceAccountProductCard();
			assertEquals(ActualText, Expectedtext);
			break;
		case 120:
			String actualText;
			String expectedtext;
			switch (content) {
			case "Interest rate(*AER)":
				actualText = personalSavingsAccountPageActions.get120DaysInterestValue();
				expectedtext = value;

				break;
			case "Minimum opening balance":
				actualText = personalSavingsAccountPageActions.get120DaysOpeningBalanceValue();
				expectedtext = value;
				break;
			case "Term":
				actualText = personalSavingsAccountPageActions.get120DaysTermValue();
				expectedtext = value;
				break;
			default:
				throw new IllegalArgumentException("Invalid value: " + value);

			}
			personalSavingsAccountPageActions.moveTo120DayNoiceAccountProductCard();
			assertEquals(actualText, expectedtext);
			break;
		default:
			throw new IllegalArgumentException("Invalid value: " + int1);
		}

	}

	@Then("I should see the {int} year fixed rate account Product Card")
	public void i_should_see_the_year_fixed_rate_account_product_card(Integer int1) {

	}

	@When("I check the {string} on the {int} year fixed rate account card")
	public void i_check_the_on_the_year_fixed_rate_account_card(String string, Integer int1) {

	}

	@Then("I should see the {string} displayed on the {int} year fixed rate account card")
	public void i_should_see_the_displayed_on_the_year_fixed_rate_account_card(String value, Integer int1) {
		switch (int1) {
		case 1:
			String ActualText;
			String Expectedtext;
			switch (value) {
			case "4.35 % Fixed":
				ActualText = personalSavingsAccountPageActions.getOneYeareFixedProductCardInterestValue();
				Expectedtext = value;

				break;
			case "1,000 - 10,000":
				ActualText = personalSavingsAccountPageActions.getOneYeareFixedRateOpeningBalanceValue();
				Expectedtext = value;
				break;
			case "1 Year":
				ActualText = personalSavingsAccountPageActions.getOneYearFixedRateTermValue();
				Expectedtext = value;
				break;
			default:
				throw new IllegalArgumentException("Invalid value: " + value);

			}
			personalSavingsAccountPageActions.moveToOneYeareFixedProductCard();
			assertEquals(ActualText, Expectedtext);
			break;
		case 2:
			String actualText;
			String expectedtext;
			switch (value) {
			case "4.45 % Fixed":
				actualText = personalSavingsAccountPageActions.getTwoYearFixedRateProductCardInterestValue();
				expectedtext = value;

				break;
			case "1,000 - 10,000":
				actualText = personalSavingsAccountPageActions.getTwoYearFixedRateOpeningBalanceValue();
				expectedtext = value;
				break;
			case "2 years":
				actualText = personalSavingsAccountPageActions.getTwoYearFixedRateTermValue();
				expectedtext = value;
				break;
			default:
				throw new IllegalArgumentException("Invalid value: " + value);

			}
			personalSavingsAccountPageActions.moveToTwoYearFixedRateProductCard();
			assertEquals(actualText, expectedtext);
			break;
		case 3:
			String actualText1;
			String expectedtext1;
			switch (value) {
			case "4.45 % Fixed":
				actualText1 = personalSavingsAccountPageActions.getThreeYearFixedRateProductCardInterestValue();
				expectedtext1 = value;

				break;
			case "1,000 - 10,000":
				actualText1 = personalSavingsAccountPageActions.getThreeYearFixedRateOpeningBalanceValue();
				expectedtext1 = value;
				break;
			case "3 years":
				actualText1 = personalSavingsAccountPageActions.getThreeYearFixedRateTermValue();
				expectedtext1 = value;
				break;
			default:
				throw new IllegalArgumentException("Invalid value: " + value);

			}
			personalSavingsAccountPageActions.moveToThreeYearFixedRateProductCard();
			assertEquals(actualText1, expectedtext1);
			break;
		case 4:
			String actualText11;
			String expectedtext11;
			switch (value) {
			case "4.45 % Fixed":
				actualText11 = personalSavingsAccountPageActions.getFourYearFixedRateProductCardInterestValue();
				expectedtext11 = value;

				break;
			case "1,000 - 10,000":
				actualText11 = personalSavingsAccountPageActions.getFourYearFixedRateOpeningBalanceValue();
				expectedtext11 = value;
				break;
			case "4 years":
				actualText11 = personalSavingsAccountPageActions.getFourYearFixedRateTermValue();
				expectedtext11 = value;
				break;
			default:
				throw new IllegalArgumentException("Invalid value: " + value);

			}
			personalSavingsAccountPageActions.moveToFourYearFixedRateProductCard();
			assertEquals(actualText11, expectedtext11);
			break;
		case 5:
			String actualText111;
			String expectedtext111;
			switch (value) {
			case "4.45 % Fixed":
				actualText111 = personalSavingsAccountPageActions.getFiveYearFixedRateProductCardInterestValue();
				expectedtext111 = value;

				break;
			case "1,000 - 10,000":
				actualText111 = personalSavingsAccountPageActions.getFiveYearFixedRateOpeningBalanceValue();
				expectedtext111 = value;
				break;
			case "5 years":
				actualText111 = personalSavingsAccountPageActions.getFiveYearFixedRateTermValue();
				expectedtext111 = value;
				break;
			default:
				throw new IllegalArgumentException("Invalid value: " + value);

			}
			personalSavingsAccountPageActions.moveToFiveYearFixedRateProductCard();
			assertEquals(actualText111, expectedtext111);
			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + int1);
		}

	}

	@Then("I should see the {int} year fixed rate cash ISA Product Card")
	public void i_should_see_the_year_fixed_rate_cash_isa_product_card(Integer int1) {

	}

	@When("I check the {string} on the {int} year fixed rate cash ISA card")
	public void i_check_the_on_the_year_fixed_rate_cash_isa_card(String string, Integer int1) {

	}

	@Then("I should see the {string} value as {string} on the {int} year fixed rate cash ISA card")
	public void i_should_see_the_displayed_on_the_year_fixed_rate_cash_isa_card(String content,String value, Integer int1) {

		switch (int1) {
		case 1:
			String ActualText;
			String Expectedtext;
			switch (content) {
			case "Interest rate(*AER)":
				ActualText = personalSavingsAccountPageActions.getOneYearFixedRateISAProductCardInterestValue();
				Expectedtext = value;

				break;
			case "Minimum opening balance":
				ActualText = personalSavingsAccountPageActions.getOneYearFixedRateISAOpeningBalanceValue();
				Expectedtext = value;
				break;
			case "Term":
				ActualText = personalSavingsAccountPageActions.getOneYearFixedRateISATermValue();
				Expectedtext = value;
				break;
			default:
				throw new IllegalArgumentException("Invalid value: " + value);

			}
			personalSavingsAccountPageActions.moveToOneYearFixedRateISAProductCard();
			assertEquals(ActualText, Expectedtext);
			break;
		case 2:
			String actualText;
			String expectedtext;
			switch (content) {
			case "Interest rate(*AER)":
				actualText = personalSavingsAccountPageActions.getTwoYearFixedRateISAProductCardInterestValue();
				expectedtext = value;

				break;
			case "Minimum opening balance":
				actualText = personalSavingsAccountPageActions.getTwoYearFixedRateISAOpeningBalanceValue();
				expectedtext = value;
				break;
			case "Term":
				actualText = personalSavingsAccountPageActions.getTwoYearFixedRateISATermValue();
				expectedtext = value;
				break;
			default:
				throw new IllegalArgumentException("Invalid value: " + value);

			}
			personalSavingsAccountPageActions.moveToTwoYearFixedRateISAProductCard();
			assertEquals(actualText, expectedtext);
			break;
		case 3:
			String actualText1;
			String expectedtext1;
			switch (content) {
			case "Interest rate(*AER)":
				actualText1 = personalSavingsAccountPageActions.getThreeYearFixedRateISAProductCardInterestValue();
				expectedtext1 = value;

				break;
			case "Minimum opening balance":
				actualText1 = personalSavingsAccountPageActions.getThreeYearFixedRateISAOpeningBalanceValue();
				expectedtext1 = value;
				break;
			case "Term":
				actualText1 = personalSavingsAccountPageActions.getThreeYearFixedRateISATermValue();
				expectedtext1 = value;
				break;
			default:
				throw new IllegalArgumentException("Invalid value: " + value);

			}
			personalSavingsAccountPageActions.moveToThreeYearFixedRateISAProductCard();
			assertEquals(actualText1, expectedtext1);
			break;
		default:
			throw new IllegalArgumentException("Invalid value: " + int1);
		}

	}

	@Then("I should see the {int} day notice cash ISA Product Card")
	public void i_should_see_the_day_notice_cash_isa_product_card(Integer int1) {

	}

	@When("I check the {string} on the {int} day notice cash ISA card")
	public void i_check_the_on_the_day_notice_cash_isa_card(String string, Integer int1) {

	}

	@Then("I should see the {string} value as {string} on the {int} day notice cash ISA card")
	public void i_should_see_the_displayed_on_the_day_notice_cash_isa_card(String content,String value, Integer int1) {

		String ActualText;
		String Expectedtext;

		switch (content) {
		case "Interest rate(*AER)":
			ActualText = personalSavingsAccountPageActions.getThirtyDaysNoticeCashISAInterestValue();
			Expectedtext = value;

			break;

		case "Minimum opening balance":
			ActualText = personalSavingsAccountPageActions.getThirtyDaysNoticeCashISAOpeningBalanceValue();
			Expectedtext = value;
			break;
		case "Term":
			ActualText = personalSavingsAccountPageActions.getThirtyDaysNoticeCashISATermValue();
			Expectedtext = value;
			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + value);
		}
		personalSavingsAccountPageActions.moveToThirtyDaysNoticeCashISA();
		assertEquals(ActualText, Expectedtext);

	}

	@Then("I should see the Double access account Product Card")
	public void i_should_see_the_double_access_account_product_card() {

	}

	@When("I check the {string} on the Double access account card")
	public void i_check_the_on_the_double_access_account_card(String string) {

	}

	@Then("I should see the {string} value as {string} on the Double access account card")
	public void i_should_see_the_displayed_on_the_double_access_account_card(String content,String value) {

		String ActualText;
		String Expectedtext;

		switch (content) {
		case "Interest rate1(*AER)":
			ActualText = personalSavingsAccountPageActions.getDoubleAccessAccountInterestValue1();
			Expectedtext = value;

			break;
		case "Interest rate2(*AER)":
			ActualText = personalSavingsAccountPageActions.getDoubleAccessAccountInterestValue2();
			Expectedtext = value;

			break;

		case "Minimum opening balance":
			ActualText = personalSavingsAccountPageActions.getDoubleAccessAccountOpeningBalanceValue();
			Expectedtext = value;
			break;
		case "Term":
			ActualText = personalSavingsAccountPageActions.getDoubleAccessAccountTermValue();
			Expectedtext = value;
			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + value);
		}
		personalSavingsAccountPageActions.moveToDoubleAccessAccount();
		assertEquals(ActualText, Expectedtext);

	}

	@Then("I should see the {string} CTA button")
	public void i_should_see_the_cta_button(String cardHeader) {
		String ActualText;
		String Expectedtext;

		switch (cardHeader) {
		case "Easy access account":
			ActualText = personalSavingsAccountPageActions.getEasyAccessAccountHeader();
			Expectedtext = cardHeader;

			break;

		case "Double access account":
			ActualText = personalSavingsAccountPageActions.getDoubleAccessAccHeader();
			Expectedtext = cardHeader;
			break;
		case "30 day notice account":
			ActualText = personalSavingsAccountPageActions.getThirtyDaysNoticeAccountHeader();
			Expectedtext = cardHeader;
			break;
		case "120 day notice account":
			ActualText = personalSavingsAccountPageActions.getOneTwentyDaysNoticeAccHeader();
			Expectedtext = cardHeader;
			break;
		case "1 year fixed rate savings account":
			ActualText = personalSavingsAccountPageActions.getOneYeareFixedRateHeader();
			Expectedtext = cardHeader;
			break;
		case "2 year fixed rate savings account":
			ActualText = personalSavingsAccountPageActions.getTwoYeareFixedRateHeader();
			Expectedtext = cardHeader;
			break;
		case "3 year fixed rate savings account":
			ActualText = personalSavingsAccountPageActions.getThreeYeareFixedRateHeader();
			Expectedtext = cardHeader;
			break;
		case "4 year fixed rate savings account":
			ActualText = personalSavingsAccountPageActions.getFourYeareFixedRateHeader();
			Expectedtext =cardHeader;
			break;
		case "5 year fixed rate savings account":
			ActualText = personalSavingsAccountPageActions.getFiveYeareFixedRateHeader();
			Expectedtext = cardHeader;
			break;
		case "1 year fixed rate cash ISA":
			ActualText = personalSavingsAccountPageActions.getOneYearFixedRateISAHeader();
			Expectedtext = cardHeader;
			break;
		case "2 year fixed rate cash ISA":
			ActualText = personalSavingsAccountPageActions.getTwoYearFixedRateISAHeader();
			Expectedtext = cardHeader;
			break;
		case "3 year fixed rate cash ISA":
			ActualText = personalSavingsAccountPageActions.getThreeYearFixedRateISAHeader();
			Expectedtext = cardHeader;
			break;
		case "30 day notice cash ISA":
			ActualText = personalSavingsAccountPageActions.getThirtyDaysNoticeCashISAHeader();
			Expectedtext = cardHeader;
			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + cardHeader);
		}

		assertEquals(ActualText, Expectedtext);
	}

	@When("I click on the button")
	public void i_click_on_the_button() {

	}

	@Then("I should be redirected to the {string} page")
	public void i_should_be_redirected_to_the_page(String value) {

		String ActualText;
		String Expectedtext;

		switch (value) {
		case "Easy Access Account - Personal Savings":
			ActualText = personalSavingsAccountPageActions.getEasyAccessAccountPageTitle();
			Expectedtext = value;

			break;

		case "Double Access Account - Personal Savings":
			ActualText = personalSavingsAccountPageActions.getDoubleAccessAccountPageTitle();
			Expectedtext = value;
			break;
		case "30 Day Notice Savings Account":
			ActualText = personalSavingsAccountPageActions.getThirtyDaysNoticeAccButtonPageTitle();
			Expectedtext = value;
			break;
		case "120 Day Notice Savings Account":
			ActualText = personalSavingsAccountPageActions.getOneTwentyDaysNoticeAccButtonPageTitle();
			Expectedtext = value;
			break;
		case "1 Year Fixed Rate Savings Account":
			ActualText = personalSavingsAccountPageActions.getOneYeareFixedRateButonPageTitle();
			Expectedtext = value;
			break;
		case "2 Year Fixed Rate Savings Account":
			ActualText = personalSavingsAccountPageActions.getTwoYeareFixedRateButonPageTitle();
			Expectedtext = value;
			break;
		case "3 Year Fixed Rate Savings Account":
			ActualText = personalSavingsAccountPageActions.getThreeYeareFixedRateButonPageTitle();
			Expectedtext = value;
			break;
		case "4 Year Fixed Rate Savings Account":
			ActualText = personalSavingsAccountPageActions.getFourYeareFixedRateButonPageTitle();
			Expectedtext = value;
			break;
		case "5 Year Fixed Rate Savings Account":
			ActualText = personalSavingsAccountPageActions.getFiveYeareFixedRateButonPageTitle();
			Expectedtext = value;
			break;
		case "1 Year Fixed Rate Cash ISA - Personal Savings":
			ActualText = personalSavingsAccountPageActions.getOneYearFixedISAButtonPageTitle();
			Expectedtext = value;
			break;
		case "2 Year Fixed Rate Cash ISA - Personal Savings":
			ActualText = personalSavingsAccountPageActions.getTwoYearFixedISAButtonPageTitle();
			Expectedtext = value;
			break;
		case "3 Year Fixed Rate Cash ISA - Personal Savings":
			ActualText = personalSavingsAccountPageActions.getThreeYearFixedISAButtonPageTitle();
			Expectedtext = value;
			break;
		case "30 Day Notice Cash ISA - Personal Savings":
			ActualText = personalSavingsAccountPageActions.getThirtyDaysNoticeCashISAButtonPageTitle();
			Expectedtext = value;
			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + value);
		}

		//assertEquals(ActualText, Expectedtext);
		assertTrue(ActualText.contains(Expectedtext), "Invalid page title");
	}

	@Then("I should see the Image copy secion on the page")
	public void i_should_see_the_image_copy_secion_on_the_page() {

	}

	@And("I should see the {string} as the header for the Image copy secion")
	public void i_should_see_the_as_the_header_for_the_image_copy_secion(String value) {
		String ActualText = personalSavingsAccountPageActions.getImageCopySectionHeader();
		String Expectedtext = value;
		assertEquals(ActualText, Expectedtext);
	}

	@Then("I should see the {string} Card on the page")
	public void i_should_see_the_card_on_the_page(String value) {

		String ActualText;
		String Expectedtext;

		switch (value) {
		case "Important personal savings forms and documents":
			ActualText = personalSavingsAccountPageActions.getImportantpersonalsavingsformsanddocumentsHeader();
			Expectedtext = value;

			break;
		case "Existing customer log in":
			ActualText = personalSavingsAccountPageActions.getExistingCustomerLoginHeader();
			Expectedtext = value;

			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + value);
		}
		personalSavingsAccountPageActions.moveToImportantpersonalsavingsformsanddocument();
		assertEquals(ActualText, Expectedtext);

	}

	@And("I should be able to click on the {string} link")
	public void i_should_be_able_to_click_on_the_link(String value) {

		switch (value) {
		case "Important personal savings forms and documents":
			
			
			personalSavingsAccountPageActions.clickImportantpersonalsavingsformsanddocumentsLink();

			break;
		case "Existing customer log in":
			//personalSavingsAccountPageActions.clickExistingCustomerLoginLink();
			//personalSavingsAccountPageActions.clickAcceptCookiesLink();
			SeleniumDriver.clickElementWithJavaScript(personalSavingsAccountPageActions.ExistingCustomerLoginLink());
			SeleniumDriver.clickElementWithJavaScript(personalSavingsAccountPageActions.AcceptCookies());
			
			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + value);
		}
		//personalSavingsAccountPageActions.moveToImportantpersonalsavingsformsanddocument();
	}

	@Then("I should be redirected to the {string} card page")
	public void i_should_be_redirected_to_the_card_page(String value) {

		String ActualText;
		String Expectedtext;

		switch (value) {
		case "Important personal savings forms and documents":
			ActualText = SeleniumDriver.getDriver().getTitle();
			Expectedtext = "Forms & Documents - Personal Savings | Aldermore Bank";

			break;
		case "Existing customer log in":
			ActualText = SeleniumDriver.getDriver().getTitle();
			Expectedtext = "Login | Aldermore";

			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + value);
		}
		//personalSavingsAccountPageActions.moveToImportantpersonalsavingsformsanddocument();
		assertEquals(ActualText, Expectedtext);

	}

}
