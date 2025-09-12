package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Business_Finance_PropertyDevelopementFinanceFAQLocators;
import utils.SeleniumDriver;

public class Business_Finance_PropertyDevelopementFinanceFAQActions {

	Business_Finance_PropertyDevelopementFinanceFAQLocators BF_PropertyDevelopementFinanceFAQLocators =null;
	
	public Business_Finance_PropertyDevelopementFinanceFAQActions() {
		
		this.BF_PropertyDevelopementFinanceFAQLocators = new Business_Finance_PropertyDevelopementFinanceFAQLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), BF_PropertyDevelopementFinanceFAQLocators);
		
	}
	
	public WebElement PropertydevelopmentfinanceFAQsLink() {
		
		return BF_PropertyDevelopementFinanceFAQLocators.PropertydevelopmentfinanceFAQsLink;
	}
	
    public WebElement backlink() {
		
		return BF_PropertyDevelopementFinanceFAQLocators.backlink;
	}
    
    public WebElement MastheadHeader() {
		
		return BF_PropertyDevelopementFinanceFAQLocators.MastheadHeader;
	}
    
    public WebElement AccordianLink() {
		
		return BF_PropertyDevelopementFinanceFAQLocators.AccordianLink;
	}
    
    public WebElement AccordianText() {
		
		return BF_PropertyDevelopementFinanceFAQLocators.AccordianText;
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
}
