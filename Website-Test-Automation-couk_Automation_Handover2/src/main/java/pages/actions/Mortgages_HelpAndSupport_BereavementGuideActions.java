package pages.actions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import pages.locators.Mortgages_HelpAndSupport_BereavementGuideLocators;
import utils.SeleniumDriver;

public class Mortgages_HelpAndSupport_BereavementGuideActions {
	
	
	Mortgages_HelpAndSupport_BereavementGuideLocators BereavementLocators = new Mortgages_HelpAndSupport_BereavementGuideLocators();
	
	public Mortgages_HelpAndSupport_BereavementGuideActions() {
		this.BereavementLocators = new Mortgages_HelpAndSupport_BereavementGuideLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), BereavementLocators);
	}
	
   public String getDropdownOption() {
	   return SeleniumDriver.GetElementText(BereavementLocators.Bereavement_guide);
   }

   public void clickedtheOption() {
	   SeleniumDriver.clickElement(BereavementLocators.Bereavement_guide, "Berevement Guide"); 
   }
   
   public String getPageTitle() {
	   return SeleniumDriver.GetElementText(BereavementLocators.BereavementGuidePageTitle);
   }
   
   public String getHeadersPresentonPage(String value)
   {
	  switch(value) {
	  case"What to do first":
	     return BereavementLocators.header1.getText();
	  case"Terms you'll hear":
		  return BereavementLocators.header2.getText();
	  case"Who else can help":
		  return BereavementLocators.header3.getText();
	  case"How to contact us":
		  return BereavementLocators.header4.getText();
		  default:
			  throw new IllegalArgumentException("Invalid Value" + value);
	  }
   }
   
   public void ClickOntheLink(String link) {
	   String Actual = BereavementLocators.LinkS.getText();
	   String Expected = link;
	   assertEquals(Actual, Expected);
	   SeleniumDriver.clickElement(BereavementLocators.LinkS, "bereavement guide for personal savings customers.");
   }
   
   public String getRedirectedtoPageTitle() {
	  return BereavementLocators.LinkPageTitle.getText();
   }
}
