package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Business_Finance_PropertyDevelopementFinanceFAQLocators {

	
	@FindBy(xpath="//span[normalize-space()='Property development finance FAQs']")
	public WebElement PropertydevelopmentfinanceFAQsLink;
	
	@FindBy(xpath="//a[@aria-label='Property development finance']")
	public WebElement backlink;
	
	@FindBy(xpath="//h1[normalize-space()='Property Development Finance - FAQs']")
	public WebElement MastheadHeader;
	
	@FindBy(xpath="//h3[normalize-space()='Who do you lend to?']")
	public WebElement AccordianLink;
	
	@FindBy(xpath="//p[contains(text(),'We can consider lending to experienced property de')]")
	public WebElement AccordianText;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
