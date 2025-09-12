package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Help_ContactUs_BusinessFinanceCustomersLocators;
import utils.SeleniumDriver;

public class Help_ContactUs_BusinessFinanceCustomersActions {
	
	Help_ContactUs_BusinessFinanceCustomersLocators help_contactus_businessfinancecustomerLocators 
	= new Help_ContactUs_BusinessFinanceCustomersLocators();
	
	public void HelpLink() {
		SeleniumDriver.clickElement(help_contactus_businessfinancecustomerLocators.HelpButton, "Help");
	}
	
	public void ContactUSLink() {
		SeleniumDriver.clickElement(help_contactus_businessfinancecustomerLocators.ContactUsButton, "Contact Us");
	}
	public Help_ContactUs_BusinessFinanceCustomersActions() {
		this.help_contactus_businessfinancecustomerLocators = new Help_ContactUs_BusinessFinanceCustomersLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), help_contactus_businessfinancecustomerLocators);
	}

	public String getCardName() {
		return SeleniumDriver.GetElementText(help_contactus_businessfinancecustomerLocators.BusinessFinanceCardHeader);
	}
	
	public void ClickOnCTAButton() {
		SeleniumDriver.clickElement(help_contactus_businessfinancecustomerLocators.BusinessFinanceCardCTAButton, "Business Finance Customer");
	}
	
	public String getBusinessFinancePageTitle() {
		return SeleniumDriver.GetElementText(help_contactus_businessfinancecustomerLocators.BusinessFinancePageTitle);
	}
	
	public WebElement OneTrustCookies(){
		
		return help_contactus_businessfinancecustomerLocators.OneTrustCookies;
	}
	
	public String getSubheader() {
		return help_contactus_businessfinancecustomerLocators.Subheader.getText();
	}
	
	public void ClickExpandOptions() {
		SeleniumDriver.clickOnElement(help_contactus_businessfinancecustomerLocators.ExpandOptions);
	}
	
	public WebElement getOptions() {
		return help_contactus_businessfinancecustomerLocators.Options1;
	}
}
