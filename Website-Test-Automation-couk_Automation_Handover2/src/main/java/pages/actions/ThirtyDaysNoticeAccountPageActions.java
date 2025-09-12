package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.*;
import utils.SeleniumDriver;

public class ThirtyDaysNoticeAccountPageActions {

	ThirtyDaysNoticeAccountPageLocators thirtyDaysNoticeAccountPageLocators = null;

	public ThirtyDaysNoticeAccountPageActions() {
		this.thirtyDaysNoticeAccountPageLocators = new ThirtyDaysNoticeAccountPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), thirtyDaysNoticeAccountPageLocators);
	}

	public WebElement ThirtyDaynoticPageHeader() {
		return thirtyDaysNoticeAccountPageLocators.ThirtyDaynoticPageHeader;
	}
	
	public WebElement applyNowBtn() {
		return thirtyDaysNoticeAccountPageLocators.applyNowBtn;
	}

	// Product Card Values

	public WebElement InterestRateValue() {
		return thirtyDaysNoticeAccountPageLocators.InterestRateValue;
	}

	public WebElement GrossMonthlyInterestValue() {
		return thirtyDaysNoticeAccountPageLocators.GrossMonthlyInterestValue;
	}

	public WebElement GrossAnnualInterestValue() {
		return thirtyDaysNoticeAccountPageLocators.GrossAnnualInterestValue;
	}

	public String getOpeningBalanceValue() {
		String string = thirtyDaysNoticeAccountPageLocators.OpeningBalanceValue.getText();
		String resultString = string.replace("£", "");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public WebElement TermValue() {
		return thirtyDaysNoticeAccountPageLocators.TermValue;
	}

	// FAQ-Product Summary

	public WebElement ProductSummaryFAQHeader() {
		return thirtyDaysNoticeAccountPageLocators.ProductSummaryFAQHeader;
	}

	public WebElement ProductSummaryAccordian() {
		return thirtyDaysNoticeAccountPageLocators.ProductSummaryAccordian;
	}

	public WebElement ProductSummaryAccordianTextBox() {
		return thirtyDaysNoticeAccountPageLocators.ProductSummaryAccordianTextBox;
	}

	public WebElement YellowCTABanner() {
		return thirtyDaysNoticeAccountPageLocators.YellowCTABanner;
	}

	public WebElement WhiteCTABanner() {
		return thirtyDaysNoticeAccountPageLocators.WhiteCTABanner;
	}

	// Image Copy Section

	public WebElement ImageCopyHeader1() {
		return thirtyDaysNoticeAccountPageLocators.ImageCopyHeader1;
	}

	public WebElement ImageCopyHeader2() {
		return thirtyDaysNoticeAccountPageLocators.ImageCopyHeader2;
	}

	// Notice Access Account FAQ

	public WebElement NoticeAccountFAQHeader() {
		return thirtyDaysNoticeAccountPageLocators.NoticeAccountFAQHeader;
	}

	public WebElement NoticeAccountFAQccordian() {
		return thirtyDaysNoticeAccountPageLocators.NoticeAccountFAQccordian;
	}

	public WebElement NoticeAccountFAQAccordianTextBlock() {
		return thirtyDaysNoticeAccountPageLocators.NoticeAccountFAQAccordianTextBlock;
	}

	public WebElement MoreCardHeader() {
		return thirtyDaysNoticeAccountPageLocators.MoreCardHeader;
	}

	public WebElement MoreCardHelpSupportLink() {
		return thirtyDaysNoticeAccountPageLocators.MoreCardHelpSupportLink;
	}

	// Cards-Summary box

	public WebElement SummaryBoxCardHeader() {
		return thirtyDaysNoticeAccountPageLocators.SummaryBoxCardHeader;
	}

	public WebElement SummaryBoxCardDownloadLink() {
		return thirtyDaysNoticeAccountPageLocators.SummaryBoxCardDownloadLink;
	}

	// Cards-Personal Savings

	public WebElement PersonalSavingsCardHeader() {
		return thirtyDaysNoticeAccountPageLocators.PersonalSavingsCardHeader;
	}

	public WebElement PersonalSavingsCardDownloadLink() {
		return thirtyDaysNoticeAccountPageLocators.PersonalSavingsCardDownloadLink;
	}

	// Cards-FSCS

	public WebElement FSCSCardHeader() {
		return thirtyDaysNoticeAccountPageLocators.FSCSCardHeader;
	}

	public WebElement FSCSCardDownloadLink() {
		return thirtyDaysNoticeAccountPageLocators.FSCSCardDownloadLink;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
