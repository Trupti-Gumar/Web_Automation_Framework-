package pages.actions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import pages.locators.Mortgages_CommercialMortgagesLocators;
import utils.SeleniumDriver;

public class Mortgages_CommercialMortgagesActions {
	
	Mortgages_CommercialMortgagesLocators CommercialLocators = new Mortgages_CommercialMortgagesLocators();
	
	public Mortgages_CommercialMortgagesActions() {
		this.CommercialLocators = new Mortgages_CommercialMortgagesLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), CommercialLocators);
	}
	
	public String getCommericalDropdownOption() {
		return CommercialLocators.CommercialDropDown.getText();
	}

	public void clickTheLink() {
		SeleniumDriver.clickElement(CommercialLocators.CommercialDropDown, "Commerical Mortgages");
	}
	
	public String getRedirectedPageTitle() {
		return SeleniumDriver.GetElementText(CommercialLocators.CommericalMortgagePageTitle);
	}
	
	public String getUSPSectionHeader(String value) {
		switch(value) {
		case"We treat you as an individual":
			return CommercialLocators.USPHeader1.getText();
		case"Up to 75% LTV available":
			return CommercialLocators.USPHeader2.getText();
		case"Borrow 1m-25m":
			return CommercialLocators.USPHeader3.getText();
		case"Expert personal support":
			return CommercialLocators.USPHeader4.getText();
		default:
			throw new IllegalArgumentException("Invalid value: " + value);	
		}
	}
	
	public void verifyTheImageSectionHeader(String value) {
		String Actual= null;
		String Expected= null;
		switch(value)
		{
		case"Commercial mortgage specialists":
		 Actual = CommercialLocators.ImageSection1.getText();
	     Expected = value;
		 break;
		case"Product highlights":
			 Actual = CommercialLocators.ImageSection2.getText();
		     Expected = value;
			 break;
	    case"VAT loans":
		 Actual = CommercialLocators.ImageSection3.getText();
	     Expected = value;
		 break;
	}
		assertEquals(Actual, Expected);
	}
	
	public String getCardHeader(String header)
	{
		switch(header) {
		case"Property development finance":
			return CommercialLocators.CardHeader1.getText();
		case"Business finance":
			return CommercialLocators.CardHeader2.getText();
		case"Business savings accounts":
			return CommercialLocators.CardHeader3.getText();
			default:
				throw new IllegalArgumentException("Invalid value: " +  header);
		}
		
	}
	
	public void verifytheBottomLink(String bottomLink) {
		String Actual = SeleniumDriver.GetElementText(CommercialLocators.bottomlink);
		String Expected = bottomLink;
		assertEquals(Actual, Expected);
		SeleniumDriver.clickElement(CommercialLocators.bottomlink, "Bottom Link");
	}
	
	public String getBottomLinkPageTitle() {
		return CommercialLocators.bottomPageTitle.getText();
	}
	
	public String getBlackBoxheader() {
		return CommercialLocators.BlackBoxHeader.getText();
	}
	
}
