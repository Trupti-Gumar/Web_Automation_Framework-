package Savings_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.*;
import utils.SeleniumDriver;

public class PersonalSavingsAccount_CashISA_TwoYearFixedRateCashISA {
	
	CashISAPageActions cashISAPageActions = new CashISAPageActions();
	CashISA_TwoYearFixedRateCashISAStepsActions cashISA_TwoYearFixedRateCashISAStepsActions = new CashISA_TwoYearFixedRateCashISAStepsActions();

	
	@Then("I should see Two Year Fixed Rate Cash ISA  Product Card")
	public void i_should_see_two_year_fixed_rate_cash_isa_product_card() {
	    
		cashISAPageActions.moveToTwoYearFixedRateISAProductCard();
	    
	}

	@When("I click on the view account button for the Two Year Fixed Rate Cash ISA Product Card")
	public void i_click_on_the_view_account_button_for_the_two_year_fixed_rate_cash_isa_product_card() {
	    
		SeleniumDriver.clickOnElement(cashISAPageActions.TwoYearISAViewLink());
	}

	@Then("I should navigate to Two Year Fixed Rate Cash ISA page")
	public void i_should_navigate_to_two_year_fixed_rate_cash_isa_page() {
	   
		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "2 Year Fixed Rate Cash ISA - Personal Savings | Aldermore Bank";
		assertEquals(Actual, Expected);

	    
	}

	@Then("I should see the {string} as the header for the Two Year Fixed Rate Cash ISA page")
	public void i_should_see_the_as_the_header_for_the_two_year_fixed_rate_cash_isa_page(String header) {
	    
		String Actual = SeleniumDriver.GetElementText(cashISA_TwoYearFixedRateCashISAStepsActions.TwoYearFixedRateISAHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	    
	}
	
	@Then("I should click on the CTA buton and redirected to account opening form page for 2 year fixed rate cash ISA")
	public void two_year_fixed_rate_opening_form_page_validation() {
		
		String Actual = SeleniumDriver.getPageTitle(cashISA_TwoYearFixedRateCashISAStepsActions.applyNowBtn());
		String Expected = "Apply for a 2 Year Fixed Rate Cash ISA | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should see the Two Year Fixed Rate Cash ISA Product Card")
	public void i_should_see_the_two_year_fixed_rate_cash_isa_product_card() {
	    
		SeleniumDriver.moveToElement(cashISA_TwoYearFixedRateCashISAStepsActions.TermValue());
	    
	}

	@When("I check the {string} on the Two Year Fixed Rate Cash ISA Product Card")
	public void i_check_the_on_the_two_year_fixed_rate_cash_isa_product_card(String string) {
	    
	    
	}

	@Then("I should see the {string} value as {string} on the Two Year Fixed Rate Cash ISA Product Card")
	public void i_should_see_the_value_as_on_the_two_year_fixed_rate_cash_isa_product_card(String content, String value) {
	    
		String ActualText;
		String Expectedtext;

		switch (content) {
		case "Interest rate(*AER)":
			ActualText = SeleniumDriver.GetElementText(cashISA_TwoYearFixedRateCashISAStepsActions.InterestRateValue());
			Expectedtext = value;

			break;
		case "Gross monthly interest":
			ActualText = SeleniumDriver.GetElementText(cashISA_TwoYearFixedRateCashISAStepsActions.GrossMonthlyInterestValue());
			Expectedtext = value;

			break;

		case "Gross annual interest":
			ActualText = SeleniumDriver.GetElementText(cashISA_TwoYearFixedRateCashISAStepsActions.GrossAnnualInterestValue());
			Expectedtext = value;

			break;

		case "Minimum opening balance":
			ActualText = cashISA_TwoYearFixedRateCashISAStepsActions.getOpeningBalanceValue();
			Expectedtext = value;
			break;
		case "Term":
			ActualText = SeleniumDriver.GetElementText(cashISA_TwoYearFixedRateCashISAStepsActions.TermValue());
			Expectedtext = value;
			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + value);
		}
		SeleniumDriver.moveToElement(cashISA_TwoYearFixedRateCashISAStepsActions.TermValue());
		assertEquals(ActualText, Expectedtext);
	    
	}

	@Then("I should see the Product summary FAQs header {string}  on Two Year Fixed Rate Cash ISA page")
	public void i_should_see_the_product_summary_fa_qs_header_on_two_year_fixed_rate_cash_isa_page(String header) {
	    
		String Actual = SeleniumDriver.GetElementText(cashISA_TwoYearFixedRateCashISAStepsActions.ProductSummaryFAQHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(cashISA_TwoYearFixedRateCashISAStepsActions.ProductSummaryFAQHeader());
		assertEquals(Actual, Expected);
	}

	@Then("I should see the Product summary FAQs Accordians on the Two Year Fixed Rate Cash ISA section")
	public void i_should_see_the_product_summary_fa_qs_accordians_on_the_two_year_fixed_rate_cash_isa_section() {
	    
		SeleniumDriver.moveToElement(cashISA_TwoYearFixedRateCashISAStepsActions.ProductSummaryAccordian());
	}

	@Then("I should see the Yellow CTA banner on the Two Year Fixed Rate Cash ISA page")
	public void i_should_see_the_yellow_cta_banner_on_the_two_year_fixed_rate_cash_isa_page() {
	   
		boolean Actual = SeleniumDriver.isElementPresent(cashISA_TwoYearFixedRateCashISAStepsActions.YellowCTABanner());
		boolean Expected = true;
		SeleniumDriver.moveToElement(cashISA_TwoYearFixedRateCashISAStepsActions.YellowCTABanner());
		assertEquals(Actual, Expected);
	    
	}

	@Then("I should be able to click on Yellow CTA banner on Two Year Fixed Rate Cash ISA page and rediredcted to the corresponding page")
	public void i_should_be_able_to_click_on_yellow_cta_banner_on_two_year_fixed_rate_cash_isa_page_and_rediredcted_to_the_corresponding_page() {
	    
		SeleniumDriver.clickOnElement(cashISA_TwoYearFixedRateCashISAStepsActions.YellowCTABanner());

		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "Apply for a 2 Year Fixed Rate Cash ISA | Aldermore Bank";
		assertEquals(Actual, Expected);
	    
	}

	@Then("I should see the {string} as the header for the {string}  image copy section on the Two Year Fixed Rate Cash ISA page")
	public void i_should_see_the_as_the_header_for_the_image_copy_section_on_the_two_year_fixed_rate_cash_isa_page(String header, String headerNum) {
	    
		String Actual;
		String Expected;
		switch (headerNum) {
		case "First":
			Actual = SeleniumDriver.GetElementText(cashISA_TwoYearFixedRateCashISAStepsActions.ImageCopyHeader1());
			Expected = header;

			break;
		case "Second":
			Actual = SeleniumDriver.GetElementText(cashISA_TwoYearFixedRateCashISAStepsActions.ImageCopyHeader2());
			Expected = header;
			break;

		case "Third":
			Actual = SeleniumDriver.GetElementText(cashISA_TwoYearFixedRateCashISAStepsActions.ImageCopyHeader3());
			Expected = header;
			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + headerNum);

		}
		assertEquals(Actual, Expected); 
	}

	@Then("I should see the Cash ISA FAQs header {string}  on Two Year Fixed Rate Cash ISA page")
	public void i_should_see_the_cash_isa_fa_qs_header_on_two_year_fixed_rate_cash_isa_page(String header) {
	    
		String Actual = SeleniumDriver.GetElementText(cashISA_TwoYearFixedRateCashISAStepsActions.CashISAFAQHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(cashISA_TwoYearFixedRateCashISAStepsActions.CashISAFAQHeader());
		assertEquals(Actual, Expected);
	}

	@Then("I should see the Cash ISA FAQs Accordians on the Two Year Fixed Rate Cash ISA section")
	public void i_should_see_the_cash_isa_fa_qs_accordians_on_the_two_year_fixed_rate_cash_isa_section() {
	    
		boolean Actual = SeleniumDriver.isElementPresent(cashISA_TwoYearFixedRateCashISAStepsActions.CashISAFAQccordian());
		boolean Expected = true;
		SeleniumDriver.moveToElement(cashISA_TwoYearFixedRateCashISAStepsActions.CashISAFAQccordian());
		assertEquals(Actual, Expected);
	    
	}

	@Then("I should see the {string} as the header for the Fixed rate cash ISAs summary box card on the Two Year Fixed Rate Cash ISA page")
	public void i_should_see_the_as_the_header_for_the_fixed_rate_cash_is_as_summary_box_card_on_the_two_year_fixed_rate_cash_isa_page(String header) {
	    
		String Actual = SeleniumDriver.GetElementText(cashISA_TwoYearFixedRateCashISAStepsActions.SummaryBoxCardHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(cashISA_TwoYearFixedRateCashISAStepsActions.SummaryBoxCardHeader());
		assertEquals(Actual, Expected);

	}

	@Then("I should see the {string} as the header for the Personal Savings Terms and Conditions card on the Two Year Fixed Rate Cash ISA page")
	public void i_should_see_the_as_the_header_for_the_personal_savings_terms_and_conditions_card_on_the_two_year_fixed_rate_cash_isa_page(String header) {
	    
		String Actual = SeleniumDriver.GetElementText(cashISA_TwoYearFixedRateCashISAStepsActions.PersonalSavingsCardHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(cashISA_TwoYearFixedRateCashISAStepsActions.SummaryBoxCardHeader());
		assertEquals(Actual, Expected);
	}

	@Then("I should see the White CTA banner on the Two Year Fixed Rate Cash ISA page")
	public void i_should_see_the_white_cta_banner_on_the_two_year_fixed_rate_cash_isa_page() {
	    
		boolean Actual = SeleniumDriver.isElementPresent(cashISA_TwoYearFixedRateCashISAStepsActions.WhiteCTABanner());
		boolean Expected = true;
		SeleniumDriver.moveToElement(cashISA_TwoYearFixedRateCashISAStepsActions.WhiteCTABanner());
		assertEquals(Actual, Expected); 
	}

	@Then("I should be able to click on White CTA banner on Two Year Fixed Rate Cash ISA page and rediredcted to the corresponding page")
	public void i_should_be_able_to_click_on_white_cta_banner_on_two_year_fixed_rate_cash_isa_page_and_rediredcted_to_the_corresponding_page() {
	    
		SeleniumDriver.clickOnElement(cashISA_TwoYearFixedRateCashISAStepsActions.WhiteCTABanner());

		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "Login | Aldermore";
		assertEquals(Actual, Expected);
	}
}
