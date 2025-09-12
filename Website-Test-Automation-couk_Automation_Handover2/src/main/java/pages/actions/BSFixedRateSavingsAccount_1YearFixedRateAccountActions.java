package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BSFixedRateSavingsAccount_1YearFixedRateAccountLocators;
import utils.SeleniumDriver;

public class BSFixedRateSavingsAccount_1YearFixedRateAccountActions {

	BSFixedRateSavingsAccount_1YearFixedRateAccountLocators bsFixedRateSavingsAccount_1YearFixedRateAccountLocators = null;

	public BSFixedRateSavingsAccount_1YearFixedRateAccountActions() {

		this.bsFixedRateSavingsAccount_1YearFixedRateAccountLocators = new BSFixedRateSavingsAccount_1YearFixedRateAccountLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), bsFixedRateSavingsAccount_1YearFixedRateAccountLocators);
	}

	public WebElement MastheadHeader() {
		return bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.MastheadHeader;
	}

	public WebElement OneYearViewAccLink() {
		return bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.OneYearViewAccLink;
	}

	// FAQ-Product Summary

	public WebElement ProductSummaryFAQHeader() {
		return bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.ProductSummaryFAQHeader;
	}

	public WebElement ProductSummaryAccordian() {
		return bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.ProductSummaryAccordian;
	}

	public WebElement ProductSummaryAccordianTextBox() {
		return bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.ProductSummaryAccordianTextBox;
	}

	// Image Copy Section

	public WebElement ImageCopyHeader1() {
		return bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.ImageCopyHeader1;
	}

	public WebElement ImageCopyHeader2() {
		return bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.ImageCopyHeader2;
	}
	
	

	public WebElement FixedRateAccountFAQHeader() {
		return bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.FixedRateAccountFAQHeader;
	}

	public WebElement FixedRateAccountFAQAccordian() {
		return bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.FixedRateAccountFAQAccordian;
	}

	public WebElement FixedRateAccountFAQAccordianTextBlock() {
		return bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.FixedRateAccountFAQAccordianTextBlock;
	}

	public WebElement MoreCardHeader() {
		return bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.MoreCardHeader;
	}

	public WebElement MoreCardHelpSupportLink() {
		return bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.MoreCardHelpSupportLink;
	}

	// CTA Banner

	public WebElement YellowCTABanner() {
		return bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.YellowCTABanner;
	}

	public WebElement WhiteCTABanner() {
		return bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.WhiteCTABanner;
	}

	// OneYearFixedRateAccountCard

	public WebElement TermValue() {
		return bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.TermValue;
	}

	public String getOneYearFixedRateSavingsAccountValues(String content) {

		switch (content) {

		case "Interest rate(*AER)":

			return bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.InterestRateValue.getText();

		case "Minimum opening balance":

			String string = bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.OpeningBalanceValue.getText();
			String resultString = string.replace("£", "");
			String[] splitString = string.replace("£", "").split("-");
			//String resString = splitString[0] + "-" + splitString[1];
			return resultString;

		case "Term":

			return bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.TermValue.getText();

		case "Gross monthly interest":

			return bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.GrossMonthlyInterestValue.getText();

		case "Gross annual interest":

			return bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.GrossAnnualInterestValue.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + content);

		}
	}
	
	public String getImageCopyHeader(String headernum) {

		switch (headernum) {

		case "First":
			return bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.ImageCopyHeader1.getText();

		case "Second":
			return bsFixedRateSavingsAccount_1YearFixedRateAccountLocators.ImageCopyHeader2.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + headernum);

		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
