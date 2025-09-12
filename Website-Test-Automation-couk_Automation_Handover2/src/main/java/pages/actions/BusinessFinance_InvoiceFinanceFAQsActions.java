package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BusinessFinance_InvoiceFinanceFAQsLocators;
import utils.SeleniumDriver;

public class BusinessFinance_InvoiceFinanceFAQsActions {

	BusinessFinance_InvoiceFinanceFAQsLocators businessFinance_InvoiceFinanceFAQsLocators = null;
	
	public BusinessFinance_InvoiceFinanceFAQsActions() {
		
		this.businessFinance_InvoiceFinanceFAQsLocators = new BusinessFinance_InvoiceFinanceFAQsLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), businessFinance_InvoiceFinanceFAQsLocators);
	}
	
	public WebElement InvoiceFinanceFAQLink() {

		return businessFinance_InvoiceFinanceFAQsLocators.InvoiceFinanceFAQLink;
	}
	
	public WebElement InvoiceFinanceBackLink() {

		return businessFinance_InvoiceFinanceFAQsLocators.InvoiceFinanceBackLink;
	}
	
	public WebElement InvoiceFinanceFAQHeader() {

		return businessFinance_InvoiceFinanceFAQsLocators.InvoiceFinanceFAQHeader;
	}
	
	public WebElement InvoiceFinanceFAQAccordian() {

		return businessFinance_InvoiceFinanceFAQsLocators.InvoiceFinanceFAQAccordian;
	}
	
	public WebElement InvoiceFinanceFAQTextBlock() {

		return businessFinance_InvoiceFinanceFAQsLocators.InvoiceFinanceFAQTextBlock;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
