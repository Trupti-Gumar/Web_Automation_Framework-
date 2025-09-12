package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BusniessFinance_InvoiceFinance_ReceivablesFinanceLocators;
import utils.SeleniumDriver;

public class BusniessFinance_InvoiceFinance_ReceivablesFinanceActions {

	BusniessFinance_InvoiceFinance_ReceivablesFinanceLocators BSInvoiceFinance_ReceivablesFinanceLocators = null;

	public BusniessFinance_InvoiceFinance_ReceivablesFinanceActions() {

		this.BSInvoiceFinance_ReceivablesFinanceLocators = new BusniessFinance_InvoiceFinance_ReceivablesFinanceLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), BSInvoiceFinance_ReceivablesFinanceLocators);

	}

	public WebElement ReceivablesFinanceCardLink() {

		return BSInvoiceFinance_ReceivablesFinanceLocators.ReceivablesFinanceCardLink;
	}

	public WebElement MastheadHeader() {

		return BSInvoiceFinance_ReceivablesFinanceLocators.MastheadHeader;
	}

	// Quick links

	public WebElement QuickLink1() {

		return BSInvoiceFinance_ReceivablesFinanceLocators.QuickLink1;
	}

	public WebElement QuickLink3() {

		return BSInvoiceFinance_ReceivablesFinanceLocators.QuickLink3;
	}

	public WebElement QuickLink5() {

		return BSInvoiceFinance_ReceivablesFinanceLocators.QuickLink5;
	}
	
	public WebElement QuickLink2() {

		return BSInvoiceFinance_ReceivablesFinanceLocators.QuickLink2;
	}
	
	//Image Copy Section

	public void ClickImageCopyHeaders(String header) {

		switch (header) {

		case "What is Receivables Finance?":

			BSInvoiceFinance_ReceivablesFinanceLocators.QuickLink1.click();

			break;

		case "Who can we help?":

			BSInvoiceFinance_ReceivablesFinanceLocators.QuickLink3.click();

			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}

	}

	public String getImageCopyHeaders(String header) {

		switch (header) {

		case "What is Receivables Finance?":

			return BSInvoiceFinance_ReceivablesFinanceLocators.ImageCopyHeader1.getText();

		case "Who can we help?":

			return BSInvoiceFinance_ReceivablesFinanceLocators.ImageCopyHeader2.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}

	}

	// Process Block

	public WebElement ProcessBlockHeader() {

		return BSInvoiceFinance_ReceivablesFinanceLocators.ProcessBlockHeader;
	}

	public String getProcessBlockStepHeaders(String header) {

		switch (header) {

		case "Send your contracts to us":

			return BSInvoiceFinance_ReceivablesFinanceLocators.ProcessBlockStep1.getText();

		case "Outstanding amounts released":

			return BSInvoiceFinance_ReceivablesFinanceLocators.ProcessBlockStep2.getText();

		case "Your customer pays us directly":

			return BSInvoiceFinance_ReceivablesFinanceLocators.ProcessBlockStep3.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	// USP

	public String getUSPSubHeaders(String header) {

		switch (header) {

		case "Flexible and transparent":

			return BSInvoiceFinance_ReceivablesFinanceLocators.USPSubHeader1.getText();

		case "An expert team":

			return BSInvoiceFinance_ReceivablesFinanceLocators.USPSubHeader2.getText();

		case "A personal service":

			return BSInvoiceFinance_ReceivablesFinanceLocators.USPSubHeader3.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}

	}

	// Document

	public WebElement ReceivablesFinanceProductSheet() {

		return BSInvoiceFinance_ReceivablesFinanceLocators.ReceivablesFinanceProductSheet;
	}

	// Yellow CTA Banner

	public WebElement YellowCTABanner() {

		return BSInvoiceFinance_ReceivablesFinanceLocators.YellowCTABanner;
	}
	
	public WebElement ImageCopyHeader1() {

		return BSInvoiceFinance_ReceivablesFinanceLocators.ImageCopyHeader1;
	}

}
