package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.*;
import utils.SeleniumDriver;

public class ThreeYearFixedRateSavingsPageActions {
	
	ThreeYearFixedRateSavingsPageLocators threeYearFixedRateSavingsPageLocators=null;
	
	public ThreeYearFixedRateSavingsPageActions() {
		this.threeYearFixedRateSavingsPageLocators= new ThreeYearFixedRateSavingsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), threeYearFixedRateSavingsPageLocators);
	}
	

	// Masthead_Medium

		public WebElement ThreeYearFixedRateHeader() {
			return threeYearFixedRateSavingsPageLocators.ThreeYearFixedRateHeader;
		}

		public WebElement InterestRateValue() {
			return threeYearFixedRateSavingsPageLocators.InterestRateValue;
		}

		public WebElement GrossMonthlyInterestValue() {
			return threeYearFixedRateSavingsPageLocators.GrossMonthlyInterestValue;
		}

		public WebElement GrossAnnualInterestValue() {
			return threeYearFixedRateSavingsPageLocators.GrossAnnualInterestValue;
		}

		public String getOpeningBalanceValue() {
			String string = threeYearFixedRateSavingsPageLocators.OpeningBalanceValue.getText();
			String resultString = string.replace("£", "");
			String[] splitString = string.replace("£", "").split("-");
			//String resString = splitString[0] + "-" + splitString[1];
			return resultString;
		}

		public WebElement TermValue() {
			return threeYearFixedRateSavingsPageLocators.TermValue;
		}

		// FAQ-Product Summary

		public WebElement ProductSummaryFAQHeader() {
			return threeYearFixedRateSavingsPageLocators.ProductSummaryFAQHeader;
		}

		public WebElement ProductSummaryAccordian() {
			return threeYearFixedRateSavingsPageLocators.ProductSummaryAccordian;
		}

		public WebElement ProductSummaryAccordianTextBox() {
			return threeYearFixedRateSavingsPageLocators.ProductSummaryAccordianTextBox;
		}

		// Image Copy Section

		public WebElement ImageCopyHeader1() {
			return threeYearFixedRateSavingsPageLocators.ImageCopyHeader1;
		}

		public WebElement ImageCopyHeader2() {
			return threeYearFixedRateSavingsPageLocators.ImageCopyHeader2;
		}

		// Fixed_rate_business_savings_accounts_FAQs

		public WebElement FixedRateAccountFAQHeader() {
			return threeYearFixedRateSavingsPageLocators.FixedRateAccountFAQHeader;
		}

		public WebElement FixedRateAccountFAQAccordian() {
			return threeYearFixedRateSavingsPageLocators.FixedRateAccountFAQAccordian;
		}

		public WebElement FixedRateAccountFAQAccordianTextBlock() {
			return threeYearFixedRateSavingsPageLocators.FixedRateAccountFAQAccordianTextBlock;
		}

		public WebElement MoreCardHeader() {
			return threeYearFixedRateSavingsPageLocators.MoreCardHeader;
		}

		public WebElement MoreCardHelpSupportLink() {
			return threeYearFixedRateSavingsPageLocators.MoreCardHelpSupportLink;
		}

		// CTA Banner

		public WebElement YellowCTABanner() {
			return threeYearFixedRateSavingsPageLocators.YellowCTABanner;
		}

		public WebElement WhiteCTABanner() {
			return threeYearFixedRateSavingsPageLocators.WhiteCTABanner;
		}

		// Cards-Summary box

		public WebElement SummaryBoxCardHeader() {
			return threeYearFixedRateSavingsPageLocators.SummaryBoxCardHeader;
		}

		public WebElement SummaryBoxCardDownloadLink() {
			return threeYearFixedRateSavingsPageLocators.SummaryBoxCardDownloadLink;
		}

		// Cards-Personal Savings

		public WebElement PersonalSavingsCardHeader() {
			return threeYearFixedRateSavingsPageLocators.PersonalSavingsCardHeader;
		}

		public WebElement PersonalSavingsCardDownloadLink() {
			return threeYearFixedRateSavingsPageLocators.PersonalSavingsCardDownloadLink;
		}

		// Cards-FSCS

		public WebElement FSCSCardHeader() {
			return threeYearFixedRateSavingsPageLocators.FSCSCardHeader;
		}

		public WebElement FSCSCardDownloadLink() {
			return threeYearFixedRateSavingsPageLocators.FSCSCardDownloadLink;
		}
}
