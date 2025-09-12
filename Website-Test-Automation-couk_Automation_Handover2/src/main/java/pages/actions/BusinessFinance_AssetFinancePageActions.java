package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BusinessFinance_AssetFinancePageLocators;
import utils.SeleniumDriver;

public class BusinessFinance_AssetFinancePageActions {

	BusinessFinance_AssetFinancePageLocators businessFinance_AssetFinancePageLocators = null;

	public BusinessFinance_AssetFinancePageActions() {

		this.businessFinance_AssetFinancePageLocators = new BusinessFinance_AssetFinancePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), businessFinance_AssetFinancePageLocators);
	}

	public WebElement AssetFinanceHeader() {

		return businessFinance_AssetFinancePageLocators.AssetFinanceHeader;
	}

	public WebElement AssetFinanceLink() {

		return businessFinance_AssetFinancePageLocators.AssetFinanceLink;
	}
	
	
  public String verifyUSPSubHeaders(String header) {
	  
	  switch(header) {
	  
	  case "Expertise":

			return businessFinance_AssetFinancePageLocators.AssetFinanceUSP1.getText();

		case "Funding":

			return businessFinance_AssetFinancePageLocators.AssetFinanceUSP2.getText();

		case "Service":

			return businessFinance_AssetFinancePageLocators.AssetFinanceUSP3.getText();

		

		default:
			throw new IllegalArgumentException("Invalid value: " + header);
	  
	  
	  
	  }
  }
	
	public String VerfyCardHeaders(String header) {
		
		 switch(header) {
		  
		  case "Construction":

				return businessFinance_AssetFinancePageLocators.ConstructionCardHeader.getText();

			case "Transportation":

				return businessFinance_AssetFinancePageLocators.TransportationCardHeader.getText();

			case "Hire Purchase":

				return businessFinance_AssetFinancePageLocators.HirePurchaseCardHeader.getText();

			case "Leas":

				return businessFinance_AssetFinancePageLocators.LeaseCardHeader.getText();
				
			case "Refinance":

				return businessFinance_AssetFinancePageLocators.RefinanceCardHeader.getText();

			default:
				throw new IllegalArgumentException("Invalid value: " + header);
		  
		  
		  
		  }
		
		
	}
	
	public String VerfyCardLinkPages(String title) {
		
		switch(title) {
		  
		  case "Construction":

				return SeleniumDriver.getPageTitle(businessFinance_AssetFinancePageLocators.ConstructionCardLink);

			case "Transportation":

				return SeleniumDriver.getPageTitle(businessFinance_AssetFinancePageLocators.TransportationCardLink);

			case "Hire Purchase":

				return SeleniumDriver.getPageTitle(businessFinance_AssetFinancePageLocators.HirePurchaseCardLink);

			case "Leas":

				return SeleniumDriver.getPageTitle(businessFinance_AssetFinancePageLocators.LeaseCardLink);
				
			case "Refinance":

				return SeleniumDriver.getPageTitle(businessFinance_AssetFinancePageLocators.RefinanceCardLink);

			default:
				throw new IllegalArgumentException("Invalid value: " + title);
		  
		  
		  
		  }
		
	}
	
	
	//FAQ
	
	public WebElement AssetFinanceFAQHeader() {

		return businessFinance_AssetFinancePageLocators.AssetFinanceFAQHeader;
	}
	
	public WebElement AssetFinanceFAQAccordian() {

		return businessFinance_AssetFinancePageLocators.AssetFinanceFAQAccordian;
	}
	
	public WebElement AssetFinanceFAQATextBlock() {

		return businessFinance_AssetFinancePageLocators.AssetFinanceFAQATextBlock;
	}
	
	public WebElement MoreCardTitle() {

		return businessFinance_AssetFinancePageLocators.MoreCardTitle;
	}
	
	public WebElement MoreCardLink() {

		return businessFinance_AssetFinancePageLocators.MoreCardLink;
	}
	
	//Award
	
	public WebElement AwardHeader() {

		return businessFinance_AssetFinancePageLocators.AwardHeader;
	}
	
	//Customer Story Card
	
	public WebElement CustomerstoriesCard() {

		return businessFinance_AssetFinancePageLocators.CustomerstoriesCard;
	}
	
	//Business finance Card
	
	public WebElement BusinessfinanceCard() {

		return businessFinance_AssetFinancePageLocators.BusinessfinanceCard;
	}
	
	//Help and Support card
	
	public WebElement HelpSupportCard() {

		return businessFinance_AssetFinancePageLocators.HelpSupportCard;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
