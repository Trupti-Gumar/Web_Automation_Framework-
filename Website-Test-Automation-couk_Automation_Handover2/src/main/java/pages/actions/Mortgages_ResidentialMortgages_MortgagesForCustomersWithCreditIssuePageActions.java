package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Mortgages_ResidentialMortgages_MortgagesForCustomersWithCreditIssueLocator;
import utils.SeleniumDriver;

public class Mortgages_ResidentialMortgages_MortgagesForCustomersWithCreditIssuePageActions {
	
	Mortgages_ResidentialMortgages_MortgagesForCustomersWithCreditIssueLocator CustomerCreditLocator = 
			new Mortgages_ResidentialMortgages_MortgagesForCustomersWithCreditIssueLocator();
	
	public Mortgages_ResidentialMortgages_MortgagesForCustomersWithCreditIssuePageActions() {
		
		this.CustomerCreditLocator = new Mortgages_ResidentialMortgages_MortgagesForCustomersWithCreditIssueLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), CustomerCreditLocator);
	}
	
	
	public String gettheOption() {
		
		return SeleniumDriver.GetElementText(CustomerCreditLocator.dropDownOption);
	}
	
	public WebElement MortgageNavigationLink() {
		
		return CustomerCreditLocator.MortgageNavigationLink;
		
	}
	
	public void clickontheOption() {
		SeleniumDriver.clickElement(CustomerCreditLocator.dropDownOption, "Mortgages for customers with credit issues");
	}
	
	public String getTheRedirectedPageTitle() {
		return SeleniumDriver.GetElementText(CustomerCreditLocator.PageTitle);
	}
	
	public String verifyTheHeader() {
		return SeleniumDriver.GetElementText(CustomerCreditLocator.ImageSectionHeader);
	}
	
	public String getFAQsHeader() {
		return SeleniumDriver.GetElementText(CustomerCreditLocator.FAQsHeader);
	}
	
	public String getMorecardheader() {
		return SeleniumDriver.GetElementText(CustomerCreditLocator.MoreCardHeader);
	}
	
	public String getMorecardCTA() {
		SeleniumDriver.clickElement(CustomerCreditLocator.CTALink, "Mortgage FAQs");
		return SeleniumDriver.GetElementText(CustomerCreditLocator.CTAPageTitle);
	}
	
	public String verifyTheCardHeader(String value) {
		switch(value) {
		case "First time buyer mortgages":
			return CustomerCreditLocator.Cardheader1.getText();
			
		case "Self-employed mortgages":
		return CustomerCreditLocator.Cardheader2.getText();
		
//		case "5 tips for improving a poor credit score":
//		return CustomerCreditLocator.Cardheader3.getText();
//		
//		case "Challenges getting a mortgage with a bad credit score?":
//		return CustomerCreditLocator.Cardheader4.getText();
//		
		case "Buy to let mortgages":
		return CustomerCreditLocator.Cardheader3.getText();
		
		default:
			throw new IllegalArgumentException("Invalid value: " + value);
		}
		
	}
	
	
}
