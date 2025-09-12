package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.FiveYearFixedRateSavingsProductCardLocators;
import utils.SeleniumDriver;

public class FiveYearFixedRateSavingsProductCardActions {

	FiveYearFixedRateSavingsProductCardLocators fiveYearFixedRateSavingsProductCardLocators = null;

	public FiveYearFixedRateSavingsProductCardActions() {

		this.fiveYearFixedRateSavingsProductCardLocators = new FiveYearFixedRateSavingsProductCardLocators();

		PageFactory.initElements(SeleniumDriver.getDriver(), fiveYearFixedRateSavingsProductCardLocators);
	}

	// Masthead_Medium

	public WebElement FiveYearFixedRateHeader() {
		return fiveYearFixedRateSavingsProductCardLocators.FiveYearFixedRateHeader;
	}

	public WebElement InterestRateValue() {
		return fiveYearFixedRateSavingsProductCardLocators.InterestRateValue;
	}

	public WebElement GrossMonthlyInterestValue() {
		return fiveYearFixedRateSavingsProductCardLocators.GrossMonthlyInterestValue;
	}

	public WebElement GrossAnnualInterestValue() {
		return fiveYearFixedRateSavingsProductCardLocators.GrossAnnualInterestValue;
	}

	public String getOpeningBalanceValue() {
		String string = fiveYearFixedRateSavingsProductCardLocators.OpeningBalanceValue.getText();
		String resultStroing = string.replace("£", "");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultStroing;
	}

	public WebElement TermValue() {
		return fiveYearFixedRateSavingsProductCardLocators.TermValue;
	}

	// FAQ-Product Summary

	public WebElement ProductSummaryFAQHeader() {
		return fiveYearFixedRateSavingsProductCardLocators.ProductSummaryFAQHeader;
	}

	public WebElement ProductSummaryAccordian() {
		return fiveYearFixedRateSavingsProductCardLocators.ProductSummaryAccordian;
	}

	public WebElement ProductSummaryAccordianTextBox() {
		return fiveYearFixedRateSavingsProductCardLocators.ProductSummaryAccordianTextBox;
	}

	// Image Copy Section

	public WebElement ImageCopyHeader1() {
		return fiveYearFixedRateSavingsProductCardLocators.ImageCopyHeader1;
	}

	public WebElement ImageCopyHeader2() {
		return fiveYearFixedRateSavingsProductCardLocators.ImageCopyHeader2;
	}

	// Fixed_rate_business_savings_accounts_FAQs

	public WebElement FixedRateAccountFAQHeader() {
		return fiveYearFixedRateSavingsProductCardLocators.FixedRateAccountFAQHeader;
	}

	public WebElement FixedRateAccountFAQAccordian() {
		return fiveYearFixedRateSavingsProductCardLocators.FixedRateAccountFAQAccordian;
	}

	public WebElement FixedRateAccountFAQAccordianTextBlock() {
		return fiveYearFixedRateSavingsProductCardLocators.FixedRateAccountFAQAccordianTextBlock;
	}

	public WebElement MoreCardHeader() {
		return fiveYearFixedRateSavingsProductCardLocators.MoreCardHeader;
	}

	public WebElement MoreCardHelpSupportLink() {
		return fiveYearFixedRateSavingsProductCardLocators.MoreCardHelpSupportLink;
	}

	// CTA Banner

	public WebElement YellowCTABanner() {
		return fiveYearFixedRateSavingsProductCardLocators.YellowCTABanner;
	}

	public WebElement WhiteCTABanner() {
		return fiveYearFixedRateSavingsProductCardLocators.WhiteCTABanner;
	}

	// Cards-Summary box

	public WebElement SummaryBoxCardHeader() {
		return fiveYearFixedRateSavingsProductCardLocators.SummaryBoxCardHeader;
	}

	public WebElement SummaryBoxCardDownloadLink() {
		return fiveYearFixedRateSavingsProductCardLocators.SummaryBoxCardDownloadLink;
	}

	// Cards-Personal Savings

	public WebElement PersonalSavingsCardHeader() {
		return fiveYearFixedRateSavingsProductCardLocators.PersonalSavingsCardHeader;
	}

	public WebElement PersonalSavingsCardDownloadLink() {
		return fiveYearFixedRateSavingsProductCardLocators.PersonalSavingsCardDownloadLink;
	}

	// Cards-FSCS

	public WebElement FSCSCardHeader() {
		return fiveYearFixedRateSavingsProductCardLocators.FSCSCardHeader;
	}

	public WebElement FSCSCardDownloadLink() {
		return fiveYearFixedRateSavingsProductCardLocators.FSCSCardDownloadLink;
	}
}
