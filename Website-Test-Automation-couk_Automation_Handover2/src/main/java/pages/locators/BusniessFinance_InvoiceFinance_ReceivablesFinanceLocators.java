package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusniessFinance_InvoiceFinance_ReceivablesFinanceLocators {

	@FindBy(xpath = "//a[normalize-space()='Receivables Finance']")
	public WebElement ReceivablesFinanceCardLink;

	@FindBy(xpath = "//h1[normalize-space()='Receivables Finance']")
	public WebElement MastheadHeader;

	// Quick links

	@FindBy(xpath = "//span[normalize-space()='What is Receivables Finance?']")
	public WebElement QuickLink1;

	@FindBy(xpath = "//span[normalize-space()='Who can we help?']")
	public WebElement QuickLink3;

	@FindBy(xpath = "//span[normalize-space()='Documents']")
	public WebElement QuickLink5;
	
	@FindBy(xpath="//span[normalize-space()='How does it work?']")
	public WebElement QuickLink2;
	// Image Copy Section

	@FindBy(xpath="//h2[normalize-space()='At a glance']")
	public WebElement ImageCopyHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Who can we help?']")
	public WebElement ImageCopyHeader2;

	// Process Block

	@FindBy(xpath = "//h2[normalize-space()='How Receivables Finance works']")
	public WebElement ProcessBlockHeader;

	@FindBy(xpath = "//h4[normalize-space()='Send your contracts to us']")
	public WebElement ProcessBlockStep1;

	@FindBy(xpath = "//h4[normalize-space()='Outstanding amounts released']")
	public WebElement ProcessBlockStep2;

	@FindBy(xpath = "//h4[normalize-space()='Your customer pays us directly']")
	public WebElement ProcessBlockStep3;

	// USP

	@FindBy(xpath = "//h2[normalize-space()='Flexible and transparent']")
	public WebElement USPSubHeader1;

	@FindBy(xpath = "//h2[normalize-space()='An expert team']")
	public WebElement USPSubHeader2;

	@FindBy(xpath = "//h2[normalize-space()='A personal service']")
	public WebElement USPSubHeader3;

	// Document

	@FindBy(xpath = "//h2[normalize-space()='Receivables Finance Product Sheet']")
	public WebElement ReceivablesFinanceProductSheet;

	// Yellow CTA Banner

	@FindBy(xpath="//a[normalize-space()='Get in touch with our team']")
	public WebElement YellowCTABanner;

}
