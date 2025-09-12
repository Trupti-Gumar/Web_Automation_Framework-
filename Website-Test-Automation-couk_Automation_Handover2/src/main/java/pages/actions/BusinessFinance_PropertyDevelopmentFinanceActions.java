package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BusinessFinance_PropertyDevelopmentFinanceLocators;
import utils.SeleniumDriver;

public class BusinessFinance_PropertyDevelopmentFinanceActions {

	BusinessFinance_PropertyDevelopmentFinanceLocators BF_PropertyDevelopmentFinanceLocators = null;
	
	public BusinessFinance_PropertyDevelopmentFinanceActions() {
		
		this.BF_PropertyDevelopmentFinanceLocators = new BusinessFinance_PropertyDevelopmentFinanceLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), BF_PropertyDevelopmentFinanceLocators);
		
	}
	
	public WebElement PropertyDevelopmentFinanceLink() {
		
		return BF_PropertyDevelopmentFinanceLocators.PropertyDevelopmentFinanceLink;
	}
	
    public WebElement MastheadHeader() {
		
		return BF_PropertyDevelopmentFinanceLocators.MastheadHeader;
	}
    
    public WebElement MastheadBlackboxHeader() {
		
		return BF_PropertyDevelopmentFinanceLocators.MastheadBlackboxHeader;
	}
	
    public WebElement propertyDevelopmentFinanceFAQLink() {
		
		return BF_PropertyDevelopmentFinanceLocators.propertyDevelopmentFinanceFAQLink;
	}
	
	
    public String getImageCopyHeader(String header) {

		switch (header) {

		case "Commercial Real Estate specialists":
			return BF_PropertyDevelopmentFinanceLocators.ImageCopySectionHeader1.getText();

		case "VAT loans for house builders and contractors":
			return BF_PropertyDevelopmentFinanceLocators.ImageCopySectionHeader2.getText();
			
		case "Development finance to suit you":
			return BF_PropertyDevelopmentFinanceLocators.ImageCopySectionHeader3.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
    public String getUSPHeader(String header) {

		switch (header) {

		case "Loans from":
			return BF_PropertyDevelopmentFinanceLocators.USPHeader1.getText();

		case "Maximum of 65% GDV":
			return BF_PropertyDevelopmentFinanceLocators.USPHeader2.getText();
			
		case "Quick turnaround":
			return BF_PropertyDevelopmentFinanceLocators.USPHeader3.getText();

		case "Flexible terms":
			return BF_PropertyDevelopmentFinanceLocators.USPHeader4.getText();
			
		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	
    }
    
    public String getCardHeader(String header) {

		switch (header) {

		case "Commercial Mortgages":
			return BF_PropertyDevelopmentFinanceLocators.CommercialMortgagesCardHeader.getText();

		case "Buy to Let Mortgages":
			return BF_PropertyDevelopmentFinanceLocators.BuytoLetMortgagesCardHeader.getText();
			
		case "Business Finance":
			return BF_PropertyDevelopmentFinanceLocators.BusinessFinanceCardHeader.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}  
	
	
    public String getCardLinkPageTitle(String header) {

		switch (header) {

		case "Commercial Mortgages":
			return SeleniumDriver.getPageTitle(BF_PropertyDevelopmentFinanceLocators.CommercialMortgagesCardLink);

		case "Buy to Let Mortgages":
			return SeleniumDriver.getPageTitle(BF_PropertyDevelopmentFinanceLocators.BuytoLetMortgagesCardLink);
			
		case "Business Finance":
			return SeleniumDriver.getPageTitle(BF_PropertyDevelopmentFinanceLocators.BusinessFinanceCardLink);

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
