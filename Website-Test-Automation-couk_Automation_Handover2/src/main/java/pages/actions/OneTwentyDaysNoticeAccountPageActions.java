package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.OneTwentyDaysNoticeAccountPageLocators;
import utils.SeleniumDriver;

public class OneTwentyDaysNoticeAccountPageActions {

	OneTwentyDaysNoticeAccountPageLocators oneTwentyDaysNoticeAccountPageLocators = null;
	
	public OneTwentyDaysNoticeAccountPageActions() {
		
		this.oneTwentyDaysNoticeAccountPageLocators = new OneTwentyDaysNoticeAccountPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), oneTwentyDaysNoticeAccountPageLocators);
	}
	
	public WebElement OneTwentyDaysNoticeAccountHeader() {
		return oneTwentyDaysNoticeAccountPageLocators.OneTwentyDaysNoticeAccountHeader;
	}
	
	public WebElement applyNowBtn() {
		return oneTwentyDaysNoticeAccountPageLocators.applyNowBtn;
	}
	
	// Product Card Values

		public WebElement InterestRateValue() {
			return oneTwentyDaysNoticeAccountPageLocators.InterestRateValue;
		}

		public WebElement GrossMonthlyInterestValue() {
			return oneTwentyDaysNoticeAccountPageLocators.GrossMonthlyInterestValue;
		}

		public WebElement GrossAnnualInterestValue() {
			return oneTwentyDaysNoticeAccountPageLocators.GrossAnnualInterestValue;
		}

		public String getOpeningBalanceValue() {
			String string = oneTwentyDaysNoticeAccountPageLocators.OpeningBalanceValue.getText();
			String resultString = string.replace("£", "");
			String[] splitString = string.replace("£", "").split("-");
			//String resString = splitString[0] + "-" + splitString[1];
			return resultString;
		}

		public WebElement TermValue() {
			return oneTwentyDaysNoticeAccountPageLocators.TermValue;
		}

		// FAQ-Product Summary

		public WebElement ProductSummaryFAQHeader() {
			return oneTwentyDaysNoticeAccountPageLocators.ProductSummaryFAQHeader;
		}

		public WebElement ProductSummaryAccordian() {
			return oneTwentyDaysNoticeAccountPageLocators.ProductSummaryAccordian;
		}

		public WebElement ProductSummaryAccordianTextBox() {
			return oneTwentyDaysNoticeAccountPageLocators.ProductSummaryAccordianTextBox;
		}

		public WebElement YellowCTABanner() {
			return oneTwentyDaysNoticeAccountPageLocators.YellowCTABanner;
		}

		public WebElement WhiteCTABanner() {
			return oneTwentyDaysNoticeAccountPageLocators.WhiteCTABanner;
		}

		// Image Copy Section

		public WebElement ImageCopyHeader1() {
			return oneTwentyDaysNoticeAccountPageLocators.ImageCopyHeader1;
		}

		public WebElement ImageCopyHeader2() {
			return oneTwentyDaysNoticeAccountPageLocators.ImageCopyHeader2;
		}

		// Notice Access Account FAQ

		public WebElement NoticeAccountFAQHeader() {
			return oneTwentyDaysNoticeAccountPageLocators.NoticeAccountFAQHeader;
		}

		public WebElement NoticeAccountFAQccordian() {
			return oneTwentyDaysNoticeAccountPageLocators.NoticeAccountFAQccordian;
		}

		public WebElement NoticeAccountFAQAccordianTextBlock() {
			return oneTwentyDaysNoticeAccountPageLocators.NoticeAccountFAQAccordianTextBlock;
		}

		public WebElement MoreCardHeader() {
			return oneTwentyDaysNoticeAccountPageLocators.MoreCardHeader;
		}

		public WebElement MoreCardHelpSupportLink() {
			return oneTwentyDaysNoticeAccountPageLocators.MoreCardHelpSupportLink;
		}

		// Cards-Summary box

		public WebElement SummaryBoxCardHeader() {
			return oneTwentyDaysNoticeAccountPageLocators.SummaryBoxCardHeader;
		}

		public WebElement SummaryBoxCardDownloadLink() {
			return oneTwentyDaysNoticeAccountPageLocators.SummaryBoxCardDownloadLink;
		}

		// Cards-Personal Savings

		public WebElement PersonalSavingsCardHeader() {
			return oneTwentyDaysNoticeAccountPageLocators.PersonalSavingsCardHeader;
		}

		public WebElement PersonalSavingsCardDownloadLink() {
			return oneTwentyDaysNoticeAccountPageLocators.PersonalSavingsCardDownloadLink;
		}

		// Cards-FSCS

		public WebElement FSCSCardHeader() {
			return oneTwentyDaysNoticeAccountPageLocators.FSCSCardHeader;
		}

		public WebElement FSCSCardDownloadLink() {
			return oneTwentyDaysNoticeAccountPageLocators.FSCSCardDownloadLink;
		}
		
		
		
		
		

}
