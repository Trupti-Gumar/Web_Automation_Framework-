package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvoiceFinance_FactoringLocators {

	@FindBy(xpath="//a[normalize-space()='Factoring']")
	public WebElement FactoringCard;

	// Masthead Header

	@FindBy(xpath = "//h1[normalize-space()='Factoring']")
	public WebElement MastheadHeader;

	// Quick links

	@FindBy(xpath = "//span[normalize-space()='At a glance']")
	public WebElement AtAglanceLink;

	@FindBy(xpath = "//span[normalize-space()='How does it work?']")
	public WebElement HowdoesitworkLink;

	@FindBy(xpath = "//span[normalize-space()='Who can we help?']")
	public WebElement WhocanwehelpLink;

	@FindBy(xpath = "//span[normalize-space()='Bad debt protection']")
	public WebElement BaddebtprotectionLink;

	@FindBy(xpath = "//span[normalize-space()='FAQs']")
	public WebElement FAQsLink;

	@FindBy(xpath = "//span[normalize-space()='Documents']")
	public WebElement DocumentsLink;

	@FindBy(xpath = "//span[normalize-space()='Case study']")
	public WebElement CaseStudyLink;

	// Product Card

	@FindBy(xpath = "//h2[normalize-space()='Factoring at a glance']")
	public WebElement ProductCardHeader;

	// Image copy Section

	@FindBy(xpath="//h2[normalize-space()='At a glance']")
	public WebElement ImageCopyHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Bad debt protection']")
	public WebElement ImageCopyHeader2;

	@FindBy(xpath = "//h2[normalize-space()='Helping businesses like yours']")
	public WebElement ImageCopyHeader3;

	@FindBy(xpath="//a[contains(text(),'Find out how Aldermore supported Prolog Fulfilment')]")
	public WebElement ImageCopyHeader3Link;

	// Process Block

	@FindBy(xpath = "//h2[normalize-space()='How does Factoring work?']")
	public WebElement ProcessBlockHeader;

	@FindBy(xpath = "//h4[normalize-space()='Agree an advance']")
	public WebElement ProcessBlockStep1;

	@FindBy(xpath = "//h4[normalize-space()='Release initial funds']")
	public WebElement ProcessBlockStep2;

	@FindBy(xpath = "//h4[normalize-space()='Chase the payment on your behalf']")
	public WebElement ProcessBlockStep3;

	@FindBy(xpath = "//h4[normalize-space()='Release remaining funds']")
	public WebElement ProcessBlockStep4;

	@FindBy(xpath = "//h4[normalize-space()='Recalculate funds available']")
	public WebElement ProcessBlockStep5;

	// Factoring FAQ

	@FindBy(xpath = "//h2[normalize-space()='Factoring FAQs']")
	public WebElement FAQHeader;

	@FindBy(xpath = "//h3[normalize-space()='Who is Factoring for?']")
	public WebElement Accordian;

	@FindBy(xpath = "//p[contains(text(),'We can help businesses across a wide range of sect')]")
	public WebElement AccordianTextBlock;

	@FindBy(xpath = "//h2[@class='card-more-faq__title']")
	public WebElement MoreCardHeader;

	@FindBy(xpath = "//a[normalize-space()='View Invoice Finance FAQs']")
	public WebElement MoreCardLink;

	// Document cards

	@FindBy(xpath = "//h2[normalize-space()='Factoring Product Sheet']")
	public WebElement FactoringProductSheetCard;

	@FindBy(xpath = "//a[normalize-space()='Download document']")
	public WebElement FactoringProductSheetDownloadLink;

	// CTA Banner

	@FindBy(xpath="//a[normalize-space()='Get in touch with our team']")
	public WebElement YellowCTABanner;
	
	//Cards
	
	@FindBy(xpath="//a[contains(text(),'Invoice finance')]")
	public WebElement invoiceFinanceCard;
	
	@FindBy(xpath="//a[normalize-space()='Invoice Finance FAQs']")
	public WebElement invoiceFinanceFAQCard;
	
	@FindBy(xpath="//a[contains(text(),'Customer stories')]")
	public WebElement customerStoriesCard;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
