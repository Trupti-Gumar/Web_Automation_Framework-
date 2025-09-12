package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.Mortgages_MortgagesHelpAndSupport_FeesStatementsAndBalancesLocators;
import utils.SeleniumDriver;

public class Mortgages_MortgagesHelpAndSupport_FeesStatementsAndBalancesActions {

	Mortgages_MortgagesHelpAndSupport_FeesStatementsAndBalancesLocators
	FSABLocators = new Mortgages_MortgagesHelpAndSupport_FeesStatementsAndBalancesLocators();
	
	public Mortgages_MortgagesHelpAndSupport_FeesStatementsAndBalancesActions() {
		this.FSABLocators = new Mortgages_MortgagesHelpAndSupport_FeesStatementsAndBalancesLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), FSABLocators);
	}
	
	public String getCardTitle() {
		return SeleniumDriver.GetElementText(FSABLocators.CardText);
	}
	 
	public void clickOnCard() {
		SeleniumDriver.clickElement(FSABLocators.CardCTAbutton, "Fees, statements and balances");
	}
	
	public String getPageTitle() {
		return SeleniumDriver.GetElementText(FSABLocators.CardPageTitle);
	}
	
	public String getUSPsectionOptons(String value)
	{
		switch(value) {
		case"Your annual statement":
			return FSABLocators.Subheader1.getText();
		case"Your remaining balance.":
			return FSABLocators.Subheader2.getText();
		case"Your certificate of interest":
			return FSABLocators.Subheader3.getText();
			default: 
				throw new IllegalArgumentException("Invalid Value : " + value);
		}
	}
	
  public void ClickedOnLink(String value) {
	  switch(value) {
	  case"Request a statement.":
		  SeleniumDriver.clickElement(FSABLocators.Link1, "Request a statement.");
	  case"Request a certificate of interest":
		  FSABLocators.Link2.click();
	  }
  }
  
//  public void ClickedOnLink(String value)
//  {
//	  switch(value) {
//	  case"Request a statement.":
//		  SeleniumDriver.clickElement(FSABLocators.Link1, "Request a statement.");
//	  case"Request a certificate of interest":
//		  SeleniumDriver.clickElement(FSABLocators.Link2, "Request a certificate of interest");
//	  }
//  }
  
  public String getLinkPageTitle(String value)
  {
	  switch(value)
	  {
	  case"404 - page not found":
		  return SeleniumDriver.GetElementText(FSABLocators.LinkPage1);
	  case"My mortgage information":
		  return SeleniumDriver.GetElementText(FSABLocators.LinkPage2);
		  default: 
			  throw new IllegalArgumentException("inValid Value :" + value);
	  }
  }
  
  public String getQuicklinkheader(String value) {
	  switch(value) {
	  case"Quick links":
	  {
	  return SeleniumDriver.GetElementText(FSABLocators.Quicklinkheader);
	  }
	  case"Help and support":
	  {
		  return SeleniumDriver.GetElementText(FSABLocators.Sublink1);
	  }
	  case"Mortgage FAQs":
	  {
		  return SeleniumDriver.GetElementText(FSABLocators.sublink2);
	  }
	  default:
		  throw new IllegalArgumentException("Invalid Value : " + value);
       }
  }
	
  public void clickOnTheLink(String link) {
	  switch(link) {
	  case"Help and support":
	  {
		  SeleniumDriver.clickOnElement(FSABLocators.Sublink1);
	  }
	  case"Mortgage FAQs":
	  {
		  SeleniumDriver.clickOnElement(FSABLocators.sublink2);
	  }
	}
  }
  
  public String getPagetitle(String value)
  {
	  switch(value) {
	  case"Mortgages help and support":
	  {
		  return SeleniumDriver.GetElementText(FSABLocators.Pagetitle1);
	  }
	  case"Mortgage FAQs":
	  {
		  return SeleniumDriver.GetElementText(FSABLocators.PageTitle2);
	  }  
	  default:
		  throw new IllegalArgumentException("Invalid Value : " + value);
	  }
  }
  
}
