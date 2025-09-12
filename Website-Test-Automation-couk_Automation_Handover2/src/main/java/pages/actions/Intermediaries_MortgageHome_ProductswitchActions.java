package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Intermediaries_MortgageHome_ProductswitchLocators;
import utils.SeleniumDriver;

public class Intermediaries_MortgageHome_ProductswitchActions {

	Intermediaries_MortgageHome_ProductswitchLocators ProductswitchLocators = null;

	public Intermediaries_MortgageHome_ProductswitchActions() {

		this.ProductswitchLocators = new Intermediaries_MortgageHome_ProductswitchLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), ProductswitchLocators);
	}

	public WebElement ProductswitchLink() {

		return ProductswitchLocators.ProductswitchLink;
	}

	public WebElement MastheadHeader() {

		return ProductswitchLocators.MastheadHeader;
	}

	public WebElement MastheadBlackboxHeader() {

		return ProductswitchLocators.MastheadBlackboxHeader;
	}

	public String getMastheadBlackboxLinkPage(String header) {

		switch (header) {

		case "Product switch guide":
			return SeleniumDriver.getPageTitle(ProductswitchLocators.MastheadBlackboxLink1);

	//	case "How to switch guide":
	//		return SeleniumDriver.getPageTitle(ProductswitchLocators.MastheadBlackboxLink2);

		case "Login to switch":
			return SeleniumDriver.getPageTitle(ProductswitchLocators.MastheadBlackboxLink3);

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	public String getUSPHeader(String header) {

		switch (header) {

		case "Great rewards":
			return ProductswitchLocators.USPHeader1.getText();

		case "Fee free & hassle free":
			return ProductswitchLocators.USPHeader2.getText();

		case "Switch alerts":
			return ProductswitchLocators.USPHeader3.getText();

		case "Residential Broker portal":
			return ProductswitchLocators.USPHeader4.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}

	public String getImageCopyHeader(String headernum) {

		switch (headernum) {

		case "First":
			return ProductswitchLocators.ImageCopyHeader1.getText();

		case "Second":
			return ProductswitchLocators.ImageCopyHeader2.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + headernum);

		}
	}

	public String getDocumentsCardHeader(String header) {

		switch (header) {

		case "Product switch mortgage guide":
			return ProductswitchLocators.UsefuldocumentsHeader1.getText();
			
		case "How to switch your clients online":
			return ProductswitchLocators.UsefuldocumentsHeader2.getText();
			
		case "View all documents":
			return ProductswitchLocators.UsefuldocumentsHeader3.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getPageTitle(String pageTitle) {
		
		switch (pageTitle) {

		case "Mortgage Documents for Intermediaries":
			return SeleniumDriver.getPageTitle(ProductswitchLocators.ViewalldocumentsCardLink);

				default:
			throw new IllegalArgumentException("Invalid value: " + pageTitle);

		}
	}	
	
	
	public String getBannerHeader(String header) {

		switch (header) {

		case "Login or register to submit business":
			return ProductswitchLocators.BannerHeader.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}
	}
	
	public String getBannerPageTitle(String pageTitle) {
		
		switch (pageTitle) {

		case "Aldermore Residential - Login":
			return SeleniumDriver.getPageTitle(ProductswitchLocators.BannerHeader);

				default:
			throw new IllegalArgumentException("Invalid value: " + pageTitle);

		}
	}
	
	
	
	
	
	
	
	
	public WebElement CTABanner() {

		return ProductswitchLocators.CTABanner;
	}
	

}
