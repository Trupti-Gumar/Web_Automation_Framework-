package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.*;
import utils.SeleniumDriver;

public class CashISA_ThreeYearFixedRateCashISAActions {

	CashISA_ThreeYearFixedRateCashISALocators cashISA_ThreeYearFixedRateCashISALocators = null;

	public CashISA_ThreeYearFixedRateCashISAActions() {

		this.cashISA_ThreeYearFixedRateCashISALocators = new CashISA_ThreeYearFixedRateCashISALocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), cashISA_ThreeYearFixedRateCashISALocators);

	}

	public WebElement ThreeYearFixedRateISAHeader() {

		return cashISA_ThreeYearFixedRateCashISALocators.ThreeYearFixedRateISAHeader;
	}

	// Product Card

	public WebElement InterestRateValue() {

		return cashISA_ThreeYearFixedRateCashISALocators.InterestRateValue;
	}

	public WebElement GrossMonthlyInterestValue() {

		return cashISA_ThreeYearFixedRateCashISALocators.GrossMonthlyInterestValue;
	}

	public WebElement GrossAnnualInterestValue() {

		return cashISA_ThreeYearFixedRateCashISALocators.GrossAnnualInterestValue;
	}

	public String getOpeningBalanceValue() {
		String string = cashISA_ThreeYearFixedRateCashISALocators.OpeningBalanceValue.getText();
		String resultString = string.replace("£", "");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public WebElement TermValue() {

		return cashISA_ThreeYearFixedRateCashISALocators.TermValue;
	}

	public WebElement applyNowBtn() {

		return cashISA_ThreeYearFixedRateCashISALocators.applyNowBtn;
	}
	// Product Summary

	public WebElement ProductSummaryFAQHeader() {
		return cashISA_ThreeYearFixedRateCashISALocators.ProductSummaryFAQHeader;
	}

	public WebElement ProductSummaryAccordian() {
		return cashISA_ThreeYearFixedRateCashISALocators.ProductSummaryAccordian;
	}

	public WebElement ProductSummaryAccordianTextBox() {
		return cashISA_ThreeYearFixedRateCashISALocators.ProductSummaryAccordianTextBox;
	}

	// CTA Banner

	public WebElement YellowCTABanner() {
		return cashISA_ThreeYearFixedRateCashISALocators.YellowCTABanner;
	}

	public WebElement WhiteCTABanner() {
		return cashISA_ThreeYearFixedRateCashISALocators.WhiteCTABanner;
	}

	// Cash ISA FAQs

	public WebElement CashISAFAQHeader() {
		return cashISA_ThreeYearFixedRateCashISALocators.CashISAFAQHeader;
	}

	public WebElement CashISAFAQccordian() {
		return cashISA_ThreeYearFixedRateCashISALocators.CashISAFAQccordian;
	}

	public WebElement CashISAFAQAccordianTextBlock() {
		return cashISA_ThreeYearFixedRateCashISALocators.CashISAFAQAccordianTextBlock;
	}

	public WebElement MoreCardHeader() {
		return cashISA_ThreeYearFixedRateCashISALocators.MoreCardHeader;
	}

	public WebElement MoreCardHelpSupportLink() {
		return cashISA_ThreeYearFixedRateCashISALocators.MoreCardHelpSupportLink;
	}

	// Cards-Summary box

	public WebElement SummaryBoxCardHeader() {
		return cashISA_ThreeYearFixedRateCashISALocators.SummaryBoxCardHeader;
	}

	public WebElement SummaryBoxCardDownloadLink() {
		return cashISA_ThreeYearFixedRateCashISALocators.SummaryBoxCardDownloadLink;
	}

	// Cards-Personal Savings

	public WebElement PersonalSavingsCardHeader() {
		return cashISA_ThreeYearFixedRateCashISALocators.PersonalSavingsCardHeader;
	}

	public WebElement PersonalSavingsCardDownloadLink() {
		return cashISA_ThreeYearFixedRateCashISALocators.PersonalSavingsCardDownloadLink;
	}

	// Image Copy Section

	public WebElement ImageCopyHeader1() {
		return cashISA_ThreeYearFixedRateCashISALocators.ImageCopyHeader1;
	}

	public WebElement ImageCopyHeader2() {
		return cashISA_ThreeYearFixedRateCashISALocators.ImageCopyHeader2;
	}

	public WebElement ImageCopyHeader3() {
		return cashISA_ThreeYearFixedRateCashISALocators.ImageCopyHeader3;
	}

	// Login link - blackbox

	public WebElement loginLinkBlackbox() {
		return cashISA_ThreeYearFixedRateCashISALocators.loginLinkBlackbox;
	}
}
