package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessFinance_MoneyWorriesPageLocators {

	@FindBy(xpath="//a[@href='/help-and-support/money-worries/']//span[@class='navigation__menu-item__span'][normalize-space()='Money worries']")
	public WebElement MoneyWorriesLink;
	
	@FindBy(xpath="//h1[normalize-space()='Cost of living and money worries']")
	public WebElement MastheadHeader;
	
	@FindBy(xpath="//h2[normalize-space()='Customers with money worries']")
	public WebElement ImageCopyHeader1;
	
	@FindBy(xpath="//h2[normalize-space()='Independent advice']")
	public WebElement ImageCopyHeader2;
	
	@FindBy(xpath="//h2[normalize-space()='Bank of England base rate changes']")
	public WebElement ImageCopyHeader3;
	
	@FindBy(xpath="//a[@class='ald_cta_textlink text__white ald-focus__button']")
	public WebElement ImageCopyLink3;
	
	@FindBy(xpath="//h2[normalize-space()='Being scam savvy']")
	public WebElement ImageCopyHeader4;
	
	@FindBy(xpath="//a[@class='ald_cta_textlink text__black ald-focus__button']")
	public WebElement ImageCopyLink4;
}
