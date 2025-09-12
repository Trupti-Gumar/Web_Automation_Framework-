package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BusinessFinance_AssetFinance_ConstructionLocators;
import utils.SeleniumDriver;

public class BusinessFinance_AssetFinance_ConstructionActions {

	BusinessFinance_AssetFinance_ConstructionLocators BSAssetFinance_ConstructionLocators = null;

	public BusinessFinance_AssetFinance_ConstructionActions() {

		this.BSAssetFinance_ConstructionLocators = new BusinessFinance_AssetFinance_ConstructionLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), BSAssetFinance_ConstructionLocators);
	}

	public WebElement ConstructionCardLink() {

		return BSAssetFinance_ConstructionLocators.ConstructionCardLink;
	}

	public WebElement MastheadHeader() {

		return BSAssetFinance_ConstructionLocators.MastheadHeader;
	}

	// Masthead black box

	public WebElement MastheadBlackBoxHeader() {

		return BSAssetFinance_ConstructionLocators.MastheadBlackBoxHeader;
	}

	public WebElement MastheadBlackBoxCTAButton() {

		return BSAssetFinance_ConstructionLocators.MastheadBlackBoxCTAButton;
	}

	// USP

	public String getUSPSubHeaders(String header) {

		switch (header) {

		case "Expertise":

			return BSAssetFinance_ConstructionLocators.USPSubHeader1.getText();

		case "Funding":

			return BSAssetFinance_ConstructionLocators.USPSubHeader2.getText();

		case "Service":

			return BSAssetFinance_ConstructionLocators.USPSubHeader3.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}

	}

//Image Copy Section

	public String getImageCopyHeaders(String header) {

		switch (header) {

		case "What we can finance":

			return BSAssetFinance_ConstructionLocators.ImageCopyHeader1.getText();

		case "Our finance solutions":

			return BSAssetFinance_ConstructionLocators.ImageCopyHeader2.getText();

		default:
			throw new IllegalArgumentException("Invalid value: " + header);

		}

	}

	// Video Block

	public WebElement VideoBlockHeader() {

		return BSAssetFinance_ConstructionLocators.VideoBlockHeader;
	}

	// BDM Card

	public WebElement BDMCardHeader() {

		return BSAssetFinance_ConstructionLocators.BDMCardHeader;
	}

}
