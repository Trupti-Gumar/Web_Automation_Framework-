package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BusinessFinance_BereavementPageLocators;
import utils.SeleniumDriver;

public class BusinessFinance_BereavementPageActions {

	BusinessFinance_BereavementPageLocators BF_BereavementPageLocators = null;
	
	public BusinessFinance_BereavementPageActions() {
		
		this.BF_BereavementPageLocators = new BusinessFinance_BereavementPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), BF_BereavementPageLocators);
	}
	
	public WebElement BereavementGuideLink() {
		
		return BF_BereavementPageLocators.BereavementGuideLink;
	}
	
    public WebElement MastheadHeader() {
		
		return BF_BereavementPageLocators.MastheadHeader;
	}
    
    public WebElement AccordianHeader() {
		
		return BF_BereavementPageLocators.AccordianHeader;
	}
    
    public WebElement AccordianLink() {
		
		return BF_BereavementPageLocators.AccordianLink;
	}
    
   public WebElement AccordianText() {
		
		return BF_BereavementPageLocators.AccordianText;
	}
    
    
   public String getTextBlockHeader(String header) {

		switch (header) {

		case "What to do first":
			return BF_BereavementPageLocators.TextBlockHeader1.getText();

		case "Terms you'll hear":
			return BF_BereavementPageLocators.TextBlockHeader2.getText();
			
		case "Who else can help":
			return BF_BereavementPageLocators.TextBlockHeader3.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
