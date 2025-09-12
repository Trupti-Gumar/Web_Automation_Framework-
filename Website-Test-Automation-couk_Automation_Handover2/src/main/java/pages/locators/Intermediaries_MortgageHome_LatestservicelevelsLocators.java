package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermediaries_MortgageHome_LatestservicelevelsLocators {

	@FindBy(xpath = "//span[normalize-space()='Latest service levels']")
	public WebElement LatestservicelevelsLink;

	@FindBy(xpath = "//h1[normalize-space()='Latest service levels']")
	public WebElement MastheadHeader;
	
//	@FindBy(xpath = "//h2[contains(text(),'Initial packaging review')]")
	@FindBy(xpath = "//h2[normalize-space()='Initial packaging review – for all cases']")
	public WebElement CardHeaderText1;

	@FindBy(xpath = "//h2[normalize-space()='Residential and standard buy to let']")
	public WebElement CardHeaderText2;

	@FindBy(xpath = "//h2[normalize-space()='Specialist buy to let']")
	public WebElement CardHeaderText3;
	
	@FindBy(xpath = "//h2[normalize-space()='Residential and Buy to let submission guide']")
	public WebElement CardHeaderText4;
	
	
}
