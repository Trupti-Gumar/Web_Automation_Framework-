package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.Mortgages_BuyToLetMortgagesForLimitedCompaniesLocators;
import utils.SeleniumDriver;

public class Mortgages_BuyToLetMortgagesForLimitedCompaniesActions {
	
	Mortgages_BuyToLetMortgagesForLimitedCompaniesLocators BuyToLetMortgagesLocator 
	= new Mortgages_BuyToLetMortgagesForLimitedCompaniesLocators();
	
	public Mortgages_BuyToLetMortgagesForLimitedCompaniesActions() {
		this.BuyToLetMortgagesLocator = new Mortgages_BuyToLetMortgagesForLimitedCompaniesLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), BuyToLetMortgagesLocator);
	
	}
	
	public String gettheDropDownOption(){
		return BuyToLetMortgagesLocator.DropDownOption.getText();
	}

	
	public void ClickedTheLink() {
		SeleniumDriver.clickElement(BuyToLetMortgagesLocator.DropDownOption, "Buy to Let Mortgages for Limited Companies");
	}
	
	public String getRedirectedPageTitle() {
		return BuyToLetMortgagesLocator.BuytoLetMortgagesPageTitle.getText();
	}
	
	public void NavigtetoBuytoLetMortgagesPage() {
		SeleniumDriver.clickElement(BuyToLetMortgagesLocator.DropDownOption, "Buy to Let Mortgages for Limited Companies"); 
	}
	
	public String getUSPheader(String value)
	{
		switch(value) {
		case"Buy to let mortgages for limited companies":
			return BuyToLetMortgagesLocator.USPHeader1.getText();
		case"Specialists in portfolio landlord lending":
			return BuyToLetMortgagesLocator.USPHeader2.getText();	
		case "Human underwriting":
			return BuyToLetMortgagesLocator.USPHeader3.getText();
		case "Expert support":
			return BuyToLetMortgagesLocator.USPHeader4.getText();
		default:
			throw new IllegalArgumentException("Invalid value: " + value);
		}
	}	
     public String getImageSectionHeader(String value) {
			switch(value)
			{
			case "Limited company buy to let mortgages":
				return BuyToLetMortgagesLocator.ImageSection1.getText();
			case "The changing tax landscape":
				return BuyToLetMortgagesLocator.ImageSection2.getText();
			case "Multiple properties on one application":
				return BuyToLetMortgagesLocator.ImageSection3.getText();
			default:
				throw new IllegalArgumentException("Invalid Value:" + value);
					
			}
			
		}
     
     public String getBlackBoxheader() {
    	 return BuyToLetMortgagesLocator.getBlackBoxHeader.getText();
     }
     
     public String getCardHeaderTitle(String value) {
    	 switch (value) {
    	 case"Buy to let mortgages":
    		 return BuyToLetMortgagesLocator.cardheader1.getText();
    	 case"Residential mortgages":
    		 return BuyToLetMortgagesLocator.cardheader2.getText();
    	 case"Mortgages help and support":
    		 return BuyToLetMortgagesLocator.cardheader3.getText();
    	 case"10 tips for first time buy to let landlords":
    		 return BuyToLetMortgagesLocator.cardheader4.getText();
    	 case"Top tips for expanding your buy to let portfolio":
    		 return BuyToLetMortgagesLocator.cardheader5.getText();
    	 case"Looking to make a buy to let investment? Check out Manchester…":
    		 return BuyToLetMortgagesLocator.cardheader6.getText();
    	 case"Understanding complex buy to let mortgages: 5 things you need to know":
    		 return BuyToLetMortgagesLocator.cardheader7.getText();
    	 default:
    		throw new IllegalArgumentException("Invalid Value : " + value);	 
    	 }
     }
			
	public String getFAQheaerHeaderTitle() {
		return BuyToLetMortgagesLocator.FAQheader.getText();
	}


}
