package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.Mortgages_HelpAndSupport_SwitchingYourMortgagesLocators;
import utils.SeleniumDriver;

public class Mortgages_HelpAndSupport_SwitchingYourMortgagesActions {
 
	Mortgages_HelpAndSupport_SwitchingYourMortgagesLocators SwitchLocators  
	= new Mortgages_HelpAndSupport_SwitchingYourMortgagesLocators();
	
	public Mortgages_HelpAndSupport_SwitchingYourMortgagesActions() {
		this.SwitchLocators = new Mortgages_HelpAndSupport_SwitchingYourMortgagesLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), SwitchLocators);
	}
	
	public String getCardNameText() {
		return SwitchLocators.CardName.getText();
	}
	
	public void clickedCTAbutton() {
		SeleniumDriver.clickElement(SwitchLocators.CardCTAbutton, "Switching Your Mortgages");
	}
	
	public String getPagetitle() {
		return SwitchLocators.PageTitle.getText();
	}
	
	public String getSubheader(String value)
	{
		switch(value)
		{
		case"Ready to switch?":
			return SwitchLocators.subheader1.getText();
		case"Fee free":
			return SwitchLocators.subheader2.getText();
		case"Hassle free":
			return SwitchLocators.subheader3.getText();
		case"Dedicated support":
			return SwitchLocators.subheader4.getText();
		case"Switch early":
		    return SwitchLocators.subheader5.getText();
		default:
			throw new IllegalArgumentException("Invlaid Value :" + value);
		}
	}
	
	public String getImageSectionheader(String value) {
		switch(value) {
		case"When can you switch?":
			return SwitchLocators.ImageSectionheader1.getText();
		case"Who can switch?":
			return SwitchLocators.ImageSectionheader2.getText();
		case"Your Service Choice":
			return SwitchLocators.ImageSectionheader3.getText();
		default:
			throw new IllegalArgumentException("Invalid Value :" + value);
		}	
	}
}
