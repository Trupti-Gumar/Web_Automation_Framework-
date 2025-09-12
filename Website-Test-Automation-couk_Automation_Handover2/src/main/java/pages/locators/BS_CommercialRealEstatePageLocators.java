package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BS_CommercialRealEstatePageLocators {
	
	
	@FindBy(xpath="//span[normalize-space()='Commercial Real Estate']")
	public WebElement CommercialRealEstate;
	
	@FindBy(xpath="//h1[normalize-space()='Commercial Real Estate']")
	public WebElement mastHeadHeader;
	
	@FindBy(xpath="//a[normalize-space()='Commercial mortgages']")
	public WebElement CommercialmortgagesCard;
	
	@FindBy(xpath="//a[normalize-space()='Property development finance']")
	public WebElement PropertydevelopmentfinanceCard;
	
	@FindBy(xpath="//a[@class='ald-cta-banner ald-cta-banner-yellow ald-focus__button ald_cta_analytics']")
	public WebElement yellowCTABanner;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
