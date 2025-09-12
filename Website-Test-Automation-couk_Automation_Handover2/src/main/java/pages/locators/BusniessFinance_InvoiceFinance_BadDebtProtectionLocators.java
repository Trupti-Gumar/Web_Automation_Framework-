package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusniessFinance_InvoiceFinance_BadDebtProtectionLocators {

	@FindBy(xpath = "//a[normalize-space()='Bad Debt Protection']")
	public WebElement BadDebtProtectionCard;

	@FindBy(xpath="//h1[normalize-space()='Bad Debt Protection']")
	public WebElement MastheadHeader;

	// Quick Link

	@FindBy(xpath = "//span[normalize-space()='How does it work?']")
	public WebElement QuickLink2;

	@FindBy(xpath = "//span[normalize-space()='Who can we help?']")
	public WebElement QuickLink3;

	@FindBy(xpath = "//span[normalize-space()='Documents']")
	public WebElement QuickLink5;

	// Video Block

	@FindBy(xpath = "//h2[normalize-space()='What is Bad Debt Protection?']")
	public WebElement VideoBlockHeader;

	// Image Copy Section

	@FindBy(xpath = "//h2[normalize-space()='How Bad Debt Protection works']")
	public WebElement ImageCopyHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Is Bad Debt Protection right for my business?']")
	public WebElement ImageCopyHeader2;

	// USP

	@FindBy(xpath = "//h2[normalize-space()='Flexible and transparent']")
	public WebElement USPSubHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Day to day support']")
	public WebElement USPSubHeader2;

	@FindBy(xpath = "//h2[normalize-space()='Part of your team']")
	public WebElement USPSubHeader3;

	// Blog Quote

	@FindBy(xpath = "//p[@class='bloq-quote__p-quote']")
	public WebElement BlogQuoteComponent;

	// Document

	@FindBy(xpath = "//h2[normalize-space()='Bad Debt Protection Product Sheet']")
	public WebElement BadDebtProtectionProductSheet;

	// Yellow CTA Banner

	@FindBy(xpath = "//a[@class='ald-cta-banner ald-cta-banner-yellow ald-focus__button']")
	public WebElement YellowCTABanner;

}
