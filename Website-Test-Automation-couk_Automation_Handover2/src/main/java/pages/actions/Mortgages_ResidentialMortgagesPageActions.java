package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.SeleniumServerStandaloneManager;
import pages.locators.Mortgage_ResidentialPageLocators;
import utils.SeleniumDriver;

public class Mortgages_ResidentialMortgagesPageActions {
	
	Mortgage_ResidentialPageLocators mortgageResidentialLocator = new Mortgage_ResidentialPageLocators();
	
	public Mortgages_ResidentialMortgagesPageActions() {

		this.mortgageResidentialLocator = new Mortgage_ResidentialPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), mortgageResidentialLocator);
	}
	
	public String getMortgageResidentialOptions()
	{
	 return mortgageResidentialLocator.ResidentialMortgageOptions.getText();
	}
	
	public WebElement MortgageResidentialLink()
	{
	return mortgageResidentialLocator.ResidentialMortgageOptions;
	}
	
    ////////Changed Webelement////////////////////	
	public String getResidentialMortgagePageHeader() {
        return mortgageResidentialLocator.ResidentialMortgageHeader.getText();
			
		}
		
	public String verifycardHeaderCTAbutton(String header) {
		switch (header) {
		
		case "Mortgages for customers with credit issues":
			return mortgageResidentialLocator.customerWithCreditIssue.getText();

		case "Self-employed mortgages":
			return mortgageResidentialLocator.SelfEmployedMortgages.getText();
			
		case "First time buyer mortgages":
		 return mortgageResidentialLocator.FirstTimeBuyerMortgages.getText();
		 			 
		case "Why use a mortgage broker?":
			 return mortgageResidentialLocator.Whyuseamortgagebroker.getText();	 
			 
		case "Divorce and mortgages – What you need to know":
			 return mortgageResidentialLocator.Divorce_and_mortgages.getText();
			 
		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
		
	}
	
	public String getCustomersWithCreditIssuesPageTitle()
	{
		SeleniumDriver.verifytheLink(mortgageResidentialLocator.customerWithCreditIssue);
		return SeleniumDriver.getDriver().getTitle();
		
	}
	
	public String getSelfEmployedMortgagesPageTitle() {
		SeleniumDriver.verifytheLink(mortgageResidentialLocator.SelfEmployedMortgages);
		return SeleniumDriver.getDriver().getTitle();
	}
	
	public String getFirstTimeBuyerMortgagesPageTitle() {
		SeleniumDriver.verifytheLink(mortgageResidentialLocator.FirstTimeBuyerMortgages);
		return SeleniumDriver.getDriver().getTitle();
	}
	
//	public String getBuytoletforindividualsTitle() {
//		SeleniumDriver.verifytheLink(mortgageResidentialLocator.Buytoletforindividuals);
//		return SeleniumDriver.getDriver().getTitle();
//	}
	
	public String getWhyuseamortgagebrokerPageTitle() {
		SeleniumDriver.verifytheLink(mortgageResidentialLocator.Whyuseamortgagebroker);
		return SeleniumDriver.getDriver().getTitle();
	}
	
//	public String getHowtogetaselfemployedmortgagePageTitle() {
//		SeleniumDriver.verifytheLink(mortgageResidentialLocator.Howtogetaselfemployedmortgage);
//		return SeleniumDriver.getDriver().getTitle();
//	}
	
	public String getDivorceandmortgagesPageTitle() {
		SeleniumDriver.verifytheLink(mortgageResidentialLocator.Divorce_and_mortgages);
		return SeleniumDriver.getDriver().getTitle();
	}
	
	public String verifyResidentialMortgageImageSectionHeader() {
		return SeleniumDriver.GetElementText(mortgageResidentialLocator.ImageSectionheader);
	}
	
	public String verifyFAQsHeader() {
		
		return SeleniumDriver.getElelment(mortgageResidentialLocator.ResidentialMortgageFAQs).getText();
	
	}
	
	public String getMorecardheader()
	{
		
		return SeleniumDriver.GetElementText(mortgageResidentialLocator.Morecardheader);
	}
	
	public String getMorecardCTA() {
		SeleniumDriver.clickOnElement(mortgageResidentialLocator.CTAFAQslink);
		return SeleniumDriver.GetElementText(mortgageResidentialLocator.FAQsPageTitle);
	}
	
	public String getmastheadBlackbox() {
		return SeleniumDriver.GetElementText(mortgageResidentialLocator.blackBoxHeader);
	}
	
	public String getOption1header() {
		return SeleniumDriver.GetElementText(mortgageResidentialLocator.Option1);
	}
	
	public String getOption1PageTitle() {
		SeleniumDriver.clickOnElement(mortgageResidentialLocator.Option1);
		return SeleniumDriver.GetElementText(mortgageResidentialLocator.Option1Title);
	}
	
	public String getOption2header() {
		return SeleniumDriver.GetElementText(mortgageResidentialLocator.Option2);
	}
	
	public String getOption2PageTitle() {
		SeleniumDriver.clickOnElement(mortgageResidentialLocator.Option2);
		return SeleniumDriver.GetElementText(mortgageResidentialLocator.Option2Title);
	}
	
	public String getOption3header() {
		return SeleniumDriver.GetElementText(mortgageResidentialLocator.Option3);
	}
	
	public String getOption3PageTitle() {
		SeleniumDriver.clickOnElement(mortgageResidentialLocator.Option3);
		return SeleniumDriver.GetElementText(mortgageResidentialLocator.Option3Title);
	}
	
}

