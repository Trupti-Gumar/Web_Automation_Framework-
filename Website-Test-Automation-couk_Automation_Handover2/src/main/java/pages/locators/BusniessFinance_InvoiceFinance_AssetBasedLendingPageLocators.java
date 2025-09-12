package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusniessFinance_InvoiceFinance_AssetBasedLendingPageLocators {

	@FindBy(xpath="//a[normalize-space()='Asset Based Lending']")
	public WebElement AssetBasedLendingCardLink;
	
	@FindBy(xpath="//h1[normalize-space()='Asset Based Lending']")
	public WebElement AssetBasedLendingHeader;
	
	@FindBy(xpath="//span[normalize-space()='How does it work?']")
	public WebElement QuickLink2;
	
	@FindBy(xpath="//span[normalize-space()='Who can we help?']")
	public WebElement QuickLink3;
	
	@FindBy(xpath="//span[normalize-space()='Bad debt protection']")
	public WebElement QuickLink4;
	
	@FindBy(xpath="//span[normalize-space()='Documents']")
	public WebElement QuickLink6;
	
	
	//Video Block
	
	@FindBy(xpath="//h2[normalize-space()='How Asset Based Lending could help your business']")
	public WebElement VideoBlockheader;
	
	//Process Block
	
	@FindBy(xpath="//span[normalize-space()='How does it work?']")
	public WebElement ProcessBlockQuickLink;
	
	@FindBy(xpath="//h2[normalize-space()='How Asset Based Lending works']")
	public WebElement ProcessBlockHeader;
	
	@FindBy(xpath="//h4[normalize-space()='Get in touch with us']")
	public WebElement ProcessBlockStep1;
	
	@FindBy(xpath="//h4[normalize-space()='Schedule our visit']")
	public WebElement ProcessBlockStep2;
	
	@FindBy(xpath="//h4[normalize-space()='See your funding structure']")
	public WebElement ProcessBlockStep3;
	
	@FindBy(xpath="//h4[normalize-space()='Receive the funds']")
	public WebElement ProcessBlockStep4;
	
	
	//Image Copy Section
	
	@FindBy(xpath="//h2[normalize-space()='At a glance']")
	public WebElement ImageCopyHeader1;
	
	@FindBy(xpath="//a[normalize-space()='Get in touch']")
	public WebElement ImageCopyHeaderLink1;
	
	@FindBy(xpath="//h2[normalize-space()='Bad debt protection']")
	public WebElement ImageCopyHeader2;
	
	//USP
	
	@FindBy(xpath="//h2[normalize-space()='Fast and cost-effective']")
	public WebElement USPSubHeader1;
	
	@FindBy(xpath="//h2[normalize-space()='Tailored and flexible']")
	public WebElement USPSubHeader2;
	
	@FindBy(xpath="//h2[normalize-space()='Dedicated support']")
	public WebElement USPSubHeader3;
	
	
	//Document
	
	@FindBy(xpath="//h2[normalize-space()='Asset Based Lending Product Sheet']")
	public WebElement ProductSheetHeader;
	
	//Yellow CTA Banner
	
	@FindBy(xpath="//a[normalize-space()='Get in touch with our team']")
	public WebElement YellowCTABanner;
	
	
}
