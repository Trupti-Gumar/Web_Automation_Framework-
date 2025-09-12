package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.*;
import utils.SeleniumDriver;

public class DoubleAccessAccountProductCardActions {

	DoubleAccessAccountProductCardLocators doubleAccessAccountProductCardLocators = null;

	public DoubleAccessAccountProductCardActions() {

		this.doubleAccessAccountProductCardLocators = new DoubleAccessAccountProductCardLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), doubleAccessAccountProductCardLocators);
	}

	public WebElement DoubleAccessAccHeader() {
		return doubleAccessAccountProductCardLocators.DoubleAccessAccHeader;
	}
	
	public WebElement doubleAccessApplynow() {
		return doubleAccessAccountProductCardLocators.doubleAccessApplynow;
	}

	// Product Card Values

	public WebElement InterestRateValue1() {
		return doubleAccessAccountProductCardLocators.InterestRateValue1;
	}

	public WebElement InterestRateValue2() {
		return doubleAccessAccountProductCardLocators.InterestRateValue2;
	}

	public WebElement GrossMonthlyInterestValue1() {
		return doubleAccessAccountProductCardLocators.GrossMonthlyInterestValue1;
	}

	public WebElement GrossMonthlyInterestValue2() {
		return doubleAccessAccountProductCardLocators.GrossMonthlyInterestValue2;
	}

	public WebElement GrossAnnualInterestValue1() {
		return doubleAccessAccountProductCardLocators.GrossAnnualInterestValue1;
	}

	public WebElement GrossAnnualInterestValue2() {
		return doubleAccessAccountProductCardLocators.GrossAnnualInterestValue2;
	}

	public String getOpeningBalanceValue() {
		String string = doubleAccessAccountProductCardLocators.OpeningBalanceValue.getText();
		String resultString = string.replace("£", "");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public WebElement TermValue() {
		return doubleAccessAccountProductCardLocators.TermValue;
	}

	// FAQ-Product Summary

	public WebElement ProductSummaryFAQHeader() {
		return doubleAccessAccountProductCardLocators.ProductSummaryFAQHeader;
	}

	public WebElement ProductSummaryAccordian() {
		return doubleAccessAccountProductCardLocators.ProductSummaryAccordian;
	}

	public WebElement ProductSummaryAccordianTextBox() {
		return doubleAccessAccountProductCardLocators.ProductSummaryAccordianTextBox;
	}

	public WebElement YellowCTABanner() {
		return doubleAccessAccountProductCardLocators.YellowCTABanner;
	}

	public WebElement WhiteCTABanner() {
		return doubleAccessAccountProductCardLocators.WhiteCTABanner;
	}

	// Image Copy Section

	public WebElement ImageCopyHeader1() {
		return doubleAccessAccountProductCardLocators.ImageCopyHeader1;
	}

	public WebElement ImageCopyHeader2() {
		return doubleAccessAccountProductCardLocators.ImageCopyHeader2;
	}

	// Double access account FAQs

	public WebElement DoubleAccessAccountFAQHeader() {
		return doubleAccessAccountProductCardLocators.DoubleAccessAccountFAQHeader;
	}

	public WebElement DoubleAccessAccountFAQccordian() {
		return doubleAccessAccountProductCardLocators.DoubleAccessAccountFAQccordian;
	}

	public WebElement DoubleAccessAccountFAQAccordianTextBlock() {
		return doubleAccessAccountProductCardLocators.DoubleAccessAccountFAQAccordianTextBlock;
	}

	public WebElement MoreCardHeader() {
		return doubleAccessAccountProductCardLocators.MoreCardHeader;
	}

	public WebElement MoreCardHelpSupportLink() {
		return doubleAccessAccountProductCardLocators.MoreCardHelpSupportLink;
	}

	// Cards-Summary box

	public WebElement SummaryBoxCardHeader() {
		return doubleAccessAccountProductCardLocators.SummaryBoxCardHeader;
	}

	public WebElement SummaryBoxCardDownloadLink() {
		return doubleAccessAccountProductCardLocators.SummaryBoxCardDownloadLink;
	}

	// Cards-Personal Savings

	public WebElement PersonalSavingsCardHeader() {
		return doubleAccessAccountProductCardLocators.PersonalSavingsCardHeader;
	}

	public WebElement PersonalSavingsCardDownloadLink() {
		return doubleAccessAccountProductCardLocators.PersonalSavingsCardDownloadLink;
	}

	// Cards-FSCS

	public WebElement FSCSCardHeader() {
		return doubleAccessAccountProductCardLocators.FSCSCardHeader;
	}

	public WebElement FSCSCardDownloadLink() {
		return doubleAccessAccountProductCardLocators.FSCSCardDownloadLink;
	}

}
