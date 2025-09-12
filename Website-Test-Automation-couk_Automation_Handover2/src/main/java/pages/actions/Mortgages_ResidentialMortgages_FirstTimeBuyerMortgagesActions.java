package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.locators.Mortgages_ResidentialMortgages_FirstTimeBuyerMortgagesLocators;
import utils.SeleniumDriver;

public class Mortgages_ResidentialMortgages_FirstTimeBuyerMortgagesActions {
	
	Mortgages_ResidentialMortgages_FirstTimeBuyerMortgagesLocators firsttimeLocator = new Mortgages_ResidentialMortgages_FirstTimeBuyerMortgagesLocators();
	
	public Mortgages_ResidentialMortgages_FirstTimeBuyerMortgagesActions() {

		this.firsttimeLocator = new Mortgages_ResidentialMortgages_FirstTimeBuyerMortgagesLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), firsttimeLocator);
	}
	
   public String verifytheFirstTimeBuyeroption() {
	   return SeleniumDriver.GetElementText(firsttimeLocator.FirstTimeOption);
   }
   
   public void FirstTimeMortgageHeader() {
	   
	   SeleniumDriver.clickOnElement(firsttimeLocator.FirstTimeOption);
	   
   }
   
   public String getFirstTimePageTitle() {
	   
   return SeleniumDriver.GetElementText(firsttimeLocator.FirstTimePageTitle);
	
   }
   
   public WebElement mortgageFirstTimelink() {
	   return firsttimeLocator.FirstTimeOption;
   }
   
   public String verifyImageSectionheader(String value) {
	   
	   switch(value){
		   case "We take a different approach":
			   return firsttimeLocator.ImageSectionHeader1.getText();
		   case "Real life stories":	
			   return firsttimeLocator.ImageSectionHeader2.getText();
			default:
				throw new IllegalArgumentException("Invalid value: " + value);
	   }

   }
   
   public String getFAQsHeader()
   {
	   return SeleniumDriver.GetElementText(firsttimeLocator.FAQsHeader);
   }
   
   public String getMorecardheader()
   {
	   return SeleniumDriver.GetElementText(firsttimeLocator.Morecardheader);
   }
   
	public String getMorecardCTA() {
		SeleniumDriver.clickOnElement(firsttimeLocator.CTAFAQslink);
		return SeleniumDriver.GetElementText(firsttimeLocator.FAQsPageTitle);
	}
	
	public String getCardHeaderTitle(String value) {
		   switch(value){
		   case "Self-employed mortgages":
			   return firsttimeLocator.CardheaderTitle1.getText();
		   case "Mortgages for customers with credit problems":	
			   return firsttimeLocator.CardheaderTitle2.getText();
		   case "Mortgage frequently asked questions":	
			   return firsttimeLocator.CardheaderTitle3.getText();
		   case "Why use a mortgage broker? Here’s 10 great reasons":	
			   return firsttimeLocator.CardheaderTitle4.getText();
		   case "Divorce and mortgages – What you need to know":	
			   return firsttimeLocator.CardheaderTitle4.getText();
			default:
				throw new IllegalArgumentException("Invalid value: " + value);
	   }
	}
	
	public void verifytheCTAbuttonPresent()
	{
		SeleniumDriver.isElementPresent(firsttimeLocator.CTAButton);
	}
	
	public void ClickOnCTAButton() {
		SeleniumDriver.clickOnElement(firsttimeLocator.CTAButton);
	}
	
	public String getPagetTitle() {
		return SeleniumDriver.GetElementText(firsttimeLocator.PageTitle);
	}

}
