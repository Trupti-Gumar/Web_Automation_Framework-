package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusniessFinance_InvoiceFinanceLocators {

	@FindBy(xpath="//li[@aria-label='Business finance drop down menu']//ul[1]")
	public WebElement BusinessFinanceMenuoptions;
	
	@FindBy(xpath="//span[@class='navigation-menu__dropdown-header__span'][normalize-space()='Business finance']")
	public WebElement BusinessFinanceDropdown;

	@FindBy(xpath="//span[normalize-space()='Invoice finance']")
	public WebElement InvoiceFinanceLink;

	// Masthead Medium

	@FindBy(xpath = "//h1[normalize-space()='Invoice Finance']")
	public WebElement InvoiceFinanceHeader;

	// Masthead black box

	@FindBy(xpath = "//h2[@class='masthead-black-box__header'] ")
	public WebElement MastheadBlackboxHeader;

	@FindBy(xpath = "(//li[@class='masthead-black-box__li'])[1]")
	public WebElement phoneNoOnBlackbox;

	@FindBy(xpath = "//a[normalize-space()='Request a callback']")
	public WebElement RequestCallBackOnBlackbox;

	@FindBy(xpath = "//a[normalize-space()='Email us']")
	public WebElement EmailUsOnBlackbox;

	// USP

	@FindBy(xpath = "//h2[normalize-space()='Flexible and transparent']")
	public WebElement USPSubHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Dedicated support']")
	public WebElement USPSubHeader2;

	@FindBy(xpath = "//h2[normalize-space()='Same day payments']")
	public WebElement USPSubHeader3;

	@FindBy(xpath = "//h2[normalize-space()='Online account management']")
	public WebElement USPSubHeader4;

	// Image copy Section

	@FindBy(xpath = "//h2[normalize-space()='Supporting businesses like yours']")
	public WebElement ImageCopyHeader;

	@FindBy(xpath = "//a[contains(text(),'Find out how Aldermore supported Didsbury Gin with')]")
	public WebElement ImageCopyLink1;

	@FindBy(xpath = "//a[normalize-space()='More customer stories']")
	public WebElement ImageCopyLink2;
	
	@FindBy(xpath="//h2[normalize-space()='How does Invoice Finance work?']")
	public WebElement ImageCopyHeader2;
	
	
	
	
	//Video Block
	
	@FindBy(xpath="//h2[@class='video-block__header font-heavy']")
	public WebElement VideoBlockHeader;
	
	@FindBy(xpath="//button[@aria-label='Play Button']//*[name()='svg']")
	public WebElement VideoBlockPlayBtn;
	
	
	//Cards
	
	@FindBy(xpath="//h2[normalize-space()='Invoice Discounting']")
	public WebElement InvoiceDiscountingCardHeader;
	
	@FindBy(xpath="//h2[normalize-space()='Factoring']")
	public WebElement FactoringCardHeader;
	
	@FindBy(xpath="//h2[normalize-space()='Asset Based Lending']")
	public WebElement AssetBasedLendingCardHeader;
	
	@FindBy(xpath="//h2[normalize-space()='Bad Debt Protection']")
	public WebElement BadDebtProtectionCardHeader;
	
	@FindBy(xpath="//h2[normalize-space()='Receivables Finance']")
	public WebElement RecievableFinanceCardHeader;
	
	@FindBy(xpath="//a[normalize-space()='Invoice Discounting']")
	public WebElement InvoiceDiscountingCardLink;
	
	@FindBy(xpath="//a[normalize-space()='Factoring']")
	public WebElement FactoringCardLink;
	
	@FindBy(xpath="//a[normalize-space()='Asset Based Lending']")
	public WebElement AssetBasedLendingCardLink;
	
	@FindBy(xpath="//a[normalize-space()='Bad Debt Protection']")
	public WebElement BadDebtProtectionCardLink;
	
	@FindBy(xpath="//a[normalize-space()='Receivables Finance']")
	public WebElement RecievableFinanceCardLink;
	
	//Process Block
	
	@FindBy(xpath="//h2[normalize-space()='How Invoice Finance works']")
	public WebElement ProcessBlockHeader;
	
	@FindBy(xpath="//h4[normalize-space()='Get in touch with us']")
	public WebElement ProcessBlockStepTitle1;
	
	@FindBy(xpath="//h4[normalize-space()='Submit your invoices to us']")
	public WebElement ProcessBlockStepTitle2;
	
	@FindBy(xpath="//h4[normalize-space()='We advance you the funds']")
	public WebElement ProcessBlockStepTitle3;
	
	@FindBy(xpath="//h4[normalize-space()='Repay us once the invoices are settled']")
	public WebElement ProcessBlockStepTitle4;
	
	//Invoice Finance FAQs
	
	@FindBy(xpath="//h2[@class='h2-heavy__header accordion__header']")
	public WebElement InvoiceFinanceFAQHeader;
	
	@FindBy(xpath="//h3[normalize-space()='How much does an Invoice Finance facility cost?']")
	public WebElement InvoiceFinanceFAQAccordian;
	
	@FindBy(xpath="//p[contains(text(),'The cost will be dependent on your requirements fr')]")
	public WebElement InvoiceFinanceFAQTextBlock;
	
	//More Card
	
	@FindBy(xpath="//h2[@class='card-more-faq__title']")
	public WebElement MoreCardHeader;
	
	@FindBy(xpath="//a[normalize-space()='View Invoice Finance FAQs']")
	public WebElement MoreCardLink;
	
	
	
	
	
	
	
	

}
