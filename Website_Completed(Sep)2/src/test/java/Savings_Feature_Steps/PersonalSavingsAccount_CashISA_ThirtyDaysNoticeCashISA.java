package Savings_Feature_Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.*;
import utils.SeleniumDriver;

public class PersonalSavingsAccount_CashISA_ThirtyDaysNoticeCashISA {
	
	CashISAPageActions cashISAPageActions = new CashISAPageActions();
	
	CashISA_ThirtyDaysNoticeCashISAActions cashISA_ThirtyDaysNoticeCashISAActions = new CashISA_ThirtyDaysNoticeCashISAActions();

	@Then("I should see Thirty Days Notice Cash ISA  Product Card")
	public void i_should_see_thirty_days_notice_cash_isa_product_card() {
	    
		cashISAPageActions.moveToThirtyDaysNoticeCashISA();
	}

	@When("I click on the view account button for the Thirty Days Notice Cash ISA Product Card")
	public void i_click_on_the_view_account_button_for_the_thirty_days_notice_cash_isa_product_card() {
	    
		SeleniumDriver.clickOnElement(cashISAPageActions.ThirtyDaysNoticeCashISAViewLink());
	}

	@Then("I should navigate to Thirty Days Notice Cash ISA page")
	public void i_should_navigate_to_thirty_days_notice_cash_isa_page() {
	    
		String Actual = SeleniumDriver.getDriver().getTitle();
		String Expected = "30 Day Notice Cash ISA - Personal Savings | Aldermore Bank";
		assertEquals(Actual, Expected);
	    
	}

	@Then("I should see the {string} as the header for the Thirty Days Notice Cash ISA page")
	public void i_should_see_the_as_the_header_for_the_thirty_days_notice_cash_isa_page(String header) {
	    
		String Actual = SeleniumDriver.GetElementText(cashISA_ThirtyDaysNoticeCashISAActions.ThirtyDaysNoticeCashISA());
		String Expected = header;
		assertEquals(Actual, Expected);
	}
	
	@And("I should click on the CTA buton and redirected to account opening form page for 30 days fixed rate cash ISA")
	public void verify_apply_button() {
		
		String Actual = SeleniumDriver.GetElementText(cashISA_ThirtyDaysNoticeCashISAActions.ThirtyDaysNoticeCashISA());
		String Expected = "30 day notice cash ISA";
		assertEquals(Actual, Expected);
	}

	@Then("I should see the Thirty Days Notice Cash ISA Product Card")
	public void i_should_see_the_thirty_days_notice_cash_isa_product_card() {
	    
		SeleniumDriver.moveToElement(cashISA_ThirtyDaysNoticeCashISAActions.TermValue());
	}

	@When("I check the {string} on the Thirty Days Notice Cash ISA Product Card")
	public void i_check_the_on_the_thirty_days_notice_cash_isa_product_card(String string) {
	    
		
	    
	}

	@Then("I should see the {string} value as {string} on the Thirty Days Notice Cash ISA Product Card")
	public void i_should_see_the_value_as_on_the_thirty_days_notice_cash_isa_product_card(String content, String value) {
	    
		String ActualText;
		String Expectedtext;

		switch (content) {
		case "Interest rate(*AER)":
			ActualText = SeleniumDriver.GetElementText(cashISA_ThirtyDaysNoticeCashISAActions.InterestRateValue());
			Expectedtext = value;

			break;
		case "Gross monthly interest":
			ActualText = SeleniumDriver.GetElementText(cashISA_ThirtyDaysNoticeCashISAActions.GrossMonthlyInterestValue());
			Expectedtext = value;

			break;

		case "Gross annual interest":
			ActualText = SeleniumDriver.GetElementText(cashISA_ThirtyDaysNoticeCashISAActions.GrossAnnualInterestValue());
			Expectedtext = value;

			break;

		case "Minimum opening balance":
			ActualText = cashISA_ThirtyDaysNoticeCashISAActions.getOpeningBalanceValue();
			Expectedtext = value;
			break;
		case "Term":
			ActualText = SeleniumDriver.GetElementText(cashISA_ThirtyDaysNoticeCashISAActions.TermValue());
			Expectedtext = value;
			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + value);
		}
		SeleniumDriver.moveToElement(cashISA_ThirtyDaysNoticeCashISAActions.TermValue());
		assertEquals(ActualText, Expectedtext);
	}

	@Then("I should see the Product summary FAQs header {string}  on Thirty Days Notice Cash ISA page")
	public void i_should_see_the_product_summary_fa_qs_header_on_thirty_days_notice_cash_isa_page(String header) {
	    
		String Actual = SeleniumDriver.GetElementText(cashISA_ThirtyDaysNoticeCashISAActions.ProductSummaryFAQHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(cashISA_ThirtyDaysNoticeCashISAActions.ProductSummaryFAQHeader());
		assertEquals(Actual, Expected); 
	}

	@Then("I should see the Product summary FAQs Accordians on the Thirty Days Notice Cash ISA section")
	public void i_should_see_the_product_summary_fa_qs_accordians_on_the_thirty_days_notice_cash_isa_section() {
	    
		SeleniumDriver.moveToElement(cashISA_ThirtyDaysNoticeCashISAActions.ProductSummaryAccordian());
	}

	@Then("I should see the Yellow CTA banner on the Thirty Days Notice Cash ISA page")
	public void i_should_see_the_yellow_cta_banner_on_the_thirty_days_notice_cash_isa_page() {
	    
		boolean Actual = SeleniumDriver.isElementPresent(cashISA_ThirtyDaysNoticeCashISAActions.YellowCTABanner());
		boolean Expected = true;
		SeleniumDriver.moveToElement(cashISA_ThirtyDaysNoticeCashISAActions.YellowCTABanner());
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on Yellow CTA banner on Thirty Days Notice Cash ISA page and rediredcted to the corresponding page")
	public void i_should_be_able_to_click_on_yellow_cta_banner_on_thirty_days_notice_cash_isa_page_and_rediredcted_to_the_corresponding_page() {
	    
		String Actual= SeleniumDriver.getPageTitle(cashISA_ThirtyDaysNoticeCashISAActions.YellowCTABanner());
	    String Expected= "Apply for a 30 Day Notice Cash ISA | Aldermore Bank";
	    assertEquals(Actual, Expected);
	}

	@Then("I should see the {string} as the header for the {string}  image copy section on the Thirty Days Notice Cash ISA page")
	public void i_should_see_the_as_the_header_for_the_image_copy_section_on_the_thirty_days_notice_cash_isa_page(String header, String headerNum) {
	    
		String Actual;
		String Expected;
		switch (headerNum) {
		case "First":
			Actual = SeleniumDriver.GetElementText(cashISA_ThirtyDaysNoticeCashISAActions.ImageCopyHeader1());
			Expected = header;

			break;
		case "Second":
			Actual = SeleniumDriver.GetElementText(cashISA_ThirtyDaysNoticeCashISAActions.ImageCopyHeader2());
			Expected = header;
			break;

		case "Third":
			Actual = SeleniumDriver.GetElementText(cashISA_ThirtyDaysNoticeCashISAActions.ImageCopyHeader3());
			Expected = header;
			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + headerNum);

		}
		assertEquals(Actual, Expected); 
	}

	@Then("I should see the Cash ISA FAQs header {string}  on Thirty Days Notice Cash ISA page")
	public void i_should_see_the_cash_isa_fa_qs_header_on_thirty_days_notice_cash_isa_page(String header) {
	    
		String Actual = SeleniumDriver.GetElementText(cashISA_ThirtyDaysNoticeCashISAActions.CashISAFAQHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(cashISA_ThirtyDaysNoticeCashISAActions.CashISAFAQHeader());
		assertEquals(Actual, Expected);
	    
	}

	@Then("I should see the Cash ISA FAQs Accordians on the Thirty Days Notice Cash ISA section")
	public void i_should_see_the_cash_isa_fa_qs_accordians_on_the_thirty_days_notice_cash_isa_section() {
	    
		boolean Actual = SeleniumDriver.isElementPresent(cashISA_ThirtyDaysNoticeCashISAActions.CashISAFAQccordian());
		boolean Expected = true;
		SeleniumDriver.moveToElement(cashISA_ThirtyDaysNoticeCashISAActions.CashISAFAQccordian());
		assertEquals(Actual, Expected);
	    
	}

	@Then("I should see the {string} as the header for the Personal Savings Terms and Conditions card on the Thirty Days Notice Cash ISA page")
	public void i_should_see_the_as_the_header_for_the_personal_savings_terms_and_conditions_card_on_the_thirty_days_notice_cash_isa_page(String header) {
	    
		String Actual = SeleniumDriver.GetElementText(cashISA_ThirtyDaysNoticeCashISAActions.PersonalSavingsCardHeader());
		String Expected = header;
		SeleniumDriver.moveToElement(cashISA_ThirtyDaysNoticeCashISAActions.PersonalSavingsCardHeader());
		assertEquals(Actual, Expected);
	    
	}

	@Then("I should see the White CTA banner on the Thirty Days Notice Cash ISA page")
	public void i_should_see_the_white_cta_banner_on_the_thirty_days_notice_cash_isa_page() {
	    
		boolean Actual = SeleniumDriver.isElementPresent(cashISA_ThirtyDaysNoticeCashISAActions.WhiteCTABanner());
		boolean Expected = true;
		SeleniumDriver.moveToElement(cashISA_ThirtyDaysNoticeCashISAActions.WhiteCTABanner());
		assertEquals(Actual, Expected);
	}

	@Then("I should be able to click on White CTA banner on Thirty Days Notice Cash ISA page and rediredcted to the corresponding page")
	public void i_should_be_able_to_click_on_white_cta_banner_on_thirty_days_notice_cash_isa_page_and_rediredcted_to_the_corresponding_page() {
	    
		String Actual= SeleniumDriver.getPageTitle(cashISA_ThirtyDaysNoticeCashISAActions.WhiteCTABanner());
	    String Expected= "Login | Aldermore";
	    assertEquals(Actual, Expected);
	}
}
