package pages.actions;

import java.awt.print.Pageable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.*;
import utils.SeleniumDriver;

public class OneYearFixedRateSavingsPageActions {

	OneYearFixedRateSavingsPageLocators oneYearFixedRateSavingsPageLocators = null;

	public OneYearFixedRateSavingsPageActions() {
		this.oneYearFixedRateSavingsPageLocators = new OneYearFixedRateSavingsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), oneYearFixedRateSavingsPageLocators);
	}

	public String getOneYearFixedRateHeader() {
		return oneYearFixedRateSavingsPageLocators.OneYearFixedRateHeader.getText();
	}
	
	//Masthead Black box
	
	public String getMastheadBlackBoxHeader() {
		return oneYearFixedRateSavingsPageLocators.MastheadBlackBoxHeader.getText();
	}
	
	public String getMastheadBlackBoxSecondaryTitle() {
		return oneYearFixedRateSavingsPageLocators.MastheadBlackBoxSecondaryTitle.getText();
	}
	
	//FAQ-Product Summary
	
	public WebElement ProductSummaryFAQHeader() {
		return oneYearFixedRateSavingsPageLocators.ProductSummaryFAQHeader;
	}
	
	public WebElement ProductSummaryAccordian() {
		return oneYearFixedRateSavingsPageLocators.ProductSummaryAccordian;
	}
	
	public WebElement ProductSummaryAccordianTextBox() {
		return oneYearFixedRateSavingsPageLocators.ProductSummaryAccordianTextBox;
	}
	
	//Image Copy Section
	
	public WebElement ImageCopyHeader1() {
		return oneYearFixedRateSavingsPageLocators.ImageCopyHeader1;
	}
	
	public WebElement ImageCopyHeader2() {
		return oneYearFixedRateSavingsPageLocators.ImageCopyHeader2;
	}
	
	//Fixed_rate_business_savings_accounts_FAQs
	
	public WebElement FixedRateAccountFAQHeader() {
		return oneYearFixedRateSavingsPageLocators.FixedRateAccountFAQHeader;
	}
	
	public WebElement FixedRateAccountFAQAccordian() {
		return oneYearFixedRateSavingsPageLocators.FixedRateAccountFAQAccordian;
	}
	
	public WebElement FixedRateAccountFAQAccordianTextBlock() {
		return oneYearFixedRateSavingsPageLocators.FixedRateAccountFAQAccordianTextBlock;
	}
	
	
	public WebElement MoreCardHeader() {
		return oneYearFixedRateSavingsPageLocators.MoreCardHeader;
	}
	
	public WebElement MoreCardHelpSupportLink() {
		return oneYearFixedRateSavingsPageLocators.MoreCardHelpSupportLink;
	}
	
	//CTA Banner
	
	public WebElement YellowCTABanner() {
		return oneYearFixedRateSavingsPageLocators.YellowCTABanner;
	}
	
	public WebElement WhiteCTABanner() {
		return oneYearFixedRateSavingsPageLocators.WhiteCTABanner;
	}
	
	//Cards-Summary box
	
	public WebElement SummaryBoxCardHeader() {
		return oneYearFixedRateSavingsPageLocators.SummaryBoxCardHeader;
	}
	
	
	public WebElement SummaryBoxCardDownloadLink() {
		return oneYearFixedRateSavingsPageLocators.SummaryBoxCardDownloadLink;
	}
	
	//Cards-Personal Savings
	
	public WebElement PersonalSavingsCardHeader() {
		return oneYearFixedRateSavingsPageLocators.PersonalSavingsCardHeader;
	}
	
	
	public WebElement PersonalSavingsCardDownloadLink() {
		return oneYearFixedRateSavingsPageLocators.PersonalSavingsCardDownloadLink;
	}
	
	//Cards-FSCS
	
	public WebElement FSCSCardHeader() {
		return oneYearFixedRateSavingsPageLocators.FSCSCardHeader;
	}
	
	public WebElement FSCSCardDownloadLink() {
		return oneYearFixedRateSavingsPageLocators.FSCSCardDownloadLink;
	}
	
	//OneYearFixedRateAccountCard
	
	public WebElement InterestRateValue() {
		return oneYearFixedRateSavingsPageLocators.InterestRateValue;
	}
	
	public WebElement GrossMonthlyInterestValue() {
		return oneYearFixedRateSavingsPageLocators.GrossMonthlyInterestValue;
	}
	
	public WebElement GrossAnnualInterestValue() {
		return oneYearFixedRateSavingsPageLocators.GrossAnnualInterestValue;
	}
	
	public String getOpeningBalanceValue() {
		String string = oneYearFixedRateSavingsPageLocators.OpeningBalanceValue.getText();
		String resultString= string.replace("£", "");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}
	
	public WebElement TermValue() {
		return oneYearFixedRateSavingsPageLocators.TermValue;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
