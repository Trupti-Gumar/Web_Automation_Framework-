package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessFinance_AssetFinanceFAQsLocators {

	@FindBy(xpath="//span[normalize-space()='Asset finance FAQs']")
	public WebElement AssetFinanceFAQLink;

	
	@FindBy(xpath="//a[@aria-label='Asset finance']")
	public WebElement AssetFinanceBackLink;
	
	@FindBy(xpath="//h1[normalize-space()='Asset Finance - FAQs']")
	public WebElement AssetFinanceFAQHeader;
	
	@FindBy(xpath="//h3[contains(text(),'I'm an existing Aldermore asset finance customer a')]")
	public WebElement AssetFinanceFAQAccordian;
	
	@FindBy(xpath="//p[contains(text(),'To help us understand your current situation, visi')]")
	public WebElement AssetFinanceFAQTextBlock;
}
