package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.MortgagePageLocators;
import utils.SeleniumDriver;

public class MortgagePageActions {
	
	MortgagePageLocators mortgagepagelocators = new MortgagePageLocators();
	
	public MortgagePageActions() {

		this.mortgagepagelocators = new MortgagePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), mortgagepagelocators);
	}
	public WebElement OneTrustCookies(){
	
		return mortgagepagelocators.OneTrustCookies;
	}
	
	public void ClickOneTrustCookies() {
		SeleniumDriver.clickOnElement(mortgagepagelocators.OneTrustCookies);
	}
	
	public WebElement MortgageNavigationLink()
	{
	return mortgagepagelocators.MortgageNavigationLink;
	}

	public String verifyMortgageOptions(String header) {
		switch (header) {
		
		case "Mortgages home":
		return mortgagepagelocators.mortgageHeaderLink.getText();

		case "Residential mortgages":
			return mortgagepagelocators.ResidentialMortgageMenuItem.getText();

		case "Buy to let mortgages":
			return mortgagepagelocators.BuyToLetMortgagesMenuItem.getText();
			
		case "Support for mortgage customers":
		 return mortgagepagelocators.SupportForMortgageCustomers.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	public WebElement MortgageHeaderLink()
	{
	return mortgagepagelocators.mortgageHeaderLink;
	}

	public String verifyMortgagePageTitle() {
		
		return mortgagepagelocators.mortagePageTitle.getText();
	}

	public String verifycardHeaderCTAbutton(String header) {
		switch (header) {
		
		case "Mortgages for customers with credit issues":
			return mortgagepagelocators.customerWithCreditIssue.getText();

		case "Self-employed mortgages":
			return mortgagepagelocators.SelfEmployedMortgages.getText();
			
		case "First time buyer mortgages":
		 return mortgagepagelocators.FirstTimeBuyerMortgages.getText();
		 
		case "Buy to let mortgages":
			 return mortgagepagelocators.Buy_to_let_mortgages.getText();
 			 
		case "Commercial mortgages":
			 return mortgagepagelocators.commericalMortgages.getText();
			 
		case "Buy to let mortgages for limited companies":
			 return mortgagepagelocators.BuyToLetForLimitedoCompanies.getText();
			 
		case"Why use a mortgage broker? Here’s 10 great reasons":	 
			  return mortgagepagelocators.Why_use_a_mortgage_broker.getText();
			  
		case"Divorce and mortgages – What you need to know":	 
			  return mortgagepagelocators.Why_use_a_mortgage_broker.getText();
		
		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getCustomersWithCreditIssuesPageTitle() {
		SeleniumDriver.verifytheLink(mortgagepagelocators.customerWithCreditIssue);
		return SeleniumDriver.getDriver().getTitle();
		
	}
	
	public String getSelfEmployedMortgagesPageTitle() {
		SeleniumDriver.verifytheLink(mortgagepagelocators.SelfEmployedMortgages);
		return SeleniumDriver.getDriver().getTitle();
		
	}
	
	public String getFirstTimeBuyerMortgagesPageTitle() {
		SeleniumDriver.verifytheLink(mortgagepagelocators.FirstTimeBuyerMortgages);
		return SeleniumDriver.getDriver().getTitle();
		
	}
	
//	public String getMortgagesFAQsPageTitle() {
//		SeleniumDriver.verifytheLink(mortgagepagelocators.MortgagesFAQs);
//		return SeleniumDriver.getDriver().getTitle();
//		
//	}
	
	public String getMortgageguidesPageTitle() {
		SeleniumDriver.verifytheLink(mortgagepagelocators.Mortgageguides);
		return SeleniumDriver.getDriver().getTitle();
		
	}
	
	public String getCommercialmortgagesPageTitle() {
		SeleniumDriver.verifytheLink(mortgagepagelocators.commericalMortgages);
		return SeleniumDriver.getDriver().getTitle();
		
	}
	
	public String getBuyToLetforlimitedCompaniesPageTitle() {
		SeleniumDriver.verifytheLink(mortgagepagelocators.BuyToLetForLimitedoCompanies);
		return SeleniumDriver.getDriver().getTitle();
		
	}
	
	public boolean isUSPSectionPresent() {
		return mortgagepagelocators.USPSection.isDisplayed();
		
	}
	
	public String getQuickLinkBlackBoxheader() {
		
		return mortgagepagelocators.QuickLinkBlackBox.getText();
	}
	
	public String getImageSectionheader() {
		return mortgagepagelocators.imageSectionheader.getText();
	}
	
	public String getQuickLinkOption1()
	{
		return mortgagepagelocators.quicklinkoption1.getText();
	}
	
	public String getQuickLinkOption2()
	{
		return mortgagepagelocators.quicklinkoption2.getText();
	}
	
	public String getQuickLinkOption3()
	{
		return mortgagepagelocators.quicklinkoption3.getText();
	}
	
	public String getPageTitleForOption1() {
		
		SeleniumDriver.clickOnElement(mortgagepagelocators.quicklinkoption1);
		return mortgagepagelocators.Option1PageTitle.getText();
	}
	
	public String getPageTitleForOption2() {
		
		SeleniumDriver.clickOnElement(mortgagepagelocators.quicklinkoption2);
		return mortgagepagelocators.Option2PageTitle.getText();
	}
	
	public String getPageTitleForOption3() {
		
		SeleniumDriver.clickOnElement(mortgagepagelocators.quicklinkoption3);
		return mortgagepagelocators.Option3PageTitle.getText();
	}
}
