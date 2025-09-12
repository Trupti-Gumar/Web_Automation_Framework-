package Savings_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CashISAPageActions;
import pages.actions.CashISA_ThreeYearFixedRateCashISAActions;
import utils.SeleniumDriver;

public class PersonalSavingsAccount_CashISA_ThreeYearFixedRateCashISA {
	
	CashISAPageActions cashISAPageActions = new CashISAPageActions();
	CashISA_ThreeYearFixedRateCashISAActions cashISA_ThreeYearFixedRateCashISAActions = new CashISA_ThreeYearFixedRateCashISAActions();

	@Then("I should see Three Year Fixed Rate Cash ISA  Product Card")
	public void i_should_see_three_year_fixed_rate_cash_isa_product_card() {
	    
		cashISAPageActions.moveToThreeYearFixedRateISAProductCard();
	}

	@When("I click on the view account button for the Three Year Fixed Rate Cash ISA Product Card")
	public void i_click_on_the_view_account_button_for_the_three_year_fixed_rate_cash_isa_product_card() {
	    
		SeleniumDriver.clickOnElement(cashISAPageActions.ThreeYearISAViewLink());
	}

	@Then("I should navigate to Three Year Fixed Rate Cash ISA page")
	public void i_should_navigate_to_three_year_fixed_rate_cash_isa_page() {
	    
		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "3 Year Fixed Rate Cash ISA - Personal Savings | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Three Year Fixed Rate Cash ISA page")
	public void i_should_see_the_as_the_header_for_the_three_year_fixed_rate_cash_isa_page(String header) {
	    
		String Actual = SeleniumDriver.GetElementText(cashISA_ThreeYearFixedRateCashISAActions.ThreeYearFixedRateISAHeader());
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@Then("I should click on the CTA buton and redirected to account opening form page for 3 year fixed rate cash ISA")
	public void two_year_fixed_rate_opening_form_page_validation() {
		
		String Actual = SeleniumDriver.getPageTitle(cashISA_ThreeYearFixedRateCashISAActions.applyNowBtn());
		String Expected = "Apply for a 3 Year Fixed Rate Cash ISA | Aldermore Bank";
		assertEquals(Actual, Expected);
	}

	@Then("I should see the Three Year Fixed Rate Cash ISA Product Card")
	public void i_should_see_the_three_year_fixed_rate_cash_isa_product_card() {
	    
		SeleniumDriver.moveToElement(cashISA_ThreeYearFixedRateCashISAActions.TermValue());
	    
	}

	@When("I check the {string} on the Three Year Fixed Rate Cash ISA Product Card")
	public void i_check_the_on_the_three_year_fixed_rate_cash_isa_product_card(String string) {
	    
	    
	}

	@Then("I should see the {string} value as {string} on the Three Year Fixed Rate Cash ISA Product Card")
	public void i_should_see_the_value_as_on_the_three_year_fixed_rate_cash_isa_product_card(String content, String value) {
	    
		String ActualText;
		String Expectedtext;

		switch (content) {
		case "Interest rate(*AER)":
			ActualText = SeleniumDriver.GetElementText(cashISA_ThreeYearFixedRateCashISAActions.InterestRateValue());
			Expectedtext = value;

			break;
		case "Gross monthly interest":
			ActualText = SeleniumDriver.GetElementText(cashISA_ThreeYearFixedRateCashISAActions.GrossMonthlyInterestValue());
			Expectedtext = value;

			break;

		case "Gross annual interest":
			ActualText = SeleniumDriver.GetElementText(cashISA_ThreeYearFixedRateCashISAActions.GrossAnnualInterestValue());
			Expectedtext = value;

			break;

		case "Minimum opening balance":
			ActualText = cashISA_ThreeYearFixedRateCashISAActions.getOpeningBalanceValue();
			Expectedtext = value;
			break;
		case "Term":
			ActualText = SeleniumDriver.GetElementText(cashISA_ThreeYearFixedRateCashISAActions.TermValue());
			Expectedtext = value;
			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + value);
		}
		SeleniumDriver.moveToElement(cashISA_ThreeYearFixedRateCashISAActions.TermValue());
		assertEquals(ActualText, Expectedtext);
	    
	}

	@Then("I should see the Product summary FAQs header {string}  on Three Year Fixed Rate Cash ISA page")
	public void i_should_see_the_product_summary_fa_qs_header_on_three_year_fixed_rate_cash_isa_page(String header) {
	    
		String Actual = SeleniumDriver.GetElementText(cashISA_ThreeYearFixedRateCashISAActions.ProductSummaryFAQHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(cashISA_ThreeYearFixedRateCashISAActions.ProductSummaryFAQHeader());
		assertEquals(Actual, Expected); 
	}

	@Then("I should see the Product summary FAQs Accordians on the Three Year Fixed Rate Cash ISA section")
	public void i_should_see_the_product_summary_fa_qs_accordians_on_the_three_year_fixed_rate_cash_isa_section() {
	    
		SeleniumDriver.moveToElement(cashISA_ThreeYearFixedRateCashISAActions.ProductSummaryAccordian());
	}

	@Then("I should see the Yellow CTA banner on the Three Year Fixed Rate Cash ISA page")
	public void i_should_see_the_yellow_cta_banner_on_the_three_year_fixed_rate_cash_isa_page() {
	    
		boolean Actual = SeleniumDriver.isElementPresent(cashISA_ThreeYearFixedRateCashISAActions.YellowCTABanner());
		boolean Expected = true;
		SeleniumDriver.moveToElement(cashISA_ThreeYearFixedRateCashISAActions.YellowCTABanner());
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on Yellow CTA banner on Three Year Fixed Rate Cash ISA page and rediredcted to the corresponding page")
	public void i_should_be_able_to_click_on_yellow_cta_banner_on_three_year_fixed_rate_cash_isa_page_and_rediredcted_to_the_corresponding_page() {
	    
	    String Actual= SeleniumDriver.getPageTitle(cashISA_ThreeYearFixedRateCashISAActions.YellowCTABanner());
	    String Expected= "Apply for a 3 Year Fixed Rate Cash ISA | Aldermore Bank";
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the {string}  image copy section on the Three Year Fixed Rate Cash ISA page")
	public void i_should_see_the_as_the_header_for_the_image_copy_section_on_the_three_year_fixed_rate_cash_isa_page(String header, String headerNum) {
	    
		String Actual;
		String Expected;
		switch (headerNum) {
		case "First":
			Actual = SeleniumDriver.GetElementText(cashISA_ThreeYearFixedRateCashISAActions.ImageCopyHeader1());
			Expected = header;

			break;
		case "Second":
			Actual = SeleniumDriver.GetElementText(cashISA_ThreeYearFixedRateCashISAActions.ImageCopyHeader2());
			Expected = header;
			break;

		case "Third":
			Actual = SeleniumDriver.GetElementText(cashISA_ThreeYearFixedRateCashISAActions.ImageCopyHeader3());
			Expected = header;
			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + headerNum);

		}
		assertEquals(Actual, Expected); 
	}

	@Then("I should see the Cash ISA FAQs header {string}  on Three Year Fixed Rate Cash ISA page")
	public void i_should_see_the_cash_isa_fa_qs_header_on_three_year_fixed_rate_cash_isa_page(String header) {
	    
		String Actual = SeleniumDriver.GetElementText(cashISA_ThreeYearFixedRateCashISAActions.CashISAFAQHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(cashISA_ThreeYearFixedRateCashISAActions.CashISAFAQHeader());
		assertEquals(Actual, Expected);
	}

	@Then("I should see the Cash ISA FAQs Accordians on the Three Year Fixed Rate Cash ISA section")
	public void i_should_see_the_cash_isa_fa_qs_accordians_on_the_three_year_fixed_rate_cash_isa_section() {
	    
		boolean Actual = SeleniumDriver.isElementPresent(cashISA_ThreeYearFixedRateCashISAActions.CashISAFAQccordian());
		boolean Expected = true;
		SeleniumDriver.moveToElement(cashISA_ThreeYearFixedRateCashISAActions.CashISAFAQccordian());
		assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the Fixed rate cash ISAs summary box card on the Three Year Fixed Rate Cash ISA page")
	public void i_should_see_the_as_the_header_for_the_fixed_rate_cash_is_as_summary_box_card_on_the_three_year_fixed_rate_cash_isa_page(String header) {
	    
		String Actual = SeleniumDriver.GetElementText(cashISA_ThreeYearFixedRateCashISAActions.SummaryBoxCardHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(cashISA_ThreeYearFixedRateCashISAActions.SummaryBoxCardHeader());
		assertEquals(Actual, Expected);

	}

	@Then("I should see the {string} as the header for the Personal Savings Terms and Conditions card on the Three Year Fixed Rate Cash ISA page")
	public void i_should_see_the_as_the_header_for_the_personal_savings_terms_and_conditions_card_on_the_three_year_fixed_rate_cash_isa_page(String header) {
	    
		String Actual = SeleniumDriver.GetElementText(cashISA_ThreeYearFixedRateCashISAActions.PersonalSavingsCardHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(cashISA_ThreeYearFixedRateCashISAActions.SummaryBoxCardHeader());
		assertEquals(Actual, Expected);
	    
	}

	@Then("I should see the White CTA banner on the Three Year Fixed Rate Cash ISA page")
	public void i_should_see_the_white_cta_banner_on_the_three_year_fixed_rate_cash_isa_page() {
	    
		boolean Actual = SeleniumDriver.isElementPresent(cashISA_ThreeYearFixedRateCashISAActions.WhiteCTABanner());
		boolean Expected = true;
		SeleniumDriver.moveToElement(cashISA_ThreeYearFixedRateCashISAActions.WhiteCTABanner());
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on White CTA banner on Three Year Fixed Rate Cash ISA page and rediredcted to the corresponding page")
	public void i_should_be_able_to_click_on_white_cta_banner_on_three_year_fixed_rate_cash_isa_page_and_rediredcted_to_the_corresponding_page() {
	    
		String Actual= SeleniumDriver.getPageTitle(cashISA_ThreeYearFixedRateCashISAActions.WhiteCTABanner());
	    String Expected= "Login | Aldermore";
	    assertEquals(Actual, Expected);
	}
}
