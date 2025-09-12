package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BusniessFinance_InvoiceFinanceLocators;
import utils.SeleniumDriver;

public class BusniessFinance_InvoiceFinanceActions {

	BusniessFinance_InvoiceFinanceLocators busniessFinance_InvoiceFinanceLocators = null;

	public BusniessFinance_InvoiceFinanceActions() {

		this.busniessFinance_InvoiceFinanceLocators = new BusniessFinance_InvoiceFinanceLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), busniessFinance_InvoiceFinanceLocators);
	}

	public WebElement BusinessFinanceMenuoptions() {

		return busniessFinance_InvoiceFinanceLocators.BusinessFinanceMenuoptions;
	}

	public WebElement InvoiceFinanceLink() {

		return busniessFinance_InvoiceFinanceLocators.InvoiceFinanceLink;
	}
	
	public WebElement BusinessFinanceDropdown() {

		return busniessFinance_InvoiceFinanceLocators.BusinessFinanceDropdown;
	}

	// Masthead medium

	public WebElement InvoiceFinanceHeader() {

		return busniessFinance_InvoiceFinanceLocators.InvoiceFinanceHeader;
	}

	// Masthead black box

	public WebElement MastheadBlackboxHeader() {

		return busniessFinance_InvoiceFinanceLocators.MastheadBlackboxHeader;
	}

	public WebElement phoneNoOnBlackbox() {

		return busniessFinance_InvoiceFinanceLocators.phoneNoOnBlackbox;
	}

	public WebElement RequestCallBackOnBlackbox() {

		return busniessFinance_InvoiceFinanceLocators.RequestCallBackOnBlackbox;
	}

	public WebElement EmailUsOnBlackbox() {

		return busniessFinance_InvoiceFinanceLocators.EmailUsOnBlackbox;
	}

	// Image copy Section

	public WebElement ImageCopyHeader() {

		return busniessFinance_InvoiceFinanceLocators.ImageCopyHeader;
	}

	public WebElement ImageCopyLink1() {

		return busniessFinance_InvoiceFinanceLocators.ImageCopyLink1;
	}

	public WebElement ImageCopyLink2() {

		return busniessFinance_InvoiceFinanceLocators.ImageCopyLink2;
	}

	// USP Section

	public String verifyUSPSubHeaders(String subHeader) {

		switch (subHeader) {

		case "Flexible and transparent":

			return busniessFinance_InvoiceFinanceLocators.USPSubHeader1.getText();

		case "Dedicated support":

			return busniessFinance_InvoiceFinanceLocators.USPSubHeader2.getText();

		case "Same day payments":

			return busniessFinance_InvoiceFinanceLocators.USPSubHeader3.getText();

		case "Online account management":

			return busniessFinance_InvoiceFinanceLocators.USPSubHeader4.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + subHeader);

		}
	}

	// Video Block

	public WebElement VideoBlockHeader() {

		return busniessFinance_InvoiceFinanceLocators.VideoBlockHeader;
	}
	
	public WebElement ImageCopyHeader2() {

		return busniessFinance_InvoiceFinanceLocators.ImageCopyHeader2;
	}

	public WebElement VideoBlockPlayBtn() {

		return busniessFinance_InvoiceFinanceLocators.VideoBlockPlayBtn;
	}

	// Cards
	
	public WebElement InvoiceDiscountingCardLink() {

		return busniessFinance_InvoiceFinanceLocators.InvoiceDiscountingCardLink;
	}
	
	public WebElement FactoringCardLink() {

		return busniessFinance_InvoiceFinanceLocators.FactoringCardLink;
	}
	
	public WebElement AssetBasedLendingCardLink() {

		return busniessFinance_InvoiceFinanceLocators.AssetBasedLendingCardLink;
	}
	
	public WebElement BadDebtProtectionCardLink() {

		return busniessFinance_InvoiceFinanceLocators.BadDebtProtectionCardLink;
	}
	
	public WebElement RecievableFinanceCardLink() {

		return busniessFinance_InvoiceFinanceLocators.RecievableFinanceCardLink;
	}
	

	public String verifyCardHeaders(String header) {

		switch (header) {

		case "Invoice Discounting":

			return busniessFinance_InvoiceFinanceLocators.InvoiceDiscountingCardHeader.getText();

		case "Factoring":

			return busniessFinance_InvoiceFinanceLocators.FactoringCardHeader.getText();

		case "Asset Based Lending":

			return busniessFinance_InvoiceFinanceLocators.AssetBasedLendingCardHeader.getText();

		case "Bad Debt Protection":

			return busniessFinance_InvoiceFinanceLocators.BadDebtProtectionCardHeader.getText();

		case "Receivables Finance":

			return busniessFinance_InvoiceFinanceLocators.RecievableFinanceCardHeader.getText();
		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	public String verifyCardPages(String pageTitle) {

		switch (pageTitle) {

		case "Invoice Discounting":

			SeleniumDriver.moveToElement(InvoiceDiscountingCardLink());

			return SeleniumDriver.getPageTitle(InvoiceDiscountingCardLink());

		case "Factoring":

			SeleniumDriver.moveToElement(FactoringCardLink());

			return SeleniumDriver.getPageTitle(FactoringCardLink());

		case "Asset Based Lending":

			SeleniumDriver.moveToElement(AssetBasedLendingCardLink());

			return SeleniumDriver.getPageTitle(AssetBasedLendingCardLink());

		case "Bad Debt Protection":

			SeleniumDriver.moveToElement(BadDebtProtectionCardLink());

			return SeleniumDriver.getPageTitle(BadDebtProtectionCardLink());

		case "Receivables Finance":

			SeleniumDriver.moveToElement(RecievableFinanceCardLink());

			return SeleniumDriver.getPageTitle(RecievableFinanceCardLink());

		default:
			throw new IllegalArgumentException("Invalid value: " + pageTitle);

		}
	}

	public WebElement InvoiceDiscountingCardHeader() {

		return busniessFinance_InvoiceFinanceLocators.InvoiceDiscountingCardHeader;
	}

	public WebElement FactoringCardHeader() {

		return busniessFinance_InvoiceFinanceLocators.FactoringCardHeader;
	}

	public WebElement AssetBasedLendingCardHeader() {

		return busniessFinance_InvoiceFinanceLocators.AssetBasedLendingCardHeader;
	}

	public WebElement BadDebtProtectionCardHeader() {

		return busniessFinance_InvoiceFinanceLocators.BadDebtProtectionCardHeader;
	}

	public WebElement RecievableFinanceCardHeader() {

		return busniessFinance_InvoiceFinanceLocators.RecievableFinanceCardHeader;
	}

	// Process Block

	public WebElement ProcessBlockHeader() {

		return busniessFinance_InvoiceFinanceLocators.ProcessBlockHeader;
	}

	public String verifyProcessBlockLinkHeader(String header) {

		switch (header) {

		case "Get in touch with us":

			return busniessFinance_InvoiceFinanceLocators.ProcessBlockStepTitle1.getText();

		case "Submit your invoices to us":

			return busniessFinance_InvoiceFinanceLocators.ProcessBlockStepTitle2.getText();

		case "We advance you the funds":

			return busniessFinance_InvoiceFinanceLocators.ProcessBlockStepTitle3.getText();

		case "Repay us once the invoices are settled":

			return busniessFinance_InvoiceFinanceLocators.ProcessBlockStepTitle4.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	public String verifyProcessBlockLinkPageTitle(String header) {

		switch (header) {

		case "Get in touch with us":

			return SeleniumDriver.getPageTitle(ProcessBlockStepTitle1());

		case "Submit your invoices to us":

			return SeleniumDriver.getPageTitle(ProcessBlockStepTitle2());

		case "We advance you the funds":

			return SeleniumDriver.getPageTitle(ProcessBlockStepTitle3());

		case "Repay us once the invoices are settled":

			return SeleniumDriver.getPageTitle(ProcessBlockStepTitle4());

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}

	}

	public WebElement ProcessBlockStepTitle1() {

		return busniessFinance_InvoiceFinanceLocators.ProcessBlockStepTitle1;
	}

	public WebElement ProcessBlockStepTitle2() {

		return busniessFinance_InvoiceFinanceLocators.ProcessBlockStepTitle2;
	}

	public WebElement ProcessBlockStepTitle3() {

		return busniessFinance_InvoiceFinanceLocators.ProcessBlockStepTitle3;
	}

	public WebElement ProcessBlockStepTitle4() {

		return busniessFinance_InvoiceFinanceLocators.ProcessBlockStepTitle4;
	}

	// Invoice Finance FAQs

	public WebElement InvoiceFinanceFAQHeader() {

		return busniessFinance_InvoiceFinanceLocators.InvoiceFinanceFAQHeader;
	}

	public WebElement InvoiceFinanceFAQAccordian() {

		return busniessFinance_InvoiceFinanceLocators.InvoiceFinanceFAQAccordian;
	}

	public WebElement InvoiceFinanceFAQTextBlock() {

		return busniessFinance_InvoiceFinanceLocators.InvoiceFinanceFAQTextBlock;
	}

	// More Card

	public WebElement MoreCardHeader() {

		return busniessFinance_InvoiceFinanceLocators.MoreCardHeader;
	}

	public WebElement MoreCardLink() {

		return busniessFinance_InvoiceFinanceLocators.MoreCardLink;
	}

	// Image Copy Section links

	public String verifyImageCopySectionLinks(String title) {

		switch (title) {

		case "Find out how Aldermore supported Didsbury Gin with a flexible Invoice Finance facility":

			return SeleniumDriver.getPageTitle(ImageCopyLink1());

		case "More customer stories":

			return SeleniumDriver.getPageTitle(ImageCopyLink2());

		default:
			throw new IllegalArgumentException("Invalid value: " + title);

		}

	}

}
