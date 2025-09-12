package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.SavingsAccountLocators;
import utils.SeleniumDriver;

public class SavingsAccountActions {

	SavingsAccountLocators savingsAccountLocators = null;

	public SavingsAccountActions() {

		this.savingsAccountLocators = new SavingsAccountLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), savingsAccountLocators);
	}

	public WebElement SavingsLink() {
		return savingsAccountLocators.SavingsLink;
	}
	
	public WebElement SavingsAccountLink() {
		return savingsAccountLocators.SavingsAccountLink;
	}
	
	public WebElement AcceptCookiesBtn() {
		return savingsAccountLocators.AcceptCookiesBtn;
	}

	// Cards

	public WebElement SavingsAccPageHeader() {
		return savingsAccountLocators.SavingsAccPageHeader;
	}

	public WebElement FSCSLogo() {
		return savingsAccountLocators.FSCSLogo;
	}

	// Cards

	public WebElement EasyAccessAccHeader() {
		return savingsAccountLocators.EasyAccessAccHeader;
	}

	public WebElement EasyAccessAcclink() {
		return savingsAccountLocators.EasyAccessAcclink;
	}

	public WebElement NoticeAccHeader() {
		return savingsAccountLocators.NoticeAccHeader;
	}

	public WebElement NoticeAccLink() {
		return savingsAccountLocators.NoticeAccLink;
	}

	public WebElement FixedrateAccountHeader() {
		return savingsAccountLocators.FixedrateAccountHeader;
	}

	public WebElement FixedrateAccountLink() {
		return savingsAccountLocators.FixedrateAccountLink;
	}

	public WebElement CashISAHeader() {
		return savingsAccountLocators.CashISAHeader;
	}

	public WebElement CashISALink() {
		return savingsAccountLocators.CashISALink;
	}

	public WebElement EasyAccessBusinessSavingsHeader() {
		return savingsAccountLocators.EasyAccessBusinessSavingsHeader;
	}

	public WebElement EasyAccessBusinessSavingsLink() {
		return savingsAccountLocators.EasyAccessBusinessSavingsLink;
	}

	public WebElement FixedrateBusinessSavingsHeader() {
		return savingsAccountLocators.FixedrateBusinessSavingsHeader;
	}

	public WebElement FixedrateBusinessSavingsLink() {
		return savingsAccountLocators.FixedrateBusinessSavingsLink;
	}

	public WebElement CorporateDepositsHeader() {
		return savingsAccountLocators.CorporateDepositsHeader;
	}

	public WebElement CorporateDepositsLink() {
		return savingsAccountLocators.CorporateDepositsLink;
	}

	// Image Copy Section

	public WebElement ImagecopyHeader() {
		return savingsAccountLocators.ImagecopyHeader;
	}

}
