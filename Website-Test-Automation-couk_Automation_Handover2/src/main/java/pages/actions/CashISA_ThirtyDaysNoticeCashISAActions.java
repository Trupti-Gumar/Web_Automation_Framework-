package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import pages.locators.*;
import utils.SeleniumDriver;

public class CashISA_ThirtyDaysNoticeCashISAActions {

	CashISA_ThirtyDaysNoticeCashISALocators cashISA_ThirtyDaysNoticeCashISALocators = null;

	public CashISA_ThirtyDaysNoticeCashISAActions() {

		this.cashISA_ThirtyDaysNoticeCashISALocators = new CashISA_ThirtyDaysNoticeCashISALocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), cashISA_ThirtyDaysNoticeCashISALocators);
	}

	public WebElement ThirtyDaysNoticeCashISA() {

		return cashISA_ThirtyDaysNoticeCashISALocators.ThirtyDaysNoticeCashISAHeader;
	}

	// Product Card

	public WebElement InterestRateValue() {

		return cashISA_ThirtyDaysNoticeCashISALocators.InterestRateValue;
	}

	public WebElement GrossMonthlyInterestValue() {

		return cashISA_ThirtyDaysNoticeCashISALocators.GrossMonthlyInterestValue;
	}

	public WebElement GrossAnnualInterestValue() {

		return cashISA_ThirtyDaysNoticeCashISALocators.GrossAnnualInterestValue;
	}

	public String getOpeningBalanceValue() {
		String string = cashISA_ThirtyDaysNoticeCashISALocators.OpeningBalanceValue.getText();
		String resultString = string.replace("£", "");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public WebElement TermValue() {

		return cashISA_ThirtyDaysNoticeCashISALocators.TermValue;
	}

	// Product Summary

	public WebElement ProductSummaryFAQHeader() {
		return cashISA_ThirtyDaysNoticeCashISALocators.ProductSummaryFAQHeader;
	}

	public WebElement ProductSummaryAccordian() {
		return cashISA_ThirtyDaysNoticeCashISALocators.ProductSummaryAccordian;
	}

	public WebElement ProductSummaryAccordianTextBox() {
		return cashISA_ThirtyDaysNoticeCashISALocators.ProductSummaryAccordianTextBox;
	}

	// CTA Banner

	public WebElement YellowCTABanner() {
		return cashISA_ThirtyDaysNoticeCashISALocators.YellowCTABanner;
	}

	public WebElement WhiteCTABanner() {
		return cashISA_ThirtyDaysNoticeCashISALocators.WhiteCTABanner;
	}

	// Cash ISA FAQs

	public WebElement CashISAFAQHeader() {
		return cashISA_ThirtyDaysNoticeCashISALocators.CashISAFAQHeader;
	}

	public WebElement CashISAFAQccordian() {
		return cashISA_ThirtyDaysNoticeCashISALocators.CashISAFAQccordian;
	}

	public WebElement CashISAFAQAccordianTextBlock() {
		return cashISA_ThirtyDaysNoticeCashISALocators.CashISAFAQAccordianTextBlock;
	}

	public WebElement MoreCardHeader() {
		return cashISA_ThirtyDaysNoticeCashISALocators.MoreCardHeader;
	}

	public WebElement MoreCardHelpSupportLink() {
		return cashISA_ThirtyDaysNoticeCashISALocators.MoreCardHelpSupportLink;
	}

	

	// Cards-Personal Savings

	public WebElement PersonalSavingsCardHeader() {
		return cashISA_ThirtyDaysNoticeCashISALocators.PersonalSavingsCardHeader;
	}

	public WebElement PersonalSavingsCardDownloadLink() {
		return cashISA_ThirtyDaysNoticeCashISALocators.PersonalSavingsCardDownloadLink;
	}

	// Image Copy Section

	public WebElement ImageCopyHeader1() {
		return cashISA_ThirtyDaysNoticeCashISALocators.ImageCopyHeader1;
	}

	public WebElement ImageCopyHeader2() {
		return cashISA_ThirtyDaysNoticeCashISALocators.ImageCopyHeader2;
	}

	public WebElement ImageCopyHeader3() {
		return cashISA_ThirtyDaysNoticeCashISALocators.ImageCopyHeader3;
	}

	// Login link - blackbox

	public WebElement loginLinkBlackbox() {
		return cashISA_ThirtyDaysNoticeCashISALocators.loginLinkBlackbox;
	}
}
