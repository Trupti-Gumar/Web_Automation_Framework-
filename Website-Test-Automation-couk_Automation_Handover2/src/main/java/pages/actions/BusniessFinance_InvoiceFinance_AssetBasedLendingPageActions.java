package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BusniessFinance_InvoiceFinance_AssetBasedLendingPageLocators;
import utils.SeleniumDriver;

public class BusniessFinance_InvoiceFinance_AssetBasedLendingPageActions {

	BusniessFinance_InvoiceFinance_AssetBasedLendingPageLocators BSInvoiceFinance_AssetBasedLendingPageLocators = null;

	public BusniessFinance_InvoiceFinance_AssetBasedLendingPageActions() {

		this.BSInvoiceFinance_AssetBasedLendingPageLocators = new BusniessFinance_InvoiceFinance_AssetBasedLendingPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), BSInvoiceFinance_AssetBasedLendingPageLocators);
	}

	public WebElement AssetBasedLendingCardLink() {

		return BSInvoiceFinance_AssetBasedLendingPageLocators.AssetBasedLendingCardLink;
	}

	public WebElement AssetBasedLendingHeader() {

		return BSInvoiceFinance_AssetBasedLendingPageLocators.AssetBasedLendingHeader;
	}

	public WebElement VideoBlockheader() {

		return BSInvoiceFinance_AssetBasedLendingPageLocators.VideoBlockheader;
	}

	public WebElement QuickLink2() {

		return BSInvoiceFinance_AssetBasedLendingPageLocators.QuickLink2;
	}

	public WebElement QuickLink3() {

		return BSInvoiceFinance_AssetBasedLendingPageLocators.QuickLink3;
	}

	public WebElement QuickLink4() {

		return BSInvoiceFinance_AssetBasedLendingPageLocators.QuickLink4;
	}

	public WebElement QuickLink6() {

		return BSInvoiceFinance_AssetBasedLendingPageLocators.QuickLink6;
	}

	// Process Block

	public WebElement ProcessBlockQuickLink() {

		return BSInvoiceFinance_AssetBasedLendingPageLocators.ProcessBlockQuickLink;
	}

	public WebElement ProcessBlockHeader() {

		return BSInvoiceFinance_AssetBasedLendingPageLocators.ProcessBlockHeader;
	}

	public String getProcessBlockStepHeaders(String header) {

		switch (header) {

		case "Get in touch with us":

			return BSInvoiceFinance_AssetBasedLendingPageLocators.ProcessBlockStep1.getText();

		case "Schedule our visit":

			return BSInvoiceFinance_AssetBasedLendingPageLocators.ProcessBlockStep2.getText();

		case "See your funding structure":

			return BSInvoiceFinance_AssetBasedLendingPageLocators.ProcessBlockStep3.getText();

		case "Receive the funds":

			return BSInvoiceFinance_AssetBasedLendingPageLocators.ProcessBlockStep4.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	// Image Copy Section

	public String getImageCopyHeaders(String header) {

		switch (header) {

		case "At a glance":

			return BSInvoiceFinance_AssetBasedLendingPageLocators.ImageCopyHeader1.getText();

		case "Bad debt protection":

			return BSInvoiceFinance_AssetBasedLendingPageLocators.ImageCopyHeader2.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}

	}

	public void ClickImageCopyHeaders(String header) {

		switch (header) {

		case "Who can we help?":

			BSInvoiceFinance_AssetBasedLendingPageLocators.QuickLink2.click();

			break;

		case "Bad debt protection":

			BSInvoiceFinance_AssetBasedLendingPageLocators.QuickLink3.click();

			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}

	}

	public WebElement ImageCopyHeaderLink1() {

		return BSInvoiceFinance_AssetBasedLendingPageLocators.ImageCopyHeaderLink1;
	}

	// USP

	public String getUSPSubHeaders(String header) {

		switch (header) {

		case "Fast and cost-effective":

			return BSInvoiceFinance_AssetBasedLendingPageLocators.USPSubHeader1.getText();

		case "Tailored and flexible":

			return BSInvoiceFinance_AssetBasedLendingPageLocators.USPSubHeader2.getText();

		case "Dedicated support":

			return BSInvoiceFinance_AssetBasedLendingPageLocators.USPSubHeader3.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}

	}

	// Document

	public WebElement ProductSheetHeader() {

		return BSInvoiceFinance_AssetBasedLendingPageLocators.ProductSheetHeader;
	}

	// Yellow CTA Banner

	public WebElement YellowCTABanner() {

		return BSInvoiceFinance_AssetBasedLendingPageLocators.YellowCTABanner;
	}

}
