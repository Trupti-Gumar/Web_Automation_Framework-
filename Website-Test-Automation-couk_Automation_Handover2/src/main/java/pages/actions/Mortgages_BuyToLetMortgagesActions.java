package pages.actions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Mortgages_BuyToLetMortgagesLocators;
import utils.SeleniumDriver;

public class Mortgages_BuyToLetMortgagesActions {
	
	Mortgages_BuyToLetMortgagesLocators BuyToLetLocator = new Mortgages_BuyToLetMortgagesLocators();
	
	public Mortgages_BuyToLetMortgagesActions() {

		this.BuyToLetLocator = new Mortgages_BuyToLetMortgagesLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), BuyToLetLocator);
	}
	
	public WebElement MortgageNavigationLink() {
		
		return BuyToLetLocator.MortgageNavigationLink;
		
	}
 
	public String VerifyBuyToLetOptions() {
		return BuyToLetLocator.BuyToLetOption.getText();
	}
	public void ClickOnOptions() {
		SeleniumDriver.clickElement(BuyToLetLocator.BuyToLetOption, "Buy To Let Option");
	}
	
	public String getBuyToLetPageTitle() {
		return SeleniumDriver.GetElementText(BuyToLetLocator.BuyToLetPageTitle);
	}
	
	public void clickOnBuyToLetOptions() {
		SeleniumDriver.clickElement(BuyToLetLocator.BuyToLetOption, "Buy To Let Option");
	}
	
	public void verifyTheUSPheaderPresent(String Value) {
		String Actual;
		String Expected;
		switch(Value) {
		case "Buy to let mortgages for limited companies":
			Actual = BuyToLetLocator.USPHeader1.getText();
			Expected = Value;
			break;
		case "Multiple properties on one application":
			Actual = BuyToLetLocator.USPHeader2.getText();
			Expected = Value;
			break;
		case "Looking to grow your buy to let portfolio":
	      Actual = BuyToLetLocator.USPHeader3.getText();
	      Expected = Value;
		  break;	
		case "First time & accidental landlords":
			Actual = BuyToLetLocator.USPHeader4.getText();	
			Expected = Value;
			break;
		default:
			throw new IllegalArgumentException("Invalid value: " + Value);
		}
		assertEquals(Actual, Expected);
	}
	
	public String verifyTheImageSectionHeader(String value) {
		
		switch(value) {
		case "We're backing buy to let landlords":
			return BuyToLetLocator.ImageHeader1.getText();
			
		case "Multiple properties on one application":
			return BuyToLetLocator.ImageHeader2.getText();
			
		case "Speak to our team":
			return BuyToLetLocator.ImageHeader3.getText();
		default:
			throw new IllegalArgumentException("Invalid value: " + value);
		
		}
	}
		public String getQuickLinkHeader(){
			return BuyToLetLocator.QuickLinkHeader.getText();
		}
		
	public String getQuickLinkOption1() {
		return BuyToLetLocator.QuickLinkoption1.getText();
	}
	
	public String getQuickLinkOption2() {
		return BuyToLetLocator.QuickLinkoption2.getText();
	}
	
	public String getQuickLinkOption3() {
		return BuyToLetLocator.QuickLinkoption3.getText();
	}
	
	public String getPageTitleForOption1() {
		SeleniumDriver.clickElement(BuyToLetLocator.QuickLinkoption1, "Limited company buy to let mortgages");
		return BuyToLetLocator.Option1TitlePage.getText();
	}
	
	public String getPageTitleForOption2() {
		SeleniumDriver.clickElement(BuyToLetLocator.QuickLinkoption2, "Customer support");
		return BuyToLetLocator.Option2TitlePage.getText();
	}
	
	public boolean verifythePageTitlepresent() {
		SeleniumDriver.clickElement(BuyToLetLocator.QuickLinkoption3, "Request a callback");
		return BuyToLetLocator.Option3TitlePage.isEnabled();
	}
	
	public String verifycardHeaderCTAbutton(String header)
	{
		switch(header) {
		case"Buy to let mortgages for limited companies":
			return BuyToLetLocator.CardHeader1.getText();
		case"Mortgages help and support":
			return BuyToLetLocator.CardHeader3.getText();
		case"Residential mortgages":
			return BuyToLetLocator.CardHeader2.getText();
		case"10 tips for first time buy to let landlords":
			return BuyToLetLocator.CardHeader4.getText();
		case"Top tips for expanding your buy to let portfolio":
			return BuyToLetLocator.CardHeader5.getText();
		case"Looking to make a buy to let investment":
			return BuyToLetLocator.CardHeader6.getText();
		case"Understanding complex buy to let mortgages: 5 things you need to know":
		   return BuyToLetLocator.CardHeader7.getText();
		default:
			throw new IllegalArgumentException("Invalid value: " + header);
		}
		
	}
	
	public String verifytheFAQHeader() {
		return BuyToLetLocator.FAQHeader.getText();
	}
	
	public String verifyMoreCardHeader() {
		return BuyToLetLocator.MoreCardHeader.getText();
	}
	
	public String ClickonCTAbutton() {
		SeleniumDriver.clickElement(BuyToLetLocator.CTAbutton, "Mortgage FAQs");
		return BuyToLetLocator.PageTitle.getText();
	}
}
