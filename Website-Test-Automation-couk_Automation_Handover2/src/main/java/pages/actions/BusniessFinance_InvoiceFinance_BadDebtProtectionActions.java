package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BusniessFinance_InvoiceFinance_BadDebtProtectionLocators;
import utils.SeleniumDriver;

public class BusniessFinance_InvoiceFinance_BadDebtProtectionActions {

	BusniessFinance_InvoiceFinance_BadDebtProtectionLocators BSInvoiceFinance_BadDebtProtectionLocators = null;

	public BusniessFinance_InvoiceFinance_BadDebtProtectionActions() {

		this.BSInvoiceFinance_BadDebtProtectionLocators = new BusniessFinance_InvoiceFinance_BadDebtProtectionLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), BSInvoiceFinance_BadDebtProtectionLocators);
	}

	public WebElement BadDebtProtectionCard() {

		return BSInvoiceFinance_BadDebtProtectionLocators.BadDebtProtectionCard;
	}

	public WebElement MastheadHeader() {

		return BSInvoiceFinance_BadDebtProtectionLocators.MastheadHeader;
	}

	// Quick Links

	public WebElement QuickLink2() {

		return BSInvoiceFinance_BadDebtProtectionLocators.QuickLink2;
	}

	public WebElement QuickLink3() {

		return BSInvoiceFinance_BadDebtProtectionLocators.QuickLink3;
	}

	public WebElement QuickLink5() {

		return BSInvoiceFinance_BadDebtProtectionLocators.QuickLink5;
	}

	// Video Block

	public WebElement VideoBlockHeader() {

		return BSInvoiceFinance_BadDebtProtectionLocators.VideoBlockHeader;
	}

	// Blog Quote

	public WebElement BlogQuoteComponent() {

		return BSInvoiceFinance_BadDebtProtectionLocators.BlogQuoteComponent;
	}

	// Document

	public WebElement BadDebtProtectionProductSheet() {

		return BSInvoiceFinance_BadDebtProtectionLocators.BadDebtProtectionProductSheet;
	}

	// Yellow CTA Banner

	public WebElement YellowCTABanner() {

		return BSInvoiceFinance_BadDebtProtectionLocators.YellowCTABanner;
	}

	// Image Copy Section

	public void ClickImageCopyHeaders(String header) {

		switch (header) {

		case "How does it work":

			BSInvoiceFinance_BadDebtProtectionLocators.QuickLink2.click();

			break;

		case "Who can we help?":

			BSInvoiceFinance_BadDebtProtectionLocators.QuickLink3.click();

			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}

	}

	public String getImageCopyHeaders(String header) {

		switch (header) {

		case "How Bad Debt Protection works":

			return BSInvoiceFinance_BadDebtProtectionLocators.ImageCopyHeader1.getText();

		case "Is Bad Debt Protection right for my business?":

			return BSInvoiceFinance_BadDebtProtectionLocators.ImageCopyHeader2.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}

	}
	
	
	public String getUSPSubHeaders(String header) {
		
		switch (header) {

		case "Flexible and transparent":

			return BSInvoiceFinance_BadDebtProtectionLocators.USPSubHeader1.getText();

		case "Day to day support":

			return BSInvoiceFinance_BadDebtProtectionLocators.USPSubHeader2.getText();
			
		case "Part of your team":

			return BSInvoiceFinance_BadDebtProtectionLocators.USPSubHeader3.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
