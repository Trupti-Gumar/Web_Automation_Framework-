package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import pages.locators.BSFixedRateSavingsAccount_6MonthFixedRateAccountLocators;
import utils.SeleniumDriver;

public class BSFixedRateSavingsAccount_6MonthFixedRateAccountActions {

	BSFixedRateSavingsAccount_6MonthFixedRateAccountLocators bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators = null;

	public BSFixedRateSavingsAccount_6MonthFixedRateAccountActions() {

		this.bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators = new BSFixedRateSavingsAccount_6MonthFixedRateAccountLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators);
	}

	public WebElement MastheadHeader() {
		return bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.MastheadHeader;
	}

	public WebElement SixMonthViewAccLink() {
		return bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.SixMonthViewAccLink;
	}

	// FAQ-Product Summary

	public WebElement ProductSummaryFAQHeader() {
		return bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.ProductSummaryFAQHeader;
	}

	public WebElement ProductSummaryAccordian() {
		return bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.ProductSummaryAccordian;
	}

	public WebElement ProductSummaryAccordianTextBox() {
		return bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.ProductSummaryAccordianTextBox;
	}

	// Image Copy Section

	public WebElement ImageCopyHeader1() {
		return bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.ImageCopyHeader1;
	}

	public WebElement ImageCopyHeader2() {
		return bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.ImageCopyHeader2;
	}
	
	

	public WebElement FixedRateAccountFAQHeader() {
		return bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.FixedRateAccountFAQHeader;
	}

	public WebElement FixedRateAccountFAQAccordian() {
		return bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.FixedRateAccountFAQAccordian;
	}

	public WebElement FixedRateAccountFAQAccordianTextBlock() {
		return bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.FixedRateAccountFAQAccordianTextBlock;
	}

	public WebElement MoreCardHeader() {
		return bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.MoreCardHeader;
	}

	public WebElement MoreCardHelpSupportLink() {
		return bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.MoreCardHelpSupportLink;
	}

	// CTA Banner

	public WebElement YellowCTABanner() {
		return bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.YellowCTABanner;
	}

	public WebElement WhiteCTABanner() {
		return bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.WhiteCTABanner;
	}

	// OneYearFixedRateAccountCard

	public WebElement TermValue() {
		return bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.TermValue;
	}

	public String getSixMonthFixedRateSavingsAccountValues(String content) {

		switch (content) {

		case "Interest rate(*AER)":

			return bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.InterestRateValue.getText();

		case "Minimum opening balance":

			String string = bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.OpeningBalanceValue.getText();
			String resultString = string.replace("£", "");
			String[] splitString = string.replace("£", "").split("-");
			//String resString = splitString[0] + "-" + splitString[1];
			return resultString;

		case "Term":

			return bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.TermValue.getText();

		case "Gross monthly interest":

			return bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.GrossMonthlyInterestValue.getText();

		case "Gross annual interest":

			return bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.GrossAnnualInterestValue.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + content);

		}
	}
	
	public String getImageCopyHeader(String headernum) {

		switch (headernum) {

		case "First":
			return bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.ImageCopyHeader1.getText();

		case "Second":
			return bsFixedRateSavingsAccount_6MonthFixedRateAccountLocators.ImageCopyHeader2.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + headernum);

		}
	}
	
}
