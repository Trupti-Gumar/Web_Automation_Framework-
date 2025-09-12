package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessFinancePageLocators {

	@FindBy(xpath="//span[@class='navigation-menu__dropdown-header__span'][normalize-space()='Business finance']")
	public WebElement BusinessFinanceNavigationLink;
	
	@FindBy(xpath="//a[contains(@aria-label,'Business finance')][normalize-space()='Business finance']")
	public WebElement BusinessFinanceLink;
	
	@FindBy(xpath="//h1[normalize-space()='Business Finance']")
	public WebElement BusinessFinanceHeader;
	
	@FindBy(xpath="//li[@class='navigation-menu__dropdown-single-menu__item']//a[@aria-label='Business finance'][normalize-space()='Business finance']")
	public WebElement BusinessFinanceMenuItem;
	
	@FindBy(xpath="//div[@id='Desktop_Nav_Business_finance']//a[@aria-label='Help and support'][normalize-space()='Help and support']")
	public WebElement HelpAndSupportMenuItem;
	
	@FindBy(xpath="//span[normalize-space()='Invoice finance']")
	public WebElement InvoiceFinanceMenuItem;
	
	@FindBy(xpath="//span[normalize-space()='Asset finance']")
	public WebElement AssetFinanceMenuItem;
	
	@FindBy(xpath="//span[normalize-space()='Commercial Real Estate']")
	public WebElement CommercialRealEstateMenuItem;
	
	@FindBy(xpath="//h2[normalize-space()='Invoice Finance']")
	public WebElement InvoiceFinanceHeader;
	
	@FindBy(xpath="//h2[normalize-space()='Asset Finance']")
	public WebElement AssetFinanceHeader;
	
	@FindBy(xpath="//h2[normalize-space()='Commercial Real Estate']")
	public WebElement CommercialRealEstateHeader;
	
	@FindBy(xpath="//span[contains(text(),'Support for asset finance customers with money wor')]")
	public WebElement SupportForAsset;
	
	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
	public WebElement AcceptCookiesBtn;
	
	
	
	
	
}
