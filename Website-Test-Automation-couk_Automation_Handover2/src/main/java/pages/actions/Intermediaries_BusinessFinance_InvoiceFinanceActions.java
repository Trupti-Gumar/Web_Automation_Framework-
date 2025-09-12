package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_BusinessFinance_InvoiceFinanceLocators;
import utils.SeleniumDriver;

public class Intermediaries_BusinessFinance_InvoiceFinanceActions {

	Intermediaries_BusinessFinance_InvoiceFinanceLocators InvoiceFinanceLocators = 
			new Intermediaries_BusinessFinance_InvoiceFinanceLocators();
	
	public Intermediaries_BusinessFinance_InvoiceFinanceActions() {
		
		this.InvoiceFinanceLocators = new Intermediaries_BusinessFinance_InvoiceFinanceLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), InvoiceFinanceLocators);
	}
	
	public WebElement InvoiceFinance_Intermediaries() {
		return InvoiceFinanceLocators.InvoiceFinance;
	}
	
	public WebElement getTitle() {
		return InvoiceFinanceLocators.InvoiceFinanceHeader;
	}
	
	public WebElement getBlackboxheader() {
		return InvoiceFinanceLocators.Blackboxheader;
	}
	
	public String getPageTitle(String header) {
		switch(header) {
		case"Get in touch":
			return SeleniumDriver.getPageTitle(InvoiceFinanceLocators.Option1);
		case"Invoice finance documents":
			return SeleniumDriver.getPageTitle(InvoiceFinanceLocators.Option2); 
		default: 
			throw new IllegalArgumentException("Invalid Value :" + header);
		
		}
			
	}
	
	public String getUSPheader(String header) {
		switch(header) {
		case"Flexible funding":
			return SeleniumDriver.GetElementText(InvoiceFinanceLocators.USPHeader1);
		case"Long-term partners":
			return SeleniumDriver.GetElementText(InvoiceFinanceLocators.USPHeader2);
		case"Same day funds":
			return SeleniumDriver.GetElementText(InvoiceFinanceLocators.USPHeader3);
		case"Online account access":
			return SeleniumDriver.GetElementText(InvoiceFinanceLocators.USPHeader4);
	    default: 
			throw new IllegalArgumentException("Invalid header : " + header);
		}
	}
	
	public String getImageHeader(String header) {
		switch(header) {
		case"Our products":
			return SeleniumDriver.GetElementText(InvoiceFinanceLocators.ImageHeader1);
		case"Who we fund":
			return SeleniumDriver.GetElementText(InvoiceFinanceLocators.ImageHeader2);
		case"What we fund":
			return SeleniumDriver.GetElementText(InvoiceFinanceLocators.ImageHeader3);
		default:
			throw new IllegalArgumentException("Invalid Value :" + header);
		}
	}
	
	public WebElement getCTABannerheader() {
		return InvoiceFinanceLocators.CTABanner;
	}
	 
	public String getCTABannerTitle() {
		return SeleniumDriver.getPageTitle(InvoiceFinanceLocators.CTABanner);
	} 
}
