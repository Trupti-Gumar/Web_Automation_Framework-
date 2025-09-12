package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessFinance_InvoiceFinanceFAQsLocators {
	
	
	
	@FindBy(xpath="//span[normalize-space()='Invoice finance FAQs']")
	public WebElement InvoiceFinanceFAQLink;

	
	@FindBy(xpath="//a[@aria-label='Invoice finance']")
	public WebElement InvoiceFinanceBackLink;
	
	@FindBy(xpath="//h1[normalize-space()='Invoice Finance - FAQs']")
	public WebElement InvoiceFinanceFAQHeader;
	
	@FindBy(xpath="//h3[normalize-space()='What is Invoice Finance?']")
	public WebElement InvoiceFinanceFAQAccordian;
	
	@FindBy(xpath="//p[contains(text(),'Invoice finance is a form of short-term borrowing ')]")
	public WebElement InvoiceFinanceFAQTextBlock;
}
