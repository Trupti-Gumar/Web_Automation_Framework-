package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.PS_EasyAccessAccountSavings_ProductCardLocators;
import utils.SeleniumDriver;

public class PS_EasyAccessAccountSavings_ProductCardActions {

	PS_EasyAccessAccountSavings_ProductCardLocators ps_EasyAccessAccountSavings_ProductCardLocators = null;

	public PS_EasyAccessAccountSavings_ProductCardActions() {

		this.ps_EasyAccessAccountSavings_ProductCardLocators = new PS_EasyAccessAccountSavings_ProductCardLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), ps_EasyAccessAccountSavings_ProductCardLocators);
	}
	
	public WebElement EasyAccessAccountViewButton() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.EasyAccessAccountViewButton;
	}

	// Masthead_Medium

	public WebElement EasyAccessAccountHeader() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.EasyAccessAccountHeader;
	}

	public WebElement InterestRateValue() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.InterestRateValue;
	}

	public WebElement GrossMonthlyInterestValue() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.GrossMonthlyInterestValue;
	}

	public WebElement GrossAnnualInterestValue() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.GrossAnnualInterestValue;
	}

	public String getOpeningBalanceValue() {
		String string = ps_EasyAccessAccountSavings_ProductCardLocators.OpeningBalanceValue.getText();
		String resultString= string.replace("£", "");
		String[] splitString = string.replace("£", "").split("-");
		//String resString = splitString[0] + "-" + splitString[1];
		return resultString;
	}

	public WebElement TermValue() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.TermValue;
	}
	
	public WebElement LoginLink() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.LoginLink;
	}
	
	public WebElement ApplyButton() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.ApplyButton;
	}

	// FAQ-Product Summary

	public WebElement ProductSummaryFAQHeader() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.ProductSummaryFAQHeader;
	}

	public WebElement ProductSummaryAccordian() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.ProductSummaryAccordian;
	}

	public WebElement ProductSummaryAccordianTextBox() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.ProductSummaryAccordianTextBox;
	}

	// Image Copy Section

	public WebElement ImageCopyHeader1() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.ImageCopyHeader1;
	}

	

	// Fixed_rate_business_savings_accounts_FAQs

	public WebElement EasyAccessAccountFAQHeader() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.EasyAccessAccountFAQHeader;
	}

	public WebElement EasyAccessAccountFAQAccordian() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.EasyAccessAccountFAQAccordian;
	}

	public WebElement EasyAccessAccountFAQAccordianTextBlock() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.EasyAccessAccountFAQAccordianTextBlock;
	}

	public WebElement MoreCardHeader() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.MoreCardHeader;
	}

	public WebElement MoreCardHelpSupportLink() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.MoreCardHelpSupportLink;
	}

	// CTA Banner

	public WebElement YellowCTABanner() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.YellowCTABanner;
	}

	public WebElement WhiteCTABanner() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.WhiteCTABanner;
	}

	// Cards-Summary box

	public WebElement SummaryBoxCardHeader() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.SummaryBoxCardHeader;
	}

	public WebElement SummaryBoxCardDownloadLink() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.SummaryBoxCardDownloadLink;
	}

	// Cards-Personal Savings

	public WebElement PersonalSavingsCardHeader() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.PersonalSavingsCardHeader;
	}

	public WebElement PersonalSavingsCardDownloadLink() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.PersonalSavingsCardDownloadLink;
	}

	// Cards-FSCS

	public WebElement FSCSCardHeader() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.FSCSCardHeader;
	}

	public WebElement FSCSCardDownloadLink() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.FSCSCardDownloadLink;
	}
	
	public WebElement EasyAccessAccApplyNow() {
		return ps_EasyAccessAccountSavings_ProductCardLocators.EasyAccessAccApplyNow;
	}
}
