package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.Mortgages_MortagagesHelpAndSupport_ContactUsLocators;
import utils.SeleniumDriver;

public class Mortgages_MortagagesHelpAndSupport_ContactUsActions {
	
	Mortgages_MortagagesHelpAndSupport_ContactUsLocators contactLocators = new Mortgages_MortagagesHelpAndSupport_ContactUsLocators();
	
  public Mortgages_MortagagesHelpAndSupport_ContactUsActions() {
	  this.contactLocators = new Mortgages_MortagagesHelpAndSupport_ContactUsLocators();
	  PageFactory.initElements(SeleniumDriver.getDriver(), contactLocators);
  }
  
  public String getCardName() {
	  return contactLocators.CardName.getText();
  }
  
  public void ClickCTA() {
	  SeleniumDriver.clickElement(contactLocators.CardCTA, "Contact Us");
  }
  
  public String getPageTitle() {
	  return contactLocators.PageTitle.getText();
  }
  
  public String getSubheaderTitle(String Value)
  {
	  switch(Value) {
	  case"Residential and buy to let mortgage customers":
		  return contactLocators.Subheader1.getText();
	  case"Commercial mortgage customers":
		  return contactLocators.Subheader2.getText();
       default:
    	   throw new IllegalArgumentException("Invalid Value : " + Value);
	  }
  }
}
