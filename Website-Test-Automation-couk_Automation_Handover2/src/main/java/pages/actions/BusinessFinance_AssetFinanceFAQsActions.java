package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BusinessFinance_AssetFinanceFAQsLocators;
import utils.SeleniumDriver;

public class BusinessFinance_AssetFinanceFAQsActions {

	BusinessFinance_AssetFinanceFAQsLocators businessFinance_AssetFinanceFAQsLocators = null;

	public BusinessFinance_AssetFinanceFAQsActions() {

		this.businessFinance_AssetFinanceFAQsLocators = new BusinessFinance_AssetFinanceFAQsLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), businessFinance_AssetFinanceFAQsLocators);
	}
	
	public WebElement AssetFinanceFAQLink() {

		return businessFinance_AssetFinanceFAQsLocators.AssetFinanceFAQLink;
	}
	
	public WebElement AssetFinanceBackLink() {

		return businessFinance_AssetFinanceFAQsLocators.AssetFinanceBackLink;
	}
	
	public WebElement AssetFinanceFAQHeader() {

		return businessFinance_AssetFinanceFAQsLocators.AssetFinanceFAQHeader;
	}
	
	public WebElement AssetFinanceFAQAccordian() {

		return businessFinance_AssetFinanceFAQsLocators.AssetFinanceFAQAccordian;
	}
	
	public WebElement AssetFinanceFAQTextBlock() {

		return businessFinance_AssetFinanceFAQsLocators.AssetFinanceFAQTextBlock;
	}
}
