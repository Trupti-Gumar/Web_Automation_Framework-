package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Help_ContactUs_SavingscustomersLocators;
import utils.SeleniumDriver;

public class Help_ContactUs_SavingsCustomersActions {
	
	Help_ContactUs_SavingscustomersLocators help_contactus_savingscustomersLocators 
	= new Help_ContactUs_SavingscustomersLocators();
	
	public WebElement AcceptCookiesBtn() {
		return help_contactus_savingscustomersLocators.AcceptCookiesBtn;
	}
		
	public void HelpLink() {
		SeleniumDriver.clickElement(help_contactus_savingscustomersLocators.HelpButton, "Help");
	}
	
	public void ContactUSLink() {
		SeleniumDriver.clickElement(help_contactus_savingscustomersLocators.ContactUsButton, "Contact Us");
	}
	public Help_ContactUs_SavingsCustomersActions() {
		this.help_contactus_savingscustomersLocators = new Help_ContactUs_SavingscustomersLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), help_contactus_savingscustomersLocators);
	}

	public String getCardName() {
		return SeleniumDriver.GetElementText(help_contactus_savingscustomersLocators.SavingscustomersCardHeader);
	}
	
	public void ClickOnCTAButton() {
		SeleniumDriver.clickElement(help_contactus_savingscustomersLocators.SavingscustomersCardHeader, "Savings");
	}
	
	public String getSavingsCustomersPageTitle() {
		return SeleniumDriver.GetElementText(help_contactus_savingscustomersLocators.SavingsCustomersPageHeader);
	}
	
	public WebElement OneTrustCookies(){
		
		return help_contactus_savingscustomersLocators.OneTrustCookies;
	}
	
	public String getSubheader() {
		return help_contactus_savingscustomersLocators.Subheader.getText();
	}
	
	public void ClickExpandOptions() {
		SeleniumDriver.clickOnElement(help_contactus_savingscustomersLocators.ExpandOptions);
	}
	
	public WebElement getOptions() {
		return help_contactus_savingscustomersLocators.Options1;
	}
}
