package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessFinance_InvoiceFinance_InvoiceDiscountingLocators {

	@FindBy(xpath="//a[normalize-space()='Invoice Discounting']")
	public WebElement invoiceDiscountingCardLink;
	
	@FindBy(xpath="//h1[normalize-space()='Invoice Discounting']")
	public WebElement invoiceDiscountingHeader;
	
	//Quick links
	
	@FindBy(xpath="//span[normalize-space()='At a glance']")
	public WebElement AtAglanceLink;
	
	@FindBy(xpath="//span[normalize-space()='Who is it for?']")
	public WebElement WhoIsItForLink;
	
	@FindBy(xpath="//span[normalize-space()='How does it work?']")
	public WebElement HowdoesitworkLink;
	
	@FindBy(xpath="//span[normalize-space()='Who can we help?']")
	public WebElement WhocanwehelpLink;
	
	@FindBy(xpath="//span[normalize-space()='Bad debt protection']")
	public WebElement BaddebtprotectionLink;
	
	@FindBy(xpath="//span[normalize-space()='FAQs']")
	public WebElement FAQsLink;
	
	@FindBy(xpath="//span[normalize-space()='Documents']")
	public WebElement DocumentsLink;
	
	//Product Card
	
	@FindBy(xpath="//h2[normalize-space()='Invoice Discounting at a glance']")
	public WebElement ProductCardHeader;
	
	@FindBy(xpath="//a[@title='Invoice finance frequently asked questions']")
	public WebElement InvoiceFinanceFAQLink;
	
	//Image Copy Section
	
	@FindBy(xpath="//h2[normalize-space()='At a glance']")
	public WebElement ImageCopyHeader1;
	
	@FindBy(xpath="//h2[normalize-space()='Who can we help?']")
	public WebElement ImageCopyHeader2;
	
	@FindBy(xpath="//h2[normalize-space()='Bad debt protection']")
	public WebElement ImageCopyHeader3;
	
	@FindBy(xpath="//a[normalize-space()='Find out more']")
	public WebElement FindOutMoreLink;
	
	//Process Block
	
	@FindBy(xpath="//h2[normalize-space()='How does Invoice Discounting work?']")
	public WebElement ProcessBlockHeader;
	
	@FindBy(xpath="//h4[normalize-space()='Agree an advance']")
	public WebElement ProcessBlockStep1;
	
	@FindBy(xpath="//h4[normalize-space()='Release initial funds']")
	public WebElement ProcessBlockStep2;
	
	@FindBy(xpath="//h4[normalize-space()='Release remaining funds']")
	public WebElement ProcessBlockStep3;
	
	@FindBy(xpath="//h4[normalize-space()='Recalculate funds available']")
	public WebElement ProcessBlockStep4;
	
	
	//Invoice Discounting FAQs
	
	@FindBy(xpath="//h2[normalize-space()='Invoice Discounting FAQs']")
	public WebElement InvoiceDiscountingFAQsHeader;
	
	@FindBy(xpath="//h3[normalize-space()='Invoice Discounting advantages and disadvantages']")
	public WebElement InvoiceDiscountingFAQsAccordian;
	
	@FindBy(xpath="(//p[contains(text(),'Placeholder copy')])[1]")
	public WebElement InvoiceDiscountingFAQsTextBlock;
	
	@FindBy(xpath="//h2[@class='card-more-faq__title']")
	public WebElement MoreCardTitle;
	
	@FindBy(xpath="//a[normalize-space()='Read our Invoice Finance FAQs']")
	public WebElement MoreCardlink;
	
	
	//Documents
	
	@FindBy(xpath="//h2[normalize-space()='Invoice Discounting Product Sheet']")
	public WebElement InvoiceDiscountingProductSheet;
	
	@FindBy(xpath="//h2[normalize-space()='Bad Debt Protection Product Sheet']")
	public WebElement BadDebtProtectionProductSheet;
	
	//Yellow Banner
	
	@FindBy(xpath="//a[normalize-space()='Get in touch with our team']")
	public WebElement YellowBanner;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
