package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.OneYearFixedRateCashISALocators;
import utils.SeleniumDriver;

public class OneYearFixedRateCashISAActions {

	OneYearFixedRateCashISALocators oneYearFixedRateCashISALocators = null;

	public OneYearFixedRateCashISAActions() {

		this.oneYearFixedRateCashISALocators = new OneYearFixedRateCashISALocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), oneYearFixedRateCashISALocators);
	}

	public WebElement OneYearFixedRateISAHeader() {

		return oneYearFixedRateCashISALocators.OneYearFixedRateISAHeader;
	}

	// Product Card

	public WebElement InterestRateValue() {

		return oneYearFixedRateCashISALocators.InterestRateValue;
	}

	public WebElement GrossMonthlyInterestValue() {

		return oneYearFixedRateCashISALocators.GrossMonthlyInterestValue;
	}

	public WebElement GrossAnnualInterestValue() {

		return oneYearFixedRateCashISALocators.GrossAnnualInterestValue;
	}

	public String getOpeningBalanceValue() {
		String string = oneYearFixedRateCashISALocators.OpeningBalanceValue.getText();
		String resultString = string.replace("£", "");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public WebElement TermValue() {

		return oneYearFixedRateCashISALocators.TermValue;
	}

	// Product Summary

	public WebElement ProductSummaryFAQHeader() {
		return oneYearFixedRateCashISALocators.ProductSummaryFAQHeader;
	}

	public WebElement ProductSummaryAccordian() {
		return oneYearFixedRateCashISALocators.ProductSummaryAccordian;
	}

	public WebElement ProductSummaryAccordianTextBox() {
		return oneYearFixedRateCashISALocators.ProductSummaryAccordianTextBox;
	}

	// CTA Banner

	public WebElement YellowCTABanner() {
		return oneYearFixedRateCashISALocators.YellowCTABanner;
	}

	public WebElement WhiteCTABanner() {
		return oneYearFixedRateCashISALocators.WhiteCTABanner;
	}

	// Cash ISA FAQs

	public WebElement CashISAFAQHeader() {
		return oneYearFixedRateCashISALocators.CashISAFAQHeader;
	}

	public WebElement CashISAFAQccordian() {
		return oneYearFixedRateCashISALocators.CashISAFAQccordian;
	}

	public WebElement CashISAFAQAccordianTextBlock() {
		return oneYearFixedRateCashISALocators.CashISAFAQAccordianTextBlock;
	}

	public WebElement MoreCardHeader() {
		return oneYearFixedRateCashISALocators.MoreCardHeader;
	}

	public WebElement MoreCardHelpSupportLink() {
		return oneYearFixedRateCashISALocators.MoreCardHelpSupportLink;
	}

	// Cards-Summary box

	public WebElement SummaryBoxCardHeader() {
		return oneYearFixedRateCashISALocators.SummaryBoxCardHeader;
	}

	public WebElement SummaryBoxCardDownloadLink() {
		return oneYearFixedRateCashISALocators.SummaryBoxCardDownloadLink;
	}

	// Cards-Personal Savings

	public WebElement PersonalSavingsCardHeader() {
		return oneYearFixedRateCashISALocators.PersonalSavingsCardHeader;
	}

	public WebElement PersonalSavingsCardDownloadLink() {
		return oneYearFixedRateCashISALocators.PersonalSavingsCardDownloadLink;
	}

	// Image Copy Section

	public WebElement ImageCopyHeader1() {
		return oneYearFixedRateCashISALocators.ImageCopyHeader1;
	}

	public WebElement ImageCopyHeader2() {
		return oneYearFixedRateCashISALocators.ImageCopyHeader2;
	}

	public WebElement ImageCopyHeader3() {
		return oneYearFixedRateCashISALocators.ImageCopyHeader3;
	}

	// Login link - blackbox

	public WebElement loginLinkBlackbox() {
		return oneYearFixedRateCashISALocators.loginLinkBlackbox;
	}
	
	public WebElement applyNow() {
		return oneYearFixedRateCashISALocators.applyNow;
	}

}
