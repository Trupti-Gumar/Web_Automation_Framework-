package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.FourYearFixedRateSavingCardProductPageLocators;
import utils.SeleniumDriver;

public class FourYearFixedRateSavingCardProductPageActions {

	FourYearFixedRateSavingCardProductPageLocators fourYearFixedRateSavingCardProductPageLocators = null;

	public FourYearFixedRateSavingCardProductPageActions() {
		this.fourYearFixedRateSavingCardProductPageLocators = new FourYearFixedRateSavingCardProductPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), fourYearFixedRateSavingCardProductPageLocators);
	}

	// Masthead_Medium

	public WebElement FourYearFixedRateHeader() {
		return fourYearFixedRateSavingCardProductPageLocators.FourYearFixedRateHeader;
	}

	public WebElement InterestRateValue() {
		return fourYearFixedRateSavingCardProductPageLocators.InterestRateValue;
	}

	public WebElement GrossMonthlyInterestValue() {
		return fourYearFixedRateSavingCardProductPageLocators.GrossMonthlyInterestValue;
	}

	public WebElement GrossAnnualInterestValue() {
		return fourYearFixedRateSavingCardProductPageLocators.GrossAnnualInterestValue;
	}

	public String getOpeningBalanceValue() {
		String string = fourYearFixedRateSavingCardProductPageLocators.OpeningBalanceValue.getText();
		String resultString = string.replace("£", "");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public WebElement TermValue() {
		return fourYearFixedRateSavingCardProductPageLocators.TermValue;
	}

	// FAQ-Product Summary

	public WebElement ProductSummaryFAQHeader() {
		return fourYearFixedRateSavingCardProductPageLocators.ProductSummaryFAQHeader;
	}

	public WebElement ProductSummaryAccordian() {
		return fourYearFixedRateSavingCardProductPageLocators.ProductSummaryAccordian;
	}

	public WebElement ProductSummaryAccordianTextBox() {
		return fourYearFixedRateSavingCardProductPageLocators.ProductSummaryAccordianTextBox;
	}

	// Image Copy Section

	public WebElement ImageCopyHeader1() {
		return fourYearFixedRateSavingCardProductPageLocators.ImageCopyHeader1;
	}

	public WebElement ImageCopyHeader2() {
		return fourYearFixedRateSavingCardProductPageLocators.ImageCopyHeader2;
	}

	// Fixed_rate_business_savings_accounts_FAQs

	public WebElement FixedRateAccountFAQHeader() {
		return fourYearFixedRateSavingCardProductPageLocators.FixedRateAccountFAQHeader;
	}

	public WebElement FixedRateAccountFAQAccordian() {
		return fourYearFixedRateSavingCardProductPageLocators.FixedRateAccountFAQAccordian;
	}

	public WebElement FixedRateAccountFAQAccordianTextBlock() {
		return fourYearFixedRateSavingCardProductPageLocators.FixedRateAccountFAQAccordianTextBlock;
	}

	public WebElement MoreCardHeader() {
		return fourYearFixedRateSavingCardProductPageLocators.MoreCardHeader;
	}

	public WebElement MoreCardHelpSupportLink() {
		return fourYearFixedRateSavingCardProductPageLocators.MoreCardHelpSupportLink;
	}

	// CTA Banner

	public WebElement YellowCTABanner() {
		return fourYearFixedRateSavingCardProductPageLocators.YellowCTABanner;
	}

	public WebElement WhiteCTABanner() {
		return fourYearFixedRateSavingCardProductPageLocators.WhiteCTABanner;
	}

	// Cards-Summary box

	public WebElement SummaryBoxCardHeader() {
		return fourYearFixedRateSavingCardProductPageLocators.SummaryBoxCardHeader;
	}

	public WebElement SummaryBoxCardDownloadLink() {
		return fourYearFixedRateSavingCardProductPageLocators.SummaryBoxCardDownloadLink;
	}

	// Cards-Personal Savings

	public WebElement PersonalSavingsCardHeader() {
		return fourYearFixedRateSavingCardProductPageLocators.PersonalSavingsCardHeader;
	}

	public WebElement PersonalSavingsCardDownloadLink() {
		return fourYearFixedRateSavingCardProductPageLocators.PersonalSavingsCardDownloadLink;
	}

	// Cards-FSCS

	public WebElement FSCSCardHeader() {
		return fourYearFixedRateSavingCardProductPageLocators.FSCSCardHeader;
	}

	public WebElement FSCSCardDownloadLink() {
		return fourYearFixedRateSavingCardProductPageLocators.FSCSCardDownloadLink;
	}

}
