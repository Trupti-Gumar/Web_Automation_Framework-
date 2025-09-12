package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Help_ContactUs_MortgagecustomersLocators;
import utils.SeleniumDriver;

public class Help_ContactUs_MortgageCustomersActions {
	
	Help_ContactUs_MortgagecustomersLocators help_contactus_MortgagecustomersLocators 
	= new Help_ContactUs_MortgagecustomersLocators();
	
	public WebElement AcceptCookiesBtn() {
		return help_contactus_MortgagecustomersLocators.AcceptCookiesBtn;
	}
		
	public void HelpLink() {
		SeleniumDriver.clickElement(help_contactus_MortgagecustomersLocators.HelpButton, "Help");
	}
	
	public void ContactUSLink() {
		SeleniumDriver.clickElement(help_contactus_MortgagecustomersLocators.ContactUsButton, "Contact Us");
	}
	
	public Help_ContactUs_MortgageCustomersActions() {
		this.help_contactus_MortgagecustomersLocators = new Help_ContactUs_MortgagecustomersLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), help_contactus_MortgagecustomersLocators);
	}

	public String getCardName() {
		return SeleniumDriver.GetElementText(help_contactus_MortgagecustomersLocators.MortgagecustomersCardHeader);
	}
	
	public void ClickOnCTAButton() {
		SeleniumDriver.clickElement(help_contactus_MortgagecustomersLocators.MortgagecustomersCardHeader, "Mortgages");
	}
	
	public String getMortgageCustomersPageTitle() {
		return SeleniumDriver.GetElementText(help_contactus_MortgagecustomersLocators.MortgageCustomersPageHeader);
	}
	
	public WebElement OneTrustCookies(){
		
		return help_contactus_MortgagecustomersLocators.OneTrustCookies;
	}
	
	public String getSubheader() {
		return help_contactus_MortgagecustomersLocators.Subheader.getText();
	}
	
	public void ClickExpandOptions() {
		SeleniumDriver.clickOnElement(help_contactus_MortgagecustomersLocators.ExpandOptions);
	}
	
	public WebElement getOptions() {
		return help_contactus_MortgagecustomersLocators.Options1;
	}
}
