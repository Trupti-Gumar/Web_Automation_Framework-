package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Mortgages_ResidentialMortgages_SelfEmployedMortgagesLocators;
import utils.SeleniumDriver;

public class Mortgages_ResidentialMortgages_SelfEmployedMortgagesActions {
	
	Mortgages_ResidentialMortgages_SelfEmployedMortgagesLocators SelfEmployedLocator = new Mortgages_ResidentialMortgages_SelfEmployedMortgagesLocators();
	
	public Mortgages_ResidentialMortgages_SelfEmployedMortgagesActions() {
		this.SelfEmployedLocator = new Mortgages_ResidentialMortgages_SelfEmployedMortgagesLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), SelfEmployedLocator);
	}
	
	public WebElement MortgageNavigationLink() {
		return SelfEmployedLocator.MortgageNavigationLink;
	}
	
	public String verifyTheOption() {
		return SeleniumDriver.GetElementText(SelfEmployedLocator.SelfEmployedOption);
	}
	
	public void Clickontheoption() {
		SeleniumDriver.clickElement(SelfEmployedLocator.SelfEmployedOption, "Self-employed mortgages");
	}

	
	public String getPageTitle() {
		return SeleniumDriver.GetElementText(SelfEmployedLocator.SelfEmployedPageTitle);
	}
	
	public String verifyResidentialMortgageImageSectionHeader() {
		return SeleniumDriver.GetElementText(SelfEmployedLocator.SelfEmplyedImageSectionTitle);
	}
	
	public String getFAQsTitle() {
		return SeleniumDriver.GetElementText(SelfEmployedLocator.SelfEmployedFAQsTitle);
	}

	public String getMorecardheader() {
		return SeleniumDriver.GetElementText(SelfEmployedLocator.moreCardHeader);
	}
	
	public String getMorecardCTA() {
		 SeleniumDriver.clickElement(SelfEmployedLocator.CTAButton, "FAQs CTA Button");
		 return SeleniumDriver.GetElementText(SelfEmployedLocator.CTAPageTitle);
	}
	
	public String verifyTheCardHeader(String value) {
		switch(value) {
		case "First time buyer mortgages":
			return SelfEmployedLocator.Cardheader1.getText();
			
		case "Buy to let mortgages":
		return SelfEmployedLocator.CardHeader3.getText();
		
		case "Mortgages for customers with credit problems":
		return SelfEmployedLocator.Cardheader2.getText();
		
		case "Self-employed? Here's 6 top tips to help you get a mortgage":
		return SelfEmployedLocator.Cardheader4.getText();
				
		case "Why use a mortgage broker? Here’s 10 great reasons":
		return SelfEmployedLocator.Cardheader5.getText();
		
		default:
			throw new IllegalArgumentException("Invalid value: " + value);
		}
		
	} 
	
	public WebElement OneTrustCookies(){
		
		return SelfEmployedLocator.OneTrustCookies;
	}
	
}


