package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BusinessSavingsAccount_FixedRateSavingsAccountLocators;
import utils.SeleniumDriver;

public class BusinessSavingsAccount_FixedRateSavingsAccountActions {

	BusinessSavingsAccount_FixedRateSavingsAccountLocators BSFixedRateSavingsAccountLocators = null;

	public BusinessSavingsAccount_FixedRateSavingsAccountActions() {

		this.BSFixedRateSavingsAccountLocators = new BusinessSavingsAccount_FixedRateSavingsAccountLocators();

		PageFactory.initElements(SeleniumDriver.getDriver(), BSFixedRateSavingsAccountLocators);
	}

	public WebElement SavingsLink() {
		return BSFixedRateSavingsAccountLocators.SavingsLink;
	}

	public WebElement FixedRateSavingsAccountLink() {
		return BSFixedRateSavingsAccountLocators.FixedRateSavingsAccountLink;
	}

	// Masthead

	public WebElement FixedRateSavingsHeader() {
		return BSFixedRateSavingsAccountLocators.FixedRateSavingsHeader;
	}

	// Image Copy Section

	public String getImageCopyHeader(String header) {

		switch (header) {

		case "Benefits of a fixed rate account":
			return BSFixedRateSavingsAccountLocators.ImageCopyHeader1.getText();

		case "Celebrating small businesses":
			return BSFixedRateSavingsAccountLocators.ImageCopyHeader2.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	// Fixed Rate FAQ

	public WebElement FAQHeader() {
		return BSFixedRateSavingsAccountLocators.FAQHeader;
	}

	public WebElement Accordian() {
		return BSFixedRateSavingsAccountLocators.Accordian;
	}

	public WebElement AccordianBlock() {
		return BSFixedRateSavingsAccountLocators.AccordianBlock;
	}

	// More Card

	public WebElement MoreCardOnFAQ() {
		return BSFixedRateSavingsAccountLocators.MoreCardOnFAQ;
	}

	public WebElement MoreCardOnFAQLink() {
		return BSFixedRateSavingsAccountLocators.MoreCardOnFAQLink;
	}

	// 1 year fixed rate savings account

	public WebElement OneYearProductCardHeader() {
		return BSFixedRateSavingsAccountLocators.OneYearProductCardHeader;
	}
	
	public WebElement OneYearTerm() {
		return BSFixedRateSavingsAccountLocators.OneYearTerm;
	}
	
	public WebElement OneYearViewAccLink() {
		return BSFixedRateSavingsAccountLocators.OneYearViewAccLink;
	}

	public String getOneYearProductCardValues(String content) {

		switch (content) {

		case "Interest rate(*AER)":
			return BSFixedRateSavingsAccountLocators.OneYearInterestRateValue.getText();

		case "Minimum opening balance":

			String string = BSFixedRateSavingsAccountLocators.OneYearOpeningBalance.getText();
			String resultString = string.replace("£", "");
			String[] splitString = string.replace("£", "").split("-");
			//String resString = splitString[0] + "-" + splitString[1];
			return resultString;

		case "Term":
			return BSFixedRateSavingsAccountLocators.OneYearTerm.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + content);

		}

	}
	
	// 6 month fixed rate savings account
	
	public WebElement SixMonthProductCardHeader() {
		return BSFixedRateSavingsAccountLocators.SixMonthProductCardHeader;
	}
	
	public WebElement SixMonthTerm() {
		return BSFixedRateSavingsAccountLocators.SixMonthTerm;
	}
	
	public WebElement SixMonthViewAccLink() {
		return BSFixedRateSavingsAccountLocators.SixMonthViewAccLink;
	}
	
	public String getSixMonthProductCardValues(String content) {

		switch (content) {

		case "Interest rate(*AER)":
			return BSFixedRateSavingsAccountLocators.SixMonthInterestRateValue.getText();

		case "Minimum opening balance":

			String string = BSFixedRateSavingsAccountLocators.SixMonthOpeningBalance.getText();
			String resultString = string.replace("£", "");
			String[] splitString = string.replace("£", "").split("-");
			//String resString = splitString[0] + "-" + splitString[1];
			return resultString;

		case "Term":
			return BSFixedRateSavingsAccountLocators.SixMonthTerm.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + content);

		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
