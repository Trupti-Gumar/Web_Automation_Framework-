package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BusinessFinance_InvoiceFinance_InvoiceDiscountingLocators;
import utils.SeleniumDriver;

public class BusinessFinance_InvoiceFinance_InvoiceDiscountingActions {

	BusinessFinance_InvoiceFinance_InvoiceDiscountingLocators businessFinance_InvoiceFinance_InvoiceDiscountingLocators = null;

	public BusinessFinance_InvoiceFinance_InvoiceDiscountingActions() {

		this.businessFinance_InvoiceFinance_InvoiceDiscountingLocators = new BusinessFinance_InvoiceFinance_InvoiceDiscountingLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), businessFinance_InvoiceFinance_InvoiceDiscountingLocators);
	}

	public WebElement invoiceDiscountingCardLink() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.invoiceDiscountingCardLink;
	}

	public WebElement invoiceDiscountingHeader() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.invoiceDiscountingHeader;
	}

	// Quick links

	public String verifyQuickLinks(String header) {

		switch (header) {

		case "At a glance":

			return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.AtAglanceLink.getText();

		case "Who is it for?":

			return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.WhoIsItForLink.getText();

		case "How does it work?":

			return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.HowdoesitworkLink.getText();

		case "Who can we help?":

			return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.WhocanwehelpLink.getText();

		case "Bad debt protection":

			return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.BaddebtprotectionLink.getText();

		case "FAQs":

			return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.FAQsLink.getText();

		case "Documents":

			return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.DocumentsLink.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	public WebElement AtAglanceLink() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.AtAglanceLink;
	}

	public WebElement WhoIsItForLink() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.WhoIsItForLink;
	}

	public WebElement HowdoesitworkLink() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.HowdoesitworkLink;
	}

	public WebElement WhocanwehelpLink() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.WhocanwehelpLink;
	}

	public WebElement BaddebtprotectionLink() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.BaddebtprotectionLink;
	}

	public WebElement FAQsLink() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.FAQsLink;
	}

	public WebElement DocumentsLink() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.DocumentsLink;
	}

	// Product Card

	public WebElement ProductCardHeader() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.ProductCardHeader;
	}

	public WebElement InvoiceFinanceFAQLink() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.InvoiceFinanceFAQLink;
	}

	// Image Copy Section

	public void moveToImgcopySection(String title) {

		switch (title) {

		case "Who is Invoice Discounting for?":

			businessFinance_InvoiceFinance_InvoiceDiscountingLocators.ImageCopyHeader1.click();

			break;
		case "Who can we help?":

			businessFinance_InvoiceFinance_InvoiceDiscountingLocators.ImageCopyHeader2.click();
			break;
		case "Bad debt protection":

			businessFinance_InvoiceFinance_InvoiceDiscountingLocators.ImageCopyHeader3.click();

			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + title);

		}
	}

	public String getImageCopyHeaders(String header) {

		switch (header) {

		case "At a glance":

			return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.ImageCopyHeader1.getText();

		case "Who can we help?":

			return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.ImageCopyHeader2.getText();

		case "Bad debt protection":

			return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.ImageCopyHeader3.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}

	}

	// Process block

	public WebElement ProcessBlockHeader() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.ProcessBlockHeader;
	}

	public WebElement ProcessBlockStep1() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.ProcessBlockStep1;
	}

	public WebElement ProcessBlockStep2() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.ProcessBlockStep2;
	}

	public WebElement ProcessBlockStep3() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.ProcessBlockStep3;
	}

	public WebElement ProcessBlockStep4() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.ProcessBlockStep4;
	}

	// Invoice Discounting FAQs

	public WebElement InvoiceDiscountingFAQsHeader() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.InvoiceDiscountingFAQsHeader;
	}

	public WebElement InvoiceDiscountingFAQsAccordian() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.InvoiceDiscountingFAQsAccordian;
	}

	public WebElement InvoiceDiscountingFAQsTextBlock() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.InvoiceDiscountingFAQsTextBlock;
	}

	public WebElement MoreCardTitle() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.MoreCardTitle;
	}

	public WebElement MoreCardlink() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.MoreCardlink;
	}

	// Yellow Banner

	public WebElement YellowBanner() {

		return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.YellowBanner;
	}

	// Documents

	public String getDocumentCardsHeader(String header) {

		switch (header) {

		case "Invoice Discounting Product Sheet":
			
			

			return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.InvoiceDiscountingProductSheet.getText();

		case "Bad Debt Protection Product Sheet":

			return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.BadDebtProtectionProductSheet.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}

	}

	// Process block steps

	public String getProcessBlockStepHeaders(String header) {

		switch (header) {

		case "Agree an advance":

			return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.ProcessBlockStep1.getText();

		case "Release initial funds":

			return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.ProcessBlockStep2.getText();

		case "Release remaining funds":

			return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.ProcessBlockStep3.getText();

		case "Recalculate funds available":

			return businessFinance_InvoiceFinance_InvoiceDiscountingLocators.ProcessBlockStep4.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

}
