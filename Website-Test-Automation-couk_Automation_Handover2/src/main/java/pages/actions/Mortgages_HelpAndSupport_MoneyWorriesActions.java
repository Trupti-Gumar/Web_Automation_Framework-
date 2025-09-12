package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.Mortgages_HelpAndSupport_MoneyWorriesLocators;
import utils.SeleniumDriver;

public class Mortgages_HelpAndSupport_MoneyWorriesActions {
	
	Mortgages_HelpAndSupport_MoneyWorriesLocators MoneyWorriesLocators = new Mortgages_HelpAndSupport_MoneyWorriesLocators();
	
	public Mortgages_HelpAndSupport_MoneyWorriesActions() {
		this.MoneyWorriesLocators = new Mortgages_HelpAndSupport_MoneyWorriesLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), MoneyWorriesLocators);
	}

	
	public String getOptionText() {
		
		return SeleniumDriver.GetElementText(MoneyWorriesLocators.MoneyWorriesDropDown);
	}
	
	public void clickedToOption() {
		SeleniumDriver.clickElement(MoneyWorriesLocators.MoneyWorriesDropDown, "Money Worries");
	}
	
	public String getPageTitle() {
		return SeleniumDriver.GetElementText(MoneyWorriesLocators.MoneyWorriesPageTitle);
	}
	
	public void navigateToMoneyWorries() {
	SeleniumDriver.clickElement(MoneyWorriesLocators.MoneyWorriesDropDown, "Money Worries");
	}
	
//	public String getUSPsectionTitle(String value) {
//		switch(value)
//		{
//		case"What we'll talk about":
//			return MoneyWorriesLocators.USPSection1.getText();
//		case "Your finances":
//			return MoneyWorriesLocators.USPSection2.getText();
//		case"Getting back on track":	
//			return MoneyWorriesLocators.USPSection3.getText();
//		case"Who else can help?":
//			return MoneyWorriesLocators.USPSection4.getText();
//		case"What you need to know.":
//			return MoneyWorriesLocators.USPSection5.getText();
//		default:
//			throw new IllegalArgumentException("Invalid value: " + value);	
//		}
//		
//	}
	
	
	public String getImagesectionTitle(String value) {
		switch(value)
		{
		case"Help us to understand the bigger picture":
			return MoneyWorriesLocators.USPSection2.getText();
		case "What we'll talk about":
			return MoneyWorriesLocators.USPSection1.getText();
		default:
			throw new IllegalArgumentException("Invalid value: " + value);	
		}
		
	}
	
	public String getLinkTitle() {
		return SeleniumDriver.GetElementText(MoneyWorriesLocators.Link);
	}
	
	public String getLinkPageTitle() {
		SeleniumDriver.clickElement(MoneyWorriesLocators.Link, "Complete our income and expenditure form");
		return SeleniumDriver.GetElementText(MoneyWorriesLocators.LinkPageTitle);
	}
	
	
}
