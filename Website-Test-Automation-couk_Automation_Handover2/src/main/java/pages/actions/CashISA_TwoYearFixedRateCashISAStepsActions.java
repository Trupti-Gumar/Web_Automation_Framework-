package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.*;
import utils.SeleniumDriver;

public class CashISA_TwoYearFixedRateCashISAStepsActions {

	CashISA_TwoYearFixedRateCashISAStepsLocators cashISA_TwoYearFixedRateCashISAStepsLocators = null;

	public CashISA_TwoYearFixedRateCashISAStepsActions() {

		this.cashISA_TwoYearFixedRateCashISAStepsLocators = new CashISA_TwoYearFixedRateCashISAStepsLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), cashISA_TwoYearFixedRateCashISAStepsLocators);
	}

	public WebElement TwoYearFixedRateISAHeader() {

		return cashISA_TwoYearFixedRateCashISAStepsLocators.TwoYearFixedRateISAHeader;
	}

	// Product Card

	public WebElement InterestRateValue() {

		return cashISA_TwoYearFixedRateCashISAStepsLocators.InterestRateValue;
	}

	public WebElement GrossMonthlyInterestValue() {

		return cashISA_TwoYearFixedRateCashISAStepsLocators.GrossMonthlyInterestValue;
	}

	public WebElement GrossAnnualInterestValue() {

		return cashISA_TwoYearFixedRateCashISAStepsLocators.GrossAnnualInterestValue;
	}

	public String getOpeningBalanceValue() {
		String string = cashISA_TwoYearFixedRateCashISAStepsLocators.OpeningBalanceValue.getText();
		String resultString = string.replace("£", "");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public WebElement TermValue() {

		return cashISA_TwoYearFixedRateCashISAStepsLocators.TermValue;
	}

	// Product Summary

	public WebElement ProductSummaryFAQHeader() {
		return cashISA_TwoYearFixedRateCashISAStepsLocators.ProductSummaryFAQHeader;
	}

	public WebElement ProductSummaryAccordian() {
		return cashISA_TwoYearFixedRateCashISAStepsLocators.ProductSummaryAccordian;
	}

	public WebElement ProductSummaryAccordianTextBox() {
		return cashISA_TwoYearFixedRateCashISAStepsLocators.ProductSummaryAccordianTextBox;
	}

	// CTA Banner

	public WebElement YellowCTABanner() {
		return cashISA_TwoYearFixedRateCashISAStepsLocators.YellowCTABanner;
	}

	public WebElement WhiteCTABanner() {
		return cashISA_TwoYearFixedRateCashISAStepsLocators.WhiteCTABanner;
	}

	// Cash ISA FAQs

	public WebElement CashISAFAQHeader() {
		return cashISA_TwoYearFixedRateCashISAStepsLocators.CashISAFAQHeader;
	}

	public WebElement CashISAFAQccordian() {
		return cashISA_TwoYearFixedRateCashISAStepsLocators.CashISAFAQccordian;
	}

	public WebElement CashISAFAQAccordianTextBlock() {
		return cashISA_TwoYearFixedRateCashISAStepsLocators.CashISAFAQAccordianTextBlock;
	}

	public WebElement MoreCardHeader() {
		return cashISA_TwoYearFixedRateCashISAStepsLocators.MoreCardHeader;
	}

	public WebElement MoreCardHelpSupportLink() {
		return cashISA_TwoYearFixedRateCashISAStepsLocators.MoreCardHelpSupportLink;
	}

	// Cards-Summary box

	public WebElement SummaryBoxCardHeader() {
		return cashISA_TwoYearFixedRateCashISAStepsLocators.SummaryBoxCardHeader;
	}

	public WebElement SummaryBoxCardDownloadLink() {
		return cashISA_TwoYearFixedRateCashISAStepsLocators.SummaryBoxCardDownloadLink;
	}

	// Cards-Personal Savings

	public WebElement PersonalSavingsCardHeader() {
		return cashISA_TwoYearFixedRateCashISAStepsLocators.PersonalSavingsCardHeader;
	}

	public WebElement PersonalSavingsCardDownloadLink() {
		return cashISA_TwoYearFixedRateCashISAStepsLocators.PersonalSavingsCardDownloadLink;
	}

	// Image Copy Section

	public WebElement ImageCopyHeader1() {
		return cashISA_TwoYearFixedRateCashISAStepsLocators.ImageCopyHeader1;
	}

	public WebElement ImageCopyHeader2() {
		return cashISA_TwoYearFixedRateCashISAStepsLocators.ImageCopyHeader2;
	}

	public WebElement ImageCopyHeader3() {
		return cashISA_TwoYearFixedRateCashISAStepsLocators.ImageCopyHeader3;
	}

	// Login link - blackbox

	public WebElement loginLinkBlackbox() {
		return cashISA_TwoYearFixedRateCashISAStepsLocators.loginLinkBlackbox;
	}
	
	public WebElement applyNowBtn() {
		return cashISA_TwoYearFixedRateCashISAStepsLocators.applyNowBtn;
	}
}
