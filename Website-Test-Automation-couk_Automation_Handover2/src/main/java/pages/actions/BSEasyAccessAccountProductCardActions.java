package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BSEasyAccessAccountProductCardLocators;
import utils.SeleniumDriver;

public class BSEasyAccessAccountProductCardActions {

	BSEasyAccessAccountProductCardLocators EasyAccessAccountProductCardLocators = null;

	public BSEasyAccessAccountProductCardActions() {

		this.EasyAccessAccountProductCardLocators = new BSEasyAccessAccountProductCardLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), EasyAccessAccountProductCardLocators);
	}

	public WebElement ViewAccBtn() {

		return EasyAccessAccountProductCardLocators.ViewAccBtn;
	}

	// Masthead_Medium

	public WebElement MastHeadHeader() {

		return EasyAccessAccountProductCardLocators.MastHeadHeader;
	}

//EasyAccessSavingsAccountProductCardvalues

	public WebElement MinimumOpeningBalance() {

		return EasyAccessAccountProductCardLocators.MinimumOpeningBalance;
	}

	public String getEasyAccessSavingsAccountValues(String content) {

		switch (content) {

		case "Interest rate(*AER)":

			return EasyAccessAccountProductCardLocators.InterestRateValue.getText();

		case "Minimum opening balance":

			String string = EasyAccessAccountProductCardLocators.MinimumOpeningBalance.getText();
			String resultString = string.replace("£", "");
			String[] splitString = string.replace("£", "").split("-");
			//String resString = splitString[0] + "-" + splitString[1];
			return resultString;

		case "Gross monthly interest":

			return EasyAccessAccountProductCardLocators.GrossMonthlyInterestRateValue.getText();

		case "Gross annual interest":

			return EasyAccessAccountProductCardLocators.GrossAnnualInterestRateValue.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + content);

		}
	}

	// FAQ-Product Summary

	public WebElement ProductSummaryFAQHeader() {
		return EasyAccessAccountProductCardLocators.ProductSummaryFAQHeader;
	}

	public WebElement ProductSummaryAccordian() {
		return EasyAccessAccountProductCardLocators.ProductSummaryAccordian;
	}

	public WebElement ProductSummaryAccordianTextBox() {
		return EasyAccessAccountProductCardLocators.ProductSummaryAccordianTextBox;
	}

	// CTA Banner

	public WebElement YellowCTABanner() {
		return EasyAccessAccountProductCardLocators.YellowCTABanner;
	}

	public WebElement WhiteCTABanner() {
		return EasyAccessAccountProductCardLocators.WhiteCTABanner;
	}
	
	public String getImageCopyHeader(String headernum) {

		switch (headernum) {

		case "First":
			return EasyAccessAccountProductCardLocators.ImageCopyHeader1.getText();

		case "Second":
			return EasyAccessAccountProductCardLocators.ImageCopyHeader2.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + headernum);

		}
	}
	
	
	
	
	
	
	

}
