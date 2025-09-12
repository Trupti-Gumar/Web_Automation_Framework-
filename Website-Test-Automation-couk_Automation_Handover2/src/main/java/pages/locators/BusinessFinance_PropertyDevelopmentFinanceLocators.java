package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessFinance_PropertyDevelopmentFinanceLocators {

	
	@FindBy(xpath="//a[@aria-label='Property development finance']")
	public WebElement PropertyDevelopmentFinanceLink;
	
	@FindBy(xpath="//h1[normalize-space()='Property Development Finance']")
	public WebElement MastheadHeader;
	
	@FindBy(xpath="//h2[normalize-space()='Contact us']")
	public WebElement MastheadBlackboxHeader;
	
	@FindBy(xpath="(//h2[@class='unique-selling-points__sub-header'])[1]")
	public WebElement USPHeader1;
	
	@FindBy(xpath="//h2[normalize-space()='Maximum of 65% GDV']")
	public WebElement USPHeader2;
	
	@FindBy(xpath="//h2[normalize-space()='Quick turnaround']")
	public WebElement USPHeader3;
	
	@FindBy(xpath="//h2[normalize-space()='Flexible terms']")
	public WebElement USPHeader4;
	
	
	@FindBy(xpath="//h2[normalize-space()='Commercial Real Estate specialists']")
	public WebElement ImageCopySectionHeader1;
	
	@FindBy(xpath="//h2[normalize-space()='VAT loans for house builders and contractors']")
	public WebElement ImageCopySectionHeader2;
	
	@FindBy(xpath="//h2[normalize-space()='Development finance to suit you']")
	public WebElement ImageCopySectionHeader3;
	
	@FindBy(xpath="//span[normalize-space()='Commercial Mortgages']")
	public WebElement CommercialMortgagesCardHeader;
	
	@FindBy(xpath="//a[normalize-space()='Commercial Mortgages']")
	public WebElement CommercialMortgagesCardLink;
	
	@FindBy(xpath="//span[normalize-space()='Buy to Let Mortgages']")
	public WebElement BuytoLetMortgagesCardHeader;
	
	
	@FindBy(xpath="//a[normalize-space()='Buy to Let Mortgages']")
	public WebElement BuytoLetMortgagesCardLink;
	
	@FindBy(xpath="//span[normalize-space()='Business Finance']")
	public WebElement BusinessFinanceCardHeader;
	
	@FindBy(xpath="//a[normalize-space()='Business Finance']")
	public WebElement BusinessFinanceCardLink;
	
	@FindBy(xpath="//span[normalize-space()='Property development finance FAQs']")
	public WebElement propertyDevelopmentFinanceFAQLink;
	
	
	
	
	
	
	
	
}
