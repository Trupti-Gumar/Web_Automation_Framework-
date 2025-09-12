package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intermediaries_Mortgages_DocumentsguidesandinsightsLocators {

	@FindBy(xpath = "//a[normalize-space()='Documents, guides and insights']")
	public WebElement DocumentsguidesandinsightsLink;

	@FindBy(xpath = "//h1[normalize-space()='Documents and forms for mortgage intermediaries']")
	public WebElement MastheadHeader;

	@FindBy(xpath = "//h2[normalize-space()='Residential mortgage documents']")
	public WebElement CardHeader1;

	@FindBy(xpath = "//h2[normalize-space()='Buy to let mortgage documents']")
	public WebElement CardHeader2;

	@FindBy(xpath = "//h2[normalize-space()='Commercial mortgage documents']")
	public WebElement CardHeader3;
	
	@FindBy(xpath = "//h2[normalize-space()='Product switching']")
	public WebElement CardHeader4;

	@FindBy(xpath = "//h2[normalize-space()='Conveyancing documents']")
	public WebElement CardHeader5;
	
	@FindBy(xpath = "//h2[normalize-space()='Latest insight and news - Intermediaries blog']")
	public WebElement CardHeader6;
	
	@FindBy(xpath = "//h2[contains(text(),'See our latest service levels')]")
	public WebElement CardHeader7;
	
	@FindBy(xpath = "//h2[contains(text(),'Speak to our team')]")
	public WebElement CardHeader8;
	
	@FindBy(xpath="//a[contains(text(),'Residential mortgage documents')]")
	public WebElement CardLink1;
	
	@FindBy(xpath="//a[contains(text(),'Buy to let mortgage documents')]")
	public WebElement CardLink2;
	
	@FindBy(xpath="//a[contains(text(),'Commercial mortgage documents')]")
	public WebElement CardLink3;
	
	@FindBy(xpath="//a[contains(text(),'Mortgage product switch documents')]")
	public WebElement CardLink4;
	
	@FindBy(xpath="//a[contains(text(),'Conveyancing')]")
	public WebElement CardLink5;
	
	@FindBy(xpath="//a[contains(text(),'Our latest service levels')]")
	public WebElement CardLink6;
	
	@FindBy(xpath="//a[contains(text(),'Residential and Buy to Let mortgages contact information')]")
	public WebElement CardLink7;

}
