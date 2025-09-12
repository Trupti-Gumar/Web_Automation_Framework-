package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.InvoiceFinance_FactoringLocators;
import utils.SeleniumDriver;

public class InvoiceFinance_FactoringActions {

	InvoiceFinance_FactoringLocators invoiceFinance_FactoringLocators = null;

	public InvoiceFinance_FactoringActions() {

		this.invoiceFinance_FactoringLocators = new InvoiceFinance_FactoringLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), invoiceFinance_FactoringLocators);
	}

	public WebElement FactoringCard() {

		return invoiceFinance_FactoringLocators.FactoringCard;
	}

	public WebElement MastheadHeader() {

		return invoiceFinance_FactoringLocators.MastheadHeader;
	}

	// Quick links

	public String verifyQuickLinks(String header) {

		switch (header) {

		case "At a glance":

			return invoiceFinance_FactoringLocators.AtAglanceLink.getText();

		case "How does it work?":

			return invoiceFinance_FactoringLocators.HowdoesitworkLink.getText();

		case "Who can we help?":

			return invoiceFinance_FactoringLocators.WhocanwehelpLink.getText();

		case "Bad debt protection":

			return invoiceFinance_FactoringLocators.BaddebtprotectionLink.getText();

		case "FAQs":

			return invoiceFinance_FactoringLocators.FAQsLink.getText();

		case "Documents":

			return invoiceFinance_FactoringLocators.DocumentsLink.getText();

		case "Case study":

			return invoiceFinance_FactoringLocators.CaseStudyLink.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	public WebElement AtAglanceLink() {

		return invoiceFinance_FactoringLocators.AtAglanceLink;
	}

	public WebElement CaseStudyLink() {

		return invoiceFinance_FactoringLocators.CaseStudyLink;
	}

	public WebElement HowdoesitworkLink() {

		return invoiceFinance_FactoringLocators.HowdoesitworkLink;
	}

	public WebElement WhocanwehelpLink() {

		return invoiceFinance_FactoringLocators.WhocanwehelpLink;
	}

	public WebElement BaddebtprotectionLink() {

		return invoiceFinance_FactoringLocators.BaddebtprotectionLink;
	}

	public WebElement FAQsLink() {

		return invoiceFinance_FactoringLocators.FAQsLink;
	}

	public WebElement DocumentsLink() {

		return invoiceFinance_FactoringLocators.DocumentsLink;
	}

	// Product Card

	public WebElement ProductCardHeader() {

		return invoiceFinance_FactoringLocators.ProductCardHeader;
	}

	// Image Copy Section

	public void moveToImgcopySection(String title) {

		switch (title) {

		case "First":

			invoiceFinance_FactoringLocators.ImageCopyHeader1.click();
			break;
		case "Second":

			invoiceFinance_FactoringLocators.ImageCopyHeader2.click();

			break;

		case "Third":

			invoiceFinance_FactoringLocators.ImageCopyHeader3.click();
			break;

		default:
			throw new IllegalArgumentException("Invalid value: " + title);

		}
	}

	public String getImageCopyHeaders(String header) {

		switch (header) {

		case "First":

			return invoiceFinance_FactoringLocators.ImageCopyHeader1.getText();

		case "Second":

			return invoiceFinance_FactoringLocators.ImageCopyHeader2.getText();

		case "Third":

			return invoiceFinance_FactoringLocators.ImageCopyHeader3.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}

	}

	public WebElement ImageCopyHeader3Link() {

		return invoiceFinance_FactoringLocators.ImageCopyHeader3Link;
	}

	// Process block

	public WebElement ProcessBlockHeader() {

		return invoiceFinance_FactoringLocators.ProcessBlockHeader;
	}

	public WebElement ProcessBlockStep1() {

		return invoiceFinance_FactoringLocators.ProcessBlockStep1;
	}

	public WebElement ProcessBlockStep2() {

		return invoiceFinance_FactoringLocators.ProcessBlockStep2;
	}

	public WebElement ProcessBlockStep3() {

		return invoiceFinance_FactoringLocators.ProcessBlockStep3;
	}

	public WebElement ProcessBlockStep4() {

		return invoiceFinance_FactoringLocators.ProcessBlockStep4;
	}

	public WebElement ProcessBlockStep5() {

		return invoiceFinance_FactoringLocators.ProcessBlockStep5;
	}

	// Invoice Discounting FAQs

	public WebElement FAQHeader() {

		return invoiceFinance_FactoringLocators.FAQHeader;
	}

	public WebElement Accordian() {

		return invoiceFinance_FactoringLocators.Accordian;
	}

	public WebElement AccordianTextBlock() {

		return invoiceFinance_FactoringLocators.AccordianTextBlock;
	}

	public WebElement MoreCardHeader() {

		return invoiceFinance_FactoringLocators.MoreCardHeader;
	}

	public WebElement MoreCardlink() {

		return invoiceFinance_FactoringLocators.MoreCardLink;
	}

	// Yellow Banner

	public WebElement YellowCTABanner() {

		return invoiceFinance_FactoringLocators.YellowCTABanner;
	}

	// Documents

	public WebElement FactoringProductSheetCard() {

		return invoiceFinance_FactoringLocators.FactoringProductSheetCard;
	}

	public WebElement FactoringProductSheetDownloadLink() {

		return invoiceFinance_FactoringLocators.FactoringProductSheetDownloadLink;
	}

	// Process block steps

	public String getProcessBlockStepHeaders(String header) {

		switch (header) {

		case "Agree an advance":

			return invoiceFinance_FactoringLocators.ProcessBlockStep1.getText();

		case "Release initial funds":

			return invoiceFinance_FactoringLocators.ProcessBlockStep2.getText();

		case "Chase the payment on your behalf":

			return invoiceFinance_FactoringLocators.ProcessBlockStep3.getText();

		case "Release remaining funds":

			return invoiceFinance_FactoringLocators.ProcessBlockStep4.getText();

		case "Recalculate funds available":

			return invoiceFinance_FactoringLocators.ProcessBlockStep5.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	// cards

	public WebElement invoiceFinanceCard() {

		return invoiceFinance_FactoringLocators.invoiceFinanceCard;
	}

	public WebElement invoiceFinanceFAQCard() {

		return invoiceFinance_FactoringLocators.invoiceFinanceFAQCard;
	}

	public WebElement customerStoriesCard() {

		return invoiceFinance_FactoringLocators.customerStoriesCard;
	}

}
