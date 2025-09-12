package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.*;
import utils.SeleniumDriver;

public class TwoYearFixedRateSavingsPageActions {

	TwoYearFixedRateSavingsPageLocators twoYearFixedRateSavingsPageLocators = null;

	public TwoYearFixedRateSavingsPageActions() {
		this.twoYearFixedRateSavingsPageLocators = new TwoYearFixedRateSavingsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), twoYearFixedRateSavingsPageLocators);
	}

	// Masthead_Medium

	public WebElement TwoYearFixedRateHeader() {
		return twoYearFixedRateSavingsPageLocators.TwoYearFixedRateHeader;
	}

	public WebElement InterestRateValue() {
		return twoYearFixedRateSavingsPageLocators.InterestRateValue;
	}

	public WebElement GrossMonthlyInterestValue() {
		return twoYearFixedRateSavingsPageLocators.GrossMonthlyInterestValue;
	}

	public WebElement GrossAnnualInterestValue() {
		return twoYearFixedRateSavingsPageLocators.GrossAnnualInterestValue;
	}

	public String getOpeningBalanceValue() {
		String string = twoYearFixedRateSavingsPageLocators.OpeningBalanceValue.getText();
		String resultString = string.replace("£", "");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public WebElement TermValue() {
		return twoYearFixedRateSavingsPageLocators.TermValue;
	}

	// FAQ-Product Summary

	public WebElement ProductSummaryFAQHeader() {
		return twoYearFixedRateSavingsPageLocators.ProductSummaryFAQHeader;
	}

	public WebElement ProductSummaryAccordian() {
		return twoYearFixedRateSavingsPageLocators.ProductSummaryAccordian;
	}

	public WebElement ProductSummaryAccordianTextBox() {
		return twoYearFixedRateSavingsPageLocators.ProductSummaryAccordianTextBox;
	}

	// Image Copy Section

	public WebElement ImageCopyHeader1() {
		return twoYearFixedRateSavingsPageLocators.ImageCopyHeader1;
	}

	public WebElement ImageCopyHeader2() {
		return twoYearFixedRateSavingsPageLocators.ImageCopyHeader2;
	}

	// Fixed_rate_business_savings_accounts_FAQs

	public WebElement FixedRateAccountFAQHeader() {
		return twoYearFixedRateSavingsPageLocators.FixedRateAccountFAQHeader;
	}

	public WebElement FixedRateAccountFAQAccordian() {
		return twoYearFixedRateSavingsPageLocators.FixedRateAccountFAQAccordian;
	}

	public WebElement FixedRateAccountFAQAccordianTextBlock() {
		return twoYearFixedRateSavingsPageLocators.FixedRateAccountFAQAccordianTextBlock;
	}

	public WebElement MoreCardHeader() {
		return twoYearFixedRateSavingsPageLocators.MoreCardHeader;
	}

	public WebElement MoreCardHelpSupportLink() {
		return twoYearFixedRateSavingsPageLocators.MoreCardHelpSupportLink;
	}

	// CTA Banner

	public WebElement YellowCTABanner() {
		return twoYearFixedRateSavingsPageLocators.YellowCTABanner;
	}

	public WebElement WhiteCTABanner() {
		return twoYearFixedRateSavingsPageLocators.WhiteCTABanner;
	}

	// Cards-Summary box

	public WebElement SummaryBoxCardHeader() {
		return twoYearFixedRateSavingsPageLocators.FixedRateSummaryBoxCardHeader;
	}

	public WebElement SummaryBoxCardDownloadLink() {
		return twoYearFixedRateSavingsPageLocators.FixedRateSummaryBoxCardDownloadLink;
	}

	// Cards-Personal Savings

	public WebElement PersonalSavingsCardHeader() {
		return twoYearFixedRateSavingsPageLocators.PersonalSavingsCardHeader;
	}

	public WebElement PersonalSavingsCardDownloadLink() {
		return twoYearFixedRateSavingsPageLocators.PersonalSavingsCardDownloadLink;
	}

	// Cards-FSCS

	public WebElement FSCSCardHeader() {
		return twoYearFixedRateSavingsPageLocators.FSCSCardHeader;
	}

	public WebElement FSCSCardDownloadLink() {
		return twoYearFixedRateSavingsPageLocators.FSCSCardDownloadLink;
	}

}
